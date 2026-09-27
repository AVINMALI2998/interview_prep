# CI/CD for This Maven Project

## 1. What Is CI/CD?

**CI/CD** is a way to automatically build, test, and deliver software when code changes.

- **Continuous Integration (CI):** Developers regularly push or merge changes. An automated pipeline checks that the project builds and its tests pass.
- **Continuous Delivery:** The application is kept ready to release, but a person usually approves the production release.
- **Continuous Deployment:** Every change that passes the required checks is released to production automatically.

CI checks code. CD prepares or delivers a release. A project can use CI without deploying anything.

## 2. What Is a Pipeline?

A pipeline is a sequence of automated steps that runs on a CI server when an event occurs, such as a push or pull request. If a required step fails, the pipeline reports failure so the problem can be fixed before merging or releasing the change.

Typical steps are:

1. Check out the repository code.
2. Install or select the required Java and build tools.
3. Compile and build the project.
4. Run automated tests.
5. Save test reports and show whether the run passed or failed.
6. Optionally package, publish, or deploy the application.

## 3. Current Project Status

This repository is a Java 11 Maven project. Its `pom.xml` currently declares JUnit 4 and does not declare Selenium or TestNG dependencies. There is no CI workflow or Jenkinsfile in the repository, so CI/CD is **not configured yet**.

The local Maven test command is:

```bash
mvn test
```

The example below shows one way to run that same command automatically with GitHub Actions. It is an example configuration; adding this notes file alone does not activate a pipeline.

## 4. Example GitHub Actions CI Workflow

To enable this workflow, save the YAML as `.github/workflows/maven-ci.yml` in the repository root. GitHub Actions runs it for pushes to `main` and for pull requests targeting `main`.

```yaml
name: Maven CI

on:
  push:
    branches: [main]
  pull_request:
    branches: [main]

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
      - name: Check out source
        uses: actions/checkout@v4

      - name: Set up Java 11
        uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '11'
          cache: maven

      - name: Build and run tests
        run: mvn --batch-mode --no-transfer-progress test

      - name: Save Maven test reports
        if: always()
        uses: actions/upload-artifact@v4
        with:
          name: surefire-reports
          path: target/surefire-reports/
          if-no-files-found: ignore
```

`if: always()` asks GitHub Actions to try uploading reports even if the test step fails. If no tests ran or Maven did not create the report folder, `if-no-files-found: ignore` avoids making the upload step itself fail.

## 5. How This Pipeline Works

- `on` defines which repository events start the workflow.
- `jobs` contains work to run; this example has one job named `test`.
- `runs-on` selects a temporary Ubuntu virtual machine for the job.
- `actions/checkout` downloads the repository onto that machine.
- `actions/setup-java` installs Java 11 and enables Maven dependency caching.
- `mvn ... test` compiles the project and runs tests supported by its Maven configuration.
- `actions/upload-artifact` stores Surefire reports so they can be downloaded from the workflow run.

Each workflow run uses a clean hosted machine. The Java and Maven settings therefore need to be declared in the workflow or project instead of relying on software installed on a developer's computer.

## 6. How Selenium Tests Fit In

If Selenium tests are added to this project, Maven must declare the Selenium and test-runner dependencies, and the tests must be discoverable by Maven Surefire. The CI machine also needs a browser and a compatible driver strategy. Selenium Manager or a supported headless browser setup can manage this, depending on the Selenium version and environment.

For browser tests, the pipeline usually runs in headless mode on a hosted Linux runner. Tests should use explicit waits, close the browser during cleanup, and avoid depending on a developer's local file paths or browser profile. If the application under test is not publicly available, the pipeline must start or connect to a test environment before running the tests.

The workflow above only runs the tests currently configured in this Maven project. It does not start a web application or deploy it.

## 7. Reports and Failures

- A passing test run lets the CI job pass; a build or test failure makes the job fail.
- Maven Surefire writes test reports under `target/surefire-reports/`.
- The uploaded artifact preserves those files after the temporary runner is removed.
- A team can add richer reports, screenshots, notifications, or deployment steps later.
- Do not store passwords or tokens directly in workflow YAML. Use repository or organization secrets when credentials are required.

## 8. CI vs. CD Example

For this project, running `mvn test` on every pull request is CI. If a later pipeline packages an application and publishes it to a release location after approval, that is continuous delivery. If it automatically deploys each passing change to production, that is continuous deployment.

## 9. Interview Answer

> CI/CD automates the process of validating and delivering code. In this Maven project, CI can run when code is pushed or a pull request is opened. GitHub Actions checks out the code, sets up Java 11, runs `mvn test`, and saves the Surefire reports. A failed build or test marks the pipeline as failed. The repository currently has no CI workflow, so this describes how I would configure it. Deployment would be a separate CD step and would only be added if the project needed it.

## 10. Common Interview Questions

**What happens when a test fails in CI?**

The test command exits with a failure status, so the job and workflow are marked failed. The team checks the logs and test reports, fixes the issue, and pushes an update.

**Why run tests on a pull request?**

It gives the team feedback before merging and helps catch regressions early.

**What is the difference between CI and continuous deployment?**

CI automatically builds and tests code changes. Continuous deployment goes further by automatically releasing changes that pass the required checks.

**Does this example deploy the application?**

No. It only builds and tests the Maven project and saves reports.
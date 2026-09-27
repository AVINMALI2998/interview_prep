# Git, GitHub, and GitHub Actions

## 1. What Is Git?

Git is a version control system. It records changes to files so developers can see what changed, save checkpoints, create branches for separate work, and return to an earlier version when needed.

Git runs locally on your computer. A Git repository contains the project files and their change history.

## 2. What Is GitHub?

GitHub is an online service that hosts Git repositories. It lets developers share their code, review changes, work together using branches and pull requests, and run automation with GitHub Actions.

**Simple difference:** Git is the version control tool; GitHub is one service where Git repositories can be stored and collaborated on.

## 3. Basic Git Workflow

```text
Working directory -> Staging area -> Local repository -> GitHub repository
      edit             git add         git commit          git push
```

1. Edit files in the working directory.
2. Use `git status` to see which files changed.
3. Use `git add <file>` to select changes for the next checkpoint.
4. Use `git commit -m "message"` to save the selected changes in local history.
5. Use `git push` to send local commits to GitHub.
6. Use `git pull` to bring updates from GitHub into the local branch.

`git add` stages a change; it does not create a commit. A commit is saved locally; it is not on GitHub until it is pushed.

## 4. Important Git and GitHub Terms

| Term | Simple meaning |
|---|---|
| Repository (repo) | Project files and their version history |
| Working directory | The files you are currently editing |
| Staging area | The selected changes that will go into the next commit |
| Commit | A saved checkpoint in the repository history |
| Branch | A separate line of work, often used for a feature or fix |
| Remote | A named connection to another repository, commonly `origin` on GitHub |
| Push | Send local commits to a remote repository |
| Pull | Fetch remote changes and integrate them into the current branch |
| Pull request (PR) | A request to review and merge a branch into another branch |
| Merge | Combine changes from one branch into another |
| `.gitignore` | A file listing untracked files Git should normally ignore |

## 5. Typical Team Workflow

1. Get the project with `git clone <repository-url>`.
2. Create a branch with `git switch -c feature/my-change`.
3. Edit files, then stage and commit the intended changes.
4. Push the branch with `git push -u origin feature/my-change`.
5. Open a pull request on GitHub for review.
6. GitHub Actions can run checks on the pull request.
7. After approval and passing checks, merge the pull request.

Teams may use different branch names and review rules, but the general idea is to keep changes isolated and review them before merging.

## 6. What Is GitHub Actions?

GitHub Actions is GitHub's automation service. It can automatically build, test, or deploy a project when a selected event happens, such as a push or pull request.

Automation is described in a YAML **workflow** file stored under `.github/workflows/` in the repository. A workflow has:

- **Event (`on`):** what starts the workflow, such as a push or pull request.
- **Job:** a group of related automation steps.
- **Runner:** the virtual machine where a job runs, such as `ubuntu-latest`.
- **Step:** an individual command or reusable action in a job.
- **Action:** a reusable task, such as checking out code or setting up Java.

## 7. Example: Run Maven Tests with GitHub Actions

Save this as `.github/workflows/maven-ci.yml` at the repository root to enable this example workflow:

```yaml
name: Maven tests

on:
  push:
    branches: [main]
  pull_request:
    branches: [main]

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - name: Check out repository
        uses: actions/checkout@v4

      - name: Set up Java 11
        uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '11'
          cache: maven

      - name: Run Maven tests
        run: mvn --batch-mode test
```

### How This Example Runs

1. A push to `main` or a pull request targeting `main` starts the workflow.
2. GitHub creates an Ubuntu runner and checks out the repository code.
3. The Java setup action installs Java 11 and configures Maven dependency caching.
4. The runner executes `mvn --batch-mode test`.
5. If the build or tests fail, the job is marked as failed; otherwise, it passes.

The workflow only runs tests that Maven is configured to find. This repository does not currently contain a GitHub Actions workflow, so this YAML is an example and does not run until it is added under `.github/workflows/`.

## 8. Interview Explanation

> Git is a version control tool that tracks code changes on a developer's computer. GitHub hosts Git repositories online and provides collaboration features such as pull requests. GitHub Actions automates tasks from workflow files when events like pushes or pull requests occur. For example, a workflow can check out the repository, install Java, run Maven tests, and report whether they passed.

## 9. Useful Commands

```bash
git status
git add <file>
git commit -m "Describe the change"
git switch -c feature/my-change
git push -u origin feature/my-change
git pull
```

Review the output of `git status` before committing so you stage only the changes you intend to include.
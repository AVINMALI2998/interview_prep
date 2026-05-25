The Collections Framework
Before we explore ArrayList, HashSet, HashMap, and other data structures in more detail, it's important to understand that all of these are part of something bigger - the Java Collections Framework.

The Java Collections Framework provides a set of interfaces (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

All of these are part of the java.util package.

They are used to store, search, sort, and organize data more easily - all using standardized methods and patterns.


Core Interfaces in the Collections Framework
Here are some common interfaces, along with their classes:

| Interface | Common Classes | Description |
|-----------|----------------|-------------|
| List | ArrayList, LinkedList | Ordered collection that allows duplicates |
| Set | HashSet, TreeSet, LinkedHashSet | Collection of unique elements |
| Map | HashMap, TreeMap, LinkedHashMap | Stores key-value pairs with unique keys |



Overview of Classes
The table below gives an overview of the common data structure classes and their characteristics:

| Interface | Class | Description |
|-----------|-------|-------------|
| List | ArrayList | Resizable array that maintains order and allows duplicates |
| | LinkedList | List with fast insert and remove operations |
| Set | HashSet | Unordered collection of unique elements |
| | TreeSet | Sorted set of unique elements (natural order) |
| | LinkedHashSet | Maintains the order in which elements were inserted |
| Map | HashMap | Stores key/value pairs with no specific order |
| | TreeMap | Sorted map based on the natural order of keys |
| | LinkedHashMap | Maintains the order in which keys were inserted |
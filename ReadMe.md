# **Project: SortingQuestion — Implement Bubble Sort on a Singly Linked List**

## **Objective**

Your task is to implement **Bubble Sort** on a **Singly Linked List of integers**.
The project consists of four predefined classes:

1. **Node.java**
2. **SinglyLinkedList.java**
3. **BuildLinkedListHelper.java**
4. **MyMain.java**

You must **complete the sort() method** in `MyMain.java` to sort the linked list using the Bubble Sort algorithm.

---

## **Project Description**

In this project, you are given a complete implementation of:

### **Node.java**

Represents one node of the singly linked list.
Each node stores:

* `data` → integer value
* `next` → reference to next node

### **SinglyLinkedList.java**

Contains:

* `insert(int data)` → inserts a new node at the beginning
* `traverse()` → prints all elements
* `getHead()` → returns head of the list

### **BuildLinkedListHelper.java**

Provides a ready-made linked list containing the elements:

```
26 → 8 → 45 → 15 → 2 → 56 → 1 → null
```

### **MyMain.java**

You must complete:

* `sort(SinglyLinkedList linkedList)` → **implement Bubble Sort on the linked list**
* Call this method in `main()` and print the sorted list

---

## **Your Task**

### **1. Implement Bubble Sort on a Singly Linked List**

You must complete the `sort()` method inside `MyMain.java`.

#### Requirements:

* Use the **Bubble Sort algorithm** (repeatedly compare adjacent nodes and swap their data).
* ⚠ **Do NOT convert the linked list into an array** — sorting must be done *directly* on the linked list.
* Swap only the **data**, not the nodes.
* Continue passes until no swaps occur.

---

## **Expected Behavior**

Before sorting, the list prints as:

```
26-->8-->45-->15-->2-->56-->1-->null
```

After calling `sort()` and printing again, the result should be:

```
1-->2-->8-->15-->26-->45-->56-->null
```

---

## **Hints (Optional)**

* Use two nested loops:

    * Outer loop continues until no swap happens
    * Inner loop traverses adjacent nodes
* Be careful with `null` checks
* You can use `Node current = linkedList.getHead()`

---

## **Output Example**

```
Before Sorting:
26-->8-->45-->15-->2-->56-->1-->null

After Sorting:
1-->2-->8-->15-->26-->45-->56-->null
```

---



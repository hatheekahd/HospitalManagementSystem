# Hospital Management System

A Mini Hospital Emergency Management System built using Java, implementing core data structures as part of the CIT300 - Data Structures and Algorithms Mid Assignment.

## Overview

This system simulates the management of patients arriving at a hospital, including patient registration, emergency treatment requests, treatment completion, and patient visit history.

## Data Structures Used

### 1. Binary Search Tree (BST) - Patient Records
- Stores patient records using Patient ID as the key
- Supports Insert, Search, Delete, and In-Order Traversal
- Files: `Patient.java`, `PatientBST.java`, `MainBST.java`

### 2. Queue - Emergency Patient Queue
- Manages patients waiting for emergency treatment using the FIFO principle
- Supports Enqueue, Dequeue, and Display operations
- Files: `EmergencyQueue.java`, `MainQueue.java`

### 3. Stack - Treatment History
- Stores completed treatment records using the LIFO principle
- Supports Push, Pop, and Display operations
- Files: `Treatment.java`, `TreatmentStack.java`, `MainStack.java`

### 4. Singly Linked List - Patient Visit History
- Stores each patient's previous hospital visits
- Supports Add, Remove, Search, and Display operations
- Files: `Visit.java`, `VisitHistory.java`, `MainVisit.java`

## Project Structure

    HospitalManagementSystem/
    ├── src/
    │   └── hospital/
    │       ├── Patient.java
    │       ├── PatientBST.java
    │       ├── MainBST.java
    │       ├── EmergencyQueue.java
    │       ├── MainQueue.java
    │       ├── Treatment.java
    │       ├── TreatmentStack.java
    │       ├── MainStack.java
    │       ├── Visit.java
    │       ├── VisitHistory.java
    │       └── MainVisit.java
    └── README.md

## How to Run

1. Clone this repository
2. Open the project in Eclipse IDE
3. Run each Main class separately to test each data structure:
   - `MainBST.java` - Tests the Binary Search Tree operations (Insert, Search, Delete, In-Order Traversal)
   - `MainQueue.java` - Tests the Emergency Queue operations (Enqueue, Dequeue, Display)
   - `MainStack.java` - Tests the Treatment History Stack operations (Push, Pop, Display)
   - `MainVisit.java` - Tests the Patient Visit History Linked List operations (Add, Remove, Search, Display)

## Sample Output

Each Main class prints its operations to the console, showing:
- Data being added to the structure
- The structure's contents before and after operations
- Search results
- Proper handling of empty structures

## Author

MAH. Hatheek Ahamed

## Technologies Used

- Java
- Eclipse IDE
- Git & GitHub
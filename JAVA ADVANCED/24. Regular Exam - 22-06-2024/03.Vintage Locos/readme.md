
# Vintage Locomotives

## Introduction
Vintage locomotives are fascinating pieces of engineering history, embodying the evolution of rail transportation over the years. Characterized by their distinctive designs and steam-powered engines, these locomotives have played a crucial role in the development of modern railroads.

## Preparation
- **Skeleton Download:** Download the provided skeleton from Judge.
- **Package Name:** Ensure the package is named `vintageLocos`.
- **Structure Adherence:** Do not change the packages and adhere strictly to the naming conventions and project structure as described in the documentation.

## Problem Description
Your task is to develop a repository that efficiently stores information about various locomotives through the creation of specified classes.

### Locomotive Class
- **Attributes**:
  - `name`: String (All names are unique)
  - `builder`: String
  - `buildDate`: LocalDate
  - `gauge`: int
  - `weight`: int
  - `maxSpeed`: int
- **Constructor**:
  - Should initialize with parameters for all attributes.
- **Methods**:
  - Getters and setters for all attributes.
  - Override the `toString()` method to format:
    ```java
    "This {locomotive name} is made by {builder} at {build date formatted as 'dd.MM.yyyy'}."
    ```
    Use `DateTimeFormatter` of pattern `"dd.MM.yyyy"` for date formatting.

### TrainStation Class
- **Attributes**:
  - `name`: String
  - `capacity`: int
  - `railGauge`: int
  - `locomotives`: List<Locomotive>
- **Constructor**:
  - Initializes `name`, `capacity`, and `railGauge`.
  - Initializes `locomotives` as a new collection.
- **Methods**:
  - `addLocomotive(Locomotive locomotive)`: Adds a locomotive if there is space and the gauge matches, otherwise outputs relevant error messages.
  - `removeLocomotive(String name)`: Removes a locomotive by name, returns true if successful.
  - `getFastestLocomotive()`: Returns a string describing the fastest locomotive, or states "There are no locomotives."
  - `getLocomotive(String name)`: Returns a locomotive by name or null if not found.
  - `getCount()`: Returns the number of locomotives.
  - `getOldestLocomotive()`: Returns the name of the oldest locomotive or a message if none exist.
  - `getStatistics()`: Returns a formatted string listing all locomotives or a message if none are present.

### Constraints
- The name, build date, and max speed of each locomotive will always be unique.
- A locomotive is added to the station before any operations that manipulate the collection of locomotives.

### Examples
Provide practical examples demonstrating the usage of the `TrainStation` class, illustrating how locomotives are managed and queried within the system.



<img width="353" alt="locomotive" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/a687264e-3492-4c38-b409-204de13f38ef">

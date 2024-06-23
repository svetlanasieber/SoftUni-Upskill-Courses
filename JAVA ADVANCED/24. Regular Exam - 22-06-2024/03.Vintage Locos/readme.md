# Vintage Locomotives Repository

Vintage locomotives are fascinating pieces of engineering history, embodying the evolution of rail transportation over the years. These locomotives, often characterized by their distinctive designs and steam-powered engines, played a crucial role in the development of modern railroads.

## Preparation

Download the skeleton provided in Judge. Do not change the packages! Pay attention to name the package `vintageLocos`, and ensure all the classes, their fields, and methods are named exactly as presented in this document. It is also important to keep the project structure as described.

## Problem Description

Your task is to create a repository that stores locomotives by creating the classes described below.

### Locomotive

First, write a class `Locomotive` with the following properties:
- `name: String`
- `builder: String`
- `buildDate: LocalDate`
- `gauge: int`
- `weight: int`
- `maxSpeed: int`

The class constructor should receive `name`, `builder`, `buildDate`, `gauge`, `weight`, and `maxSpeed`. You need to create the appropriate getters and setters. All locomotive names will be unique. It is guaranteed that there will be no duplicates of names.

Override the `toString()` method in the following format:
Hint: You can use this to format the date:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
String formattedDate = LocalDate.from(getBuildDate()).format(formatter);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
String formattedDate = LocalDate.from(getBuildDate()).format(formatter);

"This train station is full!"

"The rail gauge of this station does not match the locomotive gauge! Difference: {the difference between the station gauge and the locomotive gauge in absolute value} mm."

"{locomotive name} is the fastest locomotive with a maximum speed of {locomotive maxSpeed} km/h."

"There are no locomotives."

"Locomotives departed from {train station name}:
1. {locomotive name}
2. {locomotive name}
(...)
n. {locomotive name}"

"There are no locomotives departing from {rail station name} station."

<img width="353" alt="locomotive" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/3389773e-ef55-4491-8e3a-38349d8ed2e4">


Vintage Locomotives Repository

Vintage locomotives are fascinating pieces of engineering history, embodying the evolution of rail transportation over the years. These locomotives, often characterized by their distinctive designs and steam-powered engines, played a crucial role in the development of modern railroads.

Preparation

Download the skeleton provided in Judge. Do not change the packages! Pay attention to name the package vintageLocos, and ensure all the classes, their fields, and methods are named exactly as presented in this document. It is also important to keep the project structure as described.

Problem description

Your task is to create a repository that stores locomotives by creating the classes described below.

Locomotive

First, write a class Locomotive with the following properties:
- name: String
- builder: String
- buildDate: LocalDate
- gauge: int
- weight: int
- maxSpeed: int

The class constructor should receive name, builder, buildDate, gauge, weight and maxSpeed. You need to create the appropriate getters and setters. All locomotive names will be unique. It is guaranteed that there will be no duplicates of names.

Override the toString() method in the following format:
"This {locomotive name} is made by {locomotive builder} at {locomotive build date in the format "dd.MM.yyyy"}."
Hint: You can use this to format the date:
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
String formattedDate = LocalDate.from(getBuildDate()).format(formatter);

TrainStation

Next, write a class TrainStation. The TrainStation class should have those properties:
- name: String
- capacity: int
- railGauge: int
- locomotives: List<Locomotive>

The class constructor should receive name, capacity and railGauge. Also, it should initialize the locomotives with a new collection instance. Implement the following features:

- Method addLocomotive(Locomotive locomotive) – adds an entity to the collection of locomotives if there is space for it and the rail gauge of the station matches the gauge of the locomotive. Otherwise, print:
"This train station is full!"
If the rail gauge of the station does not match the gauge of the locomotive print:
"The rail gauge of this station does not match the locomotive gauge! Difference: {the difference between the station gauge and the locomotive gauge in absolute value} mm."

- Method removeLocomotive(String name) – removes a Locomotive by given name, if such exists, and returns boolean (true if it is removed, otherwise – false)

- Method getFastestLocomotive() – returns String - the fastest locomotive by the speed in the given train station if there is one, in the following format:
"{locomotive name} is the fastest locomotive with a maximum speed of {locomotive maxSpeed} km/h."
If there are no locomotives in the station print:
"There are no locomotives."

- Method getLocomotive(String name) – returns the locomotive with the given name, otherwise – returns null

- Method getCount() – returns the count of locomotives in the given train station

- Method getOldestLocomotive() – returns String – the name of the oldest Locomotive in the given train station. Otherwise print:
"There are no locomotives."

- Method getStatistics() – returns a String in the following format (print the locomotives in order of addition):
"Locomotives departed from {train station name}:
1. {locomotive name}
2. {locomotive name}
(…)
n. {locomotive name}"
If there are no locomotives in some train stations print only this text:
"There are no locomotives departing from {rail station name} station."

Constraints

- The name, build date and max speed of the locomotive will always be unique.
- You will always have a locomotive added before receiving methods manipulating the TrainStation's locomotives.

Examples

Example 1

Input:
Locomotive("Vintage Express", "Olde Locomotive Co.", LocalDate.of(1923, 5, 14), 1435, 80000, 100)
TrainStation("Central Station", 5, 1435)
TrainStation.addLocomotive(locomotive)
TrainStation.getFastestLocomotive()

Output:
"Vintage Express is the fastest locomotive with a maximum speed of 100 km/h."

Example 2

Input:
Locomotive("Retro Runner", "Historic Railways", LocalDate.of(1895, 9, 30), 1067, 75000, 90)
TrainStation("East Junction", 2, 1435)
TrainStation.addLocomotive(locomotive)

Output:
"The rail gauge of this station does not match the locomotive gauge! Difference: 368 mm."

Example 3

Input:
Locomotive("Heritage Hauler", "Ancient Engines Inc.", LocalDate.of(1950, 12, 5), 1435, 90000, 85)
TrainStation("West Depot", 1, 1435)
TrainStation.addLocomotive(locomotive)
TrainStation.removeLocomotive("Heritage Hauler")
Trai




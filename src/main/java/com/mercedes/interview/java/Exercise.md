# Exercise 5

The objective of exercise 5 is to implement a service and its respective methods, where you can find the method 
signatures below.

## Step 1

Create the method `getAllVehiclesConstructionYearWithName` which receives as parameter a list of vehicles `vehicles` and
the vehicle name `name`. The return is a list with the construction year for all the vehicles with the name.

```java
List<Integer> getAllVehiclesConstructionYearWithName(final List<Vehicle> vehicles, final String name);
```

## Step 2

Create the method `getAllExtras` which receives as parameter a list of vehicles `vehicles` and returns all the extras
from all vehicles.

```java
List<String> getAllExtras(final List<Vehicle> vehicles);
```

### Question 6

Do you know any way to speed up this computation? Would it be possible to use it in this scenario?

### Bonus 🙏

Would it be possible to return only unique extras ?

## Step 3

Create the method `getVehicleWithConstructionYear` to get the first vehicle whose construction year matches with the one
received by the parameter `requiredConstructionYear`.

```java
Vehicle getVehicleWithConstructionYear(final List<Vehicle> vehicles, final int requiredConstructionYear);
```

### Question 7

If none is found, how would you deal with such case?

## Step 4

Create the method `getAnyVehicleWithName` to get the name of any vehicle, whose name matches with the one received by the
parameter `name`. The returned name should be prefixed with "Car", for example, for a vehicle named "A Class" would be 
returned "Car A Class".

```java
String getAnyVehicleWithName(final List<Vehicle> vehicles, final String name);
```

### Question 8

What are optionals, why and when are they useful?

### Question 9:

The keyword final precedes the declaration of every parameter on the methods above. 
What advantages do you see in this approach?

### Question 10:

Imagine that you had a bug in the implementation of your service, how would you find this bug, which tools would you use?

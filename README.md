# Week5S2
# Java Programming – Last 5 Problems

This repository contains solutions to five Java problems based on arrays, loops, methods, strings, 2D arrays, constructors, method overloading, encapsulation, and Java's standard library.

## 1. Fantasy Team Score Multiplier

**Topics:** Arrays, Methods, Arrays Passed by Reference

The program applies a 2× multiplier to the Captain's score and a 1.5× multiplier to the Vice-Captain's score. The original array is modified directly, and the method returns nothing.

**Method:**

```java
static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex)
```

**Example:**

```text
Input:  {40, 55, 30, 62}
Captain: Index 1
Vice-Captain: Index 3
Output: [40.0, 110.0, 30.0, 93.0]
```

Only the two specified positions are changed.

## 2. Duplicate Player Pick Checker

**Topics:** Arrays, Strings, Nested Loops

The program checks whether a player appears more than once in a fantasy lineup. It uses nested loops and compares names using `equals()`.

**Method:**

```java
static String findDuplicatePick(String[] playerNames)
```

The inner loop starts from `i + 1`, so each pair is checked only once. The method immediately returns when the first duplicate is found.

**Example:**

```text
Input:  {Kohli, Bumrah, Kohli, Rohit}
Output: Duplicate Found: Kohli
```

If there are no repeated names:

```text
No Duplicates Found
```

## 3. Top Performer Tracker

**Topics:** Arrays, Loops, Logical Thinking

The program finds the minimum score, maximum score, and the difference between them without sorting the array.

**Method:**

```java
static String findMinMaxSpread(int[] scores)
```

The array is scanned once using two running variables, `min` and `max`.

**Example:**

```text
Input:  {45, 82, 79, 90, 33, 90, 61}
Output: Min: 33 | Max: 90 | Spread: 57
```

This approach is efficient because it avoids unnecessary sorting.

## 4. Match Day Grid Analyzer

**Topics:** 2D Arrays, User-Defined Methods, Loops, Jagged Arrays

The program calculates the average runs scored in each match and classifies the match as either `Power Surge` or `Normal`.

**Methods:**

```java
static double rowAverage(int[] row)
static String classifyMatches(int[][] runsPerOver, int threshold)
```

The `rowAverage()` helper is called once for every match. The program uses `row.length`, allowing different matches to contain different numbers of overs.

**Example:**

```text
Input:
{ {4, 6, 8},
  {10, 12, 14},
  {2, 3, 1} }

Threshold: 8

Output:
Match 0: Normal | Match 1: Power Surge | Match 2: Normal
```

## 5. Fantasy League Auto-Draft Ranking Engine

**Topics:** Arrays, Method Overloading, Static Methods, Constructors, Encapsulation, `Comparable`, `Arrays.sort()`

The program determines which players are draftable and then ranks them according to their batting average.

The `Player` class contains private fields, demonstrating encapsulation, and has a parameterized constructor.

Two overloaded methods are used:

```java
static boolean isDraftable(int matchesPlayed)
static boolean isDraftable(int matchesPlayed, boolean injured)
```

Established players qualify through experience, while newer players must satisfy the experience and fitness requirements.

The class implements:

```java
Comparable<Player>
```

The `compareTo()` method sorts players in descending order of batting average. `Arrays.sort()` is then used to perform the ranking without writing a custom sorting algorithm.

**Example Output:**

```text
1. Rahul | 2. Virat | 3. Dev
```

## Concepts Practiced

* Creating and modifying arrays
* Passing arrays to methods
* Nested loops
* String comparison using `equals()`
* Single-pass array processing
* 2D and jagged arrays
* Helper methods
* Method overloading
* Static methods
* Constructors
* Encapsulation using `private`
* `Comparable` and `compareTo()`
* `Arrays.sort()`
* Returning strings and arrays
* Efficient algorithm design

## Conclusion

These five problems demonstrate how core Java concepts can be combined to solve practical fantasy-sports application problems. The solutions focus on clean methods, direct array manipulation, efficient loops, reusable code, and Java's built-in features.

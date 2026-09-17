# SGPA Calculator

A simple Java console application that calculates a student's Semester Grade Point Average (SGPA) based on the number of subjects, each subject's credit value, and the grade earned in that subject.

## Overview

This project is designed for quick academic grade calculation. It accepts input from the user, validates the grade values, and computes the final SGPA using the formula:

SGPA = Total Grade Points / Total Credits

Where:
- Grade points are based on the grade assigned to each subject
- Credits are the weight of each subject in the semester
- The final value is displayed to two decimal places

## Features

- Accepts the total number of subjects
- Prompts for credits and grades for each subject
- Validates incorrect grade entries
- Maps letter grades to grade points
- Calculates the overall SGPA
- Handles invalid input gracefully
- Displays a clear final result in the console

## Grade Mapping

The calculator uses the following grade-to-point system:

- S = 10
- A = 9
- B = 8
- C = 7
- D = 6
- E = 5
- F = 0

## Prerequisites

Before running the program, make sure Java is installed on your system.

- Java Development Kit (JDK) 8 or newer

## How to Run

1. Open a terminal or command prompt in the project directory.
2. Compile the Java file:

```bash
javac main.java
```

3. Run the program:

```bash
java SGPACalculator
```

## Example Usage

```text
Enter the number of subjects (e.g., EEE, Python, Calculus, etc.): 2

Subject 1:
Enter credits: 3
Enter expected grade (S, A, B, C, D, E, F): A

Subject 2:
Enter credits: 4
Enter expected grade (S, A, B, C, D, E, F): B

Your calculated SGPA is: 8.43
```

## Program Flow

The application works in the following sequence:

1. Reads the number of subjects
2. For each subject:
   - reads the credit value
   - reads the grade
   - validates the grade
   - adds the weighted grade points to the total
3. Calculates the final SGPA
4. Prints the result to the console

## File Structure

- `main.java` - Contains the SGPA calculation logic and user interaction
- `README.md` - Project documentation and instructions

## Notes

- The program expects valid grade inputs only: `S, A, B, C, D, E, F`
- If an invalid grade is entered, the user is prompted again until a valid grade is provided
- If total credits are 0, the program displays a message instead of attempting division by zero

## License

This project is intended for educational and personal use.

# Exercise 6.9

6.9 (CONVERSIONS BETWEEN FEET AND METERS) Write a class that contains the following two methods:


/** Convert from feet to meters */
public static double footToMeter(double foot)

/** Convert from meters to feet */
public static double meterToFoot(double meter)
The formula for the conversion is:


meter = 0.305 * foot
foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:

Unavailable image

# Exercise 7.1

*7.1 (ASSIGN GRADES) Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:

Grade is A if score is 
≥
 best 
−
10
;

Grade is B if score is 
≥
 best 
−
20
;

Grade is C if score is 
≥
 best 
−
30
;

Grade is D if score is 
≥
 best 
−
40
;

Grade is F otherwise.

The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, and concludes by displaying the grades. Here is a sample run:




Enter the number of students: 4 
Enter 4 scores: 40 55 70 58 
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
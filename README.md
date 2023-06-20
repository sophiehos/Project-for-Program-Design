# Project-for-Program-Design
Java Exercise 4
Chinese Zodiac
The order of the Chinese Zodiac is based on a 12-year cycle. The first zodiac corresponds to
years divisible by 12 (remainder 0), the second year corresponds to years that a produce a
remainder of 1 and so on. For instance, 2019 is the year of the Pig because 2019 divided by 12
produces a remainder of 3.
Write a program that asks the user to enter a year. The program should verify that the year is
valid (i.e. positive) and then indicate the type of year it is based on the Chinese Zodiac. Use a
switch statement with breaks to indicate the appropriate year.
The order of the years are as follows:
• Monkey
• Rooster
• Dog
• Pig
• Rat
• Ox
• Tiger
• Rabbit
• Dragon
• Snake
• Horse
• Sheep
A sample of the output is shown below:
Enter a year: -34
Enter anno domini (AD) years please!
Re-enter the year: 2019
The year 2019 is the year of the pig
BasketBall Bar Chart
Write a program that allows you to create a bar chart for the active members of a basketball
team during a game. (Recall: there are only 5 active players on the court per team in a standard
basketball game.)
Your program should do the following tasks:
1) Prompt the user to store the first name of the five players
2) Prompt the user to enter the points scored by each player
a. Use a do...while loop to check for input validation for the points (which cannot
be negative)
3) Calls a method to construct the chart for each player (based on the number of points).
The method should have the following characteristics:
a. The method accepts two parameters – the player name and the points scored by
that player
b. The method does not return a value
c. The method generates an asterisk (i.e. *) for every point scored. For instance, it
should display *** if the player scored 3 points. Use a for loop to generate the
asterisks.
d. Use the format method from the String class to align your player’s names
neatly. (See the following pages to learn how this is done!)
A sample of the output is shown below:
Enter the first names of the 5 players: Jaden Tommy Danny Mason
Bobby
Enter points earned by Jaden: 12
Enter points earned by Tommy: 6
Enter points earned by Danny: 4
Enter points earned by Mason: 1
Enter points earned by Bobby: 9
Points for Game
Jaden ************
Tommy ******
Danny ****
Mason *
Bobby *********
How to use the format method from the String class:
Why it should be used: Your chart may be out of alignment if the players’ names are of
different lengths. For example, the code below was done using the \t escape sequence:
Enter the first names of the 5 players: Kyle Jim John Daniel
Mason
Enter points earned by Kyle: 3
Enter points earned by Jim: 9
Enter points earned by John: 5
Enter points earned by Daniel: 7
Enter points earned by Mason: 2
Points for Game
Kyle ***
Jim *********
John *****
Daniel *******
Mason **
Notice that the chart for the longest name is out of alignment.
We want to fix this by using the format method for the String class. This will allow us to set the
width and justification of any string that is entered by the user.
To apply the format method, we use the syntax String.format(format specifier, variable) where
the format specifier indicates the type of formatting applied and the variable indicates what the
formatting will apply to.
Here is an example of the format method used in an output statement.
String n = "Todd";
System.out.print(String.format("%-15s", n));
System.out.print("is my name.");
The format specifier %-15s indicates that:
%s: the format applies to a string value
-: the value will be left justified
15: the value will be set within 15 spaces
This code produces the following output:
Todd is my name.
When applied to the assignment, here is how the output appears.
Enter the first names of the 5 players: Kyle Jim John Daniel
Mason
Enter points earned by Kyle: 3
Enter points earned by Jim: 9
Enter points earned by John: 5
Enter points earned by Daniel: 7
Enter points earned by Mason: 2
Points for Game
Kyle ***
Jim *********
John *****
Daniel *******
Mason **
Make sure to apply this syntax in your assignment!

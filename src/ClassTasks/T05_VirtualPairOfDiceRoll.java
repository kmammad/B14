package ClassTasks;

public class T05_VirtualPairOfDiceRoll {

    public static void main(String[] args) {

        // WRITE YOUR CODE HERE

        int dice1 = (int) (Math.random()*6 + 1);

        System.out.println("First Dice Roll Result: " + dice1);

        int dice2 = (int)(Math.random()*6 + 1);

        System.out.println("Second Dice Roll Result: " + dice2);

        System.out.print("Sum of Pair of Dice Rolls " + (dice1 + dice2));

    }
}
/**
 VIRTUAL PAIR OF DICE ROLL

 Create a program that simulates throwing a pair of six-sided dice.

 Task Description:

 1. Simulate Pair of Dice Roll:

 - For each die in the pair, use the Math.random() method to generate a random number between 1 and 6 (inclusive) for simulating a dice roll.
 - Calculate the sum of the numbers rolled by the pair of dice.

 2. Display the Results:

 - Print out the result of each individual dice roll and the combined result (sum) of rolling the pair of dice.


 EXAMPLE:

 First Dice Roll Result: 3
 Second Dice Roll Result: 5
 Sum of Pair of Dice Rolls: 8
 */

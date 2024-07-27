import java.util.Scanner;
import java.util.Random;
public class GuessingGame 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Random random=new Random();
boolean playAgain=true;
int totalScore=0;
int round=1;
while(playAgain) 
{
int numberToGuess=random.nextInt(100) + 1;
int numberOfAttempts=0;
boolean hasGuessedCorrectly=false;
int maxAttempts=10;
System.out.println("Round"+round+": Guess the number between 1 and 100. You have "+maxAttempts+" attempts.");
while (numberOfAttempts < maxAttempts && !hasGuessedCorrectly) 
{
System.out.print("Enter your guess: ");
int userGuess=sc.nextInt();
numberOfAttempts++;
if (userGuess==numberToGuess)
{
System.out.println("Congratulations! You guessed the correct number.");
hasGuessedCorrectly=true;
totalScore+=(maxAttempts - numberOfAttempts + 1); 
} 
else if(userGuess<numberToGuess) 
{
System.out.println("Too low! Try again.");
} 
else 
{
System.out.println("Too high! Try again.");
}
}
if(!hasGuessedCorrectly) 
{
System.out.println("Sorry, you've used all your attempts. The correct number was " +numberToGuess+".");
}
System.out.print("Do you want to play another round? (yes/no): ");
String response=sc.next();
playAgain = response.equalsIgnoreCase("yes");
round++;
}
System.out.println("Game over! Your total score is: "+totalScore);
sc.close();
}
}
import java.util.ArrayList;
import java.util.List; //Importing ArrayList class
import java.util.Scanner; //Importing Scanner class
public class Exercise3dot15 {
        public static void main(String[] args) { //Declaring main method
            

            Scanner myObj = new Scanner(System.in); //Creating a Scanner object
            System.out.println("Enter a lucky three digit number(Ex: 123): "); //Prompting the user to enter a lucky three digit number
            int luckyNumber = myObj.nextInt(); //variable storing the user input
            passLuckyNumber(luckyNumber); //calling the passLuckyNumber method

        }


        public static void passLuckyNumber(int luckyNumber ) { //Declaring method name that really is passLuckyNumber
            int randomLotteryNumber = 123; //variable storing a random number between 0 and 999


           List<Integer> luckyNumbersList = getLuckyNumbers(luckyNumber); //calling the getLuckyNumbers method and storing the result in a list

            List<Integer> lotteryNumbersList = getLotteryNumbers(randomLotteryNumber); //calling the getLotteryNumbers method and storing the result in a list
           

            System.out.println("Your lucky number is " + luckyNumber); //outputs the lucky number
            System.out.println("The lottery number is " + randomLotteryNumber);

            int sameDigits = 0; //variable storing the number of same digits in the list
            int maxNumberOfComparableDigits = 3; //variable storing the maximum number of comparable digits

            for (int counter = 0; counter < maxNumberOfComparableDigits; counter++) {
                int lotteryNumberChange = lotteryNumbersList.get
                (counter); //variable storing the lottery number
                if (randomLotteryNumber == luckyNumber) {
                    System.out.println("You win $10,000!!!! Congrats Tech Bro");
                    break;
                } if (luckyNumbersList.contains(lotteryNumberChange)) {
                    sameDigits++;
                }
            }
            
            if (randomLotteryNumber != luckyNumber) {
                if (sameDigits == 3) {
                    System.out.println("You win $3,000!!!! Congrats Medium Lucky Tech Bro");
                }
                if (sameDigits == 2 || sameDigits == 0) {
                    System.out.println("Sorry you lose Everything!!!! Try Again...rip");
                }
                if (sameDigits == 1) {
                    System.out.println("You win $1,000!!!! Congrats Low Lucky Tech Bro");
                }
            }

        
            //WHAT I WAS GOING TO DO BEFORE!!! \/\/\/\/\/
        //     if (randomLotteryNumber == luckyNumber) { //if the lottery number is the same as the user's lucky number
        //         System.out.println("You win $10,000!!!! Congrats Tech Bro"); //outputs the user wins
        // } else if (
        //     luckyNumbersList.contains(firstLotteryDigit) 
        //     && luckyNumbersList.contains(secondLotteryDigit)    //TESTING FOR TWO DIGITS BEING CONTAINED IN THE LIST
        //     && luckyNumbersList.contains(thirdLotteryDigit)) {
        //     System.out.println("You win $3,000!!!! Congrats Medium Lucky Tech Bro"); //outputs the user wins
        // } else if (
        // (luckyNumbersList.contains(firstLotteryDigit)
        // && !luckyNumbersList.contains(secondLotteryDigit) 
        // && !luckyNumbersList.contains(thirdLotteryDigit)) ||
        // (luckyNumbersList.contains(secondLotteryDigit)
        // && !luckyNumbersList.contains(firstLotteryDigit)            //TESTING FOR ONE DIGIT BEING CONTAINED
        // && !luckyNumbersList.contains(thirdLotteryDigit)) ||
        // (luckyNumbersList.contains(thirdLotteryDigit)
        // && !luckyNumbersList.contains(firstLotteryDigit)
        // && !luckyNumbersList.contains(secondLotteryDigit)) 
        // ) {
        //     System.out.println("You win $1,000!!!! Congrats Low Lucky Tech Bro");
        // } else {
        //     System.out.println("You lose Everything!!!! Try Again...rip");
        // }
            //WHAT I WAS GOING TO DO BEFORE!!! /\/\/\/\/\/\/\/\

    }

    public static List<Integer> getLuckyNumbers(int luckyNumber) {
        int firstLuckyDigit = luckyNumber % 10; //variable storing the first number
            List<Integer> luckyNumbersList = new ArrayList<>(); //creating an ArrayList object
            luckyNumbersList.add(firstLuckyDigit); //adding the first number to the ArrayList object

            int secondLuckyDigit = (luckyNumber / 10) % 10; //variable storing the second number
            luckyNumbersList.add(secondLuckyDigit); //adding the second number to the ArrayList object

            int thirdLuckyDigit = luckyNumber / 100; //variable storing the third number
            luckyNumbersList.add(thirdLuckyDigit); //adding the third number to the ArrayList object

            return luckyNumbersList; //returning the ArrayList object
    }

    public static List<Integer> getLotteryNumbers (int randomLotteryNumber) {
        
        int firstLotteryDigit = randomLotteryNumber % 10; //variable storing the first lottery number
        List<Integer> lotteryNumbersList = new ArrayList<>(); //creating an ArrayList object
        lotteryNumbersList.add(firstLotteryDigit); //adding the first lottery number to the ArrayList object

        int secondLotteryDigit = (randomLotteryNumber / 10) % 10; //variable storing the second lottery number
        lotteryNumbersList.add(secondLotteryDigit); //adding the second lottery number to the ArrayList object

        int thirdLotteryDigit = randomLotteryNumber / 100; //variable storing the third lottery number
        lotteryNumbersList.add(thirdLotteryDigit); //adding the third lottery number to the ArrayList object
        
        return lotteryNumbersList; //returning the ArrayList object
    }
}

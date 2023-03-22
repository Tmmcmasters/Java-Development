import java.util.Scanner; //Importing Scanner class
public class Exercise3dot15 {
        public static void main(String[] args) { //Declaring main method
            

            Scanner myObj = new Scanner(System.in); //Creating a Scanner object
            System.out.println("Enter a lucky three digit number(Ex: 123): "); //Prompting the user to enter a lucky three digit number
            int luckyNumber = myObj.nextInt(); //variable storing the user input


        }
        public static void passLuckyNumber(int luckyNumber ) { //Declaring method name that really is passLuckyNumber
            int randomLotteryNumber = (int)(Math.random() * 999); //variable storing a random number between 0 and 999


            int firstLuckyDigit = luckyNumber % 10; //variable storing the first number
            int secondLuckyDigit = (luckyNumber / 10) % 10; //variable storing the second number
            int thirdLuckyDigit = luckyNumber / 100; //variable storing the third number


            int firstLotteryDigit = randomLotteryNumber % 10; //variable storing the first lottery number
            int secondLotteryDigit = (randomLotteryNumber / 10) % 10; //variable storing the second lottery number
            int thirdLotteryDigit = randomLotteryNumber / 100; //variable storing the third lottery number

            System.out.println("Your lucky number is " + luckyNumber); //outputs the lucky number
            System.out.println("The lottery number is " + randomLotteryNumber);
            
            


        }

}

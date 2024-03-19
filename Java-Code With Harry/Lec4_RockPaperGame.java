import java.util.*;

public class Lec4_RockPaperGame {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome! to JAVA game.");
            Random rn = new Random();
            System.out.println("Rock, Paper and Scissor game : \n Select between (0-1-2-3) 3-Exit: ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Your turn : ");
            int n = sc.nextInt();
            //Human turn
            if (n == 0) {
                System.out.println("You've selected ROCK!");
            } else if (n == 1) {
                System.out.println("You've selected PAPER!");
            } else if (n == 2) {
                System.out.println("You've selected SCISSOR!");
            } else {
                System.out.println("Invalid number!");
            }

            //Computer turn
            int computer = rn.nextInt(3);
            if (computer == 0) {
                System.out.println("Computer selected ROCK!");
            } else if (computer == 1) {
                System.out.println("Computer selected PAPER!");
            } else if (computer == 2) {
                System.out.println("Computer selected SCISSOR!");
            } else {
                System.out.println("Invalid number!");
            }

            //Game - Conditions
            if (n == computer) {
                System.out.println("It's a tie!");
            } else if ((n == 0 && computer == 2) || (n == 1 && computer == 0) || (n == 2 && computer == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer win!");
            }
            System.out.println("Do you want to play again!(0/1) ");
            int  c = sc.nextInt();
//            choice = (c != 0);
            //we can also use break
            if (c == 0) {
                break;
            }
        }
        System.out.println("Thanks");

    }
}

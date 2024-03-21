import java.util.*;

class GuessNumber {
    private int number;


    private int tries;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public GuessNumber() {
        setNumber(new Random().nextInt(100));
        System.out.println(number);
    }

    public boolean isCorrectNumber(int n) {
        return (this.number == n);
    }

    public int getNumber() {
        return number;
    }

    public void detect() {

        System.out.println("Welcome! To Guess the number game");
        while (true) {

            System.out.println("Enter the number to guess the number : ");
            int n = new Scanner(System.in).nextInt();

//            System.out.println(getNumber());
            tries++;
            if (isCorrectNumber(n)) {
                System.out.println("Congratulations! You Won.");
                System.out.println("Number of Guesses : " + getTries());
                break;
            } else if (n > getNumber()) {
                System.out.println("You entered greater number.");
            } else if (n < getNumber()) {
                System.out.println("You entered less number");
            }
            continue;
        }

    }


}

public class Lec14_GuessNumber {
    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber();

        obj.detect();

    }
}

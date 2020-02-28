import java.util.Scanner;

public class Main {
    public static void Collatz(int newNumber){
        if(newNumber==1) System.out.println(1);
        else {
            if (newNumber % 2 == 0) {
                System.out.println(newNumber);
                Collatz(newNumber / 2);
            } else {
                System.out.println(newNumber);
                Collatz(newNumber * 3 + 1);
            }
        }
    }

    public static void main (String args[]){
        int newNumber =0;
        while (newNumber<1) {
            System.out.println("Enter a positive number");
            Scanner in = new Scanner(System.in);
            newNumber = in.nextInt();
            if (newNumber > 1) {
                Collatz(newNumber);
            } else {
                System.out.println("Error please enter a positive number");
            }
        }
    }
}

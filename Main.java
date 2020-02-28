import java.util.Scanner;

public class Main {
    public static int Collatz(int newNumber){
        while(newNumber != 1) {
            if (newNumber % 2 == 0) {
                System.out.println(newNumber);
                return Collatz(newNumber / 2);
            } else{
                System.out.println(newNumber);
                return Collatz(newNumber * 3 + 1);
            }
        }
        return 1;
    }

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int newNumber = in.nextInt();
        System.out.println(newNumber);
        Collatz(newNumber);
    }
}

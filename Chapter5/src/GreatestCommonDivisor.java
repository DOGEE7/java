import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        int gcd = 1;
        int k = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer:");
        int n2 = input.nextInt();
        while (k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.print("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}

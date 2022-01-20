import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n,i,factorial=1;
        System.out.print("Enter the number : ");
        n = Input.nextInt();
        for(i=n;i>0;i--)
        {
            factorial = factorial*i;
        }
        System.out.print("Factorial of the number is = "+factorial);

        Input.close();
    }
}

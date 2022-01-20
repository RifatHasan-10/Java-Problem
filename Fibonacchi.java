import java.util.Scanner;

class Fibonacchi {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n,num1=0,num2=1,sum,i;
        System.out.print("Enter the range of the series : ");
        n = Input.nextInt();
        System.out.print(num1+"  "+num2);

        for(i=3;i<=n;i++)
        {
            sum = num1 + num2;
            System.out.print(" "+sum);

            num1 = num2;
            num2 = sum;
        }
        Input.close();

    }    
}

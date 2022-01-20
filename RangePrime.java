import java.util.Scanner;

class RangePrime {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n, i, j, count = 0;
        System.out.print("Enter the range of the number : ");
        n = Input.nextInt();
        System.out.print(2 + " ");
        for (i = 3; i < n; i++) {
            int flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\n");
        System.out.print("Total prime number in the range : " + (count + 1));
        Input.close();
    }
}

import java.util.Scanner;

class One_to_n_number_while {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n, i = 1;
        n = Input.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        Input.close();
    }
}

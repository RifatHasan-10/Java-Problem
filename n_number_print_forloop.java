import java.util.Scanner;

class n_number_print_forloop {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n, i;
        n = Input.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
        Input.close();
    }
}

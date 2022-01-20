import java.util.Scanner;

class Area_of_circle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int r;
        float pi = 3.1416f,area;
        System.out.print("Enter the value of radious : ");
        r = Input.nextInt();
        area = pi*(r*r);
        System.out.print("The area of the circle is = "+area);

        Input.close();

    }    
}

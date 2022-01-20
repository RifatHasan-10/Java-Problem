import java.util.Scanner;

class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int base,height;
        float area;
        System.out.print("Enter the value of Base : ");
        base = Input.nextInt();
        System.out.print("Enter the value of Height : ");
        height = Input.nextInt();
        area = (1.0f/2)*(base*height);
        System.out.print("The area of the Triangle is = "+area);

        Input.close();
    }
}

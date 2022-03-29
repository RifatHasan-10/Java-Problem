import java.util.Scanner;

class simple_interest {
     public static void main(String[] args) {
        
        float interrest,p,r,t;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the principle Amount : ");
        p = Input.nextFloat();
        System.out.print("Enter the Rate per Annum : ");
        r = Input.nextFloat();
        System.out.print("Enter the Time : ");
        t= Input.nextFloat();

        interrest = (p*r*t)/100;

        System.out.print("Total Interest is = "+interrest);
        
    }
}

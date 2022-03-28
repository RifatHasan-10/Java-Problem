import java.util.Scanner;

class ascitochar {
    public static void main(String[] args) {
        char asci,result;
        int pot;
        Scanner Input = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the Charecter to convert or type 0 to break the loop : ");
            asci = Input.next().charAt(0);
            if(asci=='0')
            {
                break;
            }
            pot = (int)asci;
            if(pot >= 65 && pot <97)
            {
                result = (char)(pot + 32);
            }
            else
            {
                result = (char)(pot - 32);
            }
    
            System.out.println("The output is = "+result);
    
        }
        Input.close();
     
    }
}

import java.util.Scanner;


class hlw {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        int i;
        float f,c;
        while(true)
        {
            System.out.print("Press 1 for input cecious value or 2 for farenhite value and 0 for close : ");
            i = Input.nextInt();
            if(i==0)
            {
                break;
            }
    
            if(i==1)
            {
        
                System.out.print("Enter the value of celsious scale : ");
                c = Input.nextFloat();
                f = (c*(9/5))+32;
        
                System.out.print("Result in Faharnhite : "+f);
                System.out.println("");
            }
    
            else
            {
            System.out.print("Enter the value of Farenhite scale : ");
            f = Input.nextFloat();
            c = (f-32)*(5/9);
    
            System.out.print("Result in Celcious scale : "+c);
            System.out.println("");
            }
        }

  
    }
}


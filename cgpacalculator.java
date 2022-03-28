import java.util.Scanner;

class cgpacalculator {
    public static void main(String[] args) {
        
        float subject[] = new float[10];
        float credit[] = new float[10];
        int i=0,j=0,n;
        float sum_of_credit = 0,sum_of_gpa_with_crdt=0,result;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of subject : ");
        n = Input.nextInt();
        while(i<n && j<n)
        {
            System.out.print("Enter the GPA : ");
            subject[i] = Input.nextFloat();
            System.out.print("Enter the Credit of the subject : ");
            credit[j] = Input.nextFloat();
            i++;
            j++;
        }

        for(i=0;i<n;i++)
        {
            sum_of_gpa_with_crdt = sum_of_gpa_with_crdt +  (subject[i]*credit[i]);

        }

        for(i=0;i<n;i++)
        {
            sum_of_credit =  sum_of_credit + credit[i];
        }

        result = sum_of_gpa_with_crdt/sum_of_credit;

        System.out.print("YOUR CGPA IS = "+result);

        Input.close();

    }
}

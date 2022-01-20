class piramid2 {
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=0;i<8;i++)
        {
            for(j=0;j<(n-i);j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

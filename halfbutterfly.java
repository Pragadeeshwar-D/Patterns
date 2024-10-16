static void pattern9(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row*2 - 2*i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
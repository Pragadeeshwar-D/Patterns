static void pattern10(int row)
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
       for(int i=row-1;i>=1;i--)
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
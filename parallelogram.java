 static void pattern12(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=row;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
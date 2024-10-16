 static void pattern6(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=row;j>i;j--)
           {
               System.out.print(row-j+1+" ");
           }
           System.out.println();
       }
    }
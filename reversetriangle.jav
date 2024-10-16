  static void pattern5(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=row;j>i;j--)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }a
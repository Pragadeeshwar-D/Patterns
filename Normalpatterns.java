  static void pattern(int row,int col)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern1(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<i;j--)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern2(int row,int col)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {   
               if(i==0||j==0||i==row-1||j==col-1)
               System.out.print("*");
               else
               System.out.print(" ");
               
           }
           System.out.println();
       }
    }
    static void pattern3(int row,int col)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {   
               System.out.print(j);
               
           }
           System.out.println();
       }
    }
    static void pattern4(int row,int col)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {   
               System.out.print(i);
               
           }
           System.out.println();
       }
}
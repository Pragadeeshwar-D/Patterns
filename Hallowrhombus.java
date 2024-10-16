 static void pattern18(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {   
              if(j==(2*i)-1|| j==1)
               System.out.print("*");
               else
               System.out.print(" ");
               
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
       for(int i=row-1;i>=1;i--)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {   
               if(i==row||j==(2*i)-1|| j==1)
               System.out.print("*");
               else
               System.out.print(" ");
               
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
       
    }
class dimensional
{
 public static void main(String[] args)
  {
    int a,b,c,d;       
    /*int X[]={1,2,3,4};
    int Y[]={6,7,8,9};
    int Z[]={10,11,12,13};*/
    
    int p[][]={
               {1,2,3,4},
               {6,7,8,9},
               {0,1,2,3}
              };

   for(int i=0;i<4;i++) 
   {
       for(int j=0;j<4;j++)
       {
         System.out.print(p[i][j]+"\t");
       } 
       System.out.println("");
   }
    
     
  }

}


public class Mario1
{

public static void main(String [ ] args)
{

   int n;

   do
   {
       n = Integer.parseInt(System.console().readLine(""));
   }
   while(n == 0);


   int HashNum = 2;
   int SpaceNum = (n - 1);

   for(int i = 0 ; i < n ; i++)
   {

      String temp = "";
    
      for(int j = 0; j < SpaceNum ; j++)
      {
         temp += " ";
      }
    
      for(int j = 0; j < HashNum ; j++)
      {
         temp += "#";
      }

      System.out.println(temp);

      SpaceNum--;
      HashNum++;

   }
   
   
}

}
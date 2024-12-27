class Throw
{
   public static void validate(int age)throw Exception
   {
      if(age<18)
      {
         throw new Exception("age is not eligible to vote");
      }
      else
      {
         System.out.println("age is eligible to vote");
      }
   }
}
class Main
{
   public static void main(String args[])
   {
   try {
           validate(13);
   }
   catch(Exception e)
   {
      System.out.println(e); 
   }
   }
} 

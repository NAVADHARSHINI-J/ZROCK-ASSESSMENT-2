public class trycatch {
   public static void main(String[] args) {
      try{
         int a=9/0;
      }
      catch(ArithmeticException e){
         System.out.println("Divide by zero");
      }
   }
}

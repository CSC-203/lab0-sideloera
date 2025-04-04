import java.util.Arrays;

public class Lab00 {

   public static void main(String[] args) {
      // declaring, initializing, & printing variables
      int x = 5;
      String y = "hello";
      float z = 9.8f;
      System.out.println("x:" + x + "," + " y:" + y + "," + " z:" + z);

      // making an array
      int[] nums = {3, 6, -1, 2};
      for (int item : nums) {
         System.out.println(item);
      }

      // calling a function
      int numFound = char_count(y, 'l');
      System.out.println("FOUND: " + numFound);

      // counting FOR loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }

   }
   public static int char_count(String s, char c) {
      int count = 0;
      for (char i : s.toCharArray()) {
         if (i == c)
            count += 1;
      }
      return (count);

   }



}
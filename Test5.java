// find  smallest and largest value using stream


import java.util.Arrays;
import java.util.List;

public class Test5 {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11, 50, 25);
    System.out.println("List of numbers: " + nums);
    
    Integer secondSmallest = nums.stream()
      .distinct()
      .sorted()
      .skip(1)
      .findFirst()
      .orElse(null);

   
    Integer secondLargest = nums.stream()
      .distinct()
      .sorted((a, b) -> Integer.compare(b, a))
      .skip(1)
      .findFirst()
      .orElse(null);
    System.out.println("\nSecond smallest element: " + secondSmallest);
    System.out.println("\nSecond largest element: " + secondLargest);
  
   }
}
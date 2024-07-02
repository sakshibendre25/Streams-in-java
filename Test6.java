
// Removing  duplicates values using stream


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15, 24, 28, 15);
    System.out.println("Original List of numbers: " + nums);
    
    List < Integer > distinctNumbers = nums.stream()
      .distinct()
      .collect(Collectors.toList());
    System.out.println("After removing duplicates from the  list: " + distinctNumbers);
  
   }
}

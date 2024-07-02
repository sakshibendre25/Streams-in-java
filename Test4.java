// find minimum maximum value using stream


import java.util.Arrays;
import java.util.List;

public class Test4 {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11, 50, 25);
    System.out.println("Original list of numbers: " + nums);
  
    Integer max_val = nums.stream()
      .max(Integer::compare)
      .orElse(null);

 
    Integer min_val = nums.stream()
      .min(Integer::compare)
      .orElse(null);
    System.out.println("\nMaximum value of the said list: " + max_val);
    System.out.println("\nMinimum value of the said list: " + min_val);
    

    }
}
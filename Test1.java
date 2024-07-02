
//Calculate average using Stream



import java.util.Arrays;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1,5,10,15,20,25,30,35,40);
    System.out.println("List of numbers: " + nums);

    double average = nums.stream()
      .mapToDouble(Integer::doubleValue)
      .average()
      .orElse(0.0);
      

    System.out.println("Average value of the  numbers: " + average);
  
  
  }
}

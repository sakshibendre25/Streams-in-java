
// find even and odd numbers  using stream


import java.util.Arrays;
import java.util.List;

public class Test7 {
  public static void main(String[] args) {
    List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 20, 18, 21);

   
    int sumOfEvens = numbers.stream()
      .filter(num -> num % 2 == 0)
      .mapToInt(Integer::intValue)
      .sum();
    System.out.println("Sum of even numbers: " + sumOfEvens);

    
    int sumOfOdds = numbers.stream()
      .filter(num -> num % 2 != 0)
      .mapToInt(Integer::intValue)
      .sum();
    System.out.println("Sum of odd numbers: " + sumOfOdds);
  
  }
}
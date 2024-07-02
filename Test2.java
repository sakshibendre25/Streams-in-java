// Converting list into lowecase and uppercase using stream


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
  public static void main(String[] args) {
    List < String > flowers = Arrays.asList("Rose", "Jasmine", "LILY", "Lotus", "dahila", "Tulip", "IRIS", "Aster" );
    System.out.println("List of strings: " + flowers);
    
    List < String > uppercaseStrings = flowers.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println("\nUppercase Strings: " + uppercaseStrings);


    List < String > lowercaseStrings = flowers.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());
    System.out.println("Lowercase Strings: " + lowercaseStrings);
  
  
   }
}
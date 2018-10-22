package commons.collections;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BidiMapTester {


   public static void main(String[] args) {
      BidiMap<String, String> bidi = new TreeBidiMap<>();

      bidi.put("One", "1");
      bidi.put("Two", "2");
      bidi.put("Three", "3");

      System.out.println(bidi.get("One")); 
      System.out.println(bidi.getKey("1"));
      System.out.println("Original Map: " + bidi);

      bidi.removeValue("1"); 
      System.out.println("Modified Map: " + bidi);
      BidiMap<String, String> inversedMap = bidi.inverseBidiMap();  
      System.out.println("Inversed Map: " + inversedMap);
   }
}
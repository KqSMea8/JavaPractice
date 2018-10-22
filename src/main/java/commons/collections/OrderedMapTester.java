package commons.collections;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class OrderedMapTester {

   //保留添加元素的顺序
   public static void main(String[] args) {
      OrderedMap<String, String> map = new LinkedMap<String, String>();
      map.put("One", "1");
      map.put("Two", "2");
      map.put("Three", "3");

      System.out.println(map.firstKey());
      System.out.println(map.nextKey("One"));
      System.out.println(map.nextKey("Two"));  
   }
}

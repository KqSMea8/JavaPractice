package java.map.TreeMap;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @author dz on 2018/11/16.
 */
public class TreeMapTest {


        public static void main(String[] args) {

            Map<String,Object> hashMap = new HashMap<String,Object>();
            hashMap.put("1", "a");
            hashMap.put("5", "b");
            hashMap.put("2", "c");
            hashMap.put("4", "d");
            hashMap.put("3", "e");
            Set<Map.Entry<String, Object>> entry = hashMap.entrySet();
            for(Map.Entry<String, Object> temp : entry){
                System.out.println("hashMap:"+temp.getKey()+" 值"+temp.getValue());
            }

            System.out.println("\n");

            SortedMap<String,Object> sortedMap = new TreeMap<String,Object>();
            sortedMap.put("1", "a");
            sortedMap.put("5", "b");
            sortedMap.put("2", "c");
            sortedMap.put("4", "d");
            sortedMap.put("3", "e");
            Set<Map.Entry<String, Object>> entry2 = sortedMap.entrySet();
            for(Map.Entry<String, Object> temp : entry2){
                System.out.println("sortedMap:"+temp.getKey()+" 值"+temp.getValue());
            }

        }

        @Test
        public void testTreeMap(){
            Map<String,Object> hashMap = new HashMap<String,Object>();
            hashMap.put("1b", "a");
            hashMap.put("2", "b");
            hashMap.put("4b", "d");
            hashMap.put("3", "c");
            hashMap.put("2b", "d");
            hashMap.put("3b", "c");
            Set<Map.Entry<String, Object>> entry = hashMap.entrySet();
            for(Map.Entry<String, Object> temp : entry){
                System.out.println("hashMap:"+temp.getKey()+" 值"+temp.getValue());
            }

            System.out.println("\n");

            SortedMap<String,Object> sortedMap = new TreeMap<String,Object>();
            sortedMap.put("1b", "a");
            sortedMap.put("2", "b");
            sortedMap.put("4b", "d");
            sortedMap.put("3", "c");
            sortedMap.put("2b", "d");
            sortedMap.put("3b", "c");
            Set<Map.Entry<String, Object>> entry2 = sortedMap.entrySet();
            for(Map.Entry<String, Object> temp : entry2){
                System.out.println("sortedMap:"+temp.getKey()+" 值"+temp.getValue());
            }


        }
}

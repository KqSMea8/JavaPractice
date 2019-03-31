package java.commons.collections;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtilsTester {

   //检查是否为空元素
   public static void main(String[] args) {
      List<String> list = new LinkedList<String>();

      CollectionUtils.addIgnoreNull(list, null);
      CollectionUtils.addIgnoreNull(list, "a");

      System.out.println(list);

      if(list.contains(null)) {
         System.out.println("Null value is present");
      } else {
         System.out.println("Null value is not present");
      }
   }

   //合并两个排序列表
   @Test
   public void collateTest(){
      List<String> sortedList1 = Arrays.asList("A","C","E");
      List<String> sortedList2 = Arrays.asList("B","D","F");
      List<String> mergedList = CollectionUtils.collate(sortedList1, sortedList2);
      System.out.println(mergedList);
   }

   //collect()方法可用于将一种类型的对象列表转换为不同类型的对象列表。
   @Test
   public void collectTest(){
      List<String> stringList = Arrays.asList("1","2","3");

      List<Integer> integerList = (List<Integer>) CollectionUtils.collect(stringList,
              new Transformer<String, Integer>() {

                 @Override
                 public Integer transform(String input) {
                    return Integer.parseInt(input);
                 }
              });

      System.out.println(integerList);
   }

   @Test
   public void filterTest(){
      List<Integer> integerList = new ArrayList<Integer>();
      integerList.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

      System.out.println("Original List: " + integerList);
      CollectionUtils.filter(integerList, new Predicate<Integer>() {

         @Override
         public boolean evaluate(Integer input) {
            if(input.intValue() % 2 == 0) {
               return true;
            }
            return false;
         }
      });

      System.out.println("Filtered List (Even numbers): " + integerList);
   }

   //检查列表是否为null而不用担心null列表
   @Test
   public void isNotEmptyTest(){
      List<String> list = getList();
      System.out.println("Non-Empty List Check: " + checkNotEmpty1(list));
      System.out.println("Non-Empty List Check: " + checkNotEmpty2(list));
   }
   static List<String> getList() {
      return null;
   }
   static boolean checkNotEmpty1(List<String> list) {
      return !(list == null || list.isEmpty());
   }

   static boolean checkNotEmpty2(List<String> list) {
      return CollectionUtils.isNotEmpty(list);
   }

   //isSubCollection()方法可用于检查集合是否包含给定集合。
   @Test
   public void isSubCollectionTest(){
      //checking inclusion
      List<String> list1 = Arrays.asList("A","A","A","C","B","B");
      List<String> list2 = Arrays.asList("A","A","B","B");

      System.out.println("List 1: " + list1);
      System.out.println("List 2: " + list2);
      System.out.println("Is List 2 contained in List 1: "
              + CollectionUtils.isSubCollection(list2, list1));
   }

   //用于获取两个集合(交集)之间的公共对象部分。
   @Test
   public void intersectionTest(){
      //checking inclusion
      List<String> list1 = Arrays.asList("A","A","A","C","B","B");
      List<String> list2 = Arrays.asList("A","A","B","B");

      System.out.println("List 1: " + list1);
      System.out.println("List 2: " + list2);
      System.out.println("Commons Objects of List 1 and List 2: "
              + CollectionUtils.intersection(list1, list2));
   }

   //用于通过从其他集合中减去一个集合的对象来获取新集合。
   @Test
   public void subtractTest(){
      //checking inclusion
      List<String> list1 = Arrays.asList("A","A","A","C","B","B");
      List<String> list2 = Arrays.asList("A","A","B","B");

      System.out.println("List 1: " + list1);
      System.out.println("List 2: " + list2);
      System.out.println("List 1 - List 2: "
              + CollectionUtils.subtract(list1, list2));
   }

   //用于获取两个集合的联合。
   @Test
   public void unionTest(){
      //checking inclusion
      List<String> list1 = Arrays.asList("A","A","A","C","B","B");
      List<String> list2 = Arrays.asList("A","A","B","B");

      System.out.println("List 1: " + list1);
      System.out.println("List 2: " + list2);
      System.out.println("Union of List 1 and List 2: "
              + CollectionUtils.union(list1, list2));
   }

}
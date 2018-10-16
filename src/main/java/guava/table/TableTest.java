package guava.table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
import com.google.common.collect.Tables;

import java.util.Map;
import java.util.Set;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/10/4.
 */
public class TableTest {
    public static void main(String[] args) {
        Table<String,String,Integer> table = HashBasedTable.create();
        table.put("a", "javase", 80);
        table.put("b", "javase", 90);
        table.put("a", "javame", 100);
        table.put("d", "guava", 70);

        //得到所有的行数据
        Set<Cell<String,String,Integer>> cellset = table.cellSet();

        for(Cell<String,String,Integer> temp:cellset){
            System.out.println(temp.getRowKey()+"--"+temp.getColumnKey()+"--"+temp.getValue());
        }

        System.out.println("-------rowKey和columnKey转换---------");
        Table<String,String,Integer> table1 = Tables.transpose(table);
        Set<Cell<String,String,Integer>> cellset1 = table1.cellSet();

        for(Cell<String,String,Integer> temp:cellset1){
            System.out.println(temp.getRowKey()+"--"+temp.getColumnKey()+"--"+temp.getValue());
        }

        System.out.println("-------按学生查看成绩---------");

        System.out.print("学生\t");
        Set<String> cours = table.columnKeySet();
        for(String temp:cours){
            System.out.print(temp+"\t");
        }

        System.out.println();

        Set<String> stu = table.rowKeySet();
        for(String temp:stu){
            System.out.print(temp);
            Map<String,Integer> map = table.row(temp);
            for(String temp1:cours){
                System.out.print("\t"+map.get(temp1));
            }
            System.out.println();
        }

        System.out.println("-------按课程查看成绩---------");

        System.out.print("课程\t");
        Set<String> stu1 = table.rowKeySet();
        for(String temp:stu1){
            System.out.print(temp+"\t");
        }

        System.out.println();

        Set<String> cours1 = table.columnKeySet();
        for(String temp:cours1){
            System.out.print(temp);
            Map<String,Integer> map1 = table.column(temp);
            for(String temp1:stu1){
                System.out.print("\t"+map1.get(temp1));
            }
            System.out.println();
        }
    }


}

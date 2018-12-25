package lombok;

import org.apache.calcite.rel.rules.SortUnionTransposeRule;

@ToString
public class Test {

    public static void main(String[] args) {
        System.out.println("hello !");
        Test test = new Test();
        System.out.println(test.toString());
    }

    @Override
    public String toString() {
        return "new";
    }
}

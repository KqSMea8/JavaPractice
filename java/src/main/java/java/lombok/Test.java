package java.lombok;

import lombok.ToString;
import lombok.extern.log4j.Log4j;

@ToString
@Log4j
public class Test {

    public static void main(String[] args) {
        System.out.println("hello !");
        Test test = new Test();
        System.out.println(test.toString());
        log.info("log");
    }

    @Override
    public String toString() {
        return "new";
    }
}

package java8.Assert;

public class AssertTest {

    public static void main(String[] args) {
        assert false : "Not safe at all";

        assert ( args.length > 0);
    }
}

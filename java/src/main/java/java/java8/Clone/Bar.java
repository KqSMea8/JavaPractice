package java.java8.Clone;

/**
 * @author dz on 2019/1/17.
 */
class Bar implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package java8.Clone;

/**
 * 在这种情况下，浅拷贝具有相同的引用(==)，而深拷贝仅具有等效引用(.equals())。
 *
 * 如果对浅复制引用的值进行更改，则副本将反映该更改，因为它共享相同的引用。
 * 如果对深度复制的引用的值进行更改，则副本不会反映该更改，因为它不共享相同的引用。
 */
public class Foo {

  public Bar myBar;

  public Foo shallowCopy() {
    Foo newFoo = new Foo();
    newFoo.myBar = myBar;
    return newFoo;
  }

  public Foo deepCopy() throws CloneNotSupportedException {

    Foo newFoo = new Foo();

    //clone方法执行的是浅拷贝
    // 覆盖Object中的clone方法， 实现深拷贝
    newFoo.myBar = (Bar) myBar.clone(); //or new Bar(myBar) or myBar.deepCopy or ...
    return newFoo;

  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Foo myFoo = new Foo();
    Foo sFoo = myFoo.shallowCopy();
    Foo dFoo = myFoo.deepCopy();

    //myFoo.myBar == sFoo.myBar => true
    //myFoo.myBar.equals(sFoo.myBar) => true
    //myFoo.myBar == dFoo.myBar => **false**
    //myFoo.myBar.equals(dFoo.myBar) => true

    System.out.println(myFoo.myBar == sFoo.myBar);
    System.out.println(myFoo.myBar.equals(sFoo.myBar));
    System.out.println(myFoo.myBar == dFoo.myBar);
    System.out.println(myFoo.myBar.equals(dFoo.myBar));
  }
}

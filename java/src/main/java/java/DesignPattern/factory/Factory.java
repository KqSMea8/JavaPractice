package java.DesignPattern.factory;

class Factory{

    public static Animal getInstance(String className) {
        //通过equal方法在确定类的实例
         Animal ani = null;
        if("cat".equals(className)) {
            ani = new Cat();
        }
        if("dog".equals(className)) {
            ani = new Dog();
        }
        return ani;
    }
}
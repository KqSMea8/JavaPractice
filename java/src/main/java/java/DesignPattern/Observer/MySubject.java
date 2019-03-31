package java.DesignPattern.Observer;

class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("udpate self");
        notifyObservers();
    }
    
}
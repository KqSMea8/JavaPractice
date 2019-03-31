package java.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class AbstractSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        Iterator<Observer> ite = observers.iterator();
        while(ite.hasNext()) {
            ite.next().updata();
        }
    }
}
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题/通知者
 */
public abstract class Subject {

    // 订阅者列表
    private List<Observer> observers = new ArrayList<>();

    // 订阅
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 取消订阅
    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 通知所有订阅者有内容有更新了
    public void notifyObservers(String msg){
        observers.forEach(observer -> observer.onUpdate(msg));
    }
}

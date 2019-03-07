package memento;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        // 本来是on的
        originator.setState("on");
        System.out.println("本来是开启的");
        careTaker.setMemento(originator.saveStateMemento());
        System.out.println("子线程负责保存状态");
        System.out.println("然后设置状态");
        originator.setState("off");
        System.out.println("现在的state: "+originator.getState());
        System.out.println("突然后悔，迅速rollback");
        originator.setState(careTaker.getMemento().getState());
        System.out.println("现在："+originator.getState());
    }
}

package mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void notifyMsg(String msg) {
        System.out.println(getClass().getName()+" 收到的消息："+msg);
    }
}

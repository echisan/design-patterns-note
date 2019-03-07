package mediator;

// 类似于服务吧。。
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMsg(String msg);

    public abstract void notifyMsg(String msg);
}

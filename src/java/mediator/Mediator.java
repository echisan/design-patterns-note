package mediator;

// 协调者，感觉有点类似于zookeeper，eureka的感觉
public abstract class Mediator {
    public abstract void send(String msg,Colleague colleague);
}

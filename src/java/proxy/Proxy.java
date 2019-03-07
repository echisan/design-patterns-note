package proxy;

public class Proxy implements Subject {

    Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void run() {
        System.out.println(getClass().getName()+" enhance..");
        subject.run();
    }
}

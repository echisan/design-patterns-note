package proxy;

public class RealSubject implements Subject {
    @Override
    public void run() {
        System.out.println(getClass().getName()+"-->run()");
    }
}

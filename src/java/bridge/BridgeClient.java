package bridge;

public class BridgeClient {
    public static void main(String[] args) {
        Abstraction a = new AbstractionA("a");
        a.setImplementor(new ConcreteImplementorA());
        a.operation();

        a.setImplementor(new ConcreteImplementorB());
        a.operation();


    }
}

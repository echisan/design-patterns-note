package abstractfactory;

public class Client {
    public static void main(String[] args) {
        Factory a1 = new ConcreteA1Factory();
        a1.createProductA().doSomething();
        a1.createProductB().saySomething();

        Factory b2 = new ConcreteB2Factory();
        b2.createProductA().doSomething();
        b2.createProductB().saySomething();
    }
}

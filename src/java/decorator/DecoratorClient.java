package decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        GoodbyeConcreteDecorator goodbyeConcreteDecorator = new GoodbyeConcreteDecorator(concreteComponent);
        HelloConcreteDecorator helloConcreteDecorator = new HelloConcreteDecorator(goodbyeConcreteDecorator);

        helloConcreteDecorator.operation();
    }
}

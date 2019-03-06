package decorator;

public class GoodbyeConcreteDecorator extends Decorator {
    public GoodbyeConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("被这个装饰器装饰过的类在具体操作完都会说goodbye");
    }
}

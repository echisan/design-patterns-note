package decorator;

public class HelloConcreteDecorator extends Decorator {
    public HelloConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("被这个装饰器装饰过的组件在具体操作之前都会说hello的");
        super.operation();

    }
}

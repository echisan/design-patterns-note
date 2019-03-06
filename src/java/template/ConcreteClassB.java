package template;

public class ConcreteClassB extends AbstractTemplate {
    @Override
    public void method1() {
        System.out.println(getClass().getName()+" method1");
    }

    @Override
    public void method2() {
        System.out.println(getClass().getName()+" method2");
    }
}

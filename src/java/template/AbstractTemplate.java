package template;

// 这是一个稳定的类，变化方法交由子类实现
public abstract class AbstractTemplate {
    public abstract void method1();
    public abstract void method2();

    public void templateMethod(){
        method1();
        method2();
        System.out.println("template method over");
    }
}

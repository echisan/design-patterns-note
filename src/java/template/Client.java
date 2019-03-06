package template;

public class Client {
    public static void main(String[] args) {
        AbstractTemplate classA = new ConcreteClassA();
        classA.templateMethod();


        AbstractTemplate classB = new ConcreteClassB();
        classB.templateMethod();
    }
}

package visitor;

public class VisitorClient {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();

        Element ea = new ElementA();
        ea.accept(visitor);

        Element eb = new ElementB();
        eb.accept(visitor);

    }
}

package visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("visitor element a");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("visitor element b");
    }
}

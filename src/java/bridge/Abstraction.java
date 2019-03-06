package bridge;

public abstract class Abstraction {
    private Implementor implementor;
    private String name;

    public Abstraction(String name) {
        this.name = name;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        System.out.println("Abstraction-"+name+": ");
        implementor.operation();
    }
}

class AbstractionA extends Abstraction{


    public AbstractionA(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }
}

class AbstractionB extends Abstraction{


    public AbstractionB(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }
}

package mediator;

public class ConcreteMediator extends Mediator {

    protected Colleague c1;
    protected Colleague c2;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague==c1){
            c2.notifyMsg(msg);
        }else{
            c1.notifyMsg(msg);
        }
    }

    public Colleague getC1() {
        return c1;
    }

    public void setC1(Colleague c1) {
        this.c1 = c1;
    }

    public Colleague getC2() {
        return c2;
    }

    public void setC2(Colleague c2) {
        this.c2 = c2;
    }


}

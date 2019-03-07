package mediator;

public class MediatorClient {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague cc1 = new ConcreteColleague1(mediator);
        Colleague cc2 = new ConcreteColleague2(mediator);

        mediator.c1 = cc1;
        mediator.c2 = cc2;


        cc1.sendMsg("c2你好呀");
        cc2.sendMsg("你好鸭");
    }
}

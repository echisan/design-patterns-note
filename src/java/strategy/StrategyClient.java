package strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context(new AStrategy());
        context.exec();


        context.strategy = new BStrategy();
        context.exec();
    }
}

package adapter;

public class AdapterClient {
    public static void main(String[] args) {
        IAdapter adapter = new Adapter();
        ITarget target = new Target(adapter);
        target.getUp();
        target.learnWhileEatingBreakfast();
    }
}

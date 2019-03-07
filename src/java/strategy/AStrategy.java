package strategy;

public class AStrategy implements Strategy {
    @Override
    public void run() {
        System.out.println(getClass().getName());
    }
}

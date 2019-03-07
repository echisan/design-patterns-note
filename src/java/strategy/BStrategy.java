package strategy;

public class BStrategy implements Strategy {
    @Override
    public void run() {
        System.out.println(getClass().getName());
    }
}

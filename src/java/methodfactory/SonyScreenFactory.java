package methodfactory;

public class SonyScreenFactory implements Factory {
    @Override
    public Product createProduct() {
        return new SonyScreen();
    }
}

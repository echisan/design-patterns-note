package methodfactory;

public class XiaomiScreenFactory implements Factory {
    @Override
    public Product createProduct() {
        return new XiaomiScreen();
    }
}

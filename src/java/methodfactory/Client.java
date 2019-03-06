package methodfactory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new SonyScreenFactory();
        Product product = factory.createProduct();
        product.play();


        Factory factory1 = new XiaomiScreenFactory();
        Product product1 = factory1.createProduct();
        product1.play();
    }
}

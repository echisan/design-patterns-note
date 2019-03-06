package decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体的操作");
    }
}

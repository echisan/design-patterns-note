package adapter;

public class Adapter implements IAdapter {
    @Override
    public void getUp() {
        System.out.println("起床");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("吃早餐");
    }

    @Override
    public void learn() {
        System.out.println("学习");
    }
}

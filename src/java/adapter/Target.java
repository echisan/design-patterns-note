package adapter;

public class Target implements ITarget {
    IAdapter iAdapter;

    public Target(IAdapter iAdapter) {
        this.iAdapter = iAdapter;
    }

    @Override
    public void getUp() {
        iAdapter.getUp();
    }

    @Override
    public void learnWhileEatingBreakfast() {
        iAdapter.eatBreakfast();
        iAdapter.learn();
    }
}

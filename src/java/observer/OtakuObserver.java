package observer;

// 肥宅观察者
public class OtakuObserver extends Observer{

    // 当关注的动画有更新了
    @Override
    public void onUpdate(String msg) {
        System.out.println("【肥宅】 动画："+msg+" 更新了马上去看，看爆");
    }
}


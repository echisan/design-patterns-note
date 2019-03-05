package observer;

// 社畜
public class ShachikuObserver extends Observer{

    // 社畜也订阅了动画，当动画更新了
    @Override
    public void onUpdate(String msg) {
        System.out.println("【社畜】 虽然动画："+msg+" 更新了，但是我是社畜，没时间看");
    }
}

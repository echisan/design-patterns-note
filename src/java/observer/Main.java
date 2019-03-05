package observer;

public class Main {

    public static void main(String[] args) {

        // 服务端发布了海贼王，火影主题
        OnepieceSubject onepieceSubject = new OnepieceSubject();
        NarutoSubject narutoSubject = new NarutoSubject();

        // 用户从客户端订阅了主题

        // 肥宅全都订阅了
        OtakuObserver otakuObserver = new OtakuObserver();
        onepieceSubject.attach(otakuObserver);
        narutoSubject.attach(otakuObserver);

        // 社畜时间本来也不多，只订阅了火影
        ShachikuObserver shachikuObserver = new ShachikuObserver();
        narutoSubject.attach(shachikuObserver);

        // 服务端对火影海贼王主题进行了更新
        onepieceSubject.notifyObservers("海贼王 999集");
        narutoSubject.notifyObservers("火影忍者 898集");

        // 此时用户会得到通知后进行相应的操作了
    }
}

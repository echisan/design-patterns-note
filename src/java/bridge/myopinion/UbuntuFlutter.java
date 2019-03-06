package bridge.myopinion;

public class UbuntuFlutter extends Flutter {

    public UbuntuFlutter(NativeInvoke nativeInvoke) {
        super(nativeInvoke);
    }

    @Override
    public void drawUI() {
        getNativeInvoke().invoke();
        System.out.println("Flutter UI on Ubuntu");
    }
}

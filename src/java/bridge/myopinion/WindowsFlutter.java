package bridge.myopinion;

public class WindowsFlutter extends Flutter {
    public WindowsFlutter(NativeInvoke nativeInvoke) {
        super(nativeInvoke);
    }

    @Override
    public void drawUI() {
        getNativeInvoke().invoke();
        System.out.println("Flutter UI on Windows");
    }
}

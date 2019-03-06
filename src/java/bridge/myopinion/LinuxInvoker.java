package bridge.myopinion;

public class LinuxInvoker extends NativeInvoke {
    @Override
    public void invoke() {
        System.out.println("Linux-->invoke()");
    }
}

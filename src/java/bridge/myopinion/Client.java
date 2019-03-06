package bridge.myopinion;

public class Client {
    public static void main(String[] args) {
        NativeInvoke linuxInvoker = new LinuxInvoker();
        Flutter ubuntuFlutter = new UbuntuFlutter(linuxInvoker);
        ubuntuFlutter.drawUI();

        NativeInvoke windowsInvoker = new WindowsInvoke();
        Flutter windowsFlutter = new WindowsFlutter(windowsInvoker);
        windowsFlutter.drawUI();
    }
}

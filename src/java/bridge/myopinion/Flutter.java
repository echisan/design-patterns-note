package bridge.myopinion;

// 假设是个跨平台的ui框架
public abstract class Flutter {
    private NativeInvoke nativeInvoke;

    public Flutter(NativeInvoke nativeInvoke) {
        this.nativeInvoke = nativeInvoke;
    }

    public abstract void drawUI();

    public NativeInvoke getNativeInvoke() {
        return nativeInvoke;
    }

    public void setNativeInvoke(NativeInvoke nativeInvoke) {
        this.nativeInvoke = nativeInvoke;
    }
}

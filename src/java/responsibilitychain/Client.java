package responsibilitychain;

public class Client {
    public static void main(String[] args) {
        CharsetFilter charsetFilter = new CharsetFilter();
        TestCharsetFilter testCharsetFilter = new TestCharsetFilter();

        charsetFilter.setFilterChain(testCharsetFilter);

        charsetFilter.doFilter(new Request());
    }
}

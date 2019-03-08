package responsibilitychain;

public class TestCharsetFilter extends FilterChain {

    @Override
    public void doFilter(Request request) {
        request.map.put("test",getClass().getName());
        System.out.println(request);

        doFilterChain(request);
    }
}

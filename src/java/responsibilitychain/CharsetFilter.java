package responsibilitychain;

public class CharsetFilter extends FilterChain {

    @Override
    public void doFilter(Request request) {
       request.map.put("charset","utf-8");
       doFilterChain(request);
    }
}

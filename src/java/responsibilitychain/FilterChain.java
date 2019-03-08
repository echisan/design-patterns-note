package responsibilitychain;

public abstract class FilterChain {
    private FilterChain filterChain;

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public abstract void doFilter(Request request);

    public void doFilterChain(Request request){
        if (this.filterChain!=null){
            filterChain.doFilter(request);
        }
    }
}

package responsibilitychain;

import java.util.HashMap;
import java.util.Map;

public class Request {
    public Map<String,String> map = new HashMap<>();
    @Override
    public String toString() {
        return "Request{" +
                "map=" + map +
                '}';
    }
}

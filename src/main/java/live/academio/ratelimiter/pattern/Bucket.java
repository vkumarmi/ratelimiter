package live.academio.ratelimiter.pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bucket {
    private Map<Bandwidth,Long> bandwidths;

    private Bucket(){
        bandwidths=new ConcurrentHashMap<>();
    }
    public Bucket addLimit(Bandwidth bandwidth,Long limit){
        bandwidths.put(bandwidth,limit);
        return this;
    }
}

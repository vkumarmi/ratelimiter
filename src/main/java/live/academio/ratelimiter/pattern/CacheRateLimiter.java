package live.academio.ratelimiter.pattern;

public class CacheRateLimiter implements RateLimiter{
    @Override
    public boolean tryConsume() {
        return false;
    }
}

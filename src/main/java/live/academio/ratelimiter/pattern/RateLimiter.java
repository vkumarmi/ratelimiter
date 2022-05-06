package live.academio.ratelimiter.pattern;

public interface RateLimiter {
    public boolean tryConsume();
}

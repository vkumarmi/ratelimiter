package live.academio.ratelimiter.pattern;

public class Bandwidth {

    private final User user;

    private final Endpoint endpoint;

    public Bandwidth(User user, Endpoint endpoint) {
        this.user = user;
        this.endpoint = endpoint;
    }

}

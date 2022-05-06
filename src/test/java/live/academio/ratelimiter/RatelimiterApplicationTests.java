package live.academio.ratelimiter;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class RatelimiterApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void rateLimiterTest(){
		Bucket bucket= Bucket4j.builder()
				.addLimit(Bandwidth.classic(10, Refill.intervally(10, Duration.ofMinutes(1))))
				.addLimit(Bandwidth.classic(5,Refill.intervally(5,Duration.ofSeconds(20))))
				.build();
		for (int i=1;i<=5;i++){
			Assertions.assertTrue(bucket.tryConsume(1));
		}
		Assertions.assertFalse(bucket.tryConsume(1));
	}

}

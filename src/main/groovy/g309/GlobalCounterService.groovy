package g309
import org.springframework.stereotype.Service

import java.util.concurrent.atomic.AtomicLong

@Service
class GlobalCounterService {

    private AtomicLong counter = new AtomicLong(0)

    Long get() {
        counter.get()
    }

    Long inc() {
        counter.incrementAndGet()
    }

}

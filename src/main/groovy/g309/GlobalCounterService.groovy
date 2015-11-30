package g309

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service

import java.util.concurrent.atomic.AtomicLong

@Service
@Slf4j
class GlobalCounterService implements ICount, LogInitAndDestroy {

    private AtomicLong counter = new AtomicLong(0)

    Long get() {
        counter.get()
    }

    Long inc() {
        counter.incrementAndGet()
    }

}

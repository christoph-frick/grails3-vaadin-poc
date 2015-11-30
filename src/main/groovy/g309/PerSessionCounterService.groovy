package g309

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service
import org.vaadin.spring.annotation.VaadinUIScope

import java.util.concurrent.atomic.AtomicLong

@Service
@VaadinUIScope
@Slf4j
class PerSessionCounterService implements ICount, LogInitAndDestroy {

    private AtomicLong counter = new AtomicLong(0)

    Long get() {
        counter.get()
    }

    Long inc() {
        counter.incrementAndGet()
    }

}

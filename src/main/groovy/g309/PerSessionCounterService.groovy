package g309

import org.springframework.stereotype.Service
import org.vaadin.spring.annotation.VaadinUIScope

import java.util.concurrent.atomic.AtomicLong

@Service
@VaadinUIScope
class PerSessionCounterService {

    private AtomicLong counter = new AtomicLong(0)

    Long get() {
        counter.get()
    }

    Long inc() {
        counter.incrementAndGet()
    }

}

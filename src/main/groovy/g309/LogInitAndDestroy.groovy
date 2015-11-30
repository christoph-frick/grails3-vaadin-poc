package g309

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean

@Slf4j // not inherited?
trait LogInitAndDestroy implements InitializingBean, DisposableBean {

    @Override
    void afterPropertiesSet() throws Exception {
        log.debug "Created $this"
    }

    @Override
    void destroy() throws Exception {
        log.debug "Destroy $this"
    }

}
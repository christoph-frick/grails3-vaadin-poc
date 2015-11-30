package g309
import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import org.springframework.beans.factory.annotation.Autowired
import org.vaadin.spring.annotation.VaadinUI

@VaadinUI(path = "/admin")
@Theme("g309")
class AdminUI extends UI {

    final GlobalCounterService globalCounterService
    final PerSessionCounterService perSessionCounterService

    @Autowired
    AdminUI(GlobalCounterService globalCounterService, PerSessionCounterService perSessionCounterService) {
        this.globalCounterService = globalCounterService
        this.perSessionCounterService = perSessionCounterService
    }

    @Override
    protected void init(VaadinRequest request) {
        def bb = { ICount counter ->
            new Button(counter.get().toString()).with{
                addClickListener({
                    caption = counter.inc().toString()
                })
                it
            }
        }
        setContent(
                new VerticalLayout(bb(globalCounterService), bb(perSessionCounterService))
        )
    }
}

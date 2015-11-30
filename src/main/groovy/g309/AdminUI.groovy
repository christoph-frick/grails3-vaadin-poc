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
        setContent(
                new VerticalLayout(
                        new Button(globalCounterService.get().toString()).with{
                            addClickListener({
                                caption = globalCounterService.inc().toString()
                            })
                            it
                        },
                        new Button(perSessionCounterService.get().toString()).with{
                            addClickListener({
                                caption = perSessionCounterService.inc().toString()
                            })
                            it
                        }
                )
        )
    }
}

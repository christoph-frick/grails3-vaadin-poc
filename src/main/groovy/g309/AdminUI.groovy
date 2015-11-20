package g309

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.themes.ValoTheme
import org.vaadin.spring.annotation.VaadinUI

@VaadinUI(path = "/admin")
@Theme("g309")
class AdminUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Hello World").with{
            addStyleName(ValoTheme.LABEL_H1)
            it
        })
    }
}

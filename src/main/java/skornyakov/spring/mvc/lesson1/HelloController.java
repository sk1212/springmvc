package skornyakov.spring.mvc.lesson1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import skornyakov.spring.mvc.lesson1.beans.MessageBean;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class HelloController implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping("/hello")
    public String printHello(ModelMap model){
        ArrayList<String> messages = new ArrayList<String>();
        if(applicationContext.containsBean("message")){
            for (int i = 0; i<10; i++) {
                MessageBean mb = (MessageBean) applicationContext.getBean("message");
                messages.add(mb.getMessage());
            }
            model.addAttribute("messages",messages);
        }
        return "messages";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
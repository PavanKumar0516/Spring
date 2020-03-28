import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/display")
	public ModelAndView display() {
		Date date=new Date();
		return new ModelAndView("display","date",date);
	}
}

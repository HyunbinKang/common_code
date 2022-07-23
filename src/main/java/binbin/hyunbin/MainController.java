package binbin.hyunbin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("main")
    public String Main(Model model){
        model.addAttribute("data", "start!!!!");

        return "main";
    }
}

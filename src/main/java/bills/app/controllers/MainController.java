package bills.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("welcome", "Hello world!");
        model.addAttribute("pagetitle", "Main Page");
        return "index";
    }

}

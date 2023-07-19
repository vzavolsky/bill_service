package bills.app.controllers;

import bills.app.entities.User;
import bills.app.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(
            @ModelAttribute User user,
            HttpSession session
    ) {
        return "/user/index";
    }

    @PostMapping
    public String authUser(
            @ModelAttribute User user,
            HttpSession session,
            Model model
    ) {
        User checkUser = userService.userExists(user);
        model.addAttribute("user", checkUser);
        session.setAttribute("user", checkUser);

        return "redirect:/user";
    }
}

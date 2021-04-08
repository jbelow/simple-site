package jbelow.simplesite;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/aboutMe")
    public String doForward() {
        return "pages/about";
    }

    @RequestMapping("/greatTutorial")
    public String doRedirect() {
        return "pages/tutorialHowToCount";
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}

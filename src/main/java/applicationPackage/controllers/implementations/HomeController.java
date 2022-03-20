package applicationPackage.controllers.implementations;

import applicationPackage.data.implementation.Menu;
import applicationPackage.data.implementation.MenuItem;
import applicationPackage.data.implementation.MenuType;
import applicationPackage.data.implementation.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;

@Controller
public class HomeController {

    @GetMapping ("/Home")
    public String home() {
        return "home";
    }
}

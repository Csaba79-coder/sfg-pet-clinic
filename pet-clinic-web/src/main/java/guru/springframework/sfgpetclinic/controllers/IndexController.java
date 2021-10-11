package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // All the parameters will match for the requests! the root, the / the index and the index.html also works!
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        // it is enough not needed index.html!!!
        return "index";
    }
}

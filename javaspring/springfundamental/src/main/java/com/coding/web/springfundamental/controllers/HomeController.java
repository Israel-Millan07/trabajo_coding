package com.coding.web.springfundamental.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
//    @RequestMapping("/")
//    public String index() {
//        return "index.jsp";
//    }
 // ...
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("dojoName", "Burbank");
        return "index.jsp";
    }
 // ...
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="user") String user, @RequestParam(value="password") String password) {
          // ... procesar la información y guardarla en la Session
          return "redirect:/dashboard";
    }
// ...
// ...

}



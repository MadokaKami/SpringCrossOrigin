package kami.liyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("toHome")
    public ModelAndView toHome(ModelAndView modelAndView){
        modelAndView.setViewName("/home");
        return modelAndView;
    }
}

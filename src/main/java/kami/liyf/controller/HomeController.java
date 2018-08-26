package kami.liyf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/toHome")
    public ModelAndView toHome(ModelAndView modelAndView){
        modelAndView.setViewName("/home");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/testAjax")
    @CrossOrigin
    public String testAjax(String key){
        Map<String, Object> map = new HashMap<>();
        map.put("return", key + 888);
        ModelAndView modelAndView = new ModelAndView("/home",map);
        return "12345678";
    }
}

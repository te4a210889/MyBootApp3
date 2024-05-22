package com.example.demo;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
* Hello world!
*/
@Controller

public class HelloController
{
    //@RequestMapping("/taro")
    //public String index() {
        //return "taro desu!";
    //}
    @RequestMapping("/miyagi")
    public String miyagi() {
        return "Miyagi desu!";
    }

   // @RequestMapping("/")
   // public String index(Model model) {
        //return "this is Spring Boot sample.";
        //return "index";
    //}

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "this is a setting message");
        return "index";
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public ModelAndView postForm(@RequestParam("text1") String text1) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("msg", "you write '" + text1 + "'!!!");
        return mv;
    }

}

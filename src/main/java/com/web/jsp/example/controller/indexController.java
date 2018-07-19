package com.web.jsp.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fx on 2018/7/19.
 */
@Controller
@RequestMapping("/index")
public class indexController {

    @RequestMapping("")
    public ModelAndView index(Model model){
        ModelAndView modelAndView = new ModelAndView("/index");
        System.out.println("1");
        modelAndView.addObject("id","123");
        return modelAndView;
    }
}

package com.example.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello pillar");
        logger.error("参数验证失败");
        
        
        return "index";
    }
}
package com.mert.spring;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getHomePage(){
        return "index";
    }
    
    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String getWelcomePage(){
        return "index";
    }
    
    @RequestMapping(value="/about", method = RequestMethod.GET)
    public String getAboutPage(){
        return "about";
    }
    
    @RequestMapping(value="/contact", method = RequestMethod.GET)
    public String getContactPage(){
        return "contact";
    }
    
    @RequestMapping(value="/instructors", method = RequestMethod.GET)
    public String getInstructorsPage(){
        return "instructors";
    }
    
    @RequestMapping(value="/classes", method = RequestMethod.GET)
    public String getClassesPage(){
        return "classes";
    }
    
    @RequestMapping(value="/blog", method = RequestMethod.GET)
    public String getBlogPage(){
        return "blog";
    }
    
    @RequestMapping(value="/singlepost", method = RequestMethod.GET)
    public String getSinglePostPage(){
        return "singlepost";
    }

}
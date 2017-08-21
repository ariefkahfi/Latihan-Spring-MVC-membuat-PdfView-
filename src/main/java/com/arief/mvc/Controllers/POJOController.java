package com.arief.mvc.Controllers;

import com.arief.mvc.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arief on 8/21/2017.
 */
@Controller
public class POJOController {


    @Autowired
    private ApplicationContext context;


    @RequestMapping("/pojo1")
    public String getPOJO(Model m){
        m.addAttribute("person",context.getBean("person"));
        return "pojo-view";
    }

    @RequestMapping("/pojo2")
    public String getPOJO2(Model m){
        m.addAttribute("person",context.getBean("person2"));
        return "pojo-view";
    }

}

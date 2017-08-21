package com.arief.mvc.Controllers;

import com.arief.mvc.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Arief on 8/21/2017.
 */
@Controller
public class MainController {


    @RequestMapping("/home")
    public String homeView(){
        return "home";
    }

    @RequestMapping("/download-pdf")
    public ModelAndView pdfView(){
        List<Person> data = new ArrayList<Person>();


        data.add(new Person(111,"Arief"));
        data.add(new Person(222,"Putro"));
        data.add(new Person(333,"Hello World"));
        data.add(new Person(444,"Zack"));


        return new ModelAndView("pdf","person",data);

    }


}

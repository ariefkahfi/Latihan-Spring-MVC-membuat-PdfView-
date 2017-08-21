package com.arief.mvc.Controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Arief on 8/21/2017.
 */
public class SimpleUrlHandllerControllerClass extends AbstractController {

    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView model = new ModelAndView("tes");
        model.addObject("pesan","This Controller Mapped by SimpleUrlHandlerControllerClass");
        return model;
    }
}

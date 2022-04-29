package com;

import org.springframework.stereotype.Controller;
import org.springframework.test.context.event.RecordApplicationEvents;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    //controller to show initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //controller to process HTML form

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // new controller method to read form data
    //add data to model

    @RequestMapping("/processFormVersionTwo")
    public String letsAddData(HttpServletRequest request, Model model){

        //read the reuest paramtere from the HTML form
        String theName = request.getParameter("studentName");
        // convert data to all caps
        theName = theName.toUpperCase();
        //create the message
        String res = "Yoo!!" + theName;
        // add message to model
        model.addAttribute("message",res);
        //name , value
        return "helloworld";
    }
}

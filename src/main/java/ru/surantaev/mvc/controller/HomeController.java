package ru.surantaev.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/emp_details")
    public String empDetails() {
        return "emp_details";
    }

    @RequestMapping("/show_details")
    public String showDetails(HttpServletRequest request, Model model) {
        String name = request.getParameter("empName");
        String emplastName = request.getParameter("emplastName");
        name = "MR. " + name;
        model.addAttribute("name", name);
        model.addAttribute("lastName", emplastName);
        return "show_details";
    }
}

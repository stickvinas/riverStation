package com.example.JavaProject;

import com.example.JavaProject.repositories.*;
import com.example.JavaProject.repositories.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
    @Autowired()
    adminLogsRepository adminlogs;
    @Autowired()
    userLogsRepository userlogs;

    @GetMapping("/greeting")
    public String login(Model model) {

        model.addAttribute("logs", new Logs());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String login(@ModelAttribute("logs") Logs logs, Model model) {
        System.out.println(logs.getUsername() + " " + logs.getPassword());
        for (AdminLogs lgs : adminlogs.findAll()) {
            if ((lgs.getUSERNAME().equals(logs.getUsername()) && lgs.getPASSWORD().equals(logs.getPassword()))) {
                Authorization.get(true).setAttribute("id", lgs.getID());
                Authorization.get(true).setAttribute("admin", true);
                return "redirect:/homePage";
            }
        }
        for (UserLogs lgs : userlogs.findAll()) {
            if ((lgs.getUSERNAME().equals(logs.getUsername()) && lgs.getPASSWORD().equals(logs.getPassword()))) {
                Authorization.get(true).setAttribute("id", lgs.getID());
                Authorization.get(true).setAttribute("admin", false);
                return "redirect:/homePage";
            }
        }
        model.addAttribute("logs", new Logs());
        return "greeting";
    }
}

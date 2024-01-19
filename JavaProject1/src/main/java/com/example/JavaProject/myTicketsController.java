package com.example.JavaProject;

import com.example.JavaProject.repositories.*;
import com.example.JavaProject.repositories.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class myTicketsController {
    @Autowired()
    selectTicketsRepository ticketsRepos;


    @GetMapping("/myTickets")
    public String myTickets(Model model) {
        if ((boolean) Authorization.get(true).getAttribute("admin")) {
            return "Error";
        }

        List<myTickets> tickets = new ArrayList<>();
        for (myTickets ticket: ticketsRepos.findAll()) {
            if (ticket.getUSERID()!=null && ticket.getUSERID().equals((Integer)Authorization.get(true).getAttribute("id"))){
                tickets.add(ticket);
            }
        }
        model.addAttribute("ticket", tickets);
        return "myTickets";
    }
    @PostMapping("/myTickets")
    public String myTickets(@ModelAttribute Filter filters){
        Filter filter = filters;
        return "redirect:/myTickets";
    }
}
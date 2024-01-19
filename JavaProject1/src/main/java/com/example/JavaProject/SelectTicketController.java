package com.example.JavaProject;

import com.example.JavaProject.repositories.cruisesRepository;
import com.example.JavaProject.repositories.models.Cruises;
import com.example.JavaProject.repositories.models.myTickets;
import com.example.JavaProject.repositories.selectTicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SelectTicketController {

    @Autowired()
    selectTicketsRepository ticketsRepos;

    @Autowired()
    cruisesRepository cruisesRepository;


    @GetMapping("/selectTicket")
    public String selectTickets(Model model){
        List<myTickets> tickets = new ArrayList<>();
        Cruises tmp = (Cruises) model.asMap().get("tmp");
        for(Cruises cruises : cruisesRepository.findAll()){
            if(cruises.getID()==tmp.getID()) tmp=cruises;
        }
        for (myTickets tcks: ticketsRepos.findAll()){
            if(tcks.getCRUISESHIPID() == tmp.getCRUISESHIPID() && tcks.getUSERID()==null)
                tickets.add(tcks);
        }
        model.addAttribute("selectedTickets", tickets);
        model.addAttribute("tmp", new myTickets());
        return "selectTicket";
    }

    @PostMapping("/selectTicket")
    public String selectTickets(@ModelAttribute myTickets tmp){
        for (myTickets tcks: ticketsRepos.findAll()){
            if(tcks.getID()==tmp.getID())
                tcks.setUSERID((Integer) Authorization.get(true).getAttribute("id"));
                ticketsRepos.save(tcks);
        }
        return "redirect:/myTickets";
    }

}

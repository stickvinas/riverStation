package com.example.JavaProject;

import com.example.JavaProject.repositories.*;
import com.example.JavaProject.repositories.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    Filter filter = null;
    @Autowired()
    cruisesRepository crrepos;
    @Autowired()
    homePageRepository repos;
    @Autowired()
    cruiseShipsRepository reposz;
    @Autowired()
    placesRepository placesRepos;
    @Autowired()
    selectTicketsRepository ticketrepos;

    @PostMapping("/AdminPanel")
    public String homeAdmin(@ModelAttribute cruisePlaces place, Model model){
        try{
            placesRepos.save(place);
            return "redirect:/homePage";
        } catch (Exception e) {
            System.out.println(place);
            model.addAttribute("place", place);
            model.addAttribute("error", true);
            return "AdminPanel";
        }
    }
    @PostMapping("/AddShip")
    public String shipsAdmin(@ModelAttribute cruiseShips ships, Model model){
        try{
            reposz.save(ships);
            return "redirect:/homePage";
        } catch (Exception e) {
            System.out.println(ships);
            model.addAttribute("ships", ships);
            model.addAttribute("error", true);
            return "AdminPanel";
        }
    }
    @GetMapping("/AddShip")
    public String shipsAdmin(Model model) {
        System.out.println("asd");
        if ((boolean) Authorization.get(true).getAttribute("admin")) {
            System.out.println("ads");
            model.addAttribute("ships", new cruiseShips());
            model.addAttribute("error", false);
            return "AddShip";
        }
        return "AddShip";
    }

    @PostMapping("/AddTicket")
    public String ticketsAdmin(@ModelAttribute myTickets tickets, Model model){
        try{
            ticketrepos.save(tickets);
            return "redirect:/homePage";
        } catch (Exception e) {
            System.out.println(tickets);
            model.addAttribute("tickets", tickets);
            model.addAttribute("error", true);
            return "AdminPanel";
        }
    }
    @GetMapping("/AddTicket")
    public String ticketsAdmin(Model model) {
        System.out.println("asd");
        if ((boolean) Authorization.get(true).getAttribute("admin")) {
            System.out.println("ads");
            model.addAttribute("tickets", new myTickets());
            model.addAttribute("error", false);
            return "AddTicket";
        }
        return "AddTicket";
    }

    @GetMapping("/homePage")
    public String home(Model model) {
        if ((boolean)Authorization.get(true).getAttribute("admin")) {
            model.addAttribute("place", new cruisePlaces());
            model.addAttribute("error", false);
            return "AdminPanel";
        }
        List<String> cruisedests = new ArrayList<>();
        for (cruiseDestination destinations : repos.findAll()) {
            cruisedests.add(destinations.getNAME());
        }
        List<String> cruisepls = new ArrayList<>();
        for (cruisePlaces places : placesRepos.findAll()) {
            cruisepls.add(places.getNAME());

        }
        List<Integer> cruisestops = new ArrayList<>();
        for (cruisePlaces places : placesRepos.findAll()) {
            cruisestops.add(places.getDURATION());

        }
        List<String> cruiseships = new ArrayList<>();
        for (cruiseShips cruship : reposz.findAll()) {
            cruiseships.add(cruship.getNAME());
        }

        if (filter == null) {
            List<Cruises> cruises = new ArrayList<>();
            for (Cruises crs : crrepos.findAll()) {
                cruises.add(crs);
            }
            Filter f1 = new Filter();
            model.addAttribute("places1", cruisestops);
            model.addAttribute("places", cruisepls);
            model.addAttribute("filters", f1);
            model.addAttribute("destinations", cruisedests);
            model.addAttribute("cruises", cruiseships);
            model.addAttribute("crs", cruises);
            model.addAttribute("tmp", new Cruises());
            return "homePage";
        }
        else {
            List<Cruises> cruises = new ArrayList<>();
            for (Cruises crs : crrepos.findAll()){
                if(crs.getCRUISESHIPNAME().equals(filter.getShipsFilter())){
                    if(crs.getCRUISESHIPDESTINATION().equals(filter.getPlacesFilter())){
                        if(crs.getCRUISESDURATION() == filter.durationFilter){
                            if(crs.getCRUISESHIPDEPARTURE().equals(filter.departureFilter)){
                                cruises.add(crs);
                            }
                        }
                    }
                }
            }
            Date dt = new Date();
            dt.setStart(new Date());
            Filter f1 = new Filter();
            model.addAttribute("places1", cruisestops);
            model.addAttribute("places", cruisepls);
            model.addAttribute("filters", f1);
            model.addAttribute("destinations", cruisedests);
            model.addAttribute("cruises", cruiseships);
            model.addAttribute("crs", cruises);
            model.addAttribute("tmp", new Cruises());
            return "homePage";
        }

    }



    @PostMapping("/homePage")
    public String home(@ModelAttribute Filter filters){
        filter = filters;
        return "redirect:/homePage";
    }

    @RequestMapping(value = "/homePage/buy", method = RequestMethod.POST)
    public String buy(@ModelAttribute("tmp") Cruises tmp, RedirectAttributes redirectAttributes){
        System.out.println(tmp);
        redirectAttributes.addFlashAttribute("tmp",tmp);
        return "redirect:/selectTicket";
    }


}

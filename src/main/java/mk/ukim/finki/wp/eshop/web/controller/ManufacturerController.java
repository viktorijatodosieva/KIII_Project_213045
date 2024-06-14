package mk.ukim.finki.wp.eshop.web.controller;

import mk.ukim.finki.wp.eshop.service.ManufacturerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manufacturers")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping
    public String getManufacturersPage(Model model) {
        model.addAttribute("bodyContent", "manufacturers");
        model.addAttribute("manufacturers", manufacturerService.findAll());
        return "master-template";
    }
}

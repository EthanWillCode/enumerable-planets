package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.controllers.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());

        return "index";
    }
}

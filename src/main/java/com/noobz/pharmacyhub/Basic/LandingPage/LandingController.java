package com.noobz.pharmacyhub.Basic.LandingPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {
    @GetMapping("/index")
    public String viewLandingPage(Model model)
    {
        return "index";
    }

    @GetMapping("/logout")
    public String viewLogout(Model model)
    {
        return "redirect:/login";
    }
}

package com.noobz.pharmacyhub.Pharmacy.Dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pharmacy")
public class PharmacyDashboardController {

    @GetMapping("/dashboard")
    public String viewPharmacyDashboard(Model model)
    {
        return "PharmacyTemplates/pharmacydashboard";
    }
}

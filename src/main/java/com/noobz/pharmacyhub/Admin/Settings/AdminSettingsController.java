package com.noobz.pharmacyhub.Admin.Settings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminSettingsController {
    @GetMapping("/settings")
    public String viewAdminSettings(Model model)
    {
        return "AdminTemplates/adminsettings";
    }
}

package com.example.AlcoholTester;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlcoholTesterController {

    @GetMapping("/")
    public String index(Model model, @Valid Form inputForm, BindingResult errors){
        model.addAttribute("form", inputForm);

        if(!errors.hasErrors()){
        Ergebnis ergebnis = new Ergebnis(inputForm.getGewicht(), inputForm.getGeschlecht(), inputForm.getBier(), inputForm.getWein(),
                inputForm.getKorn(), inputForm.getVodka(), inputForm.getWhiskey());

        model.addAttribute("ergebnis", ergebnis);
        }
        return "AlcoholTester";
    }
}

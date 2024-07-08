package com.techacademy;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @GetMapping("/kadai")
    public String getKadai(@RequestParam(name = "previous",required = false) String previous, Model model) {
        model.addAttribute("previous1", previous);
        return "kadai";
    }
    
    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val",val);
        return "output";
    }
    
    
 

}

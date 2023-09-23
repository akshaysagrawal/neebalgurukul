package com.neebal.exammgmt.controller;

import com.neebal.exammgmt.entities.Student;
import com.neebal.exammgmt.services.GreetingsService;
import com.neebal.exammgmt.services.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("username")
public class StudentController {

    @Autowired
    private GreetingsService greetingsService;

    @Autowired
    private MasterDataService masterDataService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap modelMap,
            /* @RequestParam(required = false)String registerSuccess*/
                                @ModelAttribute("registerSuccess") String registerSuccess,
                                @ModelAttribute("invalidCreds") String invalidCreds
    ) {
        modelMap.put("greeting", this.greetingsService.getGreeting());
        modelMap.put("registerSuccess", registerSuccess);
        modelMap.put("invalidCreds", invalidCreds);

        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showRegisterPage(ModelMap modelMap) {
        //query for the countries
        modelMap.put("countries", this.masterDataService.getCountries());
        modelMap.put("greeting", this.greetingsService.getGreeting());
        return "registration";
    }

//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registerStudent(
//            @RequestParam String username,
//            @RequestParam String password,
//            @RequestParam String country,
//            @RequestParam String gender
//    ){
//        System.out.println(username+" "+password+" "+country+" "+gender);
//        return null;
//    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerStudent(@ModelAttribute Student student,
                                  RedirectAttributes redirectAttributes) {
        System.out.println(student.getUsername() + " " + student.getPassword() + " " + student.getCountry() + " " + student.getGender());
        //imagine Student data is persisted in the database

        //redirected to the url /login
//        return "redirect:/login?registerSuccess=1";

        redirectAttributes.addFlashAttribute("registerSuccess", 1);
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String authenticate(
            @RequestParam String username,
            @RequestParam String password,
            RedirectAttributes redirectAttributes,
            Model model
    ) {
        Student student = this.masterDataService.authenticate(username, password);
        if (student == null) {
            redirectAttributes.addFlashAttribute("invalidCreds", 1);
            return "redirect:/login";
        } else {
            //for the entire logged in session
            model.addAttribute("username", username);
            return "redirect:/home";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();//cleans the model attributes from the session
        return "redirect:/login";
    }
}
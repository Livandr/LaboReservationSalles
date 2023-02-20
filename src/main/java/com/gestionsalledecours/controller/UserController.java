package com.gestionsalledecours.controller;

import com.gestionsalledecours.models.forms.ConnectionForm;
import com.gestionsalledecours.models.forms.RegisterForm;
import com.gestionsalledecours.repository.UserRepository;
import com.gestionsalledecours.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userConnection;
    private final UserRepository userRepository;

    public UserController(UserService userConnection, UserRepository userRepository) {
        this.userConnection = userConnection;
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String registerForm(@ModelAttribute("form")RegisterForm form){
        return "/user/register-form";
    }

    @GetMapping("/register")
    public String processRegistration(@ModelAttribute("form") @Valid RegisterForm form, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            form.setPassword(null);
            return "/user/register-form";
        }
        userConnection.register(form);
        return "redirect:/";
    }

    @PostMapping("/sign-in")
    public String processConnectionForm(
            @ModelAttribute("form") @Valid ConnectionForm form,
            BindingResult bindingResult
            ){
        if(bindingResult.hasErrors()){
            form.setPassword(null);
            return "/user/sign-in";
        }

        return "user/sign-in";
    }
}

package com.gestionsalledecours.controller;

import com.gestionsalledecours.models.forms.RoomInsertForm;
import com.gestionsalledecours.service.RoomService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    //GET - http://localhost:8080/room/all
    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("list", roomService.getAll());
        return  "room/display-all";
    }

    //GET - http://localhost:8080/room/add
    @GetMapping("add")
    public String insertForm(Model model){
        model.addAttribute("form", new RoomInsertForm());
        return "room/insert-form";
    }


    @PostMapping("/add")
    public String processInsertForm(@ModelAttribute("form") @Valid RoomInsertForm form, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "room/insert-form";
        }
        roomService.insert(form);
        return "redirect:/room/all";
    }


}

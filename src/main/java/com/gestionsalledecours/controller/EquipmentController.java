package com.gestionsalledecours.controller;

import com.gestionsalledecours.models.forms.EquipmentInsertForm;
import com.gestionsalledecours.service.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    private EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService){
        this.equipmentService = equipmentService;
    }

    @GetMapping("/all")
    public String displayEquipment(Model model){
        model.addAttribute("list", equipmentService.getAll());
        return "equipment/display-all";
    }

    @GetMapping("/add")
    public String insertForm(Model model){
        model.addAttribute("form", new EquipmentInsertForm());
        model.addAttribute("list", equipmentService.getAll());
        return "equipment/insert-form";
    }
    @PostMapping("/add")
    public String processInsertForm(
            Model model,
            @ModelAttribute("form") @Valid EquipmentInsertForm form,
            BindingResult bindingResult){
        if(bindingResult.hasErrors() ) {
            model.addAttribute("list", equipmentService.getAll());
            return "equipment/insert-form";
        }equipmentService.insert(form);
        return "redirect:/equipment/all";
    }

    @PostMapping("/{id;[0-9]+}/delete")
    public String processRemoveForm(@PathVariable Long id){
        equipmentService.delete(id);
        return "redirect:/equipment/all";
    }

}

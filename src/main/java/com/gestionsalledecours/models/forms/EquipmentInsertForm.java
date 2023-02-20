package com.gestionsalledecours.models.forms;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EquipmentInsertForm {
    @Size(min = 2)
    @NotBlank(message = "enter an equipment name")
    private String name;
}

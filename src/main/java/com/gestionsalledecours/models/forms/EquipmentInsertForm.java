package com.gestionsalledecours.models.forms;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EquipmentInsertForm {
    @Size(min = 2)
    private String name;
}

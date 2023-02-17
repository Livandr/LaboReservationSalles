package com.gestionsalledecours.models.forms;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RoomInsertForm {

    @Size(min = 2)
    private String name;

    private int capacity;

    private boolean teacherOnly;
}

package com.gestionsalledecours.models.forms;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RoomInsertForm {

    @Size(min = 2)
    @NotBlank(message = "enter a room name")
    private String name;
    @Positive(message = "enter a number greater than 0")
    private int capacity;

    private boolean teacherOnly;
}

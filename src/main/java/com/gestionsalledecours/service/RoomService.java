package com.gestionsalledecours.service;

import com.gestionsalledecours.models.dto.RoomDTO;
import com.gestionsalledecours.models.forms.RoomInsertForm;

import java.util.List;

public interface RoomService {
    List<RoomDTO> getAll();

    void insert(RoomInsertForm form);

    void delete(Long id);
}

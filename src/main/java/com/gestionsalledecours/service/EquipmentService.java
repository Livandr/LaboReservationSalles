package com.gestionsalledecours.service;

import com.gestionsalledecours.models.dto.EquipmentDTO;
import com.gestionsalledecours.models.forms.EquipmentInsertForm;

import java.util.List;

public interface EquipmentService {

    List<EquipmentDTO> getAll();

    void insert(EquipmentInsertForm form);
}

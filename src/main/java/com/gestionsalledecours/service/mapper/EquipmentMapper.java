package com.gestionsalledecours.service.mapper;

import com.gestionsalledecours.models.dto.EquipmentDTO;
import com.gestionsalledecours.models.entities.Equipment;
import com.gestionsalledecours.models.forms.EquipmentInsertForm;
import org.springframework.stereotype.Service;

@Service
public class EquipmentMapper {
    public EquipmentDTO toDto(Equipment entity) {
        if(entity == null)
            return null;
        return EquipmentDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public Equipment toEntity(EquipmentInsertForm form){
        if(form==null)
            return null;

        Equipment equipment = new Equipment();
        equipment.setName(form.getName());
        return equipment;
    }
}

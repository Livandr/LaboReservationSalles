package com.gestionsalledecours.service.Impl;

import com.gestionsalledecours.models.dto.EquipmentDTO;
import com.gestionsalledecours.models.entities.Equipment;
import com.gestionsalledecours.models.forms.EquipmentInsertForm;
import com.gestionsalledecours.repository.EquipmentRepository;
import com.gestionsalledecours.service.EquipmentService;
import com.gestionsalledecours.service.mapper.EquipmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService{

    private final EquipmentRepository equipmentRepository;
    private final EquipmentMapper equipmentMapper;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository, EquipmentMapper equipmentMapper){
        this.equipmentRepository = equipmentRepository;
        this.equipmentMapper = equipmentMapper;
    }

    @Override
    public List<EquipmentDTO> getAll() {
        return equipmentRepository.findAll().stream()
                .map(equipmentMapper::toDto)
                .toList();
    }

    @Override
    public void insert(EquipmentInsertForm form) {
        if(form==null)
            throw new IllegalArgumentException("form should not be null");
        Equipment entity = equipmentMapper.toEntity(form);
        equipmentRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        equipmentRepository.deleteById(id);
    }
}

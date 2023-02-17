package com.gestionsalledecours.repository;

import com.gestionsalledecours.models.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}

package com.gestionsalledecours.repository;

import com.gestionsalledecours.models.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

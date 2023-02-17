package com.gestionsalledecours.utils;

import com.gestionsalledecours.repository.EquipmentRepository;
import com.gestionsalledecours.repository.RoomRepository;
import com.gestionsalledecours.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;

public class DataInit implements InitializingBean {

    private final UserRepository userRepository;
    private final RoomRepository roomRepository;
    private final EquipmentRepository equipmentRepository;

    public DataInit(UserRepository userRepository, RoomRepository roomRepository, EquipmentRepository equipmentRepository){
        this.userRepository = userRepository;
        this.roomRepository = roomRepository;
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("-- INITIALIZING DB DATA --");


    }
}

package com.gestionsalledecours.utils;

import com.gestionsalledecours.models.entities.Equipment;
import com.gestionsalledecours.models.entities.Role;
import com.gestionsalledecours.models.entities.Room;
import com.gestionsalledecours.models.entities.User;
import com.gestionsalledecours.repository.EquipmentRepository;
import com.gestionsalledecours.repository.RoomRepository;
import com.gestionsalledecours.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@Log4j2
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

        Room room1 = new Room();
        room1.setRoomName("Mario");
        room1.setCapacity(30);
        room1.setTeacherOnly(false);

        Room room2 = new Room();
        room2.setRoomName("Mario 2");
        room2.setCapacity(20);
        room2.setTeacherOnly(false);

        Room room3 = new Room();
        room3.setRoomName("Mario 3");
        room3.setCapacity(15);
        room3.setTeacherOnly(false);

        Room room4 = new Room();
        room4.setRoomName("Nintendo");
        room4.setCapacity(12);
        room4.setTeacherOnly(true);

        Room room5 = new Room();
        room5.setRoomName("Warzone");
        room5.setCapacity(16);
        room5.setTeacherOnly(false);

        room1 = roomRepository.save(room1);
        room2 = roomRepository.save(room2);
        room3 = roomRepository.save(room3);
        room4 = roomRepository.save(room4);
        room5 = roomRepository.save(room5);

        User user1 = new User();
        user1.setLastname("patagueul");
        user1.setFirstname("james");
        user1.setRole(Role.TEACHER);
        user1.setEmail("james.patagueul@yahoo.fr");
        user1.setTel(" ");
        user1.setLogin("patjam");
        user1.setPassword("test");

        User user2 = new User();
        user2.setLastname("deloin");
        user2.setFirstname("alain");
        user2.setRole(Role.STUDENT);
        user2.setEmail("aldeloin@gmail.com");
        user2.setTel(" ");
        user2.setLogin("delala");
        user2.setPassword("test");


        user1 = userRepository.save(user1);
        user2 = userRepository.save(user2);

        Equipment equipment1 = new Equipment();
        equipment1.setName("projecteur EPSON");
        Equipment equipment2 = new Equipment();
        equipment2.setName("Smart TV SONY 85'");

        equipment1 = equipmentRepository.save(equipment1);
        equipment2 = equipmentRepository.save(equipment2);

        log.info("-- DATA INIT FINISHED --");

    }
}

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

//        ROOM ------------------------------------
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

//        USER --------------------------------

        User admin1 = new User();
        admin1.setLastname("Le Boss");
        admin1.setFirstname("James");
        admin1.setRole(Role.ADMIN);
        admin1.setEmail("jlb@highschoolbelgium.be");
        admin1.setPhone("0499999999");
        admin1.setLogin("jlb@highschoolbelgium.be");
        admin1.setPassword("pass");

        User teacher1 = new User();
        teacher1.setLastname("Lindien");
        teacher1.setFirstname("Joe");
        teacher1.setRole(Role.TEACHER);
        teacher1.setEmail("jli@highschoolbelgium.be");
        teacher1.setPhone("0499999990");
        teacher1.setLogin("jli@highschoolbelgium.be");
        teacher1.setPassword("pass");

        User teacher2 = new User();
        teacher2.setLastname("patagueul");
        teacher2.setFirstname("james");
        teacher2.setRole(Role.TEACHER);
        teacher2.setEmail("james.patagueul@yahoo.fr");
        teacher2.setPhone("0472553322");
        teacher2.setLogin("patjam");
        teacher2.setPassword("pass");

        User student1 = new User();
        student1.setLastname("Le Boss");
        student1.setFirstname("James");
        student1.setRole(Role.ADMIN);
        student1.setEmail("jlb@highschoolbelgium.be");
        student1.setPhone("0499999999");
        student1.setLogin("jlb@highschoolbelgium.be");
        student1.setPassword("pass");

        User student2 = new User();
        student2.setLastname("deloin");
        student2.setFirstname("alain");
        student2.setRole(Role.STUDENT);
        student2.setEmail("aldeloin@gmail.com");
        student2.setPhone("0498951231");
        student2.setLogin("delala");
        student2.setPassword("pass");

        admin1 = userRepository.save(admin1);

        teacher1 = userRepository.save(teacher1);
        teacher2 = userRepository.save(teacher2);

        student1 = userRepository.save(student1);
        student2 = userRepository.save(student2);


//        EQUIPEMENT

        Equipment equipment1 = new Equipment();
        equipment1.setName("projector EPSON");
        Equipment equipment2 = new Equipment();
        equipment2.setName("Smart TV SONY 85'");
        Equipment equipment3 = new Equipment();
        equipment3.setName("laptop pc");

        equipment1 = equipmentRepository.save(equipment1);
        equipment2 = equipmentRepository.save(equipment2);
        equipment3 = equipmentRepository.save(equipment3);

        log.info("-- DATA INIT FINISHED --");
    }
}

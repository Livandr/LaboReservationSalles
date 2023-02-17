package com.gestionsalledecours.service.mapper;

import com.gestionsalledecours.models.dto.RoomDTO;
import com.gestionsalledecours.models.entities.Room;
import com.gestionsalledecours.models.forms.RoomInsertForm;
import org.springframework.stereotype.Service;

@Service
public class RoomMapper {

    public RoomDTO roomDTO(Room entity){
        if(entity == null)
            return null;
        return RoomDTO.builder()
                .id(entity.getId())
                .name(entity.getRoomName())
                .capacity(entity.getCapacity())
                .teacherOnly(entity.isTeacherOnly())
                .build();
    }

    public Room toEntity(RoomInsertForm form){
        if(form == null)
            return null;
        Room room = new Room();

        room.setRoomName(form.getName());
        room.setCapacity(form.getCapacity());
        room.setTeacherOnly(form.isTeacherOnly());

        return room;
    }


}

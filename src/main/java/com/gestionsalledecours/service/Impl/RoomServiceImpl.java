package com.gestionsalledecours.service.Impl;

import com.gestionsalledecours.models.dto.RoomDTO;
import com.gestionsalledecours.models.entities.Room;
import com.gestionsalledecours.models.forms.RoomInsertForm;
import com.gestionsalledecours.repository.RoomRepository;
import com.gestionsalledecours.service.RoomService;
import com.gestionsalledecours.service.mapper.RoomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper mapper;


    public RoomServiceImpl(RoomRepository roomRepository, RoomMapper mapper){
        this.roomRepository= roomRepository;
        this.mapper = mapper;
    }

    @Override
    public List<RoomDTO> getAll() {
        return roomRepository.findAll().stream()
                .map(mapper::roomDTO)
                .toList();

    }

    @Override
    public void insert(RoomInsertForm form) {
        if (form == null)
            throw  new IllegalArgumentException("form should not be null");
        Room entity = mapper.toEntity(form);
        roomRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}

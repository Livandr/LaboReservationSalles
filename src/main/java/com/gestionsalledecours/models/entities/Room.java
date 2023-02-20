package com.gestionsalledecours.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String roomName;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private boolean teacherOnly;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private RoomReservation roomReservation;

}

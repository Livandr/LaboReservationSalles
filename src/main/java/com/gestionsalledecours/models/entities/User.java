package com.gestionsalledecours.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"user\"")
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    private String email;

    @Column
    private String phone;

    @Column (nullable = false)
    private String login;

    @Column (nullable = false)
    private String password;

    @OneToMany(targetEntity = RoomReservation.class, mappedBy = "user")
    private List<RoomReservation> roomReservations = new ArrayList<>();







}

package com.gestionsalledecours.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

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
    private String tel;

    @Column (nullable = false)
    private String login;

    @Column (nullable = false)
    private String password;

    @OneToMany(targetEntity = Reservation.class, mappedBy = "user")
    private Set<Reservation> reservations = new LinkedHashSet<>();







}

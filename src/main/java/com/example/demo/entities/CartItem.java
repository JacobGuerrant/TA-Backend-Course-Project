package com.example.demo.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="cart_items")
@Getter
@Setter

public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    //Many map
    @Column(name = "vacation_id")
    private Vacation vacation;

    //Many set map and jointable
    private Set<Excursion> excursions;

    //Many map
    @Column(name = "cart_id")
    private Cart cart;

    @Column(name = "create_date")
    private Date create_date;

    @Column(name = "last_update")
    private Date last_update;
}

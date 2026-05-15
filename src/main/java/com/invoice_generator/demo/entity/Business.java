package com.invoice_generator.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "businesses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String businessName;

    private String logo;

    private String phone;

    private String address;

    private String currency;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
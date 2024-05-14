package com.temelio.gms.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "foundation")
public class Foundation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String accountId;



}

package com.temelio.gms.entity;

import com.temelio.gms.dto.FoundationDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "grant")
public class Grant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String status;

    @Column
    private Foundation foundation;

    @Column
    private NonProfitOrg nonProfitOrg;

    @Column
    private OffsetDateTime date;



}

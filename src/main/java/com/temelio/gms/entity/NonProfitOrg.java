package com.temelio.gms.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "non_profit_org")
public class NonProfitOrg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String accountId;

    @Column
    private String address;
}

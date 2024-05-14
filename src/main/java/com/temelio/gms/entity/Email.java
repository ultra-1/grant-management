package com.temelio.gms.entity;


import com.temelio.gms.constants.EmailFormats;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String content;

    @Column
    private String sender;

    @Column
    private String receiver;

    @Column(name = "subject")
    private String subject;

    @Column(name = "files")
    @OneToMany(mappedBy = "mailId")
    private List<File> files;

    @Column
    private Grant grantId;

    @Column
    private EmailFormats.EmailEvent event;

    @Column
    private OffsetDateTime date;

}

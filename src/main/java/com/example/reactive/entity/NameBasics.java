package com.example.reactive.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "name_basics")
public class NameBasics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nconst", unique = true, nullable = false)
    private String nconst;
    @Column(name = "primaryname")
    private String primaryName;
    @Column(name = "birthyear")
    private Integer birthYear;
    @Column(name = "deathyear")
    private Integer deathYear;
    @Column(name = "primaryprofession")
    private String primaryProfession;
    @Column(name = "knownfortitles")
    private String knownForTitles;

}

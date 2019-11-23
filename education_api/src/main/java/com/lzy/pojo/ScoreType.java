package com.lzy.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "lm_scorestype")
@Getter
@Setter
public class ScoreType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scoreTypeId;
    private String scoreTypeName;
}

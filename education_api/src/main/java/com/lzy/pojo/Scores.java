package com.lzy.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name= "lm_scores")
@Getter
@Setter
public class Scores {
    private String scoreTeacherName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scoreId;
    private Integer deleteStatus;
    private BigDecimal scorePrice;
    private String scoreImgUrl;

    @ManyToOne()
    @JoinColumn(name = "scoreTypeId")
    private ScoreType scoreType;
}

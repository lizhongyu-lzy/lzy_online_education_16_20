package com.lzy.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "t_score")
@Getter
@Setter
public class Score {
    private String typeName;
    private Integer createUserId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer updateUserId;
    private Date createTime;
    private Date endTime;
    private Integer deleteStatus;

}

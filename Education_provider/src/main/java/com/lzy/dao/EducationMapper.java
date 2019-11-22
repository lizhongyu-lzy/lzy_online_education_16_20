package com.lzy.dao;

import com.lzy.pojo.Score;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EducationMapper extends JpaRepository<Score,Integer> {
}

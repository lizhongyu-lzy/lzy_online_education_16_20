package com.lzy.service.impl;

import com.lzy.VO.QueryVO;
import com.lzy.dao.EducationMapper;
import com.lzy.pojo.Score;
import com.lzy.pojo.User;
import com.lzy.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationMapper educationMapper;

    @Override
    public Page<Score> list(QueryVO queryVO) {
        Page<Score> page = educationMapper.findAll(PageRequest.of(queryVO.getPageNo() - 1, queryVO.getPageSize()));
        return page;
    }
}

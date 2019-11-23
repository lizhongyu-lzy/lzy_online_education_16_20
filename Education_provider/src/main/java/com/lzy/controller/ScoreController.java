package com.lzy.controller;

import com.lzy.VO.PageVO;
import com.lzy.VO.QueryVO;
import com.lzy.pojo.Score;
import com.lzy.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("score")
@CrossOrigin
public class ScoreController {

    @Autowired
    private EducationService educationService;

    @RequestMapping("getList")
    public PageVO<Score> list(QueryVO queryVO){

        Page<Score> list = educationService.list(queryVO);
        PageVO<Score> pageVO = new PageVO<Score>(list.getContent(),list.getTotalPages(),list.getTotalElements(),list.getSize());

        return pageVO;
    }

}

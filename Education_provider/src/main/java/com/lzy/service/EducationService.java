package com.lzy.service;

import com.lzy.VO.QueryVO;
import com.lzy.pojo.Score;
import org.springframework.data.domain.Page;

public interface EducationService {
    Page<Score> list(QueryVO queryVO);
}

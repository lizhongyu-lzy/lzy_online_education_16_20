package com.lzy.VO;

import com.lzy.pojo.Score;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageVO<T> {

    private List<T> content;
    private Integer total;
    private Long pageNo;
    private Integer pageSize;

    public PageVO() {
    }

    public PageVO(List<T> content, Integer total, Long pageNo, Integer pageSize) {
        this.content = content;
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}

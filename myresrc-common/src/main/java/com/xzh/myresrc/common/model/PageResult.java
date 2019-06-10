package com.xzh.myresrc.common.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 23:45
 * @Description:
 */
@Data
@Builder
public class PageResult<T> {

    private int page;

    private int size;

    private int totalPage;

    private long total;

    private List<T> content;

    public int getTotalPage() {
        return (int) (total % size == 0 ? total / size : (total / size) + 1);
    }



}

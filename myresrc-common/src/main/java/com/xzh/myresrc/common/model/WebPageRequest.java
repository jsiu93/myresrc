package com.xzh.myresrc.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 16:42
 * @Description:
 */
@Data
public class WebPageRequest implements Serializable {

    private int page = 1;
    private int size = 10;
}

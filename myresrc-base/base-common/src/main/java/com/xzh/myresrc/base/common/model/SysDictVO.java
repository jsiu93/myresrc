package com.xzh.myresrc.base.common.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xzh.myresrc.common.serializer.JsonIdSerializer;
import lombok.Data;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 14:37
 * @Description:
 */
@Data
public class SysDictVO {

    @JsonSerialize(using = JsonIdSerializer.class)
    private Long    id;
    private String  name;
    private String  type;
    private String  code;
    private String  value;
    private Integer orderNum;
    private String  remark;
    private Integer delFlag;
}

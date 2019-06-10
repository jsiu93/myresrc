package com.xzh.myresrc.base.common.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.xzh.myresrc.common.model.WebPageRequest;
import com.xzh.myresrc.common.serializer.JsonIdDeserializer;
import lombok.Data;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 14:38
 * @Description:
 */
@Data
public class SysDictRequest extends WebPageRequest {

    @JsonDeserialize(using = JsonIdDeserializer.class)
    private Long    id;
    private String  name;
    private String  type;
    private String  code;
    private String  value;
    private Integer orderNum;
    private String  remark;
    private Integer delFlag;

}

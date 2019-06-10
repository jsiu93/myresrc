package com.xzh.myresrc.base.service;

import com.xzh.myresrc.base.db.tables.pojos.SysDict;
import com.xzh.myresrc.common.model.PageResult;
import org.springframework.data.domain.Pageable;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 16:41
 * @Description:
 */
public interface DictService {
    PageResult<SysDict> list(SysDict sysDict, Pageable pageable);

}

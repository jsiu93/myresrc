package com.xzh.myresrc.base.service.impl;

import com.xzh.myresrc.base.db.Tables;
import com.xzh.myresrc.base.db.tables.pojos.SysDict;
import com.xzh.myresrc.base.db.tables.records.SysDictRecord;
import com.xzh.myresrc.base.service.DictService;
import com.xzh.myresrc.common.model.PageResult;
import com.xzh.myresrc.common.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 16:41
 * @Description:
 */
@Service
@Slf4j
public class DictServiceImpl implements DictService {


    @Autowired
    private DSLContext dslContext;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public PageResult<SysDict> list(SysDict sysDict, Pageable pageable) {
        log.info("list -> {}", JsonUtil.toJson(sysDict));

        SysDictRecord record = modelMapper.map(sysDict, SysDictRecord.class);
        record.setName(null);
        Condition condition = DSL.condition(record);
        if (StringUtils.isNotEmpty(sysDict.getName())) {
            condition = condition.and(Tables.SYS_DICT.NAME.like('%' + sysDict.getName() + '%'));
        }

        List<SysDictRecord> records = dslContext.selectFrom(Tables.SYS_DICT).where(condition)
                .offset((pageable.getPageNumber() - 1) * pageable.getPageSize()).limit(pageable.getPageSize())
                .fetch()
                .into(SysDictRecord.class);

        List<SysDict> list = records.stream().map(item -> {
            return modelMapper.map(item, SysDict.class);
        }).collect(Collectors.toList());

        long count = dslContext.fetchCount(Tables.SYS_DICT, condition);


        PageResult<SysDict> result = PageResult.<SysDict>builder().content(list).page(pageable.getPageNumber()).size(pageable.getPageSize()).total(count).build();
        return result;

    }
}

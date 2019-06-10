package com.xzh.myresrc.base.controller;

import com.xzh.myresrc.base.common.model.SysDictRequest;
import com.xzh.myresrc.base.common.model.SysDictVO;
import com.xzh.myresrc.base.db.tables.pojos.SysDict;
import com.xzh.myresrc.base.service.DictService;
import com.xzh.myresrc.common.model.PageResult;
import com.xzh.myresrc.common.model.ServerResponse;
import com.xzh.myresrc.common.util.BeanCopyUtil;
import com.xzh.myresrc.common.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Authur: joshuasiu
 * @Date: 2019-06-10 14:35
 * @Description:
 */
@RestController
@RequestMapping("base/dict")
@Slf4j
public class DictController {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DictService dictService;

    @PostMapping("list")
    public ServerResponse<PageResult<SysDictVO>> list(@RequestBody SysDictRequest request) {
        log.info("list -> {}", JsonUtil.toJson(request));

        PageResult<SysDict> pageResult = this.dictService.list(BeanCopyUtil.copyTo(request, new SysDict()), PageRequest.of(request.getPage(), request.getSize()));

        log.info("page={}", JsonUtil.toJson(pageResult));

        List<SysDict> content = pageResult.getContent();
        List<SysDictVO> sysDictVOS = BeanCopyUtil.copyTo(content, SysDictVO.class);

        PageResult<SysDictVO> p = PageResult.<SysDictVO>builder().page(request.getPage()).size(request.getSize()).total(pageResult.getTotal()).content(sysDictVOS).build();

        return ServerResponse.createBySuccess(p);


    }


}

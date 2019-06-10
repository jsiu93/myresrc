package com.xzh.myresrc.admin.test;

import com.xzh.myresrc.admin.db.tables.daos.SysUserDao;
import com.xzh.myresrc.admin.db.tables.pojos.SysUser;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.n3r.idworker.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Authur: joshuasiu
 * @Date: 2019-05-31 17:35
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserTest {


    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private IdWorker idWorker;

    @Test
    public void insert() {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(idWorker.nextId());

    }




}

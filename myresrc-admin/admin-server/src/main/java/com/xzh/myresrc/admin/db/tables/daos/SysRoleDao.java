/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables.daos;


import com.xzh.myresrc.admin.db.tables.SysRole;
import com.xzh.myresrc.admin.db.tables.records.SysRoleRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 角色
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SysRoleDao extends DAOImpl<SysRoleRecord, com.xzh.myresrc.admin.db.tables.pojos.SysRole, Long> {

    /**
     * Create a new SysRoleDao without any configuration
     */
    public SysRoleDao() {
        super(SysRole.SYS_ROLE, com.xzh.myresrc.admin.db.tables.pojos.SysRole.class);
    }

    /**
     * Create a new SysRoleDao with an attached configuration
     */
    @Autowired
    public SysRoleDao(Configuration configuration) {
        super(SysRole.SYS_ROLE, com.xzh.myresrc.admin.db.tables.pojos.SysRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.xzh.myresrc.admin.db.tables.pojos.SysRole object) {
        return object.getRoleId();
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRole> fetchByRoleId(Long... values) {
        return fetch(SysRole.SYS_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>role_id = value</code>
     */
    public com.xzh.myresrc.admin.db.tables.pojos.SysRole fetchOneByRoleId(Long value) {
        return fetchOne(SysRole.SYS_ROLE.ROLE_ID, value);
    }

    /**
     * Fetch records that have <code>role_name IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRole> fetchByRoleName(String... values) {
        return fetch(SysRole.SYS_ROLE.ROLE_NAME, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRole> fetchByRemark(String... values) {
        return fetch(SysRole.SYS_ROLE.REMARK, values);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRole> fetchByCreateUserId(Long... values) {
        return fetch(SysRole.SYS_ROLE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRole> fetchByCreateTime(LocalDateTime... values) {
        return fetch(SysRole.SYS_ROLE.CREATE_TIME, values);
    }
}

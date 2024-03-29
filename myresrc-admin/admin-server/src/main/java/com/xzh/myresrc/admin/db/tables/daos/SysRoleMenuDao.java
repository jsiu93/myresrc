/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables.daos;


import com.xzh.myresrc.admin.db.tables.SysRoleMenu;
import com.xzh.myresrc.admin.db.tables.records.SysRoleMenuRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 角色与菜单对应关系
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
public class SysRoleMenuDao extends DAOImpl<SysRoleMenuRecord, com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu, Long> {

    /**
     * Create a new SysRoleMenuDao without any configuration
     */
    public SysRoleMenuDao() {
        super(SysRoleMenu.SYS_ROLE_MENU, com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu.class);
    }

    /**
     * Create a new SysRoleMenuDao with an attached configuration
     */
    @Autowired
    public SysRoleMenuDao(Configuration configuration) {
        super(SysRoleMenu.SYS_ROLE_MENU, com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu> fetchById(Long... values) {
        return fetch(SysRoleMenu.SYS_ROLE_MENU.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu fetchOneById(Long value) {
        return fetchOne(SysRoleMenu.SYS_ROLE_MENU.ID, value);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu> fetchByRoleId(Long... values) {
        return fetch(SysRoleMenu.SYS_ROLE_MENU.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>menu_id IN (values)</code>
     */
    public List<com.xzh.myresrc.admin.db.tables.pojos.SysRoleMenu> fetchByMenuId(Long... values) {
        return fetch(SysRoleMenu.SYS_ROLE_MENU.MENU_ID, values);
    }
}

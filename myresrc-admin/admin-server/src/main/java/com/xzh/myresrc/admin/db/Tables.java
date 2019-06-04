/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db;


import com.xzh.myresrc.admin.db.tables.SysLog;
import com.xzh.myresrc.admin.db.tables.SysMenu;
import com.xzh.myresrc.admin.db.tables.SysRole;
import com.xzh.myresrc.admin.db.tables.SysRoleMenu;
import com.xzh.myresrc.admin.db.tables.SysUser;
import com.xzh.myresrc.admin.db.tables.SysUserRole;
import com.xzh.myresrc.admin.db.tables.SysUserToken;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in myresrc_admin
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 系统日志
     */
    public static final SysLog SYS_LOG = com.xzh.myresrc.admin.db.tables.SysLog.SYS_LOG;

    /**
     * 菜单管理
     */
    public static final SysMenu SYS_MENU = com.xzh.myresrc.admin.db.tables.SysMenu.SYS_MENU;

    /**
     * 角色
     */
    public static final SysRole SYS_ROLE = com.xzh.myresrc.admin.db.tables.SysRole.SYS_ROLE;

    /**
     * 角色与菜单对应关系
     */
    public static final SysRoleMenu SYS_ROLE_MENU = com.xzh.myresrc.admin.db.tables.SysRoleMenu.SYS_ROLE_MENU;

    /**
     * 系统用户
     */
    public static final SysUser SYS_USER = com.xzh.myresrc.admin.db.tables.SysUser.SYS_USER;

    /**
     * 用户与角色对应关系
     */
    public static final SysUserRole SYS_USER_ROLE = com.xzh.myresrc.admin.db.tables.SysUserRole.SYS_USER_ROLE;

    /**
     * 系统用户Token
     */
    public static final SysUserToken SYS_USER_TOKEN = com.xzh.myresrc.admin.db.tables.SysUserToken.SYS_USER_TOKEN;
}
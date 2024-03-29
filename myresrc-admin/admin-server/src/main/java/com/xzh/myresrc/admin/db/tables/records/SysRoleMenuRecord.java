/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables.records;


import com.xzh.myresrc.admin.db.tables.SysRoleMenu;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SysRoleMenuRecord extends UpdatableRecordImpl<SysRoleMenuRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 445665075;

    /**
     * Setter for <code>myresrc_admin.sys_role_menu.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_role_menu.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>myresrc_admin.sys_role_menu.role_id</code>. 角色ID
     */
    public void setRoleId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_role_menu.role_id</code>. 角色ID
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>myresrc_admin.sys_role_menu.menu_id</code>. 菜单ID
     */
    public void setMenuId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_role_menu.menu_id</code>. 菜单ID
     */
    public Long getMenuId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SysRoleMenu.SYS_ROLE_MENU.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SysRoleMenu.SYS_ROLE_MENU.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return SysRoleMenu.SYS_ROLE_MENU.MENU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRoleMenuRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRoleMenuRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRoleMenuRecord value3(Long value) {
        setMenuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysRoleMenuRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysRoleMenuRecord
     */
    public SysRoleMenuRecord() {
        super(SysRoleMenu.SYS_ROLE_MENU);
    }

    /**
     * Create a detached, initialised SysRoleMenuRecord
     */
    public SysRoleMenuRecord(Long id, Long roleId, Long menuId) {
        super(SysRoleMenu.SYS_ROLE_MENU);

        set(0, id);
        set(1, roleId);
        set(2, menuId);
    }
}

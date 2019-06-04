/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables;


import com.xzh.myresrc.admin.db.Indexes;
import com.xzh.myresrc.admin.db.Keys;
import com.xzh.myresrc.admin.db.MyresrcAdmin;
import com.xzh.myresrc.admin.db.tables.records.SysMenuRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 菜单管理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMenu extends TableImpl<SysMenuRecord> {

    private static final long serialVersionUID = 1825640028;

    /**
     * The reference instance of <code>myresrc_admin.sys_menu</code>
     */
    public static final SysMenu SYS_MENU = new SysMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysMenuRecord> getRecordType() {
        return SysMenuRecord.class;
    }

    /**
     * The column <code>myresrc_admin.sys_menu.menu_id</code>.
     */
    public final TableField<SysMenuRecord, Long> MENU_ID = createField("menu_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>myresrc_admin.sys_menu.parent_id</code>. 父菜单ID，一级菜单为0
     */
    public final TableField<SysMenuRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT, this, "父菜单ID，一级菜单为0");

    /**
     * The column <code>myresrc_admin.sys_menu.name</code>. 菜单名称
     */
    public final TableField<SysMenuRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "菜单名称");

    /**
     * The column <code>myresrc_admin.sys_menu.url</code>. 菜单URL
     */
    public final TableField<SysMenuRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(200), this, "菜单URL");

    /**
     * The column <code>myresrc_admin.sys_menu.perms</code>. 授权(多个用逗号分隔，如：user:list,user:create)
     */
    public final TableField<SysMenuRecord, String> PERMS = createField("perms", org.jooq.impl.SQLDataType.VARCHAR(500), this, "授权(多个用逗号分隔，如：user:list,user:create)");

    /**
     * The column <code>myresrc_admin.sys_menu.type</code>. 类型   0：目录   1：菜单   2：按钮
     */
    public final TableField<SysMenuRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "类型   0：目录   1：菜单   2：按钮");

    /**
     * The column <code>myresrc_admin.sys_menu.icon</code>. 菜单图标
     */
    public final TableField<SysMenuRecord, String> ICON = createField("icon", org.jooq.impl.SQLDataType.VARCHAR(50), this, "菜单图标");

    /**
     * The column <code>myresrc_admin.sys_menu.order_num</code>. 排序
     */
    public final TableField<SysMenuRecord, Integer> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGER, this, "排序");

    /**
     * Create a <code>myresrc_admin.sys_menu</code> table reference
     */
    public SysMenu() {
        this(DSL.name("sys_menu"), null);
    }

    /**
     * Create an aliased <code>myresrc_admin.sys_menu</code> table reference
     */
    public SysMenu(String alias) {
        this(DSL.name(alias), SYS_MENU);
    }

    /**
     * Create an aliased <code>myresrc_admin.sys_menu</code> table reference
     */
    public SysMenu(Name alias) {
        this(alias, SYS_MENU);
    }

    private SysMenu(Name alias, Table<SysMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysMenu(Name alias, Table<SysMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("菜单管理"));
    }

    public <O extends Record> SysMenu(Table<O> child, ForeignKey<O, SysMenuRecord> key) {
        super(child, key, SYS_MENU);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MyresrcAdmin.MYRESRC_ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SysMenuRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_MENU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysMenuRecord> getPrimaryKey() {
        return Keys.KEY_SYS_MENU_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<SysMenuRecord>>asList(Keys.KEY_SYS_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenu as(String alias) {
        return new SysMenu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenu as(Name alias) {
        return new SysMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysMenu rename(String name) {
        return new SysMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysMenu rename(Name name) {
        return new SysMenu(name, null);
    }
}

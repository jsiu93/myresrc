/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables;


import com.xzh.myresrc.admin.db.Indexes;
import com.xzh.myresrc.admin.db.Keys;
import com.xzh.myresrc.admin.db.MyresrcAdmin;
import com.xzh.myresrc.admin.db.tables.records.SysLogRecord;

import java.time.LocalDateTime;
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
 * 系统日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLog extends TableImpl<SysLogRecord> {

    private static final long serialVersionUID = -1616218266;

    /**
     * The reference instance of <code>myresrc_admin.sys_log</code>
     */
    public static final SysLog SYS_LOG = new SysLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysLogRecord> getRecordType() {
        return SysLogRecord.class;
    }

    /**
     * The column <code>myresrc_admin.sys_log.id</code>.
     */
    public final TableField<SysLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>myresrc_admin.sys_log.username</code>. 用户名
     */
    public final TableField<SysLogRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(50), this, "用户名");

    /**
     * The column <code>myresrc_admin.sys_log.operation</code>. 用户操作
     */
    public final TableField<SysLogRecord, String> OPERATION = createField("operation", org.jooq.impl.SQLDataType.VARCHAR(50), this, "用户操作");

    /**
     * The column <code>myresrc_admin.sys_log.method</code>. 请求方法
     */
    public final TableField<SysLogRecord, String> METHOD = createField("method", org.jooq.impl.SQLDataType.VARCHAR(200), this, "请求方法");

    /**
     * The column <code>myresrc_admin.sys_log.params</code>. 请求参数
     */
    public final TableField<SysLogRecord, String> PARAMS = createField("params", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "请求参数");

    /**
     * The column <code>myresrc_admin.sys_log.time</code>. 执行时长(毫秒)
     */
    public final TableField<SysLogRecord, Long> TIME = createField("time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "执行时长(毫秒)");

    /**
     * The column <code>myresrc_admin.sys_log.ip</code>. IP地址
     */
    public final TableField<SysLogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(64), this, "IP地址");

    /**
     * The column <code>myresrc_admin.sys_log.create_date</code>. 创建时间
     */
    public final TableField<SysLogRecord, LocalDateTime> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * Create a <code>myresrc_admin.sys_log</code> table reference
     */
    public SysLog() {
        this(DSL.name("sys_log"), null);
    }

    /**
     * Create an aliased <code>myresrc_admin.sys_log</code> table reference
     */
    public SysLog(String alias) {
        this(DSL.name(alias), SYS_LOG);
    }

    /**
     * Create an aliased <code>myresrc_admin.sys_log</code> table reference
     */
    public SysLog(Name alias) {
        this(alias, SYS_LOG);
    }

    private SysLog(Name alias, Table<SysLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysLog(Name alias, Table<SysLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("系统日志"));
    }

    public <O extends Record> SysLog(Table<O> child, ForeignKey<O, SysLogRecord> key) {
        super(child, key, SYS_LOG);
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
        return Arrays.<Index>asList(Indexes.SYS_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SysLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysLogRecord> getPrimaryKey() {
        return Keys.KEY_SYS_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysLogRecord>> getKeys() {
        return Arrays.<UniqueKey<SysLogRecord>>asList(Keys.KEY_SYS_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLog as(String alias) {
        return new SysLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLog as(Name alias) {
        return new SysLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLog rename(String name) {
        return new SysLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLog rename(Name name) {
        return new SysLog(name, null);
    }
}

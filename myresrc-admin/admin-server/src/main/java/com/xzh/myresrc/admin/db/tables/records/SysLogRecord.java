/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables.records;


import com.xzh.myresrc.admin.db.tables.SysLog;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SysLogRecord extends UpdatableRecordImpl<SysLogRecord> implements Record8<Long, String, String, String, String, Long, String, LocalDateTime> {

    private static final long serialVersionUID = -1731885408;

    /**
     * Setter for <code>myresrc_admin.sys_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.username</code>. 用户名
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.username</code>. 用户名
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.operation</code>. 用户操作
     */
    public void setOperation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.operation</code>. 用户操作
     */
    public String getOperation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.method</code>. 请求方法
     */
    public void setMethod(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.method</code>. 请求方法
     */
    public String getMethod() {
        return (String) get(3);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.params</code>. 请求参数
     */
    public void setParams(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.params</code>. 请求参数
     */
    public String getParams() {
        return (String) get(4);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.time</code>. 执行时长(毫秒)
     */
    public void setTime(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.time</code>. 执行时长(毫秒)
     */
    public Long getTime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.ip</code>. IP地址
     */
    public void setIp(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.ip</code>. IP地址
     */
    public String getIp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>myresrc_admin.sys_log.create_date</code>. 创建时间
     */
    public void setCreateDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>myresrc_admin.sys_log.create_date</code>. 创建时间
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, String, Long, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, String, Long, String, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SysLog.SYS_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysLog.SYS_LOG.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysLog.SYS_LOG.OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysLog.SYS_LOG.METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysLog.SYS_LOG.PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return SysLog.SYS_LOG.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysLog.SYS_LOG.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return SysLog.SYS_LOG.CREATE_DATE;
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
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getCreateDate();
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
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value3(String value) {
        setOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value4(String value) {
        setMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value5(String value) {
        setParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value6(Long value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value7(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value8(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, String value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysLogRecord
     */
    public SysLogRecord() {
        super(SysLog.SYS_LOG);
    }

    /**
     * Create a detached, initialised SysLogRecord
     */
    public SysLogRecord(Long id, String username, String operation, String method, String params, Long time, String ip, LocalDateTime createDate) {
        super(SysLog.SYS_LOG);

        set(0, id);
        set(1, username);
        set(2, operation);
        set(3, method);
        set(4, params);
        set(5, time);
        set(6, ip);
        set(7, createDate);
    }
}

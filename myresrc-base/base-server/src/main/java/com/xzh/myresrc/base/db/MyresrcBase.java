/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.base.db;


import com.xzh.myresrc.base.db.tables.SysDict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyresrcBase extends SchemaImpl {

    private static final long serialVersionUID = 1958943253;

    /**
     * The reference instance of <code>myresrc_base</code>
     */
    public static final MyresrcBase MYRESRC_BASE = new MyresrcBase();

    /**
     * 数据字典表
     */
    public final SysDict SYS_DICT = com.xzh.myresrc.base.db.tables.SysDict.SYS_DICT;

    /**
     * No further instances allowed
     */
    private MyresrcBase() {
        super("myresrc_base", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            SysDict.SYS_DICT);
    }
}
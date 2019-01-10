/*
 * This file is generated by jOOQ.
 */
package generated.rx.async.regular.tables.records;


import generated.rx.async.regular.tables.Somethingwithoutjson;
import generated.rx.async.regular.tables.interfaces.ISomethingwithoutjson;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SomethingwithoutjsonRecord extends UpdatableRecordImpl<SomethingwithoutjsonRecord> implements VertxPojo, Record2<Integer, String>, ISomethingwithoutjson {

    private static final long serialVersionUID = -167512509;

    /**
     * Setter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    @Override
    public SomethingwithoutjsonRecord setSomeid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    @Override
    public Integer getSomeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    @Override
    public SomethingwithoutjsonRecord setSomestring(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    @Override
    public String getSomestring() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSomestring();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSomestring();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingwithoutjsonRecord value1(Integer value) {
        setSomeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingwithoutjsonRecord value2(String value) {
        setSomestring(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SomethingwithoutjsonRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISomethingwithoutjson from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISomethingwithoutjson> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SomethingwithoutjsonRecord
     */
    public SomethingwithoutjsonRecord() {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON);
    }

    /**
     * Create a detached, initialised SomethingwithoutjsonRecord
     */
    public SomethingwithoutjsonRecord(Integer someid, String somestring) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON);

        set(0, someid);
        set(1, somestring);
    }

    public SomethingwithoutjsonRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

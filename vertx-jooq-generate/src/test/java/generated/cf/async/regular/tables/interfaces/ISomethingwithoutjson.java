/*
 * This file is generated by jOOQ.
*/
package generated.cf.async.regular.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomethingwithoutjson extends VertxPojo, Serializable {

    /**
     * Setter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    public ISomethingwithoutjson setSomeid(Integer value);

    /**
     * Getter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    public ISomethingwithoutjson setSomestring(String value);

    /**
     * Getter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    public String getSomestring();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISomethingwithoutjson
     */
    public void from(generated.cf.async.regular.tables.interfaces.ISomethingwithoutjson from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISomethingwithoutjson
     */
    public <E extends generated.cf.async.regular.tables.interfaces.ISomethingwithoutjson> E into(E into);

    @Override
    public default ISomethingwithoutjson fromJson(io.vertx.core.json.JsonObject json) {
        setSomeid(json.getInteger("someId"));
        setSomestring(json.getString("someString"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("someId",getSomeid());
        json.put("someString",getSomestring());
        return json;
    }

}

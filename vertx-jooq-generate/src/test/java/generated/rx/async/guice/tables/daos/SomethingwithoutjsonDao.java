/*
 * This file is generated by jOOQ.
*/
package generated.rx.async.guice.tables.daos;


import generated.rx.async.guice.tables.Somethingwithoutjson;
import generated.rx.async.guice.tables.records.SomethingwithoutjsonRecord;

import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.async.AsyncRXQueryExecutor;
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
@javax.inject.Singleton
public class SomethingwithoutjsonDao extends AbstractAsyncVertxDAO<SomethingwithoutjsonRecord, generated.rx.async.guice.tables.pojos.Somethingwithoutjson, Integer, Single<List<generated.rx.async.guice.tables.pojos.Somethingwithoutjson>>, Single<Optional<generated.rx.async.guice.tables.pojos.Somethingwithoutjson>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingwithoutjsonRecord,generated.rx.async.guice.tables.pojos.Somethingwithoutjson,Integer> {
    @javax.inject.Inject

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingwithoutjsonDao(Configuration configuration,io.vertx.reactivex.ext.asyncsql.AsyncSQLClient delegate) {
        super(Somethingwithoutjson.SOMETHINGWITHOUTJSON, generated.rx.async.guice.tables.pojos.Somethingwithoutjson.class, new AsyncRXQueryExecutor<SomethingwithoutjsonRecord,generated.rx.async.guice.tables.pojos.Somethingwithoutjson,Integer>(configuration,delegate,generated.rx.async.guice.tables.pojos.Somethingwithoutjson::new, Somethingwithoutjson.SOMETHINGWITHOUTJSON));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.rx.async.guice.tables.pojos.Somethingwithoutjson object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Single<List<generated.rx.async.guice.tables.pojos.Somethingwithoutjson>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Somethingwithoutjson.SOMETHINGWITHOUTJSON.SOMESTRING.in(values));
    }

    @Override
    public AsyncRXQueryExecutor<SomethingwithoutjsonRecord,generated.rx.async.guice.tables.pojos.Somethingwithoutjson,Integer> queryExecutor(){
        return (AsyncRXQueryExecutor<SomethingwithoutjsonRecord,generated.rx.async.guice.tables.pojos.Somethingwithoutjson,Integer>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Integer> keyConverter(){
        return lastId -> Integer.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).intValue());
    }
}

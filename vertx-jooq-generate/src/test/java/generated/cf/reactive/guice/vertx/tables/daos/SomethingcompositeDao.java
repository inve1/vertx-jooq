/*
 * This file is generated by jOOQ.
 */
package generated.cf.reactive.guice.vertx.tables.daos;


import generated.cf.reactive.guice.vertx.tables.Somethingcomposite;
import generated.cf.reactive.guice.vertx.tables.records.SomethingcompositeRecord;
import io.github.jklingsporn.vertx.jooq.completablefuture.reactivepg.ReactiveCompletableFutureQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonObject;
import org.jooq.Configuration;
import org.jooq.Record2;

import javax.annotation.Generated;
import java.util.List;
import java.util.concurrent.CompletableFuture;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class SomethingcompositeDao extends AbstractReactiveVertxDAO<SomethingcompositeRecord, generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite>>, CompletableFuture<generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite>, CompletableFuture<Integer>, CompletableFuture<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.completablefuture.VertxDAO<SomethingcompositeRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {
    @javax.inject.Inject

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SomethingcompositeDao(Configuration configuration, io.reactiverse.pgclient.PgClient delegate, io.vertx.core.Vertx vertx) {
        super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite.class, new ReactiveCompletableFutureQueryExecutor<SomethingcompositeRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,delegate,generated.cf.reactive.guice.vertx.tables.mappers.RowMappers.getSomethingcompositeMapper(),vertx));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite object) {
        return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
    }

    /**
     * Find records that have <code>someSecondId IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(List<Integer> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public CompletableFuture<List<generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
    }

    @Override
    public ReactiveCompletableFutureQueryExecutor<SomethingcompositeRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
        return (ReactiveCompletableFutureQueryExecutor<SomethingcompositeRecord,generated.cf.reactive.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
    }
}

package androidx.datastore.core;

import a1.c;
import ja.x;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static SingleProcessDataStore a(List list, x xVar, u7.a aVar) {
        g.f(list, "migrations");
        g.f(xVar, "scope");
        return new SingleProcessDataStore(aVar, c.N0(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), new c(), xVar);
    }
}

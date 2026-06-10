package androidx.datastore.preferences.core;

import androidx.datastore.core.b;
import ja.x;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static PreferenceDataStore a(List list, x xVar, u7.a aVar) {
        g.f(list, "migrations");
        g.f(xVar, "scope");
        return new PreferenceDataStore(b.a(list, xVar, new PreferenceDataStoreFactory$create$delegate$1(aVar)));
    }
}

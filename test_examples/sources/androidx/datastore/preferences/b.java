package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.preferences.core.PreferenceDataStore;
import c8.j;
import ja.x;
import java.util.List;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public final l<Context, List<j3.c<m3.a>>> f4764b;
    public final x c;

    /* renamed from: e  reason: collision with root package name */
    public volatile PreferenceDataStore f4766e;

    /* renamed from: a  reason: collision with root package name */
    public final String f4763a = "Noto Data Store";

    /* renamed from: d  reason: collision with root package name */
    public final Object f4765d = new Object();

    public b(l lVar, x xVar) {
        this.f4764b = lVar;
        this.c = xVar;
    }

    public final Object a(Object obj, j jVar) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        g.f(context, "thisRef");
        g.f(jVar, "property");
        PreferenceDataStore preferenceDataStore2 = this.f4766e;
        if (preferenceDataStore2 == null) {
            synchronized (this.f4765d) {
                if (this.f4766e == null) {
                    Context applicationContext = context.getApplicationContext();
                    l<Context, List<j3.c<m3.a>>> lVar = this.f4764b;
                    g.e(applicationContext, "applicationContext");
                    this.f4766e = androidx.datastore.preferences.core.a.a(lVar.U(applicationContext), this.c, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                preferenceDataStore = this.f4766e;
                g.c(preferenceDataStore);
            }
            return preferenceDataStore;
        }
        return preferenceDataStore2;
    }
}

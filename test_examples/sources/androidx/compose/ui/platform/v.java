package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import n1.a;

/* loaded from: classes.dex */
public final class v implements ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Configuration f3910i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n1.a f3911j;

    public v(Configuration configuration, n1.a aVar) {
        this.f3910i = configuration;
        this.f3911j = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        v7.g.f(configuration, "configuration");
        Configuration configuration2 = this.f3910i;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<a.b, WeakReference<a.C0189a>>> it = this.f3911j.f16064a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<a.b, WeakReference<a.C0189a>> next = it.next();
            v7.g.e(next, "it.next()");
            a.C0189a c0189a = next.getValue().get();
            if (c0189a == null || Configuration.needNewResources(updateFrom, c0189a.f16066b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f3911j.f16064a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f3911j.f16064a.clear();
    }
}

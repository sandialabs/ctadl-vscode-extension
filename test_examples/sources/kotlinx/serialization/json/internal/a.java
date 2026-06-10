package kotlinx.serialization.json.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import sa.e;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f15696a = new ConcurrentHashMap(16);

    /* renamed from: kotlinx.serialization.json.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0177a<T> {
    }

    public final <T> T a(e eVar, C0177a<T> c0177a) {
        g.f(eVar, "descriptor");
        Map map = (Map) this.f15696a.get(eVar);
        Object obj = map != null ? map.get(c0177a) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }
}

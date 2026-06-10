package androidx.datastore.preferences.core;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.c;
import m3.a;
import v7.g;

/* loaded from: classes.dex */
public final class MutablePreferences extends m3.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<a.C0185a<?>, Object> f4767a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f4768b;

    public MutablePreferences() {
        this(false, 3);
    }

    public MutablePreferences(Map<a.C0185a<?>, Object> map, boolean z10) {
        g.f(map, "preferencesMap");
        this.f4767a = map;
        this.f4768b = new AtomicBoolean(z10);
    }

    public /* synthetic */ MutablePreferences(boolean z10, int i10) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : null, (i10 & 2) != 0 ? true : z10);
    }

    @Override // m3.a
    public final Map<a.C0185a<?>, Object> a() {
        Map<a.C0185a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f4767a);
        g.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // m3.a
    public final <T> T b(a.C0185a<T> c0185a) {
        g.f(c0185a, "key");
        return (T) this.f4767a.get(c0185a);
    }

    public final void c() {
        if (!(!this.f4768b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final <T> void d(a.C0185a<T> c0185a, T t10) {
        g.f(c0185a, "key");
        e(c0185a, t10);
    }

    public final void e(a.C0185a<?> c0185a, Object obj) {
        g.f(c0185a, "key");
        c();
        Map<a.C0185a<?>, Object> map = this.f4767a;
        if (obj == null) {
            c();
            map.remove(c0185a);
            return;
        }
        if (obj instanceof Set) {
            obj = Collections.unmodifiableSet(c.Q2((Iterable) obj));
            g.e(obj, "unmodifiableSet(value.toSet())");
        }
        map.put(c0185a, obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return g.a(this.f4767a, ((MutablePreferences) obj).f4767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4767a.hashCode();
    }

    public final String toString() {
        return c.t2(this.f4767a.entrySet(), ",\n", "{\n", "\n}", MutablePreferences$toString$1.f4769j, 24);
    }
}

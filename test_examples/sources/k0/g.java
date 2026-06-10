package k0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public final class g extends n7.d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12847i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12848j;

    public g(e eVar) {
        v7.g.f(eVar, "builder");
        this.f12848j = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f12847i) {
            case 0:
                d((Map.Entry) obj);
                throw null;
            default:
                d((Map.Entry) obj);
                throw null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f12847i) {
            case 1:
                v7.g.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // n7.d
    public final int c() {
        Object obj = this.f12848j;
        switch (this.f12847i) {
            case 0:
                return ((e) obj).n;
            default:
                return ((MapBuilder) obj).f13006p;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Object obj = this.f12848j;
        switch (this.f12847i) {
            case 0:
                ((e) obj).clear();
                return;
            default:
                ((MapBuilder) obj).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        switch (this.f12847i) {
            case 0:
                return s(obj);
            default:
                return t(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f12847i) {
            case 1:
                v7.g.f(collection, "elements");
                return ((MapBuilder) this.f12848j).c(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public final void d(Map.Entry entry) {
        switch (this.f12847i) {
            case 0:
                v7.g.f(entry, "element");
                throw new UnsupportedOperationException();
            default:
                v7.g.f(entry, "element");
                throw new UnsupportedOperationException();
        }
    }

    public final boolean g(Map.Entry entry) {
        switch (this.f12847i) {
            case 0:
                v7.g.f(entry, "element");
                return u(entry);
            default:
                v7.g.f(entry, "element");
                return u(entry);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f12847i) {
            case 1:
                return ((MapBuilder) this.f12848j).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Object obj = this.f12848j;
        switch (this.f12847i) {
            case 0:
                return new h((e) obj);
            default:
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                return new MapBuilder.b(mapBuilder);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f12847i) {
            case 0:
                return w(obj);
            default:
                return x(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f12847i) {
            case 1:
                v7.g.f(collection, "elements");
                ((MapBuilder) this.f12848j).b();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f12847i) {
            case 1:
                v7.g.f(collection, "elements");
                ((MapBuilder) this.f12848j).b();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    public final /* bridge */ boolean s(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    public final /* bridge */ boolean t(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    public final boolean u(Map.Entry entry) {
        Object obj = this.f12848j;
        switch (this.f12847i) {
            case 0:
                v7.g.f(entry, "element");
                e eVar = (e) obj;
                Object obj2 = eVar.get(entry.getKey());
                if (obj2 != null) {
                    return v7.g.a(obj2, entry.getValue());
                }
                if (entry.getValue() == null && eVar.containsKey(entry.getKey())) {
                    return true;
                }
                return false;
            default:
                v7.g.f(entry, "element");
                return ((MapBuilder) obj).d(entry);
        }
    }

    public final boolean v(Map.Entry entry) {
        Object obj = this.f12848j;
        switch (this.f12847i) {
            case 0:
                v7.g.f(entry, "element");
                return ((e) obj).remove(entry.getKey(), entry.getValue());
            default:
                v7.g.f(entry, "element");
                MapBuilder mapBuilder = (MapBuilder) obj;
                mapBuilder.getClass();
                mapBuilder.b();
                int g10 = mapBuilder.g(entry.getKey());
                if (g10 >= 0) {
                    Object[] objArr = mapBuilder.f13001j;
                    v7.g.c(objArr);
                    if (v7.g.a(objArr[g10], entry.getValue())) {
                        mapBuilder.n(g10);
                        return true;
                    }
                }
                return false;
        }
    }

    public final /* bridge */ boolean w(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    public final /* bridge */ boolean x(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    public g(MapBuilder mapBuilder) {
        v7.g.f(mapBuilder, "backing");
        this.f12848j = mapBuilder;
    }
}

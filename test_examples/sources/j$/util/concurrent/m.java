package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f12150a;

    /* renamed from: b  reason: collision with root package name */
    final Object f12151b;
    volatile Object c;

    /* renamed from: d  reason: collision with root package name */
    volatile m f12152d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(int i10, Object obj, Object obj2, m mVar) {
        this.f12150a = i10;
        this.f12151b = obj;
        this.c = obj2;
        this.f12152d = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m a(int i10, Object obj) {
        Object obj2;
        if (obj != null) {
            m mVar = this;
            do {
                if (mVar.f12150a == i10 && ((obj2 = mVar.f12151b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                }
                mVar = mVar.f12152d;
            } while (mVar != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f12151b) || key.equals(obj2)) && (value == (obj3 = this.c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12151b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12151b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f12151b + "=" + this.c;
    }
}

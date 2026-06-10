package p0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import w7.c;

/* loaded from: classes.dex */
public final class r implements Map.Entry<Object, Object>, c.a {

    /* renamed from: i  reason: collision with root package name */
    public final Object f16621i;

    /* renamed from: j  reason: collision with root package name */
    public Object f16622j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ s<Object, Object> f16623k;

    public r(s<Object, Object> sVar) {
        this.f16623k = sVar;
        Map.Entry<? extends Object, ? extends Object> entry = sVar.f16627l;
        v7.g.c(entry);
        this.f16621i = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = sVar.f16627l;
        v7.g.c(entry2);
        this.f16622j = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16621i;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16622j;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        s<Object, Object> sVar = this.f16623k;
        if (sVar.f16624i.a().f16616d == sVar.f16626k) {
            Object obj2 = this.f16622j;
            sVar.f16624i.put(this.f16621i, obj);
            this.f16622j = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}

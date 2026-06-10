package ua;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class a1<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile SoftReference<T> f17946a = new SoftReference<>(null);

    public final synchronized T a(u7.a<? extends T> aVar) {
        T t10 = this.f17946a.get();
        if (t10 != null) {
            return t10;
        }
        T k02 = aVar.k0();
        this.f17946a = new SoftReference<>(k02);
        return k02;
    }
}

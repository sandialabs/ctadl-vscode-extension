package ib;

import a1.c;
import gb.b;
import java.util.HashMap;
import java.util.HashSet;
import org.koin.core.instance.SingleInstanceFactory;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11870a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<SingleInstanceFactory<?>> f11871b;
    public final HashMap<String, b<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<kb.a> f11872d;

    public a() {
        this(false);
    }

    public a(boolean z10) {
        this.f11870a = z10;
        this.f11871b = new HashSet<>();
        this.c = new HashMap<>();
        this.f11872d = new HashSet<>();
    }

    public final void a(String str, b<?> bVar, boolean z10) {
        g.f(str, "mapping");
        g.f(bVar, "factory");
        HashMap<String, b<?>> hashMap = this.c;
        if (!z10 && hashMap.containsKey(str)) {
            c.b1(bVar, str);
            throw null;
        }
        hashMap.put(str, bVar);
    }
}

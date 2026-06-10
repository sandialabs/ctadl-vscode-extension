package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import y9.e0;
import y9.f0;

/* loaded from: classes.dex */
public final class n extends o {
    public final /* synthetic */ Map<e0, f0> c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f15065d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Map<e0, ? extends f0> map, boolean z10) {
        this.c = map;
        this.f15065d = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean a() {
        return this.f15065d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean e() {
        return this.c.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public final f0 g(e0 e0Var) {
        v7.g.f(e0Var, "key");
        return this.c.get(e0Var);
    }
}

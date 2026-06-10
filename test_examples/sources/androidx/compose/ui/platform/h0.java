package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import o0.c;

/* loaded from: classes.dex */
public final class h0 implements o0.c {

    /* renamed from: a  reason: collision with root package name */
    public final u7.a<m7.n> f3845a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o0.c f3846b;

    public h0(o0.d dVar, u7.a aVar) {
        this.f3845a = aVar;
        this.f3846b = dVar;
    }

    @Override // o0.c
    public final boolean a(Object obj) {
        return this.f3846b.a(obj);
    }

    @Override // o0.c
    public final Map<String, List<Object>> b() {
        return this.f3846b.b();
    }

    @Override // o0.c
    public final Object c(String str) {
        v7.g.f(str, "key");
        return this.f3846b.c(str);
    }

    @Override // o0.c
    public final c.a d(String str, u7.a<? extends Object> aVar) {
        v7.g.f(str, "key");
        return this.f3846b.d(str, aVar);
    }
}

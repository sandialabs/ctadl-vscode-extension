package wa;

import java.util.List;
import kotlinx.serialization.json.JsonObject;
import ua.j0;

/* loaded from: classes.dex */
public final class o extends kotlinx.serialization.json.internal.c {

    /* renamed from: r  reason: collision with root package name */
    public final JsonObject f18518r;

    /* renamed from: s  reason: collision with root package name */
    public final List<String> f18519s;

    /* renamed from: t  reason: collision with root package name */
    public final int f18520t;

    /* renamed from: u  reason: collision with root package name */
    public int f18521u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(va.a aVar, JsonObject jsonObject) {
        super(aVar, jsonObject, null, null);
        v7.g.f(aVar, "json");
        v7.g.f(jsonObject, "value");
        this.f18518r = jsonObject;
        List<String> L2 = kotlin.collections.c.L2(jsonObject.keySet());
        this.f18519s = L2;
        this.f18520t = L2.size() * 2;
        this.f18521u = -1;
    }

    @Override // kotlinx.serialization.json.internal.c, wa.b
    public final kotlinx.serialization.json.b D(String str) {
        v7.g.f(str, "tag");
        if (this.f18521u % 2 == 0) {
            j0 j0Var = va.g.f18220a;
            return new va.k(str, true);
        }
        return (kotlinx.serialization.json.b) kotlin.collections.d.L1(str, this.f18518r);
    }

    @Override // kotlinx.serialization.json.internal.c, wa.b
    public final kotlinx.serialization.json.b L() {
        return this.f18518r;
    }

    @Override // kotlinx.serialization.json.internal.c
    public final JsonObject P() {
        return this.f18518r;
    }

    @Override // kotlinx.serialization.json.internal.c, wa.b, ta.a, ta.b
    public final void a(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.c, ta.a
    public final int t(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        int i10 = this.f18521u;
        if (i10 < this.f18520t - 1) {
            int i11 = i10 + 1;
            this.f18521u = i11;
            return i11;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.c, ua.b1
    public final String z(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return this.f18519s.get(i10 / 2);
    }
}

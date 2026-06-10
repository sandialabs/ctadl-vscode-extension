package kotlinx.serialization.json.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.a;
import n7.l;
import sa.e;
import sa.h;
import ua.j0;
import v7.g;

/* loaded from: classes.dex */
public class c extends wa.b {

    /* renamed from: m  reason: collision with root package name */
    public final JsonObject f15698m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final e f15699o;

    /* renamed from: p  reason: collision with root package name */
    public int f15700p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15701q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(va.a aVar, JsonObject jsonObject, String str, e eVar) {
        super(aVar);
        g.f(aVar, "json");
        g.f(jsonObject, "value");
        this.f15698m = jsonObject;
        this.n = str;
        this.f15699o = eVar;
    }

    @Override // wa.b
    public kotlinx.serialization.json.b D(String str) {
        g.f(str, "tag");
        return (kotlinx.serialization.json.b) kotlin.collections.d.L1(str, L());
    }

    @Override // wa.b
    /* renamed from: P */
    public JsonObject L() {
        return this.f15698m;
    }

    @Override // wa.b, ta.a, ta.b
    public void a(e eVar) {
        Set set;
        Set c22;
        g.f(eVar, "descriptor");
        va.e eVar2 = this.f18502l;
        if (!eVar2.f18210b && !(eVar.h() instanceof sa.c)) {
            va.a aVar = this.f18501k;
            b.c(eVar, aVar);
            if (!eVar2.f18219l) {
                c22 = m0.b.z(eVar);
            } else {
                Set z10 = m0.b.z(eVar);
                Map map = (Map) aVar.c.a(eVar, b.f15697a);
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = EmptySet.f12983i;
                }
                c22 = l.c2(z10, set);
            }
            for (String str : L().keySet()) {
                if (!c22.contains(str) && !g.a(str, this.n)) {
                    String jsonObject = L().toString();
                    g.f(str, "key");
                    StringBuilder p10 = a4.b.p("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                    p10.append((Object) a1.c.T0(-1, jsonObject));
                    throw a1.c.r(p10.toString(), -1);
                }
            }
        }
    }

    @Override // wa.b, ta.c, ta.d
    public final ta.a b(e eVar) {
        g.f(eVar, "descriptor");
        return eVar == this.f15699o ? this : super.b(eVar);
    }

    @Override // wa.b, kotlinx.serialization.internal.TaggedDecoder, ta.c
    public final boolean o() {
        return !this.f15701q && super.o();
    }

    @Override // ta.a
    public int t(e eVar) {
        kotlinx.serialization.json.c cVar;
        boolean z10;
        g.f(eVar, "descriptor");
        while (this.f15700p < eVar.c()) {
            int i10 = this.f15700p;
            this.f15700p = i10 + 1;
            String z11 = z(eVar, i10);
            g.f(z11, "nestedName");
            String str = (String) kotlin.collections.c.w2(this.f15649i);
            boolean z12 = true;
            int i11 = this.f15700p - 1;
            this.f15701q = false;
            boolean containsKey = L().containsKey(z11);
            va.a aVar = this.f18501k;
            if (!containsKey) {
                if (!aVar.f18191a.f18213f && !eVar.k(i11) && eVar.j(i11).f()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15701q = z10;
                if (!z10) {
                    continue;
                }
            }
            if (this.f18502l.f18215h) {
                e j2 = eVar.j(i11);
                if (j2.f() || !(D(z11) instanceof JsonNull)) {
                    if (g.a(j2.h(), h.b.f17531a) && (!j2.f() || !(D(z11) instanceof JsonNull))) {
                        kotlinx.serialization.json.b D = D(z11);
                        String str2 = null;
                        if (D instanceof kotlinx.serialization.json.c) {
                            cVar = (kotlinx.serialization.json.c) D;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            j0 j0Var = va.g.f18220a;
                            if (!(cVar instanceof JsonNull)) {
                                str2 = cVar.c();
                            }
                        }
                        if (str2 != null && b.a(str2, j2, aVar) == -3) {
                        }
                    }
                    z12 = false;
                }
                if (!z12) {
                }
            }
            return i11;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[SYNTHETIC] */
    @Override // ua.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String z(e eVar, int i10) {
        Object obj;
        boolean z10;
        g.f(eVar, "descriptor");
        va.a aVar = this.f18501k;
        b.c(eVar, aVar);
        String d5 = eVar.d(i10);
        if (!this.f18502l.f18219l) {
            return d5;
        }
        if (L().keySet().contains(d5)) {
            return d5;
        }
        a.C0177a<Map<String, Integer>> c0177a = b.f15697a;
        JsonNamesMapKt$deserializationNamesMap$1 jsonNamesMapKt$deserializationNamesMap$1 = new JsonNamesMapKt$deserializationNamesMap$1(eVar, aVar);
        a aVar2 = aVar.c;
        aVar2.getClass();
        Object a10 = aVar2.a(eVar, c0177a);
        if (a10 == null) {
            a10 = jsonNamesMapKt$deserializationNamesMap$1.k0();
            ConcurrentHashMap concurrentHashMap = aVar2.f15696a;
            Object obj2 = concurrentHashMap.get(eVar);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, obj2);
            }
            ((Map) obj2).put(c0177a, a10);
        }
        Map map = (Map) a10;
        Iterator<T> it = L().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i10) {
                    z10 = true;
                    continue;
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
                if (z10) {
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return d5;
    }
}

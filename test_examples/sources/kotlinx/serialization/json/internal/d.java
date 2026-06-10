package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import m7.n;
import u7.q;
import v7.g;
import v7.l;
import va.e;
import va.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final wa.a f15702a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15703b;
    public int c;

    public d(e eVar, wa.a aVar) {
        g.f(eVar, "configuration");
        g.f(aVar, "lexer");
        this.f15702a = aVar;
        this.f15703b = eVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:27:0x008b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, m7.a aVar, p7.c cVar) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i10;
        byte h10;
        CoroutineSingletons coroutineSingletons;
        m7.a aVar2;
        LinkedHashMap linkedHashMap;
        String k3;
        dVar.getClass();
        if (cVar instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) cVar;
            int i11 = jsonTreeReader$readObject$2.f15689r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.f15689r = i11 - Integer.MIN_VALUE;
                Object obj = jsonTreeReader$readObject$2.f15687p;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = jsonTreeReader$readObject$2.f15689r;
                if (i10 == 0) {
                    if (i10 == 1) {
                        String str = jsonTreeReader$readObject$2.f15686o;
                        linkedHashMap = jsonTreeReader$readObject$2.n;
                        d dVar2 = jsonTreeReader$readObject$2.f15685m;
                        m7.a aVar3 = jsonTreeReader$readObject$2.f15684l;
                        m0.b.n1(obj);
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                        linkedHashMap.put(str, (kotlinx.serialization.json.b) obj);
                        byte g10 = dVar2.f15702a.g();
                        if (g10 == 4) {
                            if (g10 == 7) {
                                d dVar3 = dVar2;
                                h10 = g10;
                                dVar = dVar3;
                                wa.a aVar4 = dVar.f15702a;
                                if (h10 == 6) {
                                    aVar4.h((byte) 7);
                                } else if (h10 == 4) {
                                    wa.a.p(aVar4, "Unexpected trailing comma", 0, null, 6);
                                    throw null;
                                }
                                return new JsonObject(linkedHashMap);
                            }
                            wa.a.p(dVar2.f15702a, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        aVar2 = aVar3;
                        coroutineSingletons = coroutineSingletons3;
                        d dVar4 = dVar2;
                        h10 = g10;
                        dVar = dVar4;
                        if (dVar.f15702a.b()) {
                            boolean z10 = dVar.f15703b;
                            wa.a aVar5 = dVar.f15702a;
                            if (z10) {
                                k3 = aVar5.l();
                            } else {
                                k3 = aVar5.k();
                            }
                            aVar5.h((byte) 5);
                            n nVar = n.f16010a;
                            jsonTreeReader$readObject$2.f15684l = aVar2;
                            jsonTreeReader$readObject$2.f15685m = dVar;
                            jsonTreeReader$readObject$2.n = linkedHashMap;
                            jsonTreeReader$readObject$2.f15686o = k3;
                            jsonTreeReader$readObject$2.f15689r = 1;
                            aVar2.a(nVar, jsonTreeReader$readObject$2);
                            if (coroutineSingletons2 != coroutineSingletons) {
                                coroutineSingletons3 = coroutineSingletons;
                                aVar3 = aVar2;
                                obj = coroutineSingletons2;
                                String str2 = k3;
                                dVar2 = dVar;
                                str = str2;
                                linkedHashMap.put(str, (kotlinx.serialization.json.b) obj);
                                byte g102 = dVar2.f15702a.g();
                                if (g102 == 4) {
                                }
                            } else {
                                return coroutineSingletons;
                            }
                        }
                        wa.a aVar42 = dVar.f15702a;
                        if (h10 == 6) {
                        }
                        return new JsonObject(linkedHashMap);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                wa.a aVar6 = dVar.f15702a;
                h10 = aVar6.h((byte) 6);
                if (aVar6.t() != 4) {
                    coroutineSingletons = coroutineSingletons2;
                    aVar2 = aVar;
                    linkedHashMap = new LinkedHashMap();
                    if (dVar.f15702a.b()) {
                    }
                    wa.a aVar422 = dVar.f15702a;
                    if (h10 == 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                wa.a.p(aVar6, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
        }
        jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(dVar, cVar);
        Object obj2 = jsonTreeReader$readObject$2.f15687p;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = jsonTreeReader$readObject$2.f15689r;
        if (i10 == 0) {
        }
    }

    public final kotlinx.serialization.json.b b() {
        kotlinx.serialization.json.b jsonObject;
        String k3;
        Object obj;
        wa.a aVar = this.f15702a;
        byte t10 = aVar.t();
        if (t10 == 1) {
            return d(true);
        }
        if (t10 == 0) {
            return d(false);
        }
        if (t10 == 6) {
            int i10 = this.c + 1;
            this.c = i10;
            if (i10 == 200) {
                m7.b bVar = new m7.b(n.f16010a, new JsonTreeReader$readDeepRecursive$1(this, null));
                while (true) {
                    obj = bVar.f15988l;
                    p7.c<Object> cVar = bVar.f15987k;
                    if (cVar == null) {
                        break;
                    }
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (g.a(coroutineSingletons, obj)) {
                        try {
                            q<? super m7.a<?, ?>, Object, ? super p7.c<Object>, ? extends Object> qVar = bVar.f15985i;
                            Object obj2 = bVar.f15986j;
                            g.d(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                            l.d(3, qVar);
                            obj = qVar.O(bVar, obj2, cVar);
                        } catch (Throwable th) {
                            obj = m0.b.Q(th);
                        }
                        if (obj != coroutineSingletons) {
                        }
                    } else {
                        bVar.f15988l = coroutineSingletons;
                    }
                    cVar.t(obj);
                }
                m0.b.n1(obj);
                jsonObject = (kotlinx.serialization.json.b) obj;
            } else {
                byte h10 = aVar.h((byte) 6);
                if (aVar.t() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!aVar.b()) {
                            break;
                        }
                        if (this.f15703b) {
                            k3 = aVar.l();
                        } else {
                            k3 = aVar.k();
                        }
                        aVar.h((byte) 5);
                        linkedHashMap.put(k3, b());
                        h10 = aVar.g();
                        if (h10 != 4) {
                            if (h10 != 7) {
                                wa.a.p(aVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (h10 == 6) {
                        aVar.h((byte) 7);
                    } else if (h10 == 4) {
                        wa.a.p(aVar, "Unexpected trailing comma", 0, null, 6);
                        throw null;
                    }
                    jsonObject = new JsonObject(linkedHashMap);
                } else {
                    wa.a.p(aVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.c--;
            return jsonObject;
        } else if (t10 == 8) {
            return c();
        } else {
            wa.a.p(aVar, androidx.activity.e.g("Cannot begin reading element, unexpected token: ", t10), 0, null, 6);
            throw null;
        }
    }

    public final kotlinx.serialization.json.a c() {
        boolean z10;
        wa.a aVar = this.f15702a;
        byte g10 = aVar.g();
        if (aVar.t() != 4) {
            ArrayList arrayList = new ArrayList();
            while (aVar.b()) {
                arrayList.add(b());
                g10 = aVar.g();
                if (g10 != 4) {
                    if (g10 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i10 = aVar.f18498a;
                    if (!z10) {
                        wa.a.p(aVar, "Expected end of the array or comma", i10, null, 4);
                        throw null;
                    }
                }
            }
            if (g10 == 8) {
                aVar.h((byte) 9);
            } else if (g10 == 4) {
                wa.a.p(aVar, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        wa.a.p(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final kotlinx.serialization.json.c d(boolean z10) {
        String l2;
        boolean z11 = this.f15703b;
        wa.a aVar = this.f15702a;
        if (!z11 && z10) {
            l2 = aVar.k();
            return (z10 && g.a(l2, "null")) ? JsonNull.INSTANCE : new k(l2, z10);
        }
        l2 = aVar.l();
        if (z10) {
        }
    }
}

package androidx.compose.foundation.relocation;

import h0.e;
import j1.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.b;
import m7.n;
import p7.c;
import x.d;
import x.f;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl implements d {

    /* renamed from: a  reason: collision with root package name */
    public final e<f> f2031a = new e<>(new f[16]);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r13 >= r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008a -> B:37:0x008d). Please submit an issue!!! */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0.d dVar, c<? super n> cVar) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i10;
        f[] fVarArr;
        int i11;
        u0.d dVar2;
        CoroutineSingletons coroutineSingletons;
        int i12;
        u0.d dVar3;
        Object a10;
        if (cVar instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) cVar;
            int i13 = bringIntoViewRequesterImpl$bringIntoView$1.f2037r;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.f2037r = i13 - Integer.MIN_VALUE;
                Object obj = bringIntoViewRequesterImpl$bringIntoView$1.f2035p;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = bringIntoViewRequesterImpl$bringIntoView$1.f2037r;
                if (i10 == 0) {
                    if (i10 == 1) {
                        i12 = bringIntoViewRequesterImpl$bringIntoView$1.f2034o;
                        int i14 = bringIntoViewRequesterImpl$bringIntoView$1.n;
                        ?? r42 = bringIntoViewRequesterImpl$bringIntoView$1.f2033m;
                        u0.d dVar4 = bringIntoViewRequesterImpl$bringIntoView$1.f2032l;
                        b.n1(obj);
                        dVar2 = dVar4;
                        fVarArr = r42;
                        i11 = i14;
                        coroutineSingletons = coroutineSingletons2;
                        i12++;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b.n1(obj);
                    e<f> eVar = this.f2031a;
                    int i15 = eVar.f11334k;
                    if (i15 > 0) {
                        fVarArr = eVar.f11332i;
                        i11 = i15;
                        dVar2 = dVar;
                        coroutineSingletons = coroutineSingletons2;
                        i12 = 0;
                        f fVar = fVarArr[i12];
                        bringIntoViewRequesterImpl$bringIntoView$1.f2032l = dVar2;
                        bringIntoViewRequesterImpl$bringIntoView$1.f2033m = fVarArr;
                        bringIntoViewRequesterImpl$bringIntoView$1.n = i11;
                        bringIntoViewRequesterImpl$bringIntoView$1.f2034o = i12;
                        bringIntoViewRequesterImpl$bringIntoView$1.f2037r = 1;
                        h hVar = fVar.f18546k;
                        if (hVar == null || !hVar.P()) {
                            hVar = null;
                        }
                        if (hVar != null) {
                            if (dVar2 == null) {
                                dVar3 = a1.c.t(u0.c.f17721b, v8.b.M(hVar.p()));
                            } else {
                                dVar3 = dVar2;
                            }
                            x.c cVar2 = fVar.f18545j;
                            if (cVar2 == null) {
                                cVar2 = fVar.f18544i;
                            }
                            a10 = cVar2.a(dVar3, hVar, bringIntoViewRequesterImpl$bringIntoView$1);
                            if (a10 == coroutineSingletons2) {
                                if (a10 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i12++;
                            }
                        }
                        a10 = n.f16010a;
                        if (a10 == coroutineSingletons) {
                        }
                        i12++;
                    }
                    return n.f16010a;
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, cVar);
        Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.f2035p;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = bringIntoViewRequesterImpl$bringIntoView$1.f2037r;
        if (i10 == 0) {
        }
    }
}

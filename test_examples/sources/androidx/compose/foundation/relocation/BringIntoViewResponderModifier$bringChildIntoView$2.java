package androidx.compose.foundation.relocation;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.h;
import ja.u0;
import ja.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u0.d;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {214, 223, 230}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Pair f2044m;
    public Pair n;

    /* renamed from: o  reason: collision with root package name */
    public int f2045o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f2046p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ BringIntoViewResponderModifier f2047q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ h f2048r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f2049s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, h hVar, d dVar, p7.c<? super BringIntoViewResponderModifier$bringChildIntoView$2> cVar) {
        super(2, cVar);
        this.f2047q = bringIntoViewResponderModifier;
        this.f2048r = hVar;
        this.f2049s = dVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.f2047q, this.f2048r, this.f2049s, cVar);
        bringIntoViewResponderModifier$bringChildIntoView$2.f2046p = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:52:0x00c6, B:54:0x00ca), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Pair<d, ? extends u0> pair;
        Pair<d, ? extends u0> pair2;
        Pair<d, ? extends u0> pair3;
        h hVar;
        Pair<d, ? extends u0> pair4;
        Pair<d, ? extends u0> pair5;
        Pair<d, ? extends u0> pair6;
        Pair<d, ? extends u0> pair7;
        Pair<d, ? extends u0> pair8;
        Pair<d, ? extends u0> pair9;
        Pair<d, ? extends u0> pair10;
        Pair<d, ? extends u0> pair11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2045o;
        BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2047q;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            pair9 = (Pair) this.f2046p;
                            b.n1(obj);
                            pair4 = pair9;
                            pair10 = bringIntoViewResponderModifier.n;
                            pair11 = bringIntoViewResponderModifier.f2043m;
                            if (pair10 == pair11) {
                                bringIntoViewResponderModifier.n = null;
                            }
                            if (pair11 == pair4) {
                                bringIntoViewResponderModifier.f2043m = null;
                            }
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair5 = this.n;
                    pair4 = this.f2044m;
                    hVar = (h) this.f2046p;
                    try {
                        b.n1(obj);
                        if (bringIntoViewResponderModifier.n == pair5) {
                            this.f2046p = pair4;
                            this.f2044m = null;
                            this.n = null;
                            this.f2045o = 3;
                            if (BringIntoViewResponderModifier.c(bringIntoViewResponderModifier, pair4, hVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            pair9 = pair4;
                            pair4 = pair9;
                        }
                        pair10 = bringIntoViewResponderModifier.n;
                        pair11 = bringIntoViewResponderModifier.f2043m;
                        if (pair10 == pair11) {
                        }
                        if (pair11 == pair4) {
                        }
                        return n.f16010a;
                    } catch (Throwable th) {
                        th = th;
                        pair = pair4;
                        pair2 = bringIntoViewResponderModifier.n;
                        pair3 = bringIntoViewResponderModifier.f2043m;
                        if (pair2 == pair3) {
                            bringIntoViewResponderModifier.n = null;
                        }
                        if (pair3 == pair) {
                            bringIntoViewResponderModifier.f2043m = null;
                        }
                        throw th;
                    }
                }
                pair6 = (Pair) this.f2046p;
                b.n1(obj);
                n nVar = n.f16010a;
                pair7 = bringIntoViewResponderModifier.n;
                pair8 = bringIntoViewResponderModifier.f2043m;
                if (pair7 == pair8) {
                    bringIntoViewResponderModifier.n = null;
                }
                if (pair8 == pair6) {
                    bringIntoViewResponderModifier.f2043m = null;
                }
                return nVar;
            }
            b.n1(obj);
            x xVar = (x) this.f2046p;
            h hVar2 = bringIntoViewResponderModifier.f18546k;
            if (hVar2 == null || !hVar2.P()) {
                hVar2 = null;
            }
            if (hVar2 == null) {
                return n.f16010a;
            }
            h hVar3 = this.f2048r;
            if (!hVar3.P()) {
                return n.f16010a;
            }
            boolean z10 = false;
            d t10 = hVar2.t(hVar3, false);
            d d5 = this.f2049s.d(a1.c.s(t10.f17726a, t10.f17727b));
            Pair<d, ? extends u0> pair12 = new Pair<>(d5, a1.b.X(xVar.j()));
            Pair<d, ? extends u0> pair13 = bringIntoViewResponderModifier.f2043m;
            bringIntoViewResponderModifier.f2043m = pair12;
            if (pair13 != null) {
                try {
                    d dVar = pair13.f12962i;
                    if (dVar.f17726a <= d5.f17726a && dVar.f17727b <= d5.f17727b && dVar.c >= d5.c && dVar.f17728d >= d5.f17728d) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f2046p = hVar2;
                        this.f2044m = pair12;
                        this.n = pair13;
                        this.f2045o = 2;
                        if (((u0) pair13.f12963j).R(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hVar = hVar2;
                        pair4 = pair12;
                        pair5 = pair13;
                        if (bringIntoViewResponderModifier.n == pair5) {
                        }
                        pair10 = bringIntoViewResponderModifier.n;
                        pair11 = bringIntoViewResponderModifier.f2043m;
                        if (pair10 == pair11) {
                        }
                        if (pair11 == pair4) {
                        }
                        return n.f16010a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pair = pair12;
                    pair2 = bringIntoViewResponderModifier.n;
                    pair3 = bringIntoViewResponderModifier.f2043m;
                    if (pair2 == pair3) {
                    }
                    if (pair3 == pair) {
                    }
                    throw th;
                }
            }
            this.f2046p = pair12;
            this.f2045o = 1;
            if (BringIntoViewResponderModifier.c(bringIntoViewResponderModifier, pair12, hVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            pair6 = pair12;
            n nVar2 = n.f16010a;
            pair7 = bringIntoViewResponderModifier.n;
            pair8 = bringIntoViewResponderModifier.f2043m;
            if (pair7 == pair8) {
            }
            if (pair8 == pair6) {
            }
            return nVar2;
        } catch (Throwable th3) {
            th = th3;
            pair = coroutineSingletons;
        }
    }
}

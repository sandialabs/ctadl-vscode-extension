package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import ja.u0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t.g;
import u.h;
import u.j;
import u.l;
import u.m;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {412, 414, 421, 422, 431}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public boolean f1455m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f1456o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g f1457p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f1458q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ j f1459r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ g0<m> f1460s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ g1<u7.a<Boolean>> f1461t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$handlePressInteraction$2(g gVar, long j2, j jVar, g0<m> g0Var, g1<? extends u7.a<Boolean>> g1Var, p7.c<? super ClickableKt$handlePressInteraction$2> cVar) {
        super(2, cVar);
        this.f1457p = gVar;
        this.f1458q = j2;
        this.f1459r = jVar;
        this.f1460s = g0Var;
        this.f1461t = g1Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ClickableKt$handlePressInteraction$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.f1457p, this.f1458q, this.f1459r, this.f1460s, this.f1461t, cVar);
        clickableKt$handlePressInteraction$2.f1456o = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        u0 M0;
        Object M;
        h lVar;
        boolean z10;
        u.n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        g0<m> g0Var = this.f1460s;
        j jVar = this.f1459r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m0.b.n1(obj);
                        g0Var.setValue(null);
                        return n.f16010a;
                    }
                    nVar = (u.n) this.f1456o;
                    m0.b.n1(obj);
                    this.f1456o = null;
                    this.n = 4;
                    if (jVar.a(nVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    g0Var.setValue(null);
                    return n.f16010a;
                }
                z10 = this.f1455m;
                m0.b.n1(obj);
                if (z10) {
                    m mVar = new m(this.f1458q);
                    u.n nVar2 = new u.n(mVar);
                    this.f1456o = nVar2;
                    this.n = 3;
                    if (jVar.a(mVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nVar = nVar2;
                    this.f1456o = null;
                    this.n = 4;
                    if (jVar.a(nVar, this) == coroutineSingletons) {
                    }
                }
                g0Var.setValue(null);
                return n.f16010a;
            }
            M0 = (u0) this.f1456o;
            m0.b.n1(obj);
            M = obj;
        } else {
            m0.b.n1(obj);
            M0 = m0.b.M0((x) this.f1456o, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.f1461t, this.f1458q, this.f1459r, this.f1460s, null), 3);
            this.f1456o = M0;
            this.n = 1;
            M = this.f1457p.M(this);
            if (M == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        boolean booleanValue = ((Boolean) M).booleanValue();
        if (M0.b()) {
            this.f1456o = null;
            this.f1455m = booleanValue;
            this.n = 2;
            M0.c(null);
            Object R = M0.R(this);
            if (R != coroutineSingletons) {
                R = n.f16010a;
            }
            if (R == coroutineSingletons) {
                return coroutineSingletons;
            }
            z10 = booleanValue;
            if (z10) {
            }
            g0Var.setValue(null);
            return n.f16010a;
        }
        m value = g0Var.getValue();
        if (value != null) {
            if (booleanValue) {
                lVar = new u.n(value);
            } else {
                lVar = new l(value);
            }
            this.f1456o = null;
            this.n = 5;
            if (jVar.a(lVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        g0Var.setValue(null);
        return n.f16010a;
    }
}

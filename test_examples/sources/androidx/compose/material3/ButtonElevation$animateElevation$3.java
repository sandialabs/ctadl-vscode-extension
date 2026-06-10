package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import r.f;
import r.y;
import u.h;
import u.m;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.material3.ButtonElevation$animateElevation$3", f = "Button.kt", l = {864}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ButtonElevation$animateElevation$3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2244m;
    public final /* synthetic */ androidx.compose.animation.core.a<b2.d, f> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f2245o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ float f2246p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ h f2247q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$3(androidx.compose.animation.core.a<b2.d, f> aVar, b bVar, float f10, h hVar, p7.c<? super ButtonElevation$animateElevation$3> cVar) {
        super(2, cVar);
        this.n = aVar;
        this.f2245o = bVar;
        this.f2246p = f10;
        this.f2247q = hVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ButtonElevation$animateElevation$3) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new ButtonElevation$animateElevation$3(this.n, this.f2245o, this.f2246p, this.f2247q, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        if ((r2 instanceof u.d) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
        if ((r1 instanceof u.d) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object obj2;
        y<b2.d> yVar;
        Object d5;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2244m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            androidx.compose.animation.core.a<b2.d, f> aVar = this.n;
            float f10 = ((b2.d) aVar.f1356e.getValue()).f6339i;
            b bVar = this.f2245o;
            y<b2.d> yVar2 = null;
            if (b2.d.a(f10, bVar.f2603b)) {
                obj2 = new m(u0.c.f17721b);
            } else if (b2.d.a(f10, bVar.f2604d)) {
                obj2 = new u.f();
            } else if (b2.d.a(f10, bVar.c)) {
                obj2 = new u.d();
            } else {
                obj2 = null;
            }
            this.f2244m = 1;
            y<b2.d> yVar3 = e0.d.f10537a;
            h hVar = this.f2247q;
            if (hVar != null) {
                if (!(hVar instanceof m)) {
                    if (!(hVar instanceof u.b)) {
                        if (!(hVar instanceof u.f)) {
                        }
                    }
                }
                yVar2 = e0.d.f10537a;
            } else if (obj2 != null) {
                if (!(obj2 instanceof m) && !(obj2 instanceof u.b)) {
                    if (obj2 instanceof u.f) {
                        yVar = e0.d.c;
                        yVar2 = yVar;
                    }
                }
                yVar = e0.d.f10538b;
                yVar2 = yVar;
            }
            float f11 = this.f2246p;
            if (yVar2 != null) {
                d5 = androidx.compose.animation.core.a.a(aVar, new b2.d(f11), yVar2, this);
                if (d5 == obj3) {
                    if (d5 == obj3) {
                        return obj3;
                    }
                }
                d5 = n.f16010a;
                if (d5 == obj3) {
                }
            } else {
                d5 = aVar.d(new b2.d(f11), this);
                if (d5 == obj3) {
                    if (d5 == obj3) {
                    }
                }
                d5 = n.f16010a;
                if (d5 == obj3) {
                }
            }
        }
        return n.f16010a;
    }
}

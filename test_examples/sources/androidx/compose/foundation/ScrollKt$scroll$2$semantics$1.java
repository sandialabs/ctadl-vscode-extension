package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.j;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.h;
import o1.i;
import o1.o;
import u7.l;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1567j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f1568k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f1569l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ScrollState f1570m;
    public final /* synthetic */ x n;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<Float, Float, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x f1571j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f1572k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ScrollState f1573l;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {276, 278}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00131 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f1574m;
            public final /* synthetic */ boolean n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ ScrollState f1575o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ float f1576p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ float f1577q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00131(boolean z10, ScrollState scrollState, float f10, float f11, p7.c<? super C00131> cVar) {
                super(2, cVar);
                this.n = z10;
                this.f1575o = scrollState;
                this.f1576p = f10;
                this.f1577q = f11;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((C00131) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new C00131(this.n, this.f1575o, this.f1576p, this.f1577q, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f1574m;
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    boolean z10 = this.n;
                    ScrollState scrollState = this.f1575o;
                    if (z10) {
                        this.f1574m = 1;
                        if (ScrollExtensionsKt.a(scrollState, this.f1576p, a1.c.z1(0.0f, null, 7), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        this.f1574m = 2;
                        if (ScrollExtensionsKt.a(scrollState, this.f1577q, a1.c.z1(0.0f, null, 7), this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x xVar, boolean z10, ScrollState scrollState) {
            super(2);
            this.f1571j = xVar;
            this.f1572k = z10;
            this.f1573l = scrollState;
        }

        @Override // u7.p
        public final Boolean R(Float f10, Float f11) {
            float floatValue = f10.floatValue();
            m0.b.M0(this.f1571j, null, null, new C00131(this.f1572k, this.f1573l, f11.floatValue(), floatValue, null), 3);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1(boolean z10, boolean z11, boolean z12, ScrollState scrollState, x xVar) {
        super(1);
        this.f1567j = z10;
        this.f1568k = z11;
        this.f1569l = z12;
        this.f1570m = scrollState;
        this.n = xVar;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        g.f(oVar2, "$this$semantics");
        ScrollState scrollState = this.f1570m;
        h hVar = new h(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(scrollState), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(scrollState), this.f1567j);
        j<Object>[] jVarArr = o1.n.f16212a;
        boolean z10 = this.f1568k;
        if (z10) {
            o1.n.f16215e.a(oVar2, o1.n.f16212a[6], hVar);
        } else {
            o1.n.f16214d.a(oVar2, o1.n.f16212a[5], hVar);
        }
        if (this.f1569l) {
            oVar2.c(i.f16195d, new o1.a(null, new AnonymousClass1(this.n, z10, scrollState)));
        }
        return n.f16010a;
    }
}

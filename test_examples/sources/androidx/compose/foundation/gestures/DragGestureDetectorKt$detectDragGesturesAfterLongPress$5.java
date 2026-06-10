package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import g1.v;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/v;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {276, 280, 284}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1651m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ l<u0.c, n> f1652o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1653p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1654q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ p<o, u0.c, n> f1655r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {286}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

        /* renamed from: k  reason: collision with root package name */
        public int f1656k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f1657l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o f1658m;
        public final /* synthetic */ u7.a<n> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ u7.a<n> f1659o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ p<o, u0.c, n> f1660p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/o;", "it", "Lm7/n;", "invoke", "(Lg1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
        /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00141 extends Lambda implements l<o, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ p<o, u0.c, n> f1661j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00141(p<? super o, ? super u0.c, n> pVar) {
                super(1);
                this.f1661j = pVar;
            }

            @Override // u7.l
            public final n U(o oVar) {
                o oVar2 = oVar;
                g.f(oVar2, "it");
                this.f1661j.R(oVar2, new u0.c(v0.p.C(oVar2, false)));
                oVar2.a();
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(o oVar, u7.a<n> aVar, u7.a<n> aVar2, p<? super o, ? super u0.c, n> pVar, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f1658m = oVar;
            this.n = aVar;
            this.f1659o = aVar2;
            this.f1660p = pVar;
        }

        @Override // u7.p
        public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
            return ((AnonymousClass1) a(cVar, cVar2)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1658m, this.n, this.f1659o, this.f1660p, cVar);
            anonymousClass1.f1657l = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            g1.c cVar;
            u7.a<n> aVar;
            boolean z10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1656k;
            if (i10 != 0) {
                if (i10 == 1) {
                    cVar = (g1.c) this.f1657l;
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                g1.c cVar2 = (g1.c) this.f1657l;
                long j2 = this.f1658m.f11162a;
                C00141 c00141 = new C00141(this.f1660p);
                this.f1657l = cVar2;
                this.f1656k = 1;
                Object f10 = DragGestureDetectorKt.f(cVar2, j2, c00141, this);
                if (f10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
                obj = f10;
            }
            if (((Boolean) obj).booleanValue()) {
                List<o> list = cVar.C().f11159a;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    o oVar = list.get(i11);
                    g.f(oVar, "<this>");
                    if (!oVar.b() && oVar.f11167g && !oVar.f11164d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        oVar.a();
                    }
                }
                aVar = this.n;
            } else {
                aVar = this.f1659o;
            }
            aVar.k0();
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(l<? super u0.c, n> lVar, u7.a<n> aVar, u7.a<n> aVar2, p<? super o, ? super u0.c, n> pVar, p7.c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.f1652o = lVar;
        this.f1653p = aVar;
        this.f1654q = aVar2;
        this.f1655r = pVar;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f1652o, this.f1653p, this.f1654q, this.f1655r, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.n = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: CancellationException -> 0x007f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x007f, blocks: (B:7:0x0010, B:12:0x0020, B:23:0x0053, B:25:0x0058, B:20:0x0048), top: B:33:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        v vVar;
        o oVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1651m;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            m0.b.n1(obj);
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (v) this.n;
                    m0.b.n1(obj);
                    oVar = (o) obj;
                    if (oVar != null) {
                        this.f1652o.U(new u0.c(oVar.c));
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(oVar, this.f1654q, this.f1653p, this.f1655r, null);
                        this.n = null;
                        this.f1651m = 3;
                        if (vVar.Q(anonymousClass1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return n.f16010a;
                }
                vVar = (v) this.n;
                m0.b.n1(obj);
            } else {
                m0.b.n1(obj);
                v vVar2 = (v) this.n;
                DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(null);
                this.n = vVar2;
                this.f1651m = 1;
                Object Q = vVar2.Q(dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1, this);
                if (Q == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vVar = vVar2;
                obj = Q;
            }
            o oVar2 = (o) obj;
            this.n = vVar;
            this.f1651m = 2;
            obj = DragGestureDetectorKt.a(vVar, oVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            oVar = (o) obj;
            if (oVar != null) {
            }
            return n.f16010a;
        } catch (CancellationException e10) {
            this.f1653p.k0();
            throw e10;
        }
    }
}

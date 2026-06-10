package androidx.compose.material.ripple;

import androidx.datastore.preferences.PreferencesProto$Value;
import d0.g;
import d0.j;
import ja.x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import r.q;
import r.y;
import u.h;
import u.i;
import u.l;
import u.m;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2138m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f2139o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g f2140p;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<h> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ g f2141i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x f2142j;

        public a(g gVar, x xVar) {
            this.f2141i = gVar;
            this.f2142j = xVar;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(h hVar, p7.c<? super n> cVar) {
            u.b bVar;
            y<Float> yVar;
            p stateLayer$handleInteraction$2;
            float f10;
            y<Float> yVar2;
            m mVar;
            h hVar2 = hVar;
            boolean z10 = hVar2 instanceof m;
            x xVar = this.f2142j;
            g gVar = this.f2141i;
            if (z10) {
                gVar.e((m) hVar2, xVar);
            } else {
                if (hVar2 instanceof u.n) {
                    mVar = ((u.n) hVar2).f17715a;
                } else if (hVar2 instanceof l) {
                    mVar = ((l) hVar2).f17713a;
                } else {
                    gVar.getClass();
                    v7.g.f(hVar2, "interaction");
                    v7.g.f(xVar, "scope");
                    j jVar = gVar.f10365a;
                    jVar.getClass();
                    boolean z11 = hVar2 instanceof u.b;
                    ArrayList arrayList = jVar.f10369d;
                    if (z11) {
                        arrayList.add(hVar2);
                    } else {
                        if (hVar2 instanceof u.c) {
                            bVar = ((u.c) hVar2).f17709a;
                        } else if (hVar2 instanceof u.a) {
                            bVar = ((u.a) hVar2).f17708a;
                        }
                        arrayList.remove(bVar);
                    }
                    h hVar3 = (h) kotlin.collections.c.w2(arrayList);
                    if (!v7.g.a(jVar.f10370e, hVar3)) {
                        if (hVar3 != null) {
                            if (z11) {
                                f10 = jVar.f10368b.getValue().f10349a;
                            } else {
                                f10 = 0.0f;
                            }
                            y<Float> yVar3 = d0.h.f10366a;
                            if (hVar3 instanceof u.b) {
                                yVar2 = new y<>(45, q.c, 2);
                            } else {
                                yVar2 = d0.h.f10366a;
                            }
                            stateLayer$handleInteraction$2 = new StateLayer$handleInteraction$1(jVar, f10, yVar2, null);
                        } else {
                            h hVar4 = jVar.f10370e;
                            y<Float> yVar4 = d0.h.f10366a;
                            if (hVar4 instanceof u.b) {
                                yVar = new y<>(150, q.c, 2);
                            } else {
                                yVar = d0.h.f10366a;
                            }
                            stateLayer$handleInteraction$2 = new StateLayer$handleInteraction$2(jVar, yVar, null);
                        }
                        m0.b.M0(xVar, null, null, stateLayer$handleInteraction$2, 3);
                        jVar.f10370e = hVar3;
                    }
                }
                gVar.g(mVar);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(i iVar, g gVar, p7.c<? super Ripple$rememberUpdatedInstance$1> cVar) {
        super(2, cVar);
        this.f2139o = iVar;
        this.f2140p = gVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((Ripple$rememberUpdatedInstance$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.f2139o, this.f2140p, cVar);
        ripple$rememberUpdatedInstance$1.n = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2138m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.p c = this.f2139o.c();
            a aVar = new a(this.f2140p, (x) this.n);
            this.f2138m = 1;
            c.getClass();
            if (kotlinx.coroutines.flow.p.n(c, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

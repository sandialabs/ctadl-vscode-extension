package androidx.compose.foundation.interaction;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import ja.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u.f;
import u.g;
import u.h;
import u.i;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HoverInteractionKt$collectIsHoveredAsState$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1871m;
    public final /* synthetic */ i n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g0<Boolean> f1872o;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<h> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ List<f> f1873i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<Boolean> f1874j;

        public a(ArrayList arrayList, g0 g0Var) {
            this.f1873i = arrayList;
            this.f1874j = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.c
        public final Object c(h hVar, p7.c cVar) {
            h hVar2 = hVar;
            boolean z10 = hVar2 instanceof f;
            List<f> list = this.f1873i;
            if (z10) {
                list.add(hVar2);
            } else if (hVar2 instanceof g) {
                list.remove(((g) hVar2).f17711a);
            }
            this.f1874j.setValue(Boolean.valueOf(!list.isEmpty()));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1(i iVar, g0<Boolean> g0Var, p7.c<? super HoverInteractionKt$collectIsHoveredAsState$1> cVar) {
        super(2, cVar);
        this.n = iVar;
        this.f1872o = g0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((HoverInteractionKt$collectIsHoveredAsState$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new HoverInteractionKt$collectIsHoveredAsState$1(this.n, this.f1872o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1871m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.p c = this.n.c();
            a aVar = new a(arrayList, this.f1872o);
            this.f1871m = 1;
            c.getClass();
            if (kotlinx.coroutines.flow.p.n(c, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

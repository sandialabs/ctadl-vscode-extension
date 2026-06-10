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
import u.h;
import u.i;
import u.l;
import u.m;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PressInteractionKt$collectIsPressedAsState$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1875m;
    public final /* synthetic */ i n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g0<Boolean> f1876o;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<h> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ List<m> f1877i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g0<Boolean> f1878j;

        public a(ArrayList arrayList, g0 g0Var) {
            this.f1877i = arrayList;
            this.f1878j = g0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.c
        public final Object c(h hVar, p7.c cVar) {
            m mVar;
            h hVar2 = hVar;
            boolean z10 = hVar2 instanceof m;
            List<m> list = this.f1877i;
            if (z10) {
                list.add(hVar2);
            } else {
                if (hVar2 instanceof u.n) {
                    mVar = ((u.n) hVar2).f17715a;
                } else if (hVar2 instanceof l) {
                    mVar = ((l) hVar2).f17713a;
                }
                list.remove(mVar);
            }
            this.f1878j.setValue(Boolean.valueOf(!list.isEmpty()));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1(i iVar, g0<Boolean> g0Var, p7.c<? super PressInteractionKt$collectIsPressedAsState$1> cVar) {
        super(2, cVar);
        this.n = iVar;
        this.f1876o = g0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((PressInteractionKt$collectIsPressedAsState$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new PressInteractionKt$collectIsPressedAsState$1(this.n, this.f1876o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1875m;
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
            a aVar = new a(arrayList, this.f1876o);
            this.f1875m = 1;
            c.getClass();
            if (kotlinx.coroutines.flow.p.n(c, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

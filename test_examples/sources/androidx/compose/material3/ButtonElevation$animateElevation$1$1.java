package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u.e;
import u.f;
import u.g;
import u.h;
import u.i;
import u.l;
import u.m;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {810}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ButtonElevation$animateElevation$1$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2239m;
    public final /* synthetic */ i n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<h> f2240o;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<h> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<h> f2241i;

        public a(SnapshotStateList<h> snapshotStateList) {
            this.f2241i = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(h hVar, p7.c cVar) {
            Object obj;
            h hVar2 = hVar;
            boolean z10 = hVar2 instanceof f;
            SnapshotStateList<h> snapshotStateList = this.f2241i;
            if (!z10) {
                if (hVar2 instanceof g) {
                    obj = ((g) hVar2).f17711a;
                } else if (!(hVar2 instanceof u.d)) {
                    if (hVar2 instanceof e) {
                        obj = ((e) hVar2).f17710a;
                    } else if (!(hVar2 instanceof m)) {
                        if (hVar2 instanceof u.n) {
                            obj = ((u.n) hVar2).f17715a;
                        } else {
                            if (hVar2 instanceof l) {
                                obj = ((l) hVar2).f17713a;
                            }
                            return n.f16010a;
                        }
                    }
                }
                snapshotStateList.remove(obj);
                return n.f16010a;
            }
            snapshotStateList.add(hVar2);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$1$1(i iVar, SnapshotStateList<h> snapshotStateList, p7.c<? super ButtonElevation$animateElevation$1$1> cVar) {
        super(2, cVar);
        this.n = iVar;
        this.f2240o = snapshotStateList;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ButtonElevation$animateElevation$1$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new ButtonElevation$animateElevation$1$1(this.n, this.f2240o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2239m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.p c = this.n.c();
            a aVar = new a(this.f2240o);
            this.f2239m = 1;
            c.getClass();
            if (kotlinx.coroutines.flow.p.n(c, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

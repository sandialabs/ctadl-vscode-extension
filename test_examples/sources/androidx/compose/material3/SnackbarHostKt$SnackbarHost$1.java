package androidx.compose.material3;

import androidx.compose.ui.platform.h;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import ja.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2420m;
    public final /* synthetic */ m n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ h f2421o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(m mVar, h hVar, p7.c<? super SnackbarHostKt$SnackbarHost$1> cVar) {
        super(2, cVar);
        this.n = mVar;
        this.f2421o = hVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.n, this.f2421o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2420m;
        m mVar = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            if (mVar != null) {
                SnackbarDuration duration = mVar.a().getDuration();
                if (mVar.a().b() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g.f(duration, "<this>");
                int ordinal = duration.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            j2 = Long.MAX_VALUE;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        j2 = 10000;
                    }
                } else {
                    j2 = 4000;
                }
                h hVar = this.f2421o;
                if (hVar != null) {
                    j2 = hVar.a(j2, z10);
                }
                this.f2420m = 1;
                if (m0.b.S(j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
        mVar.dismiss();
        return n.f16010a;
    }
}

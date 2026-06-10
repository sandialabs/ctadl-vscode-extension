package com.noto.app.settings.general;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import g0.g1;
import g0.m0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
@c(c = "com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2", f = "GeneralSettingsFragment.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2 extends SuspendLambda implements p<m0<String>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9739m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ GeneralSettingsFragment f9740o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g1<Long> f9741p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Context f9742q;

    /* loaded from: classes.dex */
    public static final class a implements kotlinx.coroutines.flow.c<t6.a> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ m0<String> f9743i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Context f9744j;

        public a(m0<String> m0Var, Context context) {
            this.f9743i = m0Var;
            this.f9744j = context;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(t6.a aVar, p7.c cVar) {
            Context context = this.f9744j;
            g.e(context, "context");
            this.f9743i.setValue(ModelUtilsKt.o(context, aVar));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2(GeneralSettingsFragment generalSettingsFragment, g1<Long> g1Var, Context context, p7.c<? super GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2> cVar) {
        super(2, cVar);
        this.f9740o = generalSettingsFragment;
        this.f9741p = g1Var;
        this.f9742q = context;
    }

    @Override // u7.p
    public final Object R(m0<String> m0Var, p7.c<? super n> cVar) {
        return ((GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2) a(m0Var, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2 generalSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2 = new GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2(this.f9740o, this.f9741p, this.f9742q, cVar);
        generalSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2.n = obj;
        return generalSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9739m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            com.noto.app.settings.c Z = GeneralSettingsFragment.Z(this.f9740o);
            kotlinx.coroutines.flow.b<t6.a> d5 = Z.f9659d.d(this.f9741p.getValue().longValue());
            a aVar = new a((m0) this.n, this.f9742q);
            this.f9739m = 1;
            if (d5.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

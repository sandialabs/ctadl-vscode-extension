package com.noto.app.settings.general;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.util.ModelUtilsKt;
import g0.g1;
import g0.m0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
@c(c = "com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2", f = "GeneralSettingsFragment.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2 extends SuspendLambda implements p<m0<String>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9730m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f9731o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f9732p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f9733q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f9734r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f9735s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ GeneralSettingsFragment f9736t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f9737u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g1<Long> f9738v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2(String str, String str2, String str3, String str4, String str5, GeneralSettingsFragment generalSettingsFragment, Context context, g1<Long> g1Var, p7.c<? super GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2> cVar) {
        super(2, cVar);
        this.f9731o = str;
        this.f9732p = str2;
        this.f9733q = str3;
        this.f9734r = str4;
        this.f9735s = str5;
        this.f9736t = generalSettingsFragment;
        this.f9737u = context;
        this.f9738v = g1Var;
    }

    @Override // u7.p
    public final Object R(m0<String> m0Var, p7.c<? super n> cVar) {
        return ((GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2) a(m0Var, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2 generalSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2 = new GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2(this.f9731o, this.f9732p, this.f9733q, this.f9734r, this.f9735s, this.f9736t, this.f9737u, this.f9738v, cVar);
        generalSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2.n = obj;
        return generalSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0 m0Var;
        m0 m0Var2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9730m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0Var2 = (m0) this.n;
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            m0Var = (m0) this.n;
            g1<Long> g1Var = this.f9738v;
            long a10 = GeneralSettingsFragment$onCreateView$1$3$1.a(g1Var);
            if (a10 == -4) {
                str = this.f9731o;
            } else {
                List<Long> list = FilteredItemModel.f8281k;
                if (a10 == -2) {
                    str = this.f9732p;
                } else if (a10 == -3) {
                    str = this.f9733q;
                } else if (a10 == -5) {
                    str = this.f9734r;
                } else if (a10 == -6) {
                    str = this.f9735s;
                } else {
                    com.noto.app.settings.c Z = GeneralSettingsFragment.Z(this.f9736t);
                    kotlinx.coroutines.flow.b<t6.a> d5 = Z.f9659d.d(GeneralSettingsFragment$onCreateView$1$3$1.a(g1Var));
                    this.n = m0Var;
                    this.f9730m = 1;
                    Object a11 = FlowKt__ReduceKt.a(d5, this);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m0Var2 = m0Var;
                    obj = a11;
                }
            }
            m0Var.setValue(str);
            return n.f16010a;
        }
        Context context = this.f9737u;
        g.e(context, "context");
        m0 m0Var3 = m0Var2;
        str = ModelUtilsKt.o(context, (t6.a) obj);
        m0Var = m0Var3;
        m0Var.setValue(str);
        return n.f16010a;
    }
}

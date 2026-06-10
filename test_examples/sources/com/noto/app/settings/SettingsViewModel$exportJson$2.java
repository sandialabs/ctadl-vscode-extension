package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.JsonUtilsKt;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m7.n;
import t6.d;
import t6.e;
import t6.f;
import t6.v;
import u7.p;
import va.j;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.SettingsViewModel$exportJson$2", f = "SettingsViewModel.kt", l = {104, 105, 106, 107, 108}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsViewModel$exportJson$2 extends SuspendLambda implements p<x, p7.c<? super String>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public List f9541m;
    public List n;

    /* renamed from: o  reason: collision with root package name */
    public List f9542o;

    /* renamed from: p  reason: collision with root package name */
    public List f9543p;

    /* renamed from: q  reason: collision with root package name */
    public int f9544q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ c f9545r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$exportJson$2(c cVar, p7.c<? super SettingsViewModel$exportJson$2> cVar2) {
        super(2, cVar2);
        this.f9545r = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super String> cVar) {
        return ((SettingsViewModel$exportJson$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsViewModel$exportJson$2(this.f9545r, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        List list;
        Object a10;
        List list2;
        List list3;
        Object a11;
        List list4;
        List list5;
        Object a12;
        List list6;
        List list7;
        List list8;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9544q;
        c cVar = this.f9545r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                List list9 = this.f9543p;
                                list4 = this.f9542o;
                                list8 = this.n;
                                List list10 = this.f9541m;
                                m0.b.n1(obj);
                                list7 = list9;
                                list6 = list10;
                                f fVar = new f(list6, list8, list4, list7, (v) obj);
                                j jVar = JsonUtilsKt.f9819a;
                                jVar.getClass();
                                return jVar.b(f.Companion.serializer(), fVar);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list4 = this.f9542o;
                        list5 = this.n;
                        list3 = this.f9541m;
                        m0.b.n1(obj);
                        List list11 = (List) obj;
                        kotlinx.coroutines.flow.b<v> w10 = cVar.f9663h.w();
                        this.f9541m = list3;
                        this.n = list5;
                        this.f9542o = list4;
                        this.f9543p = list11;
                        this.f9544q = 5;
                        a12 = FlowKt__ReduceKt.a(w10, this);
                        if (a12 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        list6 = list3;
                        list7 = list11;
                        obj = a12;
                        list8 = list5;
                        f fVar2 = new f(list6, list8, list4, list7, (v) obj);
                        j jVar2 = JsonUtilsKt.f9819a;
                        jVar2.getClass();
                        return jVar2.b(f.Companion.serializer(), fVar2);
                    }
                    list2 = this.n;
                    list3 = this.f9541m;
                    m0.b.n1(obj);
                    List list12 = (List) obj;
                    kotlinx.coroutines.flow.b<List<e>> b5 = cVar.f9662g.b();
                    this.f9541m = list3;
                    this.n = list2;
                    this.f9542o = list12;
                    this.f9544q = 4;
                    a11 = FlowKt__ReduceKt.a(b5, this);
                    if (a11 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list13 = list2;
                    list4 = list12;
                    obj = a11;
                    list5 = list13;
                    List list112 = (List) obj;
                    kotlinx.coroutines.flow.b<v> w102 = cVar.f9663h.w();
                    this.f9541m = list3;
                    this.n = list5;
                    this.f9542o = list4;
                    this.f9543p = list112;
                    this.f9544q = 5;
                    a12 = FlowKt__ReduceKt.a(w102, this);
                    if (a12 != coroutineSingletons) {
                    }
                } else {
                    list = this.f9541m;
                    m0.b.n1(obj);
                    List list14 = (List) obj;
                    kotlinx.coroutines.flow.b<List<t6.c>> d5 = cVar.f9661f.d();
                    this.f9541m = list;
                    this.n = list14;
                    this.f9544q = 3;
                    a10 = FlowKt__ReduceKt.a(d5, this);
                    if (a10 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list15 = list;
                    list2 = list14;
                    obj = a10;
                    list3 = list15;
                    List list122 = (List) obj;
                    kotlinx.coroutines.flow.b<List<e>> b52 = cVar.f9662g.b();
                    this.f9541m = list3;
                    this.n = list2;
                    this.f9542o = list122;
                    this.f9544q = 4;
                    a11 = FlowKt__ReduceKt.a(b52, this);
                    if (a11 != coroutineSingletons) {
                    }
                }
            } else {
                m0.b.n1(obj);
            }
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.b<List<t6.a>> c = cVar.f9659d.c();
            this.f9544q = 1;
            obj = FlowKt__ReduceKt.a(c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list16 = (List) obj;
        kotlinx.coroutines.flow.b<List<d>> e10 = cVar.f9660e.e();
        this.f9541m = list16;
        this.f9544q = 2;
        Object a13 = FlowKt__ReduceKt.a(e10, this);
        if (a13 == coroutineSingletons) {
            return coroutineSingletons;
        }
        list = list16;
        obj = a13;
        List list142 = (List) obj;
        kotlinx.coroutines.flow.b<List<t6.c>> d52 = cVar.f9661f.d();
        this.f9541m = list;
        this.n = list142;
        this.f9544q = 3;
        a10 = FlowKt__ReduceKt.a(d52, this);
        if (a10 != coroutineSingletons) {
        }
    }
}

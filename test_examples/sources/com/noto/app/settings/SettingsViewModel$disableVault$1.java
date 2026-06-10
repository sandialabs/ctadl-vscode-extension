package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.VaultTimeout;
import ja.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m7.n;
import n7.l;
import u6.e;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.SettingsViewModel$disableVault$1", f = "SettingsViewModel.kt", l = {208, 210, 211, 212, 213, 214, 215}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsViewModel$disableVault$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public c f9537m;
    public Iterator n;

    /* renamed from: o  reason: collision with root package name */
    public int f9538o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f9539p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$disableVault$1(c cVar, p7.c<? super SettingsViewModel$disableVault$1> cVar2) {
        super(2, cVar2);
        this.f9539p = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SettingsViewModel$disableVault$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsViewModel$disableVault$1(this.f9539p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[LOOP:1: B:17:0x0060->B:19:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object a10;
        Iterator it;
        c cVar;
        e eVar;
        e eVar2;
        VaultTimeout vaultTimeout;
        e eVar3;
        e eVar4;
        e eVar5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9538o;
        c cVar2 = this.f9539p;
        switch (i10) {
            case 0:
                m0.b.n1(obj);
                kotlinx.coroutines.flow.b<List<t6.a>> c = cVar2.f9659d.c();
                this.f9538o = 1;
                a10 = FlowKt__ReduceKt.a(c, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Iterable<t6.a> iterable = (Iterable) a10;
                ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
                for (t6.a aVar : iterable) {
                    arrayList.add(t6.a.a(aVar, null, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2031615));
                }
                it = arrayList.iterator();
                cVar = cVar2;
                while (it.hasNext()) {
                    u6.a aVar2 = cVar.f9659d;
                    this.f9537m = cVar;
                    this.n = it;
                    this.f9538o = 2;
                    if (aVar2.f((t6.a) it.next(), this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                eVar = cVar2.f9663h;
                this.f9537m = null;
                this.n = null;
                this.f9538o = 3;
                if (eVar.T(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar2 = cVar2.f9663h;
                vaultTimeout = VaultTimeout.Immediately;
                this.f9538o = 4;
                if (eVar2.j(vaultTimeout, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar3 = cVar2.f9663h;
                this.f9538o = 5;
                if (eVar3.B(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return n.f16010a;
            case 1:
                m0.b.n1(obj);
                a10 = obj;
                Iterable<t6.a> iterable2 = (Iterable) a10;
                ArrayList arrayList2 = new ArrayList(l.Z1(iterable2, 10));
                while (r2.hasNext()) {
                }
                it = arrayList2.iterator();
                cVar = cVar2;
                while (it.hasNext()) {
                }
                eVar = cVar2.f9663h;
                this.f9537m = null;
                this.n = null;
                this.f9538o = 3;
                if (eVar.T(null, this) == coroutineSingletons) {
                }
                eVar2 = cVar2.f9663h;
                vaultTimeout = VaultTimeout.Immediately;
                this.f9538o = 4;
                if (eVar2.j(vaultTimeout, this) == coroutineSingletons) {
                }
                eVar3 = cVar2.f9663h;
                this.f9538o = 5;
                if (eVar3.B(null, this) == coroutineSingletons) {
                }
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                it = this.n;
                cVar = this.f9537m;
                m0.b.n1(obj);
                while (it.hasNext()) {
                }
                eVar = cVar2.f9663h;
                this.f9537m = null;
                this.n = null;
                this.f9538o = 3;
                if (eVar.T(null, this) == coroutineSingletons) {
                }
                eVar2 = cVar2.f9663h;
                vaultTimeout = VaultTimeout.Immediately;
                this.f9538o = 4;
                if (eVar2.j(vaultTimeout, this) == coroutineSingletons) {
                }
                eVar3 = cVar2.f9663h;
                this.f9538o = 5;
                if (eVar3.B(null, this) == coroutineSingletons) {
                }
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                m0.b.n1(obj);
                eVar2 = cVar2.f9663h;
                vaultTimeout = VaultTimeout.Immediately;
                this.f9538o = 4;
                if (eVar2.j(vaultTimeout, this) == coroutineSingletons) {
                }
                eVar3 = cVar2.f9663h;
                this.f9538o = 5;
                if (eVar3.B(null, this) == coroutineSingletons) {
                }
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                m0.b.n1(obj);
                eVar3 = cVar2.f9663h;
                this.f9538o = 5;
                if (eVar3.B(null, this) == coroutineSingletons) {
                }
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 5:
                m0.b.n1(obj);
                eVar4 = cVar2.f9663h;
                this.f9538o = 6;
                if (eVar4.O(false, this) == coroutineSingletons) {
                }
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case 6:
                m0.b.n1(obj);
                eVar5 = cVar2.f9663h;
                this.f9538o = 7;
                if (eVar5.J(false, this) == coroutineSingletons) {
                }
                return n.f16010a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                m0.b.n1(obj);
                return n.f16010a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

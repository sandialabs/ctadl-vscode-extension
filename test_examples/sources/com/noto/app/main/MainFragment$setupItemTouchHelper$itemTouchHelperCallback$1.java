package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.b0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.app.util.ModelUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.x;
import u7.p;
import v7.g;
import z6.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/airbnb/epoxy/b0;", "viewHolder", "", "direction", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/b0;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainFragment$setupItemTouchHelper$itemTouchHelperCallback$1 extends Lambda implements p<b0, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8878j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x f8879k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupItemTouchHelper$itemTouchHelperCallback$1(x xVar, MainFragment mainFragment) {
        super(2);
        this.f8878j = mainFragment;
        this.f8879k = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r9 != null) goto L12;
     */
    @Override // u7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n R(b0 b0Var, Integer num) {
        d dVar;
        r rVar;
        d dVar2;
        Long l2;
        t6.a aVar;
        t6.a aVar2;
        b0 b0Var2 = b0Var;
        int intValue = num.intValue();
        g.f(b0Var2, "viewHolder");
        int i10 = MainFragment.A0;
        MainFragment mainFragment = this.f8878j;
        List list = (List) n6.d.a((n6.c) mainFragment.h0().f8910i.getValue(), EmptyList.f12981i);
        b0Var2.s();
        r rVar2 = b0Var2.f6617u;
        if (rVar2 instanceof d) {
            dVar = (d) rVar2;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            if (intValue == 16) {
                Pair<t6.a, Integer> j2 = ModelUtilsKt.j(list, new MainFragment$onSwipe$parentId$1(dVar));
                if (j2 != null && (aVar2 = j2.f12962i) != null) {
                    l2 = aVar2.f17593b;
                } else {
                    l2 = null;
                }
            } else {
                b0 b0Var3 = (b0) this.f8879k.f17482b.H(b0Var2.d() - 1);
                if (b0Var3 != null) {
                    b0Var3.s();
                    rVar = b0Var3.f6617u;
                } else {
                    rVar = null;
                }
                if (rVar instanceof d) {
                    dVar2 = (d) rVar;
                } else {
                    dVar2 = null;
                }
                Pair<t6.a, Integer> j10 = ModelUtilsKt.j(list, new MainFragment$onSwipe$parentId$2(dVar, dVar2));
                if (j10 != null && (aVar = j10.f12962i) != null) {
                    l2 = Long.valueOf(aVar.f17592a);
                } else {
                    l2 = null;
                }
            }
            MainViewModel h02 = mainFragment.h0();
            t6.a E = dVar.E();
            h02.getClass();
            m0.b.M0(a1.b.d0(h02), null, null, new MainViewModel$updateFolderParentId$1(h02, E, l2, null), 3);
            m mVar = mainFragment.f8845w0;
            if (mVar != null) {
                mVar.notifyModelChanged(b0Var2.d());
            } else {
                g.l("epoxyController");
                throw null;
            }
        }
        return n.f16010a;
    }
}

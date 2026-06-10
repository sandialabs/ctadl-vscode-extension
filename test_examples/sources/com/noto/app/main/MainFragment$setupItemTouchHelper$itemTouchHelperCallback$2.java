package com.noto.app.main;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.b0;
import com.airbnb.epoxy.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.x;
import v7.g;
import z6.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainFragment$setupItemTouchHelper$itemTouchHelperCallback$2 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8880j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x f8881k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupItemTouchHelper$itemTouchHelperCallback$2(x xVar, MainFragment mainFragment) {
        super(0);
        this.f8880j = mainFragment;
        this.f8881k = xVar;
    }

    @Override // u7.a
    public final n k0() {
        d dVar;
        int i10 = MainFragment.A0;
        MainFragment mainFragment = this.f8880j;
        mainFragment.getClass();
        x xVar = this.f8881k;
        EpoxyRecyclerView epoxyRecyclerView = xVar.f17482b;
        g.e(epoxyRecyclerView, "rv");
        int childCount = epoxyRecyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = epoxyRecyclerView.getChildAt(i11);
            g.e(childAt, "getChildAt(index)");
            RecyclerView.b0 D = xVar.f17482b.D(childAt);
            g.d(D, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyViewHolder");
            b0 b0Var = (b0) D;
            b0Var.s();
            r rVar = b0Var.f6617u;
            if (rVar instanceof d) {
                dVar = (d) rVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                MainViewModel h02 = mainFragment.h0();
                t6.a E = dVar.E();
                int d5 = b0Var.d();
                h02.getClass();
                m0.b.M0(a1.b.d0(h02), null, null, new MainViewModel$updateFolderPosition$1(h02, E, d5, null), 3);
            }
        }
        return n.f16010a;
    }
}

package com.noto.app.main;

import android.view.MotionEvent;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.m;
import com.noto.app.main.MainFragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.x;
import u7.p;
import v7.g;
import z6.f;
import z6.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "entry", "depth", "Lm7/n;", "invoke", "(Lkotlin/Pair;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainFragment$setupFolders$1$1$3$1 extends Lambda implements p<Pair<? extends t6.a, ? extends Integer>, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f8872j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f8873k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f8874l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8875m;
    public final /* synthetic */ x n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupFolders$1$1$3$1(m mVar, boolean z10, boolean z11, MainFragment mainFragment, x xVar) {
        super(2);
        this.f8872j = mVar;
        this.f8873k = z10;
        this.f8874l = z11;
        this.f8875m = mainFragment;
        this.n = xVar;
    }

    @Override // u7.p
    public final n R(Pair<? extends t6.a, ? extends Integer> pair, Integer num) {
        boolean z10;
        Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        int intValue = num.intValue();
        g.f(pair2, "entry");
        f fVar = new f();
        t6.a aVar = (t6.a) pair2.f12962i;
        fVar.M(aVar.f17592a);
        fVar.L(aVar);
        fVar.Q(((Number) pair2.f12963j).intValue());
        fVar.N(this.f8873k);
        fVar.P(this.f8874l);
        final MainFragment mainFragment = this.f8875m;
        Long l2 = (Long) mainFragment.f8847y0.getValue();
        if (l2 != null) {
            if (aVar.f17592a == l2.longValue()) {
                z10 = true;
                fVar.O(z10);
                fVar.p();
                fVar.f19137p = intValue;
                fVar.R(new c(mainFragment, pair2, 1));
                fVar.T(new k(mainFragment, pair2, 1));
                final x xVar = this.n;
                fVar.S(new View.OnTouchListener() { // from class: z6.l
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        RecyclerView.b0 D;
                        androidx.recyclerview.widget.n nVar;
                        s6.x xVar2 = s6.x.this;
                        v7.g.f(xVar2, "$this_setupFolders");
                        MainFragment mainFragment2 = mainFragment;
                        v7.g.f(mainFragment2, "this$0");
                        if (motionEvent.getAction() == 0 && (D = xVar2.f17482b.D(view)) != null && (nVar = mainFragment2.f8846x0) != null) {
                            nVar.t(D);
                        }
                        return view.performClick();
                    }
                });
                this.f8872j.add(fVar);
                return n.f16010a;
            }
        }
        z10 = false;
        fVar.O(z10);
        fVar.p();
        fVar.f19137p = intValue;
        fVar.R(new c(mainFragment, pair2, 1));
        fVar.T(new k(mainFragment, pair2, 1));
        final x xVar2 = this.n;
        fVar.S(new View.OnTouchListener() { // from class: z6.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                RecyclerView.b0 D;
                androidx.recyclerview.widget.n nVar;
                s6.x xVar22 = s6.x.this;
                v7.g.f(xVar22, "$this_setupFolders");
                MainFragment mainFragment2 = mainFragment;
                v7.g.f(mainFragment2, "this$0");
                if (motionEvent.getAction() == 0 && (D = xVar22.f17482b.D(view)) != null && (nVar = mainFragment2.f8846x0) != null) {
                    nVar.t(D);
                }
                return view.performClick();
            }
        });
        this.f8872j.add(fVar);
        return n.f16010a;
    }
}

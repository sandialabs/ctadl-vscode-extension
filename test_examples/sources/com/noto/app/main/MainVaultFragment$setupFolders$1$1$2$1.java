package com.noto.app.main;

import android.view.MotionEvent;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.airbnb.epoxy.m;
import com.noto.app.main.MainVaultFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;
import z6.f;
import z6.y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lt6/a;", "", "entry", "depth", "Lm7/n;", "invoke", "(Lkotlin/Pair;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainVaultFragment$setupFolders$1$1$2$1 extends Lambda implements p<Pair<? extends t6.a, ? extends Integer>, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f8898j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ MainVaultFragment f8899k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f8900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainVaultFragment$setupFolders$1$1$2$1(m mVar, MainVaultFragment mainVaultFragment, boolean z10) {
        super(2);
        this.f8898j = mVar;
        this.f8899k = mainVaultFragment;
        this.f8900l = z10;
    }

    @Override // u7.p
    public final n R(Pair<? extends t6.a, ? extends Integer> pair, Integer num) {
        final Pair<? extends t6.a, ? extends Integer> pair2 = pair;
        int intValue = num.intValue();
        g.f(pair2, "entry");
        f fVar = new f();
        t6.a aVar = (t6.a) pair2.f12962i;
        fVar.M(aVar.f17592a);
        fVar.L(aVar);
        fVar.Q(((Number) pair2.f12963j).intValue());
        boolean z10 = false;
        fVar.N(false);
        final MainVaultFragment mainVaultFragment = this.f8899k;
        Long l2 = (Long) mainVaultFragment.f8892v0.getValue();
        if (l2 != null) {
            if (aVar.f17592a == l2.longValue()) {
                z10 = true;
            }
        }
        fVar.O(z10);
        fVar.P(this.f8900l);
        fVar.p();
        fVar.f19137p = intValue;
        fVar.R(new y(mainVaultFragment, 2, pair2));
        fVar.T(new View.OnLongClickListener() { // from class: z6.r
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MainVaultFragment mainVaultFragment2 = MainVaultFragment.this;
                v7.g.f(mainVaultFragment2, "this$0");
                Pair pair3 = pair2;
                v7.g.f(pair3, "$entry");
                mainVaultFragment2.Z();
                NavController g10 = ViewUtilsKt.g(mainVaultFragment2);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new t(((t6.a) pair3.f12962i).f17592a), null);
                    return true;
                }
                return true;
            }
        });
        fVar.S(new View.OnTouchListener() { // from class: z6.s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        this.f8898j.add(fVar);
        return n.f16010a;
    }
}

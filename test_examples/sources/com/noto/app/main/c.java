package com.noto.app.main;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Pair;
import v7.g;
import z6.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f8980i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8981j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Pair f8982k;

    public /* synthetic */ c(MainFragment mainFragment, Pair pair, int i10) {
        this.f8980i = i10;
        this.f8981j = mainFragment;
        this.f8982k = pair;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8980i;
        Pair pair = this.f8982k;
        MainFragment mainFragment = this.f8981j;
        switch (i10) {
            case 0:
                g.f(mainFragment, "this$0");
                mainFragment.Z();
                long j2 = ((t6.a) pair.f12962i).f17592a;
                Long l2 = (Long) mainFragment.f8847y0.getValue();
                if (l2 != null && j2 == l2.longValue()) {
                    return;
                }
                NavController g10 = ViewUtilsKt.g(mainFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new p(((t6.a) pair.f12962i).f17592a), new MainFragment$setupFolders$1$1$2$1$1$1(mainFragment));
                    return;
                }
                return;
            default:
                g.f(mainFragment, "this$0");
                g.f(pair, "$entry");
                mainFragment.Z();
                t6.a aVar = (t6.a) pair.f12962i;
                long j10 = aVar.f17592a;
                Long l4 = (Long) mainFragment.f8847y0.getValue();
                if (l4 != null && j10 == l4.longValue()) {
                    return;
                }
                NavController g11 = ViewUtilsKt.g(mainFragment);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new p(aVar.f17592a), new MainFragment$setupFolders$1$1$3$1$1$1$1(mainFragment));
                    return;
                }
                return;
        }
    }
}

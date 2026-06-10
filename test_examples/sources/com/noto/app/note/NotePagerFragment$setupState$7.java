package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s6.k0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "scrollPosition", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$7 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k0 f9132j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ NotePagerFragment f9133k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$7(k0 k0Var, NotePagerFragment notePagerFragment) {
        super(1);
        this.f9132j = k0Var;
        this.f9133k = notePagerFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m7.n U(Integer num) {
        boolean z10;
        int intValue;
        int intValue2;
        Integer num2 = num;
        k0 k0Var = this.f9132j;
        AppBarLayout appBarLayout = k0Var.f17406a;
        if (num2 != null && num2.intValue() == 0) {
            z10 = false;
            appBarLayout.d(z10, true);
            int i10 = NotePagerFragment.f9109i0;
            NotePagerFragment notePagerFragment = this.f9133k;
            intValue = ((Number) a1.b.m(notePagerFragment.a0().f9146o).getValue()).intValue();
            v7.g.e(num2, "scrollPosition");
            intValue2 = num2.intValue();
            BottomAppBar bottomAppBar = k0Var.f17407b;
            if (intValue <= intValue2) {
                bottomAppBar.E();
            } else {
                bottomAppBar.getBehavior().t(bottomAppBar);
            }
            notePagerFragment.a0().f9146o.setValue(Integer.valueOf(num2.intValue()));
            return m7.n.f16010a;
        }
        z10 = true;
        appBarLayout.d(z10, true);
        int i102 = NotePagerFragment.f9109i0;
        NotePagerFragment notePagerFragment2 = this.f9133k;
        intValue = ((Number) a1.b.m(notePagerFragment2.a0().f9146o).getValue()).intValue();
        v7.g.e(num2, "scrollPosition");
        intValue2 = num2.intValue();
        BottomAppBar bottomAppBar2 = k0Var.f17407b;
        if (intValue <= intValue2) {
        }
        notePagerFragment2.a0().f9146o.setValue(Integer.valueOf(num2.intValue()));
        return m7.n.f16010a;
    }
}

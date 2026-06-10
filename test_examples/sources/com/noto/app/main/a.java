package com.noto.app.main;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.util.ViewUtilsKt;
import v7.g;
import z6.n;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f8976i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ o6.b f8977j;

    public /* synthetic */ a(o6.b bVar, int i10) {
        this.f8976i = i10;
        this.f8977j = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8976i;
        o6.b bVar = this.f8977j;
        switch (i10) {
            case 0:
                MainFragment mainFragment = (MainFragment) bVar;
                g.f(mainFragment, "this$0");
                mainFragment.Z();
                Long l2 = (Long) mainFragment.f8847y0.getValue();
                FilteredItemModel filteredItemModel = FilteredItemModel.All;
                if (l2 != null && l2.longValue() == -2) {
                    return;
                }
                NavController g10 = ViewUtilsKt.g(mainFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new n(filteredItemModel), new MainFragment$setupFolders$1$1$1$1$2$2$1(mainFragment));
                    return;
                }
                return;
            case 1:
                MainFragment mainFragment2 = (MainFragment) bVar;
                g.f(mainFragment2, "this$0");
                mainFragment2.Z();
                Long l4 = (Long) mainFragment2.f8847y0.getValue();
                FilteredItemModel filteredItemModel2 = FilteredItemModel.Scheduled;
                if (l4 != null && l4.longValue() == -5) {
                    return;
                }
                NavController g11 = ViewUtilsKt.g(mainFragment2);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new n(filteredItemModel2), new MainFragment$setupFolders$1$1$1$2$2$2$1(mainFragment2));
                    return;
                }
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                MainFragment mainFragment3 = (MainFragment) bVar;
                int i11 = MainFragment.A0;
                g.f(mainFragment3, "this$0");
                mainFragment3.Z();
                NavController g12 = ViewUtilsKt.g(mainFragment3);
                if (g12 != null) {
                    a4.b.r(R.id.action_mainFragment_to_settingsFragment, g12, null);
                    return;
                }
                return;
            default:
                MainDialogFragment mainDialogFragment = (MainDialogFragment) bVar;
                int i12 = MainDialogFragment.f8838v0;
                g.f(mainDialogFragment, "this$0");
                mainDialogFragment.Z();
                NavController g13 = ViewUtilsKt.g(mainDialogFragment);
                if (g13 != null) {
                    a4.b.r(R.id.action_mainDialogFragment_to_settingsFragment, g13, null);
                    return;
                }
                return;
        }
    }
}

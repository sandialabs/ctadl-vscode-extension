package com.noto.app.folder;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import com.noto.app.domain.model.NotoColor;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.StateFlowImpl;
import x6.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f8718i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f8719j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f8720k;

    public /* synthetic */ o(int i10, Fragment fragment, Object obj) {
        this.f8718i = i10;
        this.f8719j = fragment;
        this.f8720k = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8718i;
        Object obj = this.f8720k;
        Fragment fragment = this.f8719j;
        switch (i10) {
            case 0:
                FolderFragment$setupNotesAndLabels$1.b((FolderFragment) fragment, (h0) obj);
                return;
            case 1:
                FolderFragment$setupNotesAndLabels$1.b((FolderFragment) fragment, (h0) obj);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                FolderFragment$setupNotesAndLabels$1.d((FolderFragment) fragment, (h0) obj);
                return;
            default:
                NewFolderFragment newFolderFragment = (NewFolderFragment) fragment;
                Pair pair = (Pair) obj;
                v7.g.f(newFolderFragment, "this$0");
                v7.g.f(pair, "$pair");
                int i11 = NewFolderFragment.f8567f0;
                FolderViewModel b02 = newFolderFragment.b0();
                NotoColor notoColor = (NotoColor) pair.f12962i;
                b02.getClass();
                v7.g.f(notoColor, "notoColor");
                StateFlowImpl stateFlowImpl = b02.f8437q;
                stateFlowImpl.setValue(FolderViewModel.p((List) stateFlowImpl.getValue(), notoColor));
                return;
        }
    }
}

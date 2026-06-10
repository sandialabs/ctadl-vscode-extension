package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/i0;", "T", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainDialogFragment$special$$inlined$sharedViewModel$default$1 extends Lambda implements u7.a<MainViewModel> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f8840j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDialogFragment$special$$inlined$sharedViewModel$default$1(Fragment fragment) {
        super(0);
        this.f8840j = fragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.noto.app.main.MainViewModel, androidx.lifecycle.i0] */
    @Override // u7.a
    public final MainViewModel k0() {
        return org.koin.androidx.viewmodel.ext.android.a.a(this.f8840j, i.a(MainViewModel.class));
    }
}

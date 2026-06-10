package org.koin.androidx.viewmodel.ext.android;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/i0;", "T", "Lab/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SharedViewModelExtKt$getSharedViewModel$1 extends Lambda implements u7.a<ab.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f16492j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedViewModelExtKt$getSharedViewModel$1(Fragment fragment) {
        super(0);
        this.f16492j = fragment;
    }

    @Override // u7.a
    public final ab.a k0() {
        m0 X = this.f16492j.R().X();
        g.e(X, "storeOwner.viewModelStore");
        return new ab.a(X);
    }
}

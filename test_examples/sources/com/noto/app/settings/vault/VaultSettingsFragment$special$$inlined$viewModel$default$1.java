package com.noto.app.settings.vault;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.n0;
import com.noto.app.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ext.android.ViewModelStoreOwnerExtKt;
import u7.a;
import v7.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/i0;", "T", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultSettingsFragment$special$$inlined$viewModel$default$1 extends Lambda implements a<c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n0 f9768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultSettingsFragment$special$$inlined$viewModel$default$1(n0 n0Var) {
        super(0);
        this.f9768j = n0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.noto.app.settings.c, androidx.lifecycle.i0] */
    @Override // u7.a
    public final c k0() {
        return ViewModelStoreOwnerExtKt.a(this.f9768j, null, i.a(c.class), null);
    }
}

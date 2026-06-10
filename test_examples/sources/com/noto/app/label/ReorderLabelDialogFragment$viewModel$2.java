package com.noto.app.label;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import y6.u;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljb/a;", "invoke", "()Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReorderLabelDialogFragment$viewModel$2 extends Lambda implements u7.a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ReorderLabelDialogFragment f8795j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderLabelDialogFragment$viewModel$2(ReorderLabelDialogFragment reorderLabelDialogFragment) {
        super(0);
        this.f8795j = reorderLabelDialogFragment;
    }

    @Override // u7.a
    public final jb.a k0() {
        ReorderLabelDialogFragment reorderLabelDialogFragment = this.f8795j;
        return a1.b.v0(Long.valueOf(((u) reorderLabelDialogFragment.f8779v0.getValue()).f18933a), Long.valueOf(((u) reorderLabelDialogFragment.f8779v0.getValue()).f18934b));
    }
}

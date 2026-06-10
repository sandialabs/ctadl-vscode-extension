package com.noto.app.label;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import y6.o;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljb/a;", "invoke", "()Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NewLabelDialogFragment$viewModel$2 extends Lambda implements u7.a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewLabelDialogFragment f8776j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLabelDialogFragment$viewModel$2(NewLabelDialogFragment newLabelDialogFragment) {
        super(0);
        this.f8776j = newLabelDialogFragment;
    }

    @Override // u7.a
    public final jb.a k0() {
        int i10 = NewLabelDialogFragment.f8766w0;
        NewLabelDialogFragment newLabelDialogFragment = this.f8776j;
        return a1.b.v0(Long.valueOf(((o) newLabelDialogFragment.f8768v0.getValue()).f18923a), Long.valueOf(((o) newLabelDialogFragment.f8768v0.getValue()).f18924b));
    }
}

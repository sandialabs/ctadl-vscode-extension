package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import x6.l0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljb/a;", "invoke", "()Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListOrderingDialogFragment$viewModel$2 extends Lambda implements u7.a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteListOrderingDialogFragment f8646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListOrderingDialogFragment$viewModel$2(NoteListOrderingDialogFragment noteListOrderingDialogFragment) {
        super(0);
        this.f8646j = noteListOrderingDialogFragment;
    }

    @Override // u7.a
    public final jb.a k0() {
        return a1.b.v0(Long.valueOf(((l0) this.f8646j.f8636v0.getValue()).f18697a));
    }
}

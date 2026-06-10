package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljb/a;", "invoke", "()Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteFragment$viewModel$2 extends Lambda implements u7.a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9108j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$viewModel$2(NoteFragment noteFragment) {
        super(0);
        this.f9108j = noteFragment;
    }

    @Override // u7.a
    public final jb.a k0() {
        int i10 = NoteFragment.f9026f0;
        NoteFragment noteFragment = this.f9108j;
        return a1.b.v0(Long.valueOf(noteFragment.a0().f348a), Long.valueOf(noteFragment.a0().f349b), noteFragment.a0().c, noteFragment.a0().f350d);
    }
}

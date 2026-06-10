package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljb/a;", "invoke", "()Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteReadingModeFragment$viewModel$2 extends Lambda implements u7.a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteReadingModeFragment f9175j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$viewModel$2(NoteReadingModeFragment noteReadingModeFragment) {
        super(0);
        this.f9175j = noteReadingModeFragment;
    }

    @Override // u7.a
    public final jb.a k0() {
        NoteReadingModeFragment noteReadingModeFragment = this.f9175j;
        return a1.b.v0((Long) noteReadingModeFragment.f9157e0.getValue(), (Long) noteReadingModeFragment.f9158f0.getValue());
    }
}

package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "body", "Lm7/n;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteFragment$setupState$34 extends Lambda implements u7.l<String, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$34(NoteFragment noteFragment) {
        super(1);
        this.f9097j = noteFragment;
    }

    @Override // u7.l
    public final m7.n U(String str) {
        String str2 = str;
        int i10 = NoteFragment.f9026f0;
        NoteFragment noteFragment = this.f9097j;
        noteFragment.b0().m();
        NoteViewModel b02 = noteFragment.b0();
        v7.g.e(str2, "body");
        b02.n(str2);
        return m7.n.f16010a;
    }
}

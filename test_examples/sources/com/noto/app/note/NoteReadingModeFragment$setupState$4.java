package com.noto.app.note;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s6.l0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteReadingModeFragment$setupState$4 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteReadingModeFragment f9173j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l0 f9174k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$setupState$4(NoteReadingModeFragment noteReadingModeFragment, l0 l0Var) {
        super(1);
        this.f9173j = noteReadingModeFragment;
        this.f9174k = l0Var;
    }

    @Override // u7.l
    public final m7.n U(Integer num) {
        boolean z10;
        View view;
        Integer num2 = num;
        NoteReadingModeFragment noteReadingModeFragment = this.f9173j;
        if (noteReadingModeFragment.s() && !noteReadingModeFragment.G && (view = noteReadingModeFragment.M) != null && view.getWindowToken() != null && noteReadingModeFragment.M.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f9174k.f17415b.v(0);
        }
        return m7.n.f16010a;
    }
}

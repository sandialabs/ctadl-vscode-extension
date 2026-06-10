package com.noto.app.note;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s6.b0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteFragment$setupListeners$backCallback$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9061j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b0 f9062k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupListeners$backCallback$1(NoteFragment noteFragment, b0 b0Var) {
        super(0);
        this.f9061j = noteFragment;
        this.f9062k = b0Var;
    }

    @Override // u7.a
    public final m7.n k0() {
        NavController g10;
        int i10 = NoteFragment.f9026f0;
        NoteFragment noteFragment = this.f9061j;
        if (noteFragment.a0().c != null && (g10 = ViewUtilsKt.g(noteFragment)) != null) {
            g10.l(R.id.mainFragment, false);
        }
        NavController g11 = ViewUtilsKt.g(noteFragment);
        if (g11 != null) {
            g11.j();
        }
        NoteViewModel b02 = noteFragment.b0();
        b0 b0Var = this.f9062k;
        b02.d(String.valueOf(b0Var.f17298e.getText()), String.valueOf(b0Var.f17297d.getText()), true);
        Context j2 = noteFragment.j();
        if (j2 != null) {
            a1.c.W1(j2);
        }
        Context j10 = noteFragment.j();
        if (j10 != null) {
            a1.c.Y1(j10);
        }
        s c = noteFragment.c();
        if (c != null) {
            CoordinatorLayout coordinatorLayout = b0Var.f17295a;
            v7.g.e(coordinatorLayout, "root");
            ViewUtilsKt.h(c, coordinatorLayout);
            return m7.n.f16010a;
        }
        return null;
    }
}

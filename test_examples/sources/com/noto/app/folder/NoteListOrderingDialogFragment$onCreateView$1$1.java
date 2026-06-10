package com.noto.app.folder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.g0;
import x6.l0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NoteListOrderingDialogFragment$onCreateView$1$1", f = "NoteListOrderingDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListOrderingDialogFragment$onCreateView$1$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8640m;
    public final /* synthetic */ NoteListOrderingDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g0 f8641o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListOrderingDialogFragment$onCreateView$1$1(NoteListOrderingDialogFragment noteListOrderingDialogFragment, g0 g0Var, p7.c<? super NoteListOrderingDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = noteListOrderingDialogFragment;
        this.f8641o = g0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteListOrderingDialogFragment$onCreateView$1$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteListOrderingDialogFragment$onCreateView$1$1 noteListOrderingDialogFragment$onCreateView$1$1 = new NoteListOrderingDialogFragment$onCreateView$1$1(this.n, this.f8641o, cVar);
        noteListOrderingDialogFragment$onCreateView$1$1.f8640m = obj;
        return noteListOrderingDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialRadioButton materialRadioButton;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8640m;
        NoteListOrderingDialogFragment noteListOrderingDialogFragment = this.n;
        Context j2 = noteListOrderingDialogFragment.j();
        g0 g0Var = this.f8641o;
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            g0Var.c.c.setTextColor(b5);
            Drawable background = g0Var.c.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
        }
        if (((l0) noteListOrderingDialogFragment.f8636v0.getValue()).f18698b) {
            int ordinal = aVar.n.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return m7.n.f16010a;
                }
                materialRadioButton = g0Var.f17349b;
            }
            materialRadioButton = g0Var.f17348a;
        } else {
            int ordinal2 = aVar.f17605p.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    return m7.n.f16010a;
                }
                materialRadioButton = g0Var.f17349b;
            }
            materialRadioButton = g0Var.f17348a;
        }
        materialRadioButton.setChecked(true);
        return m7.n.f16010a;
    }
}

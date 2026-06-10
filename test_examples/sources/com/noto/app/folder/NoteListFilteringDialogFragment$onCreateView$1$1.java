package com.noto.app.folder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.e0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NoteListFilteringDialogFragment$onCreateView$1$1", f = "NoteListFilteringDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListFilteringDialogFragment$onCreateView$1$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8610m;
    public final /* synthetic */ NoteListFilteringDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ e0 f8611o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListFilteringDialogFragment$onCreateView$1$1(NoteListFilteringDialogFragment noteListFilteringDialogFragment, e0 e0Var, p7.c<? super NoteListFilteringDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = noteListFilteringDialogFragment;
        this.f8611o = e0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteListFilteringDialogFragment$onCreateView$1$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteListFilteringDialogFragment$onCreateView$1$1 noteListFilteringDialogFragment$onCreateView$1$1 = new NoteListFilteringDialogFragment$onCreateView$1$1(this.n, this.f8611o, cVar);
        noteListFilteringDialogFragment$onCreateView$1$1.f8610m = obj;
        return noteListFilteringDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialRadioButton materialRadioButton;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8610m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            e0 e0Var = this.f8611o;
            e0Var.f17336e.c.setTextColor(b5);
            Drawable background = e0Var.f17336e.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
            int ordinal = aVar.f17608s.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        materialRadioButton = e0Var.f17335d;
                    }
                } else {
                    materialRadioButton = e0Var.f17334b;
                }
            } else {
                materialRadioButton = e0Var.c;
            }
            materialRadioButton.setChecked(true);
        }
        return m7.n.f16010a;
    }
}

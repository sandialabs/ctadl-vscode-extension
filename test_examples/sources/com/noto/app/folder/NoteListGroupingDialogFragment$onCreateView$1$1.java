package com.noto.app.folder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.radiobutton.MaterialRadioButton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.f0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NoteListGroupingDialogFragment$onCreateView$1$1", f = "NoteListGroupingDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListGroupingDialogFragment$onCreateView$1$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8624m;
    public final /* synthetic */ NoteListGroupingDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f0 f8625o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListGroupingDialogFragment$onCreateView$1$1(NoteListGroupingDialogFragment noteListGroupingDialogFragment, f0 f0Var, p7.c<? super NoteListGroupingDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = noteListGroupingDialogFragment;
        this.f8625o = f0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteListGroupingDialogFragment$onCreateView$1$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteListGroupingDialogFragment$onCreateView$1$1 noteListGroupingDialogFragment$onCreateView$1$1 = new NoteListGroupingDialogFragment$onCreateView$1$1(this.n, this.f8625o, cVar);
        noteListGroupingDialogFragment$onCreateView$1$1.f8624m = obj;
        return noteListGroupingDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialRadioButton materialRadioButton;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8624m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            f0 f0Var = this.f8625o;
            f0Var.f17343e.c.setTextColor(b5);
            Drawable background = f0Var.f17343e.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
            int ordinal = aVar.f17604o.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            materialRadioButton = f0Var.f17340a;
                        }
                    } else {
                        materialRadioButton = f0Var.c;
                    }
                } else {
                    materialRadioButton = f0Var.f17341b;
                }
            } else {
                materialRadioButton = f0Var.f17342d;
            }
            materialRadioButton.setChecked(true);
        }
        return m7.n.f16010a;
    }
}

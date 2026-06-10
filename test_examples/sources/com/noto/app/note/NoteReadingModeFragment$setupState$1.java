package com.noto.app.note;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.app.domain.model.NotoColor;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.l0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReadingModeFragment$setupState$1", f = "NoteReadingModeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteReadingModeFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9164m;
    public final /* synthetic */ NoteReadingModeFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ l0 f9165o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$setupState$1(NoteReadingModeFragment noteReadingModeFragment, l0 l0Var, p7.c<? super NoteReadingModeFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = noteReadingModeFragment;
        this.f9165o = l0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteReadingModeFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteReadingModeFragment$setupState$1 noteReadingModeFragment$setupState$1 = new NoteReadingModeFragment$setupState$1(this.n, this.f9165o, cVar);
        noteReadingModeFragment$setupState$1.f9164m = obj;
        return noteReadingModeFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        Drawable verticalScrollbarThumbDrawable;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9164m;
        int i11 = NoteReadingModeFragment.f9155g0;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            if (aVar.f17595e == NotoColor.Black) {
                i10 = 32;
            } else {
                i10 = 128;
            }
            int d5 = q2.a.d(b5, i10);
            l0 l0Var = this.f9165o;
            l0Var.f17417e.setLinkTextColor(b5);
            MaterialTextView materialTextView = l0Var.f17416d;
            materialTextView.setLinkTextColor(b5);
            l0Var.f17417e.setHighlightColor(d5);
            materialTextView.setHighlightColor(d5);
            if (Build.VERSION.SDK_INT >= 29 && (verticalScrollbarThumbDrawable = l0Var.f17415b.getVerticalScrollbarThumbDrawable()) != null && (mutate = verticalScrollbarThumbDrawable.mutate()) != null) {
                mutate.setTint(b5);
            }
        }
        return m7.n.f16010a;
    }
}

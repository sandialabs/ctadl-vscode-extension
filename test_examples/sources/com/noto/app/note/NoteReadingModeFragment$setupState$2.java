package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.app.domain.model.Font;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.l0;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lt6/d;", "note", "Lcom/noto/app/domain/model/Font;", "font", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReadingModeFragment$setupState$2", f = "NoteReadingModeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteReadingModeFragment$setupState$2 extends SuspendLambda implements q<t6.d, Font, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.d f9166m;
    public /* synthetic */ Font n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteReadingModeFragment f9167o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ l0 f9168p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$setupState$2(NoteReadingModeFragment noteReadingModeFragment, l0 l0Var, p7.c<? super NoteReadingModeFragment$setupState$2> cVar) {
        super(3, cVar);
        this.f9167o = noteReadingModeFragment;
        this.f9168p = l0Var;
    }

    @Override // u7.q
    public final Object O(t6.d dVar, Font font, p7.c<? super m7.n> cVar) {
        NoteReadingModeFragment$setupState$2 noteReadingModeFragment$setupState$2 = new NoteReadingModeFragment$setupState$2(this.f9167o, this.f9168p, cVar);
        noteReadingModeFragment$setupState$2.f9166m = dVar;
        noteReadingModeFragment$setupState$2.n = font;
        return noteReadingModeFragment$setupState$2.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        m0.b.n1(obj);
        t6.d dVar = this.f9166m;
        Font font = this.n;
        int i11 = NoteReadingModeFragment.f9155g0;
        this.f9167o.getClass();
        l0 l0Var = this.f9168p;
        l0Var.f17417e.setText(dVar.c);
        MaterialTextView materialTextView = l0Var.f17416d;
        String str = dVar.f17623d;
        materialTextView.setText(str);
        MaterialTextView materialTextView2 = l0Var.f17417e;
        v7.g.e(materialTextView2, "tvNoteTitle");
        int i12 = 8;
        if (!ha.i.T0(dVar.c)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        materialTextView2.setVisibility(i10);
        if (!ha.i.T0(str)) {
            i12 = 0;
        }
        materialTextView.setVisibility(i12);
        ViewUtilsKt.t(materialTextView2, font);
        ViewUtilsKt.r(materialTextView, font);
        return m7.n.f16010a;
    }
}

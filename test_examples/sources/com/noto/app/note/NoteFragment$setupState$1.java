package com.noto.app.note;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$1", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9063m;
    public final /* synthetic */ NoteFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$1(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(2, cVar);
        this.n = noteFragment;
        this.f9064o = b0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$1 noteFragment$setupState$1 = new NoteFragment$setupState$1(this.f9064o, this.n, cVar);
        noteFragment$setupState$1.f9063m = obj;
        return noteFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        Drawable mutate;
        Drawable mutate2;
        Drawable mutate3;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9063m;
        int i11 = NoteFragment.f9026f0;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            if (aVar.f17595e == NotoColor.Black) {
                i10 = 32;
            } else {
                i10 = 128;
            }
            int d5 = q2.a.d(b5, i10);
            b0 b0Var = this.f9064o;
            b0Var.f17307o.setText(ModelUtilsKt.o(j2, aVar));
            b0Var.f17307o.setTextColor(b5);
            Drawable navigationIcon = b0Var.f17305l.getNavigationIcon();
            if (navigationIcon != null && (mutate3 = navigationIcon.mutate()) != null) {
                mutate3.setTint(b5);
            }
            CustomEditText customEditText = b0Var.f17298e;
            customEditText.setLinkTextColor(b5);
            CustomEditText customEditText2 = b0Var.f17297d;
            customEditText2.setLinkTextColor(b5);
            customEditText.setHighlightColor(d5);
            customEditText2.setHighlightColor(d5);
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable textCursorDrawable = customEditText.getTextCursorDrawable();
                if (textCursorDrawable != null && (mutate2 = textCursorDrawable.mutate()) != null) {
                    mutate2.setTint(b5);
                }
                Drawable textCursorDrawable2 = customEditText2.getTextCursorDrawable();
                if (textCursorDrawable2 != null && (mutate = textCursorDrawable2.mutate()) != null) {
                    mutate.setTint(b5);
                }
            }
        }
        return m7.n.f16010a;
    }
}

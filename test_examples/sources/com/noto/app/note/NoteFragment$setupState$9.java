package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Font;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Font;", "font", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$9", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$9 extends SuspendLambda implements u7.p<Font, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9107m;
    public final /* synthetic */ b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$9(b0 b0Var, p7.c<? super NoteFragment$setupState$9> cVar) {
        super(2, cVar);
        this.n = b0Var;
    }

    @Override // u7.p
    public final Object R(Font font, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$9) a(font, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$9 noteFragment$setupState$9 = new NoteFragment$setupState$9(this.n, cVar);
        noteFragment$setupState$9.f9107m = obj;
        return noteFragment$setupState$9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Font font = (Font) this.f9107m;
        b0 b0Var = this.n;
        CustomEditText customEditText = b0Var.f17298e;
        v7.g.e(customEditText, "etNoteTitle");
        ViewUtilsKt.t(customEditText, font);
        CustomEditText customEditText2 = b0Var.f17297d;
        v7.g.e(customEditText2, "etNoteBody");
        ViewUtilsKt.r(customEditText2, font);
        return m7.n.f16010a;
    }
}

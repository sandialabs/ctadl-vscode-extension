package com.noto.app.note;

import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Font;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Font;", "font", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$7", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$7 extends SuspendLambda implements u7.p<Font, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9362m;
    public final /* synthetic */ o0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment$onCreateView$2$7(o0 o0Var, p7.c<? super QuickNoteDialogFragment$onCreateView$2$7> cVar) {
        super(2, cVar);
        this.n = o0Var;
    }

    @Override // u7.p
    public final Object R(Font font, p7.c<? super m7.n> cVar) {
        return ((QuickNoteDialogFragment$onCreateView$2$7) a(font, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        QuickNoteDialogFragment$onCreateView$2$7 quickNoteDialogFragment$onCreateView$2$7 = new QuickNoteDialogFragment$onCreateView$2$7(this.n, cVar);
        quickNoteDialogFragment$onCreateView$2$7.f9362m = obj;
        return quickNoteDialogFragment$onCreateView$2$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Font font = (Font) this.f9362m;
        o0 o0Var = this.n;
        EditText editText = o0Var.c;
        v7.g.e(editText, "etNoteTitle");
        ViewUtilsKt.t(editText, font);
        EditText editText2 = o0Var.f17445b;
        v7.g.e(editText2, "etNoteBody");
        ViewUtilsKt.r(editText2, font);
        return m7.n.f16010a;
    }
}

package com.noto.app.note;

import android.content.Context;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$1", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9348m;
    public final /* synthetic */ QuickNoteDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ o0 f9349o;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ o0 f9350i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ QuickNoteDialogFragment f9351j;

        public a(o0 o0Var, QuickNoteDialogFragment quickNoteDialogFragment) {
            this.f9350i = o0Var;
            this.f9351j = quickNoteDialogFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0 o0Var = this.f9350i;
            o0Var.f17445b.requestFocus();
            s c = this.f9351j.c();
            if (c != null) {
                EditText editText = o0Var.f17445b;
                v7.g.e(editText, "etNoteBody");
                ViewUtilsKt.v(c, editText);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ o0 f9352i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ QuickNoteDialogFragment f9353j;

        public b(o0 o0Var, QuickNoteDialogFragment quickNoteDialogFragment) {
            this.f9352i = o0Var;
            this.f9353j = quickNoteDialogFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0 o0Var = this.f9352i;
            o0Var.c.requestFocus();
            s c = this.f9353j.c();
            if (c != null) {
                EditText editText = o0Var.c;
                v7.g.e(editText, "etNoteTitle");
                ViewUtilsKt.v(c, editText);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment$onCreateView$2$1(o0 o0Var, QuickNoteDialogFragment quickNoteDialogFragment, p7.c cVar) {
        super(2, cVar);
        this.n = quickNoteDialogFragment;
        this.f9349o = o0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((QuickNoteDialogFragment$onCreateView$2$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        QuickNoteDialogFragment$onCreateView$2$1 quickNoteDialogFragment$onCreateView$2$1 = new QuickNoteDialogFragment$onCreateView$2$1(this.f9349o, this.n, cVar);
        quickNoteDialogFragment$onCreateView$2$1.f9348m = obj;
        return quickNoteDialogFragment$onCreateView$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        EditText editText;
        Runnable aVar;
        m0.b.n1(obj);
        t6.a aVar2 = (t6.a) this.f9348m;
        QuickNoteDialogFragment quickNoteDialogFragment = this.n;
        Context j2 = quickNoteDialogFragment.j();
        o0 o0Var = this.f9349o;
        if (j2 != null) {
            o0Var.f17447e.setTextColor(q.b(j2, q.j(aVar2.f17595e)));
            o0Var.f17447e.setText(ModelUtilsKt.o(j2, aVar2));
        }
        int ordinal = aVar2.f17602l.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                editText = o0Var.c;
                aVar = new b(o0Var, quickNoteDialogFragment);
            } else {
                return m7.n.f16010a;
            }
        } else {
            editText = o0Var.f17445b;
            aVar = new a(o0Var, quickNoteDialogFragment);
        }
        editText.post(aVar);
        return m7.n.f16010a;
    }
}

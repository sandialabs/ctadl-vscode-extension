package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$3", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$3 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9090m;
    public final /* synthetic */ NoteFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9091o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$3(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(2, cVar);
        this.n = noteFragment;
        this.f9091o = b0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$3) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$3 noteFragment$setupState$3 = new NoteFragment$setupState$3(this.f9091o, this.n, cVar);
        noteFragment$setupState$3.f9090m = obj;
        return noteFragment$setupState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CustomEditText customEditText;
        Runnable runnable;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9090m;
        int i10 = NoteFragment.f9026f0;
        final NoteFragment noteFragment = this.n;
        if (noteFragment.a0().f349b == 0) {
            int ordinal = aVar.f17602l.ordinal();
            final b0 b0Var = this.f9091o;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    customEditText = b0Var.f17298e;
                    runnable = new Runnable() { // from class: a7.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            s6.b0 b0Var2 = s6.b0.this;
                            b0Var2.f17298e.requestFocus();
                            androidx.fragment.app.s c = noteFragment.c();
                            if (c != null) {
                                CustomEditText customEditText2 = b0Var2.f17298e;
                                v7.g.e(customEditText2, "etNoteTitle");
                                ViewUtilsKt.v(c, customEditText2);
                            }
                        }
                    };
                }
            } else {
                customEditText = b0Var.f17297d;
                runnable = new Runnable() { // from class: a7.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s6.b0 b0Var2 = s6.b0.this;
                        b0Var2.f17297d.requestFocus();
                        androidx.fragment.app.s c = noteFragment.c();
                        if (c != null) {
                            CustomEditText customEditText2 = b0Var2.f17297d;
                            v7.g.e(customEditText2, "etNoteBody");
                            ViewUtilsKt.v(c, customEditText2);
                        }
                    }
                };
            }
            customEditText.post(runnable);
        }
        return m7.n.f16010a;
    }
}

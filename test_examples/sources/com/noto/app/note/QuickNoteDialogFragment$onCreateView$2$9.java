package com.noto.app.note;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "body", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$9", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$9 extends SuspendLambda implements u7.p<String, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9363m;
    public final /* synthetic */ o0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ QuickNoteDialogFragment f9364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment$onCreateView$2$9(o0 o0Var, QuickNoteDialogFragment quickNoteDialogFragment, p7.c<? super QuickNoteDialogFragment$onCreateView$2$9> cVar) {
        super(2, cVar);
        this.n = o0Var;
        this.f9364o = quickNoteDialogFragment;
    }

    @Override // u7.p
    public final Object R(String str, p7.c<? super m7.n> cVar) {
        return ((QuickNoteDialogFragment$onCreateView$2$9) a(str, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        QuickNoteDialogFragment$onCreateView$2$9 quickNoteDialogFragment$onCreateView$2$9 = new QuickNoteDialogFragment$onCreateView$2$9(this.n, this.f9364o, cVar);
        quickNoteDialogFragment$onCreateView$2$9.f9363m = obj;
        return quickNoteDialogFragment$onCreateView$2$9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        m0.b.n1(obj);
        String str2 = (String) this.f9363m;
        o0 o0Var = this.n;
        TickerView tickerView = o0Var.f17448f;
        QuickNoteDialogFragment quickNoteDialogFragment = this.f9364o;
        Context j2 = quickNoteDialogFragment.j();
        String str3 = null;
        if (j2 != null) {
            str = q.e(j2, R.plurals.words_count, ModelUtilsKt.p(str2), new Integer(ModelUtilsKt.p(str2)));
        } else {
            str = null;
        }
        tickerView.setText(str);
        Context j10 = quickNoteDialogFragment.j();
        if (j10 != null) {
            str3 = q.e(j10, R.plurals.words_count, ModelUtilsKt.p(str2), new Integer(ModelUtilsKt.p(str2)));
        }
        o0Var.f17449g.setText(str3);
        return m7.n.f16010a;
    }
}

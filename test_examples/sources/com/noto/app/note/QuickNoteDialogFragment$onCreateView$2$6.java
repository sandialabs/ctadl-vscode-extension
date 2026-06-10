package com.noto.app.note;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$6", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$6 extends SuspendLambda implements u7.p<Pair<? extends String, ? extends String>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9361m;
    public final /* synthetic */ QuickNoteDialogFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment$onCreateView$2$6(QuickNoteDialogFragment quickNoteDialogFragment, p7.c<? super QuickNoteDialogFragment$onCreateView$2$6> cVar) {
        super(2, cVar);
        this.n = quickNoteDialogFragment;
    }

    @Override // u7.p
    public final Object R(Pair<? extends String, ? extends String> pair, p7.c<? super m7.n> cVar) {
        return ((QuickNoteDialogFragment$onCreateView$2$6) a(pair, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        QuickNoteDialogFragment$onCreateView$2$6 quickNoteDialogFragment$onCreateView$2$6 = new QuickNoteDialogFragment$onCreateView$2$6(this.n, cVar);
        quickNoteDialogFragment$onCreateView$2$6.f9361m = obj;
        return quickNoteDialogFragment$onCreateView$2$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Pair pair = (Pair) this.f9361m;
        int i10 = QuickNoteDialogFragment.f9328y0;
        QuickNoteDialogFragment quickNoteDialogFragment = this.n;
        quickNoteDialogFragment.g0().d((String) pair.f12962i, (String) pair.f12963j, false);
        Context j2 = quickNoteDialogFragment.j();
        if (j2 != null) {
            a1.c.W1(j2);
        }
        Context j10 = quickNoteDialogFragment.j();
        if (j10 != null) {
            a1.c.Y1(j10);
        }
        return m7.n.f16010a;
    }
}

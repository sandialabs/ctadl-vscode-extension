package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import u7.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "title", "body", "Lkotlin/Pair;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$5", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$5 extends SuspendLambda implements q<String, String, p7.c<? super Pair<? extends String, ? extends String>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ String f9360m;
    public /* synthetic */ String n;

    public QuickNoteDialogFragment$onCreateView$2$5(p7.c<? super QuickNoteDialogFragment$onCreateView$2$5> cVar) {
        super(3, cVar);
    }

    @Override // u7.q
    public final Object O(String str, String str2, p7.c<? super Pair<? extends String, ? extends String>> cVar) {
        QuickNoteDialogFragment$onCreateView$2$5 quickNoteDialogFragment$onCreateView$2$5 = new QuickNoteDialogFragment$onCreateView$2$5(cVar);
        quickNoteDialogFragment$onCreateView$2$5.f9360m = str;
        quickNoteDialogFragment$onCreateView$2$5.n = str2;
        return quickNoteDialogFragment$onCreateView$2$5.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        return new Pair(this.f9360m, this.n);
    }
}

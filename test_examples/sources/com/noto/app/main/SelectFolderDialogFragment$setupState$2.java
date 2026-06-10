package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import s6.r;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isScrolling", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.SelectFolderDialogFragment$setupState$2", f = "SelectFolderDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectFolderDialogFragment$setupState$2 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8975m;
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderDialogFragment$setupState$2(r rVar, p7.c<? super SelectFolderDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = rVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((SelectFolderDialogFragment$setupState$2) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SelectFolderDialogFragment$setupState$2 selectFolderDialogFragment$setupState$2 = new SelectFolderDialogFragment$setupState$2(this.n, cVar);
        selectFolderDialogFragment$setupState$2.f8975m = ((Boolean) obj).booleanValue();
        return selectFolderDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        this.n.f17462b.f17311b.setSelected(this.f8975m);
        return n.f16010a;
    }
}

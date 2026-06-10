package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$9", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$9 extends SuspendLambda implements u7.p<String, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8423m;
    public final /* synthetic */ FolderFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$9(FolderFragment folderFragment, p7.c<? super FolderFragment$setupState$9> cVar) {
        super(2, cVar);
        this.n = folderFragment;
    }

    @Override // u7.p
    public final Object R(String str, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$9) a(str, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$9 folderFragment$setupState$9 = new FolderFragment$setupState$9(this.n, cVar);
        folderFragment$setupState$9.f8423m = obj;
        return folderFragment$setupState$9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        String str = (String) this.f8423m;
        int i10 = FolderFragment.f8358k0;
        FolderViewModel a02 = this.n.a0();
        a02.getClass();
        v7.g.f(str, "searchTerm");
        a02.f8439s.setValue(str);
        return m7.n.f16010a;
    }
}

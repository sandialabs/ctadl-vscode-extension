package com.noto.app.folder;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderArchiveFragment$setupState$2", f = "FolderArchiveFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderArchiveFragment$setupState$2 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8322m;
    public final /* synthetic */ FolderArchiveFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s6.g f8323o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderArchiveFragment$setupState$2(s6.g gVar, FolderArchiveFragment folderArchiveFragment, p7.c cVar) {
        super(2, cVar);
        this.n = folderArchiveFragment;
        this.f8323o = gVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((FolderArchiveFragment$setupState$2) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderArchiveFragment$setupState$2 folderArchiveFragment$setupState$2 = new FolderArchiveFragment$setupState$2(this.f8323o, this.n, cVar);
        folderArchiveFragment$setupState$2.f8322m = obj;
        return folderArchiveFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8322m;
        int i10 = FolderArchiveFragment.f8310g0;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            s6.g gVar = this.f8323o;
            gVar.f17347e.setText(f7.q.f(j2, R.string.folder_archive, ModelUtilsKt.o(j2, aVar)));
            gVar.f17347e.setTextColor(b5);
            gVar.f17345b.setNavigationIconTint(b5);
        }
        return m7.n.f16010a;
    }
}

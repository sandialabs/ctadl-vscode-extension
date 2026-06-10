package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.noto.app.domain.model.Layout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderArchiveFragment$setupState$4", f = "FolderArchiveFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderArchiveFragment$setupState$4 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8325m;
    public final /* synthetic */ FolderArchiveFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderArchiveFragment$setupState$4(FolderArchiveFragment folderArchiveFragment, p7.c<? super FolderArchiveFragment$setupState$4> cVar) {
        super(2, cVar);
        this.n = folderArchiveFragment;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((FolderArchiveFragment$setupState$4) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderArchiveFragment$setupState$4 folderArchiveFragment$setupState$4 = new FolderArchiveFragment$setupState$4(this.n, cVar);
        folderArchiveFragment$setupState$4.f8325m = obj;
        return folderArchiveFragment$setupState$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Layout layout = ((t6.a) this.f8325m).f17597g;
        int i10 = FolderArchiveFragment.f8310g0;
        FolderArchiveFragment folderArchiveFragment = this.n;
        folderArchiveFragment.getClass();
        int ordinal = layout.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = folderArchiveFragment.f8313f0;
                if (staggeredGridLayoutManager != null) {
                    staggeredGridLayoutManager.k1(2);
                } else {
                    v7.g.l("layoutManager");
                    throw null;
                }
            }
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = folderArchiveFragment.f8313f0;
            if (staggeredGridLayoutManager2 != null) {
                staggeredGridLayoutManager2.k1(1);
            } else {
                v7.g.l("layoutManager");
                throw null;
            }
        }
        return m7.n.f16010a;
    }
}

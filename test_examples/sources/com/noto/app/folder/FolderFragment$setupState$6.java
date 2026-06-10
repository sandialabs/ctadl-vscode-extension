package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.app.domain.model.Layout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$6", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$6 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8419m;
    public final /* synthetic */ FolderFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s6.i f8420o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$6(s6.i iVar, FolderFragment folderFragment, p7.c cVar) {
        super(2, cVar);
        this.n = folderFragment;
        this.f8420o = iVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$6) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$6 folderFragment$setupState$6 = new FolderFragment$setupState$6(this.f8420o, this.n, cVar);
        folderFragment$setupState$6.f8419m = obj;
        return folderFragment$setupState$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Layout layout = ((t6.a) this.f8419m).f17597g;
        int i10 = FolderFragment.f8358k0;
        FolderFragment folderFragment = this.n;
        folderFragment.getClass();
        int ordinal = layout.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = folderFragment.f8363h0;
                if (staggeredGridLayoutManager != null) {
                    staggeredGridLayoutManager.k1(2);
                } else {
                    v7.g.l("layoutManager");
                    throw null;
                }
            }
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = folderFragment.f8363h0;
            if (staggeredGridLayoutManager2 != null) {
                staggeredGridLayoutManager2.k1(1);
            } else {
                v7.g.l("layoutManager");
                throw null;
            }
        }
        EpoxyRecyclerView epoxyRecyclerView = this.f8420o.f17374g;
        v7.g.e(epoxyRecyclerView, "rv");
        epoxyRecyclerView.setAdapter(epoxyRecyclerView.getAdapter());
        return m7.n.f16010a;
    }
}

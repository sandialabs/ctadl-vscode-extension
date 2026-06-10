package com.noto.app.folder;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm7/n;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$10", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$10 extends SuspendLambda implements u7.p<m7.n, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$10(FolderFragment folderFragment, p7.c<? super FolderFragment$setupState$10> cVar) {
        super(2, cVar);
        this.f8401m = folderFragment;
    }

    @Override // u7.p
    public final Object R(m7.n nVar, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$10) a(nVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderFragment$setupState$10(this.f8401m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        Integer valueOf;
        int i10;
        int size;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        m0.b.n1(obj);
        FolderFragment folderFragment = this.f8401m;
        StaggeredGridLayoutManager staggeredGridLayoutManager = folderFragment.f8363h0;
        if (staggeredGridLayoutManager != null) {
            int i12 = staggeredGridLayoutManager.f5754q;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i13 >= staggeredGridLayoutManager.f5754q) {
                    break;
                }
                StaggeredGridLayoutManager.f fVar = staggeredGridLayoutManager.f5755r[i13];
                boolean z14 = StaggeredGridLayoutManager.this.f5761x;
                ArrayList<View> arrayList = fVar.f5787a;
                if (z14) {
                    i11 = arrayList.size() - 1;
                    z11 = true;
                    z12 = true;
                    z13 = false;
                    size = -1;
                } else {
                    size = arrayList.size();
                    z11 = true;
                    z12 = true;
                    z13 = false;
                    i11 = 0;
                }
                iArr[i13] = fVar.g(i11, size, z11, z12, z13);
                i13++;
            }
            if (i12 != 0) {
                z10 = false;
            }
            if (z10) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(iArr[0]);
            }
            if (valueOf != null) {
                i10 = valueOf.intValue();
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                FolderViewModel a02 = folderFragment.a0();
                a02.getClass();
                m0.b.M0(a1.b.d0(a02), null, null, new FolderViewModel$updateFolderScrollingPosition$1(a02, i10, null), 3);
            }
            return m7.n.f16010a;
        }
        v7.g.l("layoutManager");
        throw null;
    }
}

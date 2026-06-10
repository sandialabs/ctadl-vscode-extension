package o4;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.noto.app.folder.FolderFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16322i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f16323j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f16324k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f16325l;

    public /* synthetic */ o(FolderFragment folderFragment, boolean z10, t6.a aVar) {
        this.f16322i = 1;
        this.f16324k = folderFragment;
        this.f16323j = z10;
        this.f16325l = aVar;
    }

    public /* synthetic */ o(p pVar, w4.l lVar) {
        this.f16322i = 0;
        this.f16324k = pVar;
        this.f16325l = lVar;
        this.f16323j = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16322i;
        boolean z10 = this.f16323j;
        Object obj = this.f16325l;
        Object obj2 = this.f16324k;
        switch (i10) {
            case 0:
                ((p) obj2).e((w4.l) obj, z10);
                return;
            default:
                FolderFragment folderFragment = (FolderFragment) obj2;
                t6.a aVar = (t6.a) obj;
                int i11 = FolderFragment.f8358k0;
                v7.g.f(folderFragment, "this$0");
                v7.g.f(aVar, "$folder");
                if (!((Boolean) a1.b.m(folderFragment.a0().f8441u).getValue()).booleanValue() && z10) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = folderFragment.f8363h0;
                    if (staggeredGridLayoutManager != null) {
                        staggeredGridLayoutManager.w0(aVar.f17607r);
                        return;
                    } else {
                        v7.g.l("layoutManager");
                        throw null;
                    }
                }
                return;
        }
    }
}

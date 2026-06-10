package x6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderArchiveFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f18655i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderArchiveFragment f18656j;

    public b(List list, FolderArchiveFragment folderArchiveFragment) {
        this.f18655i = list;
        this.f18656j = folderArchiveFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<t6.c> list = this.f18655i;
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        for (t6.c cVar : list) {
            arrayList.add(Long.valueOf(cVar.f17615a));
        }
        FolderArchiveFragment folderArchiveFragment = this.f18656j;
        NavController g10 = ViewUtilsKt.g(folderArchiveFragment);
        if (g10 != null) {
            ViewUtilsKt.o(g10, v8.b.g(((c) folderArchiveFragment.f8312e0.getValue()).f18659a, 0L, kotlin.collections.c.M2(arrayList), new long[0], 118), null);
        }
    }
}

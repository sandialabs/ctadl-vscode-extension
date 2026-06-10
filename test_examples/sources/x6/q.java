package x6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f18709i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f18710j;

    public q(List list, FolderFragment folderFragment) {
        this.f18709i = list;
        this.f18710j = folderFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<t6.c> list = this.f18709i;
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        for (t6.c cVar : list) {
            arrayList.add(Long.valueOf(cVar.f17615a));
        }
        FolderFragment folderFragment = this.f18710j;
        NavController g10 = ViewUtilsKt.g(folderFragment);
        if (g10 != null) {
            int i10 = FolderFragment.f8358k0;
            ViewUtilsKt.o(g10, ma.i.n(folderFragment.Z().f18713a, 0L, kotlin.collections.c.M2(arrayList), new long[0], 118), null);
        }
    }
}

package x6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class p implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f18707i;

    public p(FolderFragment folderFragment) {
        this.f18707i = folderFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EmptyList emptyList = EmptyList.f12981i;
        FolderFragment folderFragment = this.f18707i;
        NavController g10 = ViewUtilsKt.g(folderFragment);
        if (g10 != null) {
            int i10 = FolderFragment.f8358k0;
            ViewUtilsKt.o(g10, ma.i.n(folderFragment.Z().f18713a, 0L, kotlin.collections.c.M2(emptyList), new long[0], 118), null);
        }
    }
}

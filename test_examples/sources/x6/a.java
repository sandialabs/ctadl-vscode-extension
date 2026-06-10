package x6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderArchiveFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FolderArchiveFragment f18652i;

    public a(FolderArchiveFragment folderArchiveFragment) {
        this.f18652i = folderArchiveFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EmptyList emptyList = EmptyList.f12981i;
        FolderArchiveFragment folderArchiveFragment = this.f18652i;
        NavController g10 = ViewUtilsKt.g(folderArchiveFragment);
        if (g10 != null) {
            ViewUtilsKt.o(g10, v8.b.g(((c) folderArchiveFragment.f8312e0.getValue()).f18659a, 0L, kotlin.collections.c.M2(emptyList), new long[0], 118), null);
        }
    }
}

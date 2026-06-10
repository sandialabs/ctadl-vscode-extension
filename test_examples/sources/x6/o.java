package x6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderFragment;
import com.noto.app.folder.NewFolderFragment;
import com.noto.app.util.ViewUtilsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18704i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18705j;

    public /* synthetic */ o(int i10, Object obj) {
        this.f18704i = i10;
        this.f18705j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f18704i;
        Object obj = this.f18705j;
        switch (i10) {
            case 0:
                FolderFragment folderFragment = (FolderFragment) obj;
                v7.g.f(folderFragment, "this$0");
                NavController g10 = ViewUtilsKt.g(folderFragment);
                if (g10 != null) {
                    int i11 = FolderFragment.f8358k0;
                    ViewUtilsKt.o(g10, new w(folderFragment.Z().f18713a, 0L), null);
                    return;
                }
                return;
            case 1:
                FolderFragment folderFragment2 = (FolderFragment) obj;
                int i12 = FolderFragment.f8358k0;
                v7.g.f(folderFragment2, "this$0");
                NavController g11 = ViewUtilsKt.g(folderFragment2);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new v(false), null);
                    return;
                }
                return;
            default:
                s6.y yVar = (s6.y) obj;
                int i13 = NewFolderFragment.f8567f0;
                v7.g.f(yVar, "$this_setupListeners");
                yVar.f17487d.v(0);
                return;
        }
    }
}

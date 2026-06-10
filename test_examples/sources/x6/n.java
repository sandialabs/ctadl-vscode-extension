package x6;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.folder.FolderArchiveFragment;
import com.noto.app.folder.FolderFragment;
import com.noto.app.folder.NewFolderFragment;
import com.noto.app.util.ViewUtilsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18701i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18702j;

    public /* synthetic */ n(int i10, Object obj) {
        this.f18701i = i10;
        this.f18702j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f18701i;
        Object obj = this.f18702j;
        switch (i10) {
            case 0:
                FolderFragment folderFragment = (FolderFragment) obj;
                v7.g.f(folderFragment, "this$0");
                int i11 = FolderFragment.f8358k0;
                folderFragment.a0().e();
                return;
            case 1:
                s6.g gVar = (s6.g) obj;
                int i12 = FolderArchiveFragment.f8310g0;
                v7.g.f(gVar, "$this_setupListeners");
                gVar.f17344a.j0(0);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                s6.i iVar = (s6.i) obj;
                int i13 = FolderFragment.f8358k0;
                v7.g.f(iVar, "$this_setupListeners");
                iVar.f17374g.j0(0);
                return;
            default:
                NewFolderFragment newFolderFragment = (NewFolderFragment) obj;
                int i14 = NewFolderFragment.f8567f0;
                v7.g.f(newFolderFragment, "this$0");
                NavController g10 = ViewUtilsKt.g(newFolderFragment);
                if (g10 != null) {
                    g10.j();
                    return;
                }
                return;
        }
    }
}

package a7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.note.NoteSelectionDialogFragment;

/* loaded from: classes.dex */
public final class o0 extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.y f328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s6.n0 f329b;
    public final /* synthetic */ NoteSelectionDialogFragment c;

    public o0(androidx.recyclerview.widget.y yVar, s6.n0 n0Var, NoteSelectionDialogFragment noteSelectionDialogFragment) {
        this.f328a = yVar;
        this.f329b = n0Var;
        this.c = noteSelectionDialogFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        int i12;
        v7.g.f(recyclerView, "recyclerView");
        s6.n0 n0Var = this.f329b;
        View c = this.f328a.c(n0Var.f17431b.getLayoutManager());
        NoteSelectionDialogFragment noteSelectionDialogFragment = this.c;
        if (c != null) {
            n0Var.f17431b.getClass();
            RecyclerView.b0 L = RecyclerView.L(c);
            if (L != null) {
                i12 = L.c();
            } else {
                i12 = -1;
            }
            int i13 = NoteSelectionDialogFragment.B0;
            noteSelectionDialogFragment.m0().f8446z = i12;
        }
        int i14 = NoteSelectionDialogFragment.B0;
        FolderViewModel m02 = noteSelectionDialogFragment.m0();
        if (i10 <= 0 && i10 >= 0) {
            z10 = false;
            m02.A = z10;
        }
        z10 = true;
        m02.A = z10;
    }
}

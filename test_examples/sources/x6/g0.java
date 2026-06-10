package x6;

import android.view.View;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.noto.app.folder.NoteItem;
import com.noto.app.note.NotePagerFragment;
import com.noto.app.note.NotePagerViewModel;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements View.OnLongClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18680i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18681j;

    public /* synthetic */ g0(int i10, Object obj) {
        this.f18680i = i10;
        this.f18681j = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f18680i;
        Object obj = this.f18681j;
        switch (i10) {
            case 0:
                NoteItem noteItem = (NoteItem) obj;
                v7.g.f(noteItem, "this$0");
                View.OnClickListener onClickListener = noteItem.f8599y;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return true;
            default:
                NotePagerFragment notePagerFragment = (NotePagerFragment) obj;
                int i11 = NotePagerFragment.f9109i0;
                v7.g.f(notePagerFragment, "this$0");
                FragmentStateAdapter fragmentStateAdapter = notePagerFragment.f9114h0;
                if (fragmentStateAdapter != null) {
                    fragmentStateAdapter.u(a1.c.B0((List) notePagerFragment.a0().f9141i.getValue()));
                }
                NotePagerViewModel a02 = notePagerFragment.a0();
                a02.n.setValue(kotlin.collections.c.v2((List) a02.f9141i.getValue()));
                return true;
        }
    }
}

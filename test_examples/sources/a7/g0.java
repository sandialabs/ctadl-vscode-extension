package a7;

import androidx.viewpager2.widget.ViewPager2;
import com.noto.app.note.NotePagerFragment;
import com.noto.app.note.NotePagerViewModel;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotePagerFragment f292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s6.k0 f293b;

    public g0(s6.k0 k0Var, NotePagerFragment notePagerFragment) {
        this.f292a = notePagerFragment;
        this.f293b = k0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        int i11 = NotePagerFragment.f9109i0;
        NotePagerViewModel a02 = this.f292a.a0();
        a02.n.setValue(((List) a02.f9141i.getValue()).get(i10));
        this.f293b.f17407b.E();
    }
}

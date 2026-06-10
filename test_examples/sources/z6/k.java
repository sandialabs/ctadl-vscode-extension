package z6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.main.MainArchiveFragment;
import com.noto.app.main.MainFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnLongClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f19150i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ o6.b f19151j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Pair f19152k;

    public /* synthetic */ k(o6.b bVar, Pair pair, int i10) {
        this.f19150i = i10;
        this.f19151j = bVar;
        this.f19152k = pair;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f19150i;
        Pair pair = this.f19152k;
        o6.b bVar = this.f19151j;
        switch (i10) {
            case 0:
                MainFragment mainFragment = (MainFragment) bVar;
                v7.g.f(mainFragment, "this$0");
                mainFragment.Z();
                NavController g10 = ViewUtilsKt.g(mainFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new o(((t6.a) pair.f12962i).f17592a), null);
                }
                return true;
            case 1:
                MainFragment mainFragment2 = (MainFragment) bVar;
                v7.g.f(mainFragment2, "this$0");
                v7.g.f(pair, "$entry");
                mainFragment2.Z();
                NavController g11 = ViewUtilsKt.g(mainFragment2);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new o(((t6.a) pair.f12962i).f17592a), null);
                }
                return true;
            default:
                MainArchiveFragment mainArchiveFragment = (MainArchiveFragment) bVar;
                v7.g.f(mainArchiveFragment, "this$0");
                v7.g.f(pair, "$entry");
                mainArchiveFragment.Z();
                NavController g12 = ViewUtilsKt.g(mainArchiveFragment);
                if (g12 != null) {
                    ViewUtilsKt.o(g12, new h(((t6.a) pair.f12962i).f17592a), null);
                }
                return true;
        }
    }
}

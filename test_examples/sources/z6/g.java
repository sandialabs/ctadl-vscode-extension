package z6;

import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.main.MainArchiveFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f19144i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f19145j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f19146k;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f19144i = i10;
        this.f19145j = obj;
        this.f19146k = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f19144i;
        Object obj = this.f19146k;
        Object obj2 = this.f19145j;
        switch (i10) {
            case 0:
                MainArchiveFragment mainArchiveFragment = (MainArchiveFragment) obj2;
                Pair pair = (Pair) obj;
                v7.g.f(mainArchiveFragment, "this$0");
                v7.g.f(pair, "$entry");
                mainArchiveFragment.Z();
                t6.a aVar = (t6.a) pair.f12962i;
                long j2 = aVar.f17592a;
                Long l2 = (Long) mainArchiveFragment.f8825v0.getValue();
                if (l2 != null && j2 == l2.longValue()) {
                    return;
                }
                NavController g10 = ViewUtilsKt.g(mainArchiveFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new i(aVar.f17592a), null);
                    return;
                }
                return;
            default:
                u7.p pVar = (u7.p) obj2;
                Context context = (Context) obj;
                v7.g.f(pVar, "$callback");
                v7.g.f(context, "$context");
                pVar.R(0L, f7.q.f(context, R.string.none, new Object[0]));
                return;
        }
    }
}

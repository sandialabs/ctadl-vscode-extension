package z6;

import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.filtered.FilteredItemModel;
import com.noto.app.main.MainVaultFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f19170i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f19171j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f19172k;

    public /* synthetic */ y(Object obj, int i10, Object obj2) {
        this.f19170i = i10;
        this.f19171j = obj;
        this.f19172k = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f19170i;
        Object obj = this.f19172k;
        Object obj2 = this.f19171j;
        switch (i10) {
            case 0:
                u7.p pVar = (u7.p) obj2;
                Context context = (Context) obj;
                v7.g.f(pVar, "$callback");
                v7.g.f(context, "$context");
                List<Long> list = FilteredItemModel.f8281k;
                pVar.R(-2L, f7.q.f(context, R.string.all, new Object[0]));
                return;
            case 1:
                u7.p pVar2 = (u7.p) obj2;
                Context context2 = (Context) obj;
                v7.g.f(pVar2, "$callback");
                v7.g.f(context2, "$context");
                List<Long> list2 = FilteredItemModel.f8281k;
                pVar2.R(-5L, f7.q.f(context2, R.string.scheduled, new Object[0]));
                return;
            default:
                MainVaultFragment mainVaultFragment = (MainVaultFragment) obj2;
                Pair pair = (Pair) obj;
                v7.g.f(mainVaultFragment, "this$0");
                v7.g.f(pair, "$entry");
                mainVaultFragment.Z();
                t6.a aVar = (t6.a) pair.f12962i;
                long j2 = aVar.f17592a;
                Long l2 = (Long) mainVaultFragment.f8892v0.getValue();
                if (l2 != null && j2 == l2.longValue()) {
                    return;
                }
                NavController g10 = ViewUtilsKt.g(mainVaultFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new u(aVar.f17592a), null);
                    return;
                }
                return;
        }
    }
}

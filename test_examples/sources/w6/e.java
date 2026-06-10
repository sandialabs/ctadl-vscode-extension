package w6;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Pair;
import x6.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnLongClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18439i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f18440j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long[] f18441k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f18442l;

    public /* synthetic */ e(FilteredFragment filteredFragment, Object obj, long[] jArr, int i10) {
        this.f18439i = i10;
        this.f18440j = filteredFragment;
        this.f18442l = obj;
        this.f18441k = jArr;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f18439i;
        long[] jArr = this.f18441k;
        FilteredFragment filteredFragment = this.f18440j;
        Object obj = this.f18442l;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                v7.g.f(filteredFragment, "this$0");
                v7.g.f(pair, "$pair");
                v7.g.f(jArr, "$noteIds");
                NavController g10 = ViewUtilsKt.g(filteredFragment);
                if (g10 != null) {
                    t6.d dVar = ((h0) pair.f12963j).f18683a;
                    ViewUtilsKt.o(g10, ma.i.k(dVar.f17622b, dVar.f17621a, jArr), null);
                }
                return true;
            default:
                h0 h0Var = (h0) obj;
                v7.g.f(filteredFragment, "this$0");
                v7.g.f(h0Var, "$model");
                v7.g.f(jArr, "$noteIds");
                NavController g11 = ViewUtilsKt.g(filteredFragment);
                if (g11 != null) {
                    t6.d dVar2 = h0Var.f18683a;
                    ViewUtilsKt.o(g11, ma.i.k(dVar2.f17622b, dVar2.f17621a, jArr), null);
                }
                return true;
        }
    }
}

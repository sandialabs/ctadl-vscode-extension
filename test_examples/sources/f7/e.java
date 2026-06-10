package f7;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e extends RecyclerView.h {
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final EdgeEffect a(int i10, RecyclerView recyclerView) {
        v7.g.f(recyclerView, "recyclerView");
        return new d(i10, recyclerView, recyclerView.getContext());
    }
}

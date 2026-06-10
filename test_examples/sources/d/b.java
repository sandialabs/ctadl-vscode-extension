package d;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class b implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f10207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f10208b;

    public b(View view, View view2) {
        this.f10207a = view;
        this.f10208b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        AlertController.b(absListView, this.f10207a, this.f10208b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}

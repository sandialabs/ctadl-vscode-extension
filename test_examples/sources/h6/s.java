package h6;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.p0;

/* loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t f11518i;

    public s(t tVar) {
        this.f11518i = tVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
        Object item;
        View view2 = null;
        t tVar = this.f11518i;
        if (i10 < 0) {
            p0 p0Var = tVar.f11519m;
            if (!p0Var.c()) {
                item = null;
            } else {
                item = p0Var.f1067k.getSelectedItem();
            }
        } else {
            item = tVar.getAdapter().getItem(i10);
        }
        t.a(tVar, item);
        AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
        p0 p0Var2 = tVar.f11519m;
        if (onItemClickListener != null) {
            if (view != null) {
                if (i10 < 0) {
                }
                onItemClickListener.onItemClick(p0Var2.f1067k, view, i10, j2);
            }
            if (p0Var2.c()) {
                view2 = p0Var2.f1067k.getSelectedView();
            }
            view = view2;
            if (!p0Var2.c()) {
                i10 = -1;
            } else {
                i10 = p0Var2.f1067k.getSelectedItemPosition();
            }
            if (!p0Var2.c()) {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = p0Var2.f1067k.getSelectedItemId();
            }
            onItemClickListener.onItemClick(p0Var2.f1067k, view, i10, j2);
        }
        p0Var2.dismiss();
    }
}

package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p0 f1061i;

    public o0(p0 p0Var) {
        this.f1061i = p0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j2) {
        k0 k0Var;
        if (i10 == -1 || (k0Var = this.f1061i.f1067k) == null) {
            return;
        }
        k0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t<S> extends z<S> {

    /* renamed from: e0  reason: collision with root package name */
    public int f7096e0;

    /* renamed from: f0  reason: collision with root package name */
    public d<S> f7097f0;

    /* renamed from: g0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f7098g0;

    /* loaded from: classes.dex */
    public class a extends y<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            Iterator<y<S>> it = t.this.f7122d0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7096e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7097f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7098g0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.n;
        }
        this.f7096e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7097f0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7098g0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.f7096e0));
        d<S> dVar = this.f7097f0;
        new a();
        return dVar.B();
    }
}

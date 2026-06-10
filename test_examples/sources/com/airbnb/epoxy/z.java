package com.airbnb.epoxy;

import android.view.ViewParent;
import com.airbnb.epoxy.p;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z<T extends p> extends r<T> {
    @Override // com.airbnb.epoxy.r
    /* renamed from: A */
    public void q(T t10) {
    }

    @Override // com.airbnb.epoxy.r
    /* renamed from: B */
    public void r(T t10) {
    }

    @Override // com.airbnb.epoxy.r
    /* renamed from: C */
    public void u(T t10) {
    }

    @Override // com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        p pVar = (p) obj;
    }

    @Override // com.airbnb.epoxy.r
    /* renamed from: w */
    public void f(T t10) {
    }

    @Override // com.airbnb.epoxy.r
    /* renamed from: x */
    public void e(T t10, r<?> rVar) {
        f(t10);
    }

    @Override // com.airbnb.epoxy.r
    /* renamed from: y */
    public void g(T t10, List<Object> list) {
        f(t10);
    }

    public abstract T z(ViewParent viewParent);
}

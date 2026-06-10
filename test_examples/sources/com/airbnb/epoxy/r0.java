package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f6690a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewStub f6691b;
    public final int c;

    public r0(ViewGroup viewGroup, ViewStub viewStub, int i10) {
        v7.g.f(viewGroup, "viewGroup");
        v7.g.f(viewStub, "viewStub");
        this.f6690a = viewGroup;
        this.f6691b = viewStub;
        this.c = i10;
    }

    public final void a() {
        ViewGroup viewGroup = this.f6690a;
        int i10 = this.c;
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            viewGroup.removeView(childAt);
            return;
        }
        throw new IllegalStateException("No view exists at position " + i10);
    }
}

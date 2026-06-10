package com.airbnb.epoxy;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends d {

    /* renamed from: i  reason: collision with root package name */
    public final h0 f6651i = new h0();

    /* renamed from: j  reason: collision with root package name */
    public final List<r<?>> f6652j = new ModelList();

    @Override // com.airbnb.epoxy.d
    public final List<r<?>> s() {
        return this.f6652j;
    }

    @Override // com.airbnb.epoxy.d
    public final r<?> t(int i10) {
        r<?> rVar = (r) ((ArrayList) this.f6652j).get(i10);
        if (!rVar.c) {
            return this.f6651i;
        }
        return rVar;
    }
}

package com.airbnb.epoxy;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final r<?> f6645a;

    /* renamed from: b  reason: collision with root package name */
    public final p.e<r<?>> f6646b;

    public i() {
        throw null;
    }

    public i(r<?> rVar) {
        List<r<?>> singletonList = Collections.singletonList(rVar);
        if (singletonList.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = singletonList.size();
        if (size == 1) {
            this.f6645a = (r) singletonList.get(0);
            this.f6646b = null;
            return;
        }
        this.f6645a = null;
        this.f6646b = new p.e<>(size);
        for (r<?> rVar2 : singletonList) {
            this.f6646b.J(rVar2.f6681a, rVar2);
        }
    }
}

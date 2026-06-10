package com.noto.app.data.repository;

import ja.f0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.a;
import m7.n;
import t6.c;
import u6.b;
import v7.g;

/* loaded from: classes.dex */
public final class LabelRepositoryImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    public final v6.b f7702a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f7703b;

    public LabelRepositoryImpl(v6.b bVar) {
        a aVar = f0.f12767b;
        g.f(bVar, "dataSource");
        g.f(aVar, "dispatcher");
        this.f7702a = bVar;
        this.f7703b = aVar;
    }

    @Override // u6.b
    public final Object a(c cVar, p7.c<? super n> cVar2) {
        Object I1 = m0.b.I1(cVar2, this.f7703b, new LabelRepositoryImpl$deleteLabel$2(this, cVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.b
    public final kotlinx.coroutines.flow.b<c> b(long j2) {
        return a1.b.Q(this.f7702a.b(j2), this.f7703b);
    }

    @Override // u6.b
    public final Object c(c cVar, p7.c<? super n> cVar2) {
        Object I1 = m0.b.I1(cVar2, this.f7703b, new LabelRepositoryImpl$updateLabel$2(this, cVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.b
    public final kotlinx.coroutines.flow.b<List<c>> d() {
        return a1.b.Q(this.f7702a.d(), this.f7703b);
    }

    @Override // u6.b
    public final kotlinx.coroutines.flow.b<List<c>> e(long j2) {
        return a1.b.Q(this.f7702a.e(j2), this.f7703b);
    }

    @Override // u6.b
    public final Object f(c cVar, boolean z10, p7.c<? super Long> cVar2) {
        return m0.b.I1(cVar2, this.f7703b, new LabelRepositoryImpl$createLabel$2(z10, this, cVar, null));
    }
}

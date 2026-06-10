package com.noto.app.data.repository;

import ja.f0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.a;
import m0.b;
import m7.n;
import t6.e;
import u6.c;
import v6.d;
import v7.g;

/* loaded from: classes.dex */
public final class NoteLabelRepositoryImpl implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f7713a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f7714b;

    public NoteLabelRepositoryImpl(d dVar) {
        a aVar = f0.f12767b;
        g.f(dVar, "source");
        g.f(aVar, "dispatcher");
        this.f7713a = dVar;
        this.f7714b = aVar;
    }

    @Override // u6.c
    public final Object a(long j2, long j10, p7.c<? super n> cVar) {
        Object I1 = b.I1(cVar, this.f7714b, new NoteLabelRepositoryImpl$deleteNoteLabel$2(this, j2, j10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.c
    public final kotlinx.coroutines.flow.b<List<e>> b() {
        return a1.b.Q(this.f7713a.b(), this.f7714b);
    }

    @Override // u6.c
    public final Object c(e eVar, p7.c<? super n> cVar) {
        Object I1 = b.I1(cVar, this.f7714b, new NoteLabelRepositoryImpl$createNoteLabel$2(this, eVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }
}

package com.noto.app.data.repository;

import ja.f0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.scheduling.a;
import m7.n;
import u6.d;
import v6.c;
import v7.g;

/* loaded from: classes.dex */
public final class NoteRepositoryImpl implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f7720a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f7721b;

    public NoteRepositoryImpl(c cVar) {
        a aVar = f0.f12767b;
        g.f(cVar, "dataSource");
        g.f(aVar, "dispatcher");
        this.f7720a = cVar;
        this.f7721b = aVar;
    }

    @Override // u6.d
    public final b<List<t6.d>> a(long j2) {
        return a1.b.Q(this.f7720a.a(j2), this.f7721b);
    }

    @Override // u6.d
    public final Object b(t6.d dVar, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7721b, new NoteRepositoryImpl$deleteNote$2(this, dVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.d
    public final Object c(t6.d dVar, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7721b, new NoteRepositoryImpl$updateNote$2(this, dVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.d
    public final b<List<t6.d>> d(long j2) {
        return a1.b.Q(this.f7720a.d(j2), this.f7721b);
    }

    @Override // u6.d
    public final b<List<t6.d>> e() {
        return a1.b.Q(this.f7720a.e(), this.f7721b);
    }

    @Override // u6.d
    public final b<t6.d> f(long j2) {
        return a1.b.Q(this.f7720a.f(j2), this.f7721b);
    }

    @Override // u6.d
    public final Object g(t6.d dVar, boolean z10, p7.c<? super Long> cVar) {
        return m0.b.I1(cVar, this.f7721b, new NoteRepositoryImpl$createNote$2(z10, this, dVar, null));
    }

    @Override // u6.d
    public final b<List<t6.b>> h() {
        return a1.b.Q(this.f7720a.g(), this.f7721b);
    }
}

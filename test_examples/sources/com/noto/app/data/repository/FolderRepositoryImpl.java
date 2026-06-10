package com.noto.app.data.repository;

import ja.f0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.b;
import m7.n;
import p7.c;
import u6.a;
import v7.g;

/* loaded from: classes.dex */
public final class FolderRepositoryImpl implements a {

    /* renamed from: a  reason: collision with root package name */
    public final v6.a f7692a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f7693b;

    public FolderRepositoryImpl(v6.a aVar) {
        kotlinx.coroutines.scheduling.a aVar2 = f0.f12767b;
        g.f(aVar, "dataSource");
        g.f(aVar2, "dispatcher");
        this.f7692a = aVar;
        this.f7693b = aVar2;
    }

    @Override // u6.a
    public final b<List<t6.a>> a() {
        return a1.b.Q(this.f7692a.a(), this.f7693b);
    }

    @Override // u6.a
    public final Object b(t6.a aVar, c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7693b, new FolderRepositoryImpl$deleteFolder$2(this, aVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.a
    public final b<List<t6.a>> c() {
        return a1.b.Q(this.f7692a.c(), this.f7693b);
    }

    @Override // u6.a
    public final b<t6.a> d(long j2) {
        return a1.b.Q(this.f7692a.d(j2), this.f7693b);
    }

    @Override // u6.a
    public final b<List<t6.a>> e() {
        return a1.b.Q(this.f7692a.e(), this.f7693b);
    }

    @Override // u6.a
    public final Object f(t6.a aVar, c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7693b, new FolderRepositoryImpl$updateFolder$2(this, aVar, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.a
    public final b<List<t6.a>> g() {
        return a1.b.Q(this.f7692a.g(), this.f7693b);
    }

    @Override // u6.a
    public final b<List<t6.a>> h() {
        return a1.b.Q(this.f7692a.h(), this.f7693b);
    }

    @Override // u6.a
    public final Object i(t6.a aVar, boolean z10, c<? super Long> cVar) {
        return m0.b.I1(cVar, this.f7693b, new FolderRepositoryImpl$createFolder$2(z10, this, aVar, null));
    }
}

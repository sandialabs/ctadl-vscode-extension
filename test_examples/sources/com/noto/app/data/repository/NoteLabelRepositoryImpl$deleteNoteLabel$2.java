package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v6.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.NoteLabelRepositoryImpl$deleteNoteLabel$2", f = "NoteLabelRepositoryImpl.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteLabelRepositoryImpl$deleteNoteLabel$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7717m;
    public final /* synthetic */ NoteLabelRepositoryImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f7718o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f7719p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteLabelRepositoryImpl$deleteNoteLabel$2(NoteLabelRepositoryImpl noteLabelRepositoryImpl, long j2, long j10, p7.c<? super NoteLabelRepositoryImpl$deleteNoteLabel$2> cVar) {
        super(2, cVar);
        this.n = noteLabelRepositoryImpl;
        this.f7718o = j2;
        this.f7719p = j10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteLabelRepositoryImpl$deleteNoteLabel$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteLabelRepositoryImpl$deleteNoteLabel$2(this.n, this.f7718o, this.f7719p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7717m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            d dVar = this.n.f7713a;
            long j2 = this.f7718o;
            long j10 = this.f7719p;
            this.f7717m = 1;
            if (dVar.a(j2, j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

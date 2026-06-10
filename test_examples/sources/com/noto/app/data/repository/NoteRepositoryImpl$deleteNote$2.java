package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import t6.d;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.NoteRepositoryImpl$deleteNote$2", f = "NoteRepositoryImpl.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteRepositoryImpl$deleteNote$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7725m;
    public final /* synthetic */ NoteRepositoryImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f7726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteRepositoryImpl$deleteNote$2(NoteRepositoryImpl noteRepositoryImpl, d dVar, p7.c<? super NoteRepositoryImpl$deleteNote$2> cVar) {
        super(2, cVar);
        this.n = noteRepositoryImpl;
        this.f7726o = dVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteRepositoryImpl$deleteNote$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteRepositoryImpl$deleteNote$2(this.n, this.f7726o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7725m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            v6.c cVar = this.n.f7720a;
            this.f7725m = 1;
            if (cVar.b(this.f7726o, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}

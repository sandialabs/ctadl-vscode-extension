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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.NoteRepositoryImpl$createNote$2", f = "NoteRepositoryImpl.kt", l = {36, 37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteRepositoryImpl$createNote$2 extends SuspendLambda implements p<x, p7.c<? super Long>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7722m;
    public final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteRepositoryImpl f7723o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f7724p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteRepositoryImpl$createNote$2(boolean z10, NoteRepositoryImpl noteRepositoryImpl, d dVar, p7.c<? super NoteRepositoryImpl$createNote$2> cVar) {
        super(2, cVar);
        this.n = z10;
        this.f7723o = noteRepositoryImpl;
        this.f7724p = dVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Long> cVar) {
        return ((NoteRepositoryImpl$createNote$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteRepositoryImpl$createNote$2(this.n, this.f7723o, this.f7724p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i10;
        Object I1;
        Object h10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f7722m;
        NoteRepositoryImpl noteRepositoryImpl = this.f7723o;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    b.n1(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.n1(obj);
            I1 = obj;
        } else {
            b.n1(obj);
            boolean z10 = this.n;
            d dVar = this.f7724p;
            if (z10) {
                long j2 = dVar.f17622b;
                this.f7722m = 1;
                noteRepositoryImpl.getClass();
                I1 = b.I1(this, noteRepositoryImpl.f7721b, new NoteRepositoryImpl$getNotePosition$2(noteRepositoryImpl, j2, null));
                if (I1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i10 = dVar.f17624e;
                int i12 = i10;
                v6.c cVar = noteRepositoryImpl.f7720a;
                d a10 = d.a(this.f7724p, 0L, 0L, null, null, i12, false, false, null, null, 0, 4079);
                this.f7722m = 2;
                h10 = cVar.h(a10, this);
                if (h10 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return h10;
            }
        }
        i10 = ((Number) I1).intValue();
        int i122 = i10;
        v6.c cVar2 = noteRepositoryImpl.f7720a;
        d a102 = d.a(this.f7724p, 0L, 0L, null, null, i122, false, false, null, null, 0, 4079);
        this.f7722m = 2;
        h10 = cVar2.h(a102, this);
        if (h10 != coroutineSingletons) {
        }
    }
}

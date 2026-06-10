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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.LabelRepositoryImpl$createLabel$2", f = "LabelRepositoryImpl.kt", l = {27, 28}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LabelRepositoryImpl$createLabel$2 extends SuspendLambda implements p<x, p7.c<? super Long>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7704m;
    public final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ LabelRepositoryImpl f7705o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t6.c f7706p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelRepositoryImpl$createLabel$2(boolean z10, LabelRepositoryImpl labelRepositoryImpl, t6.c cVar, p7.c<? super LabelRepositoryImpl$createLabel$2> cVar2) {
        super(2, cVar2);
        this.n = z10;
        this.f7705o = labelRepositoryImpl;
        this.f7706p = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Long> cVar) {
        return ((LabelRepositoryImpl$createLabel$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new LabelRepositoryImpl$createLabel$2(this.n, this.f7705o, this.f7706p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[PHI: r11 
      PHI: (r11v11 java.lang.Object) = (r11v7 java.lang.Object), (r11v0 java.lang.Object) binds: [B:18:0x005a, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f7704m;
        LabelRepositoryImpl labelRepositoryImpl = this.f7705o;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    b.n1(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.n1(obj);
        } else {
            b.n1(obj);
            boolean z10 = this.n;
            t6.c cVar = this.f7706p;
            if (z10) {
                long j2 = cVar.f17616b;
                this.f7704m = 1;
                labelRepositoryImpl.getClass();
                obj = b.I1(this, labelRepositoryImpl.f7703b, new LabelRepositoryImpl$getLabelPosition$2(labelRepositoryImpl, j2, null));
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i10 = cVar.f17618e;
                int i12 = i10;
                v6.b bVar = labelRepositoryImpl.f7702a;
                t6.c a10 = t6.c.a(this.f7706p, 0L, null, i12, 15);
                this.f7704m = 2;
                obj = bVar.f(a10, this);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return obj;
            }
        }
        i10 = ((Number) obj).intValue();
        int i122 = i10;
        v6.b bVar2 = labelRepositoryImpl.f7702a;
        t6.c a102 = t6.c.a(this.f7706p, 0L, null, i122, 15);
        this.f7704m = 2;
        obj = bVar2.f(a102, this);
        if (obj != coroutineSingletons) {
        }
    }
}

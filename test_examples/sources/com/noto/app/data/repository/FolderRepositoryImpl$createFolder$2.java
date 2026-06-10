package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import t6.a;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.FolderRepositoryImpl$createFolder$2", f = "FolderRepositoryImpl.kt", l = {31, 32}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderRepositoryImpl$createFolder$2 extends SuspendLambda implements p<x, p7.c<? super Long>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7694m;
    public final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderRepositoryImpl f7695o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a f7696p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderRepositoryImpl$createFolder$2(boolean z10, FolderRepositoryImpl folderRepositoryImpl, a aVar, p7.c<? super FolderRepositoryImpl$createFolder$2> cVar) {
        super(2, cVar);
        this.n = z10;
        this.f7695o = folderRepositoryImpl;
        this.f7696p = aVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Long> cVar) {
        return ((FolderRepositoryImpl$createFolder$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FolderRepositoryImpl$createFolder$2(this.n, this.f7695o, this.f7696p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i10;
        Object I1;
        Object i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f7694m;
        FolderRepositoryImpl folderRepositoryImpl = this.f7695o;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    b.n1(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.n1(obj);
            I1 = obj;
        } else {
            b.n1(obj);
            if (this.n) {
                this.f7694m = 1;
                folderRepositoryImpl.getClass();
                I1 = b.I1(this, folderRepositoryImpl.f7693b, new FolderRepositoryImpl$getFolderPosition$2(folderRepositoryImpl, null));
                if (I1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i10 = this.f7696p.f17594d;
                int i13 = i10;
                v6.a aVar = folderRepositoryImpl.f7692a;
                a a10 = a.a(this.f7696p, null, null, i13, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097143);
                this.f7694m = 2;
                i11 = aVar.i(a10, this);
                if (i11 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return i11;
            }
        }
        i10 = ((Number) I1).intValue();
        int i132 = i10;
        v6.a aVar2 = folderRepositoryImpl.f7692a;
        a a102 = a.a(this.f7696p, null, null, i132, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097143);
        this.f7694m = 2;
        i11 = aVar2.i(a102, this);
        if (i11 != coroutineSingletons) {
        }
    }
}

package androidx.compose.ui.input.nestedscroll;

import b2.k;
import ja.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.b;
import p7.c;
import u7.a;

/* loaded from: classes.dex */
public final class NestedScrollDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends x> f3251a = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* renamed from: b  reason: collision with root package name */
    public x f3252b;
    public f1.a c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j2, long j10, c<? super k> cVar) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i10;
        long j11;
        if (cVar instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) cVar;
            int i11 = nestedScrollDispatcher$dispatchPostFling$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.n = i11 - Integer.MIN_VALUE;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.f3254l;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = nestedScrollDispatcher$dispatchPostFling$12.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b.n1(obj);
                    f1.a aVar = this.c;
                    if (aVar != null) {
                        nestedScrollDispatcher$dispatchPostFling$12.n = 1;
                        obj = aVar.d(j2, j10, nestedScrollDispatcher$dispatchPostFling$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        int i12 = k.c;
                        j11 = k.f6350b;
                        return new k(j11);
                    }
                }
                j11 = ((k) obj).f6351a;
                return new k(j11);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, cVar);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.f3254l;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = nestedScrollDispatcher$dispatchPostFling$122.n;
        if (i10 == 0) {
        }
        j11 = ((k) obj2).f6351a;
        return new k(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j2, c<? super k> cVar) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i10;
        long j10;
        if (cVar instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) cVar;
            int i11 = nestedScrollDispatcher$dispatchPreFling$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.n = i11 - Integer.MIN_VALUE;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.f3256l;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = nestedScrollDispatcher$dispatchPreFling$1.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b.n1(obj);
                    f1.a aVar = this.c;
                    if (aVar != null) {
                        nestedScrollDispatcher$dispatchPreFling$1.n = 1;
                        obj = aVar.e(j2, nestedScrollDispatcher$dispatchPreFling$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        int i12 = k.c;
                        j10 = k.f6350b;
                        return new k(j10);
                    }
                }
                j10 = ((k) obj).f6351a;
                return new k(j10);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, cVar);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.f3256l;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = nestedScrollDispatcher$dispatchPreFling$1.n;
        if (i10 == 0) {
        }
        j10 = ((k) obj2).f6351a;
        return new k(j10);
    }
}

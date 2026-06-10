package ja;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public abstract class k0 extends CoroutineDispatcher {
    public static final /* synthetic */ int n = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f12780k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12781l;

    /* renamed from: m  reason: collision with root package name */
    public kotlinx.coroutines.internal.a<d0<?>> f12782m;

    public final void W(boolean z10) {
        long j2 = this.f12780k - (z10 ? 4294967296L : 1L);
        this.f12780k = j2;
        if (j2 <= 0 && this.f12781l) {
            shutdown();
        }
    }

    public final void X(d0<?> d0Var) {
        kotlinx.coroutines.internal.a<d0<?>> aVar = this.f12782m;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f12782m = aVar;
        }
        Object[] objArr = aVar.f15469a;
        int i10 = aVar.c;
        objArr[i10] = d0Var;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.c = length;
        int i11 = aVar.f15470b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            n7.i.d2(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f15469a;
            int length3 = objArr3.length;
            int i12 = aVar.f15470b;
            n7.i.d2(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f15469a = objArr2;
            aVar.f15470b = 0;
            aVar.c = length2;
        }
    }

    public final void Y(boolean z10) {
        this.f12780k = (z10 ? 4294967296L : 1L) + this.f12780k;
        if (z10) {
            return;
        }
        this.f12781l = true;
    }

    public final boolean Z() {
        return this.f12780k >= 4294967296L;
    }

    public long a0() {
        return !b0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean b0() {
        kotlinx.coroutines.internal.a<d0<?>> aVar = this.f12782m;
        if (aVar == null) {
            return false;
        }
        int i10 = aVar.f15470b;
        Object obj = null;
        if (i10 != aVar.c) {
            Object[] objArr = aVar.f15469a;
            Object obj2 = objArr[i10];
            objArr[i10] = null;
            aVar.f15470b = (i10 + 1) & (objArr.length - 1);
            if (obj2 != null) {
                obj = obj2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var == null) {
            return false;
        }
        d0Var.run();
        return true;
    }

    public void shutdown() {
    }
}

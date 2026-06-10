package com.airbnb.epoxy;

import com.airbnb.epoxy.m;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r<T> {

    /* renamed from: j  reason: collision with root package name */
    public static long f6680j = -1;

    /* renamed from: a  reason: collision with root package name */
    public long f6681a;

    /* renamed from: b  reason: collision with root package name */
    public int f6682b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public m f6683d;

    /* renamed from: e  reason: collision with root package name */
    public m f6684e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6685f;

    /* renamed from: g  reason: collision with root package name */
    public int f6686g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6687h;

    /* renamed from: i  reason: collision with root package name */
    public b f6688i;

    /* loaded from: classes.dex */
    public class a implements m.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f6689a;

        public a(z zVar) {
            this.f6689a = zVar;
        }

        @Override // com.airbnb.epoxy.m.f
        public final void a() {
            r rVar = this.f6689a;
            rVar.f6686g = rVar.hashCode();
            rVar.f6685f = false;
        }

        @Override // com.airbnb.epoxy.m.f
        public final void b() {
            this.f6689a.f6685f = true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public r() {
        long j2 = f6680j;
        f6680j = j2 - 1;
        this.c = true;
        k(j2);
        this.f6687h = true;
    }

    public void c(m mVar) {
        mVar.addInternal(this);
    }

    public final void d(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (mVar.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + mVar.getFirstIndexOfModelInBuildingList(this));
        } else if (this.f6683d == null) {
            this.f6683d = mVar;
            this.f6686g = hashCode();
            mVar.addAfterInterceptorCallback(new a((z) this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(r rVar, Object obj) {
        f(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f6681a == rVar.f6681a && i() == rVar.i() && this.c == rVar.c) {
            return true;
        }
        return false;
    }

    public void f(T t10) {
    }

    public void g(T t10, List<Object> list) {
        f(t10);
    }

    public abstract int h();

    public int hashCode() {
        long j2 = this.f6681a;
        return ((i() + (((int) (j2 ^ (j2 >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final int i() {
        int i10 = this.f6682b;
        return i10 == 0 ? h() : i10;
    }

    public int j(int i10, int i11, int i12) {
        return 1;
    }

    public r<T> k(long j2) {
        if (this.f6683d != null && j2 != this.f6681a) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.f6687h = false;
        this.f6681a = j2;
        return this;
    }

    public final void l(CharSequence charSequence) {
        long j2;
        if (charSequence == null) {
            j2 = 0;
        } else {
            int length = charSequence.length();
            long j10 = -3750763034362895579L;
            for (int i10 = 0; i10 < length; i10++) {
                j10 = (j10 ^ charSequence.charAt(i10)) * 1099511628211L;
            }
            j2 = j10;
        }
        k(j2);
    }

    public final void m(Number... numberArr) {
        long j2 = 0;
        if (numberArr != null) {
            long j10 = 0;
            for (Number number : numberArr) {
                long j11 = j10 * 31;
                long hashCode = number == null ? 0L : number.hashCode();
                long j12 = hashCode ^ (hashCode << 21);
                long j13 = j12 ^ (j12 >>> 35);
                j10 = j11 + (j13 ^ (j13 << 4));
            }
            j2 = j10;
        }
        k(j2);
    }

    public void n(int i10) {
        p();
        this.f6682b = i10;
    }

    public void o(Object obj) {
    }

    public final void p() {
        boolean z10;
        int i10 = 0;
        if (this.f6683d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f6685f) {
            m mVar = this.f6683d;
            if (!mVar.isBuildingModels()) {
                n adapter = mVar.getAdapter();
                int size = adapter.f6665j.f6626f.size();
                while (true) {
                    if (i10 < size) {
                        if (adapter.f6665j.f6626f.get(i10).f6681a == this.f6681a) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
            } else {
                i10 = mVar.getFirstIndexOfModelInBuildingList(this);
            }
            throw new ImmutableModelException(this, "", i10);
        }
        m mVar2 = this.f6684e;
        if (mVar2 != null) {
            mVar2.setStagedModel(this);
        }
    }

    public void q(T t10) {
    }

    public void r(T t10) {
    }

    public boolean s() {
        return false;
    }

    public final int t(int i10, int i11, int i12) {
        if (this.f6688i != null) {
            return 2;
        }
        return j(i10, i11, i12);
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f6681a + ", viewType=" + i() + ", shown=" + this.c + ", addedToAdapter=false}";
    }

    public void u(T t10) {
    }

    public final void v(String str, int i10) {
        boolean z10;
        if (this.f6683d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f6685f && this.f6686g != hashCode()) {
            throw new ImmutableModelException(this, str, i10);
        }
    }
}

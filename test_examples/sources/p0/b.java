package p0;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p0.g;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: l  reason: collision with root package name */
    public final a f16597l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16598m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, SnapshotIdSet snapshotIdSet, u7.l<Object, m7.n> lVar, u7.l<Object, m7.n> lVar2, a aVar) {
        super(i10, snapshotIdSet, lVar, lVar2);
        v7.g.f(snapshotIdSet, "invalid");
        v7.g.f(aVar, "parent");
        this.f16597l = aVar;
        aVar.j(this);
    }

    @Override // p0.a, p0.f
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.f16598m) {
                this.f16598m = true;
                this.f16597l.k(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[Catch: all -> 0x00f2, TryCatch #0 {, blocks: (B:13:0x001f, B:15:0x0024, B:18:0x002b, B:22:0x0045, B:24:0x004d, B:25:0x0057, B:27:0x005e, B:29:0x0066, B:30:0x006b, B:32:0x008c, B:34:0x00a2, B:47:0x00df, B:40:0x00c0, B:45:0x00ca, B:46:0x00cd, B:33:0x009f, B:26:0x005b), top: B:59:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x00f2, TryCatch #0 {, blocks: (B:13:0x001f, B:15:0x0024, B:18:0x002b, B:22:0x0045, B:24:0x004d, B:25:0x0057, B:27:0x005e, B:29:0x0066, B:30:0x006b, B:32:0x008c, B:34:0x00a2, B:47:0x00df, B:40:0x00c0, B:45:0x00ca, B:46:0x00cd, B:33:0x009f, B:26:0x005b), top: B:59:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: all -> 0x00f2, TryCatch #0 {, blocks: (B:13:0x001f, B:15:0x0024, B:18:0x002b, B:22:0x0045, B:24:0x004d, B:25:0x0057, B:27:0x005e, B:29:0x0066, B:30:0x006b, B:32:0x008c, B:34:0x00a2, B:47:0x00df, B:40:0x00c0, B:45:0x00ca, B:46:0x00cd, B:33:0x009f, B:26:0x005b), top: B:59:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: all -> 0x00f2, TryCatch #0 {, blocks: (B:13:0x001f, B:15:0x0024, B:18:0x002b, B:22:0x0045, B:24:0x004d, B:25:0x0057, B:27:0x005e, B:29:0x0066, B:30:0x006b, B:32:0x008c, B:34:0x00a2, B:47:0x00df, B:40:0x00c0, B:45:0x00ca, B:46:0x00cd, B:33:0x009f, B:26:0x005b), top: B:59:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    @Override // p0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g t() {
        HashMap hashMap;
        int i10;
        int[] iArr;
        boolean z10;
        boolean z11;
        a aVar = this.f16597l;
        if (!aVar.f16592k && !aVar.c) {
            Set<w> set = this.f16588g;
            int i11 = this.f16603b;
            if (set != null) {
                hashMap = SnapshotKt.c(aVar, this, aVar.e());
            } else {
                hashMap = null;
            }
            synchronized (SnapshotKt.c) {
                SnapshotKt.d(this);
                if (set != null && set.size() != 0) {
                    g v3 = v(this.f16597l.d(), hashMap, this.f16597l.e());
                    if (!v7.g.a(v3, g.b.f16605a)) {
                        return v3;
                    }
                    Set<w> u10 = this.f16597l.u();
                    HashSet hashSet = u10;
                    if (u10 == null) {
                        HashSet hashSet2 = new HashSet();
                        this.f16597l.y(hashSet2);
                        hashSet = hashSet2;
                    }
                    hashSet.addAll(set);
                    if (this.f16597l.d() < i11) {
                        this.f16597l.s();
                    }
                    a aVar2 = this.f16597l;
                    aVar2.q(aVar2.e().d(i11).c(this.f16589h));
                    this.f16597l.w(i11);
                    a aVar3 = this.f16597l;
                    i10 = this.f16604d;
                    this.f16604d = -1;
                    if (i10 < 0) {
                        int[] iArr2 = aVar3.f16590i;
                        v7.g.f(iArr2, "<this>");
                        int length = iArr2.length;
                        int[] copyOf = Arrays.copyOf(iArr2, length + 1);
                        copyOf[length] = i10;
                        aVar3.f16590i = copyOf;
                    } else {
                        aVar3.getClass();
                    }
                    this.f16597l.x(this.f16589h);
                    a aVar4 = this.f16597l;
                    iArr = this.f16590i;
                    aVar4.getClass();
                    v7.g.f(iArr, "handles");
                    if (iArr.length != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int[] iArr3 = aVar4.f16590i;
                        if (iArr3.length == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            aVar4.f16590i = iArr;
                        } else {
                            int length2 = iArr3.length;
                            int length3 = iArr.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr, 0, copyOf2, length2, length3);
                            v7.g.e(copyOf2, "result");
                            aVar4.f16590i = copyOf2;
                        }
                    }
                    m7.n nVar = m7.n.f16010a;
                    this.f16592k = true;
                    if (!this.f16598m) {
                        this.f16598m = true;
                        this.f16597l.k(this);
                    }
                    return g.b.f16605a;
                }
                a();
                if (this.f16597l.d() < i11) {
                }
                a aVar22 = this.f16597l;
                aVar22.q(aVar22.e().d(i11).c(this.f16589h));
                this.f16597l.w(i11);
                a aVar32 = this.f16597l;
                i10 = this.f16604d;
                this.f16604d = -1;
                if (i10 < 0) {
                }
                this.f16597l.x(this.f16589h);
                a aVar42 = this.f16597l;
                iArr = this.f16590i;
                aVar42.getClass();
                v7.g.f(iArr, "handles");
                if (iArr.length != 0) {
                }
                if (z10) {
                }
                m7.n nVar2 = m7.n.f16010a;
                this.f16592k = true;
                if (!this.f16598m) {
                }
                return g.b.f16605a;
            }
        }
        return new g.a(this);
    }
}

package androidx.compose.runtime.snapshots;

import a1.c;
import java.util.ArrayList;
import java.util.Iterator;
import m0.b;
import n7.i;
import n7.l;
import v7.g;
import w7.a;

/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, a {

    /* renamed from: m  reason: collision with root package name */
    public static final SnapshotIdSet f2928m = new SnapshotIdSet(0, 0, 0, null);

    /* renamed from: i  reason: collision with root package name */
    public final long f2929i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2930j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2931k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f2932l;

    public SnapshotIdSet(long j2, long j10, int i10, int[] iArr) {
        this.f2929i = j2;
        this.f2930j = j10;
        this.f2931k = i10;
        this.f2932l = iArr;
    }

    public final SnapshotIdSet c(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        g.f(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f2928m;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i10 = this.f2931k;
        if (snapshotIdSet.f2931k == i10 && snapshotIdSet.f2932l == (iArr = this.f2932l)) {
            return new SnapshotIdSet(this.f2929i & (~snapshotIdSet.f2929i), (~snapshotIdSet.f2930j) & this.f2930j, i10, iArr);
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.d(it.next().intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet d(int i10) {
        int[] iArr;
        int Q;
        int i11 = this.f2931k;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j2 = 1 << i12;
            long j10 = this.f2930j;
            if ((j10 & j2) != 0) {
                return new SnapshotIdSet(this.f2929i, j10 & (~j2), i11, this.f2932l);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j11 = 1 << (i12 - 64);
            long j12 = this.f2929i;
            if ((j12 & j11) != 0) {
                return new SnapshotIdSet(j12 & (~j11), this.f2930j, i11, this.f2932l);
            }
        } else if (i12 < 0 && (iArr = this.f2932l) != null && (Q = c.Q(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f2929i, this.f2930j, this.f2931k, null);
            }
            int[] iArr2 = new int[length];
            if (Q > 0) {
                i.a2(0, 0, Q, iArr, iArr2);
            }
            if (Q < length) {
                i.a2(Q, Q + 1, length + 1, iArr, iArr2);
            }
            return new SnapshotIdSet(this.f2929i, this.f2930j, this.f2931k, iArr2);
        }
        return this;
    }

    public final boolean g(int i10) {
        int[] iArr;
        int i11 = i10 - this.f2931k;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f2930j) != 0;
        } else if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f2929i) != 0;
        } else if (i11 <= 0 && (iArr = this.f2932l) != null) {
            if (c.Q(iArr, i10) < 0) {
                z10 = false;
            }
            return z10;
        } else {
            return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this, null);
        ga.i iVar = new ga.i();
        iVar.f11305l = b.P(iVar, iVar, snapshotIdSet$iterator$1);
        return iVar;
    }

    public final SnapshotIdSet s(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        g.f(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f2928m;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i10 = this.f2931k;
        if (snapshotIdSet.f2931k == i10 && snapshotIdSet.f2932l == (iArr = this.f2932l)) {
            return new SnapshotIdSet(this.f2929i | snapshotIdSet.f2929i, this.f2930j | snapshotIdSet.f2930j, i10, iArr);
        }
        if (this.f2932l == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.t(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.t(it2.next().intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet t(int i10) {
        long j2;
        int i11;
        int i12 = this.f2931k;
        int i13 = i10 - i12;
        long j10 = this.f2930j;
        if (i13 < 0 || i13 >= 64) {
            long j11 = this.f2929i;
            if (i13 < 64 || i13 >= 128) {
                int[] iArr = this.f2932l;
                if (i13 >= 128) {
                    if (!g(i10)) {
                        int i14 = ((i10 + 1) / 64) * 64;
                        int i15 = this.f2931k;
                        ArrayList arrayList = null;
                        long j12 = j11;
                        while (true) {
                            if (i15 >= i14) {
                                j2 = j10;
                                i11 = i15;
                                break;
                            }
                            if (j10 != 0) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    if (iArr != null) {
                                        for (int i16 : iArr) {
                                            arrayList.add(Integer.valueOf(i16));
                                        }
                                    }
                                }
                                for (int i17 = 0; i17 < 64; i17++) {
                                    if (((1 << i17) & j10) != 0) {
                                        arrayList.add(Integer.valueOf(i17 + i15));
                                    }
                                }
                            }
                            if (j12 == 0) {
                                i11 = i14;
                                j2 = 0;
                                break;
                            }
                            i15 += 64;
                            j10 = j12;
                            j12 = 0;
                        }
                        if (arrayList != null) {
                            iArr = kotlin.collections.c.K2(arrayList);
                        }
                        return new SnapshotIdSet(j12, j2, i11, iArr).t(i10);
                    }
                } else if (iArr == null) {
                    return new SnapshotIdSet(j11, j10, i12, new int[]{i10});
                } else {
                    int Q = c.Q(iArr, i10);
                    if (Q < 0) {
                        int i18 = -(Q + 1);
                        int length = iArr.length + 1;
                        int[] iArr2 = new int[length];
                        i.a2(0, 0, i18, iArr, iArr2);
                        i.a2(i18 + 1, i18, length - 1, iArr, iArr2);
                        iArr2[i18] = i10;
                        return new SnapshotIdSet(this.f2929i, this.f2930j, this.f2931k, iArr2);
                    }
                }
            } else {
                long j13 = 1 << (i13 - 64);
                if ((j11 & j13) == 0) {
                    return new SnapshotIdSet(j11 | j13, j10, i12, this.f2932l);
                }
            }
        } else {
            long j14 = 1 << i13;
            if ((j10 & j14) == 0) {
                return new SnapshotIdSet(this.f2929i, j10 | j14, i12, this.f2932l);
            }
        }
        return this;
    }

    public final String toString() {
        CharSequence valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(l.Z1(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            boolean z10 = true;
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                valueOf = (CharSequence) obj;
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        g.e(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb3);
        sb.append(']');
        return sb.toString();
    }
}

package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import v2.l;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public static final ThreadLocal<m> f5920m = new ThreadLocal<>();
    public static final a n = new a();

    /* renamed from: j  reason: collision with root package name */
    public long f5922j;

    /* renamed from: k  reason: collision with root package name */
    public long f5923k;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView> f5921i = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<c> f5924l = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 != false) goto L14;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(c cVar, c cVar2) {
            boolean z10;
            boolean z11;
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f5930d;
            int i10 = 1;
            if (recyclerView == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar4.f5930d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (recyclerView == null) {
                }
                i10 = -1;
            } else {
                boolean z12 = cVar3.f5928a;
                if (z12 == cVar4.f5928a) {
                    int i11 = cVar4.f5929b - cVar3.f5929b;
                    if (i11 != 0) {
                        return i11;
                    }
                    int i12 = cVar3.c - cVar4.c;
                    if (i12 == 0) {
                        return 0;
                    }
                    return i12;
                }
            }
            return i10;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f5925a;

        /* renamed from: b  reason: collision with root package name */
        public int f5926b;
        public int[] c;

        /* renamed from: d  reason: collision with root package name */
        public int f5927d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f5927d * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f5927d++;
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f5927d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f5643v;
            if (recyclerView.f5641u != null && lVar != null && lVar.f5700j) {
                if (z10) {
                    if (!recyclerView.f5626m.g()) {
                        lVar.m(recyclerView.f5641u.d(), this);
                    }
                } else {
                    if (!((!recyclerView.D || recyclerView.M || recyclerView.f5626m.g()) ? true : true)) {
                        lVar.l(this.f5925a, this.f5926b, recyclerView.f5634q0, this);
                    }
                }
                int i10 = this.f5927d;
                if (i10 > lVar.f5701k) {
                    lVar.f5701k = i10;
                    lVar.f5702l = z10;
                    recyclerView.f5622k.o();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5928a;

        /* renamed from: b  reason: collision with root package name */
        public int f5929b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f5930d;

        /* renamed from: e  reason: collision with root package name */
        public int f5931e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i10, long j2) {
        boolean z10;
        int h10 = recyclerView.n.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                RecyclerView.b0 L = RecyclerView.L(recyclerView.n.g(i11));
                if (L.c == i10 && !L.i()) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f5622k;
        try {
            recyclerView.R();
            RecyclerView.b0 m10 = sVar.m(i10, j2);
            if (m10 != null) {
                if (m10.h() && !m10.i()) {
                    sVar.i(m10.f5666a);
                } else {
                    sVar.a(m10, false);
                }
            }
            return m10;
        } finally {
            recyclerView.S(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f5922j == 0) {
            this.f5922j = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f5632p0;
        bVar.f5925a = i10;
        bVar.f5926b = i11;
    }

    public final void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        ArrayList<RecyclerView> arrayList = this.f5921i;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f5632p0;
                bVar.b(recyclerView3, false);
                i10 += bVar.f5927d;
            }
        }
        ArrayList<c> arrayList2 = this.f5924l;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f5632p0;
                int abs = Math.abs(bVar2.f5926b) + Math.abs(bVar2.f5925a);
                for (int i14 = 0; i14 < bVar2.f5927d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f5928a = z10;
                    cVar2.f5929b = abs;
                    cVar2.c = i15;
                    cVar2.f5930d = recyclerView4;
                    cVar2.f5931e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, n);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f5930d) != null; i16++) {
            if (cVar.f5928a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j2;
            }
            RecyclerView.b0 c10 = c(recyclerView, cVar.f5931e, j10);
            if (c10 != null && c10.f5667b != null && c10.h() && !c10.i() && (recyclerView2 = c10.f5667b.get()) != null) {
                if (recyclerView2.M && recyclerView2.n.h() != 0) {
                    RecyclerView.i iVar = recyclerView2.V;
                    if (iVar != null) {
                        iVar.k();
                    }
                    RecyclerView.l lVar = recyclerView2.f5643v;
                    RecyclerView.s sVar = recyclerView2.f5622k;
                    if (lVar != null) {
                        lVar.r0(sVar);
                        recyclerView2.f5643v.s0(sVar);
                    }
                    sVar.f5720a.clear();
                    sVar.g();
                }
                b bVar3 = recyclerView2.f5632p0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f5927d != 0) {
                    try {
                        int i17 = v2.l.f18154a;
                        l.a.a("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f5634q0;
                        RecyclerView.Adapter adapter = recyclerView2.f5641u;
                        xVar.f5744d = 1;
                        xVar.f5745e = adapter.d();
                        xVar.f5747g = false;
                        xVar.f5748h = false;
                        xVar.f5749i = false;
                        for (int i18 = 0; i18 < bVar3.f5927d * 2; i18 += 2) {
                            c(recyclerView2, bVar3.c[i18], j2);
                        }
                        l.a.b();
                        cVar.f5928a = false;
                        cVar.f5929b = 0;
                        cVar.c = 0;
                        cVar.f5930d = null;
                        cVar.f5931e = 0;
                    } catch (Throwable th) {
                        int i19 = v2.l.f18154a;
                        l.a.b();
                        throw th;
                    }
                }
            }
            cVar.f5928a = false;
            cVar.f5929b = 0;
            cVar.c = 0;
            cVar.f5930d = null;
            cVar.f5931e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = v2.l.f18154a;
            l.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f5921i;
            if (arrayList.isEmpty()) {
                this.f5922j = 0L;
                l.a.b();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f5922j = 0L;
                l.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f5923k);
            this.f5922j = 0L;
            l.a.b();
        } catch (Throwable th) {
            this.f5922j = 0L;
            int i12 = v2.l.f18154a;
            l.a.b();
            throw th;
        }
    }
}

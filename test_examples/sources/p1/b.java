package p1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p1.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f16648a = 0;

    static {
        EmptyList emptyList;
        boolean z10;
        EmptyList emptyList2 = null;
        if (true & true) {
            emptyList = EmptyList.f12981i;
        } else {
            emptyList = null;
        }
        if (true & true) {
            emptyList2 = EmptyList.f12981i;
        }
        v7.g.f(emptyList, "spanStyles");
        v7.g.f(emptyList2, "paragraphStyles");
        v7.g.f(EmptyList.f12981i, "annotations");
        List G2 = kotlin.collections.c.G2(emptyList2, new a.b());
        int size = G2.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            a.C0207a c0207a = (a.C0207a) G2.get(i11);
            boolean z11 = true;
            if (c0207a.f16646b >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = c0207a.c;
                if (i10 > 0) {
                    z11 = false;
                }
                if (!z11) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0207a.f16646b + ", " + i10 + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public static final ArrayList a(List list, int i10, int i11) {
        boolean z10;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                a.C0207a c0207a = (a.C0207a) obj;
                if (b(i10, i11, c0207a.f16646b, c0207a.c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                a.C0207a c0207a2 = (a.C0207a) arrayList.get(i13);
                arrayList2.add(new a.C0207a(c0207a2.f16645a, Math.max(i10, c0207a2.f16646b) - i10, Math.min(i11, c0207a2.c) - i10, c0207a2.f16647d));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        if ((r6 == r7) == (r4 == r5)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
        if ((r4 == r5) == (r6 == r7)) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 <= i12 && i13 <= i11) {
            if (i11 == i13) {
            }
            z10 = true;
            if (!z10) {
                return true;
            }
            if (i12 <= i10 && i11 <= i13) {
                if (i13 == i11) {
                }
                z11 = true;
                return !z11;
            }
            z11 = false;
            if (!z11) {
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}

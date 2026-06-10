package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends m {

    /* renamed from: e  reason: collision with root package name */
    final m[] f12144e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(m[] mVarArr) {
        super(-1, null, null, null);
        this.f12144e = mVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.h) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r0 = ((j$.util.concurrent.h) r0).f12144e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(int i10, Object obj) {
        int length;
        m m10;
        Object obj2;
        m[] mVarArr = this.f12144e;
        loop0: while (obj != null && mVarArr != null && (length = mVarArr.length) != 0 && (m10 = ConcurrentHashMap.m(mVarArr, (length - 1) & i10)) != null) {
            while (true) {
                int i11 = m10.f12150a;
                if (i11 != i10 || ((obj2 = m10.f12151b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i11 >= 0) {
                        m10 = m10.f12152d;
                        if (m10 == null) {
                            break loop0;
                        }
                    } else {
                        break;
                    }
                }
            }
            return m10;
        }
        return null;
    }
}

package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    m[] f12156a;

    /* renamed from: b  reason: collision with root package name */
    m f12157b = null;
    p c;

    /* renamed from: d  reason: collision with root package name */
    p f12158d;

    /* renamed from: e  reason: collision with root package name */
    int f12159e;

    /* renamed from: f  reason: collision with root package name */
    int f12160f;

    /* renamed from: g  reason: collision with root package name */
    int f12161g;

    /* renamed from: h  reason: collision with root package name */
    final int f12162h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(m[] mVarArr, int i10, int i11, int i12) {
        this.f12156a = mVarArr;
        this.f12162h = i10;
        this.f12159e = i11;
        this.f12160f = i11;
        this.f12161g = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m e() {
        m[] mVarArr;
        int length;
        int i10;
        p pVar;
        m mVar = this.f12157b;
        if (mVar != null) {
            mVar = mVar.f12152d;
        }
        while (mVar == null) {
            if (this.f12160f < this.f12161g && (mVarArr = this.f12156a) != null && (length = mVarArr.length) > (i10 = this.f12159e) && i10 >= 0) {
                m m10 = ConcurrentHashMap.m(mVarArr, i10);
                if (m10 == null || m10.f12150a >= 0) {
                    mVar = m10;
                } else if (m10 instanceof h) {
                    this.f12156a = ((h) m10).f12144e;
                    p pVar2 = this.f12158d;
                    if (pVar2 != null) {
                        this.f12158d = pVar2.f12155d;
                    } else {
                        pVar2 = new p();
                    }
                    pVar2.c = mVarArr;
                    pVar2.f12153a = length;
                    pVar2.f12154b = i10;
                    pVar2.f12155d = this.c;
                    this.c = pVar2;
                    mVar = null;
                } else {
                    mVar = m10 instanceof r ? ((r) m10).f12166f : null;
                }
                if (this.c != null) {
                    while (true) {
                        pVar = this.c;
                        if (pVar == null) {
                            break;
                        }
                        int i11 = this.f12159e;
                        int i12 = pVar.f12153a;
                        int i13 = i11 + i12;
                        this.f12159e = i13;
                        if (i13 < length) {
                            break;
                        }
                        this.f12159e = pVar.f12154b;
                        this.f12156a = pVar.c;
                        pVar.c = null;
                        p pVar3 = pVar.f12155d;
                        pVar.f12155d = this.f12158d;
                        this.c = pVar3;
                        this.f12158d = pVar;
                        length = i12;
                    }
                    if (pVar == null) {
                        int i14 = this.f12159e + this.f12162h;
                        this.f12159e = i14;
                        if (i14 >= length) {
                            int i15 = this.f12160f + 1;
                            this.f12160f = i15;
                            this.f12159e = i15;
                        }
                    }
                } else {
                    int i16 = i10 + this.f12162h;
                    this.f12159e = i16;
                    if (i16 >= length) {
                        int i17 = this.f12160f + 1;
                        this.f12160f = i17;
                        this.f12159e = i17;
                    }
                }
            }
            this.f12157b = null;
            return null;
        }
        this.f12157b = mVar;
        return mVar;
    }
}

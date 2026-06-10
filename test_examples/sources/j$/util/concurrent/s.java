package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends m {

    /* renamed from: e  reason: collision with root package name */
    s f12168e;

    /* renamed from: f  reason: collision with root package name */
    s f12169f;

    /* renamed from: g  reason: collision with root package name */
    s f12170g;

    /* renamed from: h  reason: collision with root package name */
    s f12171h;

    /* renamed from: i  reason: collision with root package name */
    boolean f12172i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i10, Object obj, Object obj2, s sVar, s sVar2) {
        super(i10, obj, obj2, sVar);
        this.f12168e = sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.m
    public final m a(int i10, Object obj) {
        return b(i10, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b(int i10, Object obj, Class cls) {
        int d5;
        if (obj != null) {
            s sVar = this;
            do {
                s sVar2 = sVar.f12169f;
                s sVar3 = sVar.f12170g;
                int i11 = sVar.f12150a;
                if (i11 <= i10) {
                    if (i11 >= i10) {
                        Object obj2 = sVar.f12151b;
                        if (obj2 != obj && (obj2 == null || !obj.equals(obj2))) {
                            if (sVar2 != null) {
                                if (sVar3 != null) {
                                    if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d5 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                        s b5 = sVar3.b(i10, obj, cls);
                                        if (b5 != null) {
                                            return b5;
                                        }
                                    } else if (d5 >= 0) {
                                        sVar2 = sVar3;
                                    }
                                }
                            }
                        }
                        return sVar;
                    }
                    sVar = sVar3;
                    continue;
                }
                sVar = sVar2;
                continue;
            } while (sVar != null);
            return null;
        }
        return null;
    }
}

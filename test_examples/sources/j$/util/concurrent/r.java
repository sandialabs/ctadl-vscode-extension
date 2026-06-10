package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends m {

    /* renamed from: h  reason: collision with root package name */
    private static final Unsafe f12163h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f12164i;

    /* renamed from: e  reason: collision with root package name */
    s f12165e;

    /* renamed from: f  reason: collision with root package name */
    volatile s f12166f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f12167g;
    volatile int lockState;

    static {
        try {
            Unsafe c = w.c();
            f12163h = c;
            f12164i = c.objectFieldOffset(r.class.getDeclaredField("lockState"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        super(-2, null, null, null);
        int d5;
        int j2;
        this.f12166f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.f12152d;
            sVar.f12170g = null;
            sVar.f12169f = null;
            if (sVar2 == null) {
                sVar.f12168e = null;
                sVar.f12172i = false;
            } else {
                Object obj = sVar.f12151b;
                int i10 = sVar.f12150a;
                s sVar4 = sVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = sVar4.f12151b;
                    int i11 = sVar4.f12150a;
                    j2 = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d5 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) ? j(obj, obj2) : d5;
                    s sVar5 = j2 <= 0 ? sVar4.f12169f : sVar4.f12170g;
                    if (sVar5 == null) {
                        break;
                    }
                    sVar4 = sVar5;
                }
                sVar.f12168e = sVar4;
                if (j2 <= 0) {
                    sVar4.f12169f = sVar;
                } else {
                    sVar4.f12170g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.f12165e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.f12168e;
            if (sVar3 == null) {
                sVar2.f12172i = false;
                return sVar2;
            } else if (sVar2.f12172i) {
                sVar2.f12172i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f12169f;
                s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.f12170g;
                    if (sVar4 != null && sVar4.f12172i) {
                        sVar4.f12172i = false;
                        sVar3.f12172i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.f12168e;
                        sVar4 = sVar3 == null ? null : sVar3.f12170g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar6 = sVar4.f12169f;
                        s sVar7 = sVar4.f12170g;
                        if ((sVar7 != null && sVar7.f12172i) || (sVar6 != null && sVar6.f12172i)) {
                            if (sVar7 == null || !sVar7.f12172i) {
                                if (sVar6 != null) {
                                    sVar6.f12172i = false;
                                }
                                sVar4.f12172i = true;
                                sVar = i(sVar, sVar4);
                                sVar3 = sVar2.f12168e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f12170g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f12172i = sVar3 == null ? false : sVar3.f12172i;
                                s sVar8 = sVar4.f12170g;
                                if (sVar8 != null) {
                                    sVar8.f12172i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f12172i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f12172i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.f12172i) {
                        sVar4.f12172i = false;
                        sVar3.f12172i = true;
                        sVar = i(sVar, sVar3);
                        sVar3 = sVar2.f12168e;
                        sVar4 = sVar3 == null ? null : sVar3.f12169f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar9 = sVar4.f12169f;
                        s sVar10 = sVar4.f12170g;
                        if ((sVar9 != null && sVar9.f12172i) || (sVar10 != null && sVar10.f12172i)) {
                            if (sVar9 == null || !sVar9.f12172i) {
                                if (sVar10 != null) {
                                    sVar10.f12172i = false;
                                }
                                sVar4.f12172i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.f12168e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f12169f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.f12172i = sVar3 == null ? false : sVar3.f12172i;
                                s sVar11 = sVar4.f12169f;
                                if (sVar11 != null) {
                                    sVar11.f12172i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.f12172i = false;
                                sVar = i(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.f12172i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f12172i = true;
        while (true) {
            s sVar4 = sVar2.f12168e;
            if (sVar4 != null) {
                if (!sVar4.f12172i || (sVar3 = sVar4.f12168e) == null) {
                    break;
                }
                s sVar5 = sVar3.f12169f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f12170g;
                    if (sVar5 == null || !sVar5.f12172i) {
                        if (sVar2 == sVar4.f12170g) {
                            sVar = h(sVar, sVar4);
                            s sVar6 = sVar4.f12168e;
                            sVar3 = sVar6 == null ? null : sVar6.f12168e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.f12172i = false;
                            if (sVar3 != null) {
                                sVar3.f12172i = true;
                                sVar = i(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.f12172i = false;
                        sVar4.f12172i = false;
                        sVar3.f12172i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.f12172i) {
                    if (sVar2 == sVar4.f12169f) {
                        sVar = i(sVar, sVar4);
                        s sVar7 = sVar4.f12168e;
                        sVar3 = sVar7 == null ? null : sVar7.f12168e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.f12172i = false;
                        if (sVar3 != null) {
                            sVar3.f12172i = true;
                            sVar = h(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.f12172i = false;
                    sVar4.f12172i = false;
                    sVar3.f12172i = true;
                    sVar2 = sVar3;
                }
            } else {
                sVar2.f12172i = false;
                return sVar2;
            }
        }
        return sVar;
    }

    private final void d() {
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f12163h.compareAndSwapInt(this, f12164i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f12163h.compareAndSwapInt(this, f12164i, i10, i10 | 2)) {
                    this.f12167g = Thread.currentThread();
                    z10 = true;
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f12167g = null;
        }
    }

    private final void e() {
        if (f12163h.compareAndSwapInt(this, f12164i, 0, 1)) {
            return;
        }
        d();
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f12170g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f12169f;
            sVar2.f12170g = sVar4;
            if (sVar4 != null) {
                sVar4.f12168e = sVar2;
            }
            s sVar5 = sVar2.f12168e;
            sVar3.f12168e = sVar5;
            if (sVar5 == null) {
                sVar3.f12172i = false;
                sVar = sVar3;
            } else if (sVar5.f12169f == sVar2) {
                sVar5.f12169f = sVar3;
            } else {
                sVar5.f12170g = sVar3;
            }
            sVar3.f12169f = sVar2;
            sVar2.f12168e = sVar3;
        }
        return sVar;
    }

    static s i(s sVar, s sVar2) {
        s sVar3 = sVar2.f12169f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f12170g;
            sVar2.f12169f = sVar4;
            if (sVar4 != null) {
                sVar4.f12168e = sVar2;
            }
            s sVar5 = sVar2.f12168e;
            sVar3.f12168e = sVar5;
            if (sVar5 == null) {
                sVar3.f12172i = false;
                sVar = sVar3;
            } else if (sVar5.f12170g == sVar2) {
                sVar5.f12170g = sVar3;
            } else {
                sVar5.f12169f = sVar3;
            }
            sVar3.f12170g = sVar2;
            sVar2.f12168e = sVar3;
        }
        return sVar;
    }

    static int j(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.m
    public final m a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            m mVar = this.f12166f;
            while (mVar != null) {
                int i11 = this.lockState;
                if ((i11 & 3) == 0) {
                    Unsafe unsafe = f12163h;
                    long j2 = f12164i;
                    if (unsafe.compareAndSwapInt(this, j2, i11, i11 + 4)) {
                        try {
                            s sVar2 = this.f12165e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i10, obj, null);
                            }
                            if (w.a(unsafe, this, j2) == 6 && (thread2 = this.f12167g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th) {
                            if (w.a(f12163h, this, f12164i) == 6 && (thread = this.f12167g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (mVar.f12150a == i10 && ((obj2 = mVar.f12151b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f12152d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s f(int i10, Object obj, Object obj2) {
        int d5;
        int i11;
        s sVar;
        s sVar2 = this.f12165e;
        Class cls = null;
        boolean z10 = false;
        while (true) {
            if (sVar2 == null) {
                s sVar3 = new s(i10, obj, obj2, null, null);
                this.f12165e = sVar3;
                this.f12166f = sVar3;
                break;
            }
            int i12 = sVar2.f12150a;
            if (i12 <= i10) {
                if (i12 >= i10) {
                    Object obj3 = sVar2.f12151b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        break;
                    } else if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d5 = ConcurrentHashMap.d(cls, obj, obj3)) == 0) {
                        if (!z10) {
                            s sVar4 = sVar2.f12169f;
                            if ((sVar4 == null || (r3 = sVar4.b(i10, obj, cls)) == null) && ((sVar = sVar2.f12170g) == null || (r3 = sVar.b(i10, obj, cls)) == null)) {
                                z10 = true;
                            }
                        }
                        i11 = j(obj, obj3);
                    } else {
                        i11 = d5;
                    }
                } else {
                    i11 = 1;
                }
            } else {
                i11 = -1;
            }
            s sVar5 = i11 <= 0 ? sVar2.f12169f : sVar2.f12170g;
            if (sVar5 == null) {
                s sVar6 = this.f12166f;
                s sVar7 = new s(i10, obj, obj2, sVar6, sVar2);
                this.f12166f = sVar7;
                if (sVar6 != null) {
                    sVar6.f12171h = sVar7;
                }
                if (i11 <= 0) {
                    sVar2.f12169f = sVar7;
                } else {
                    sVar2.f12170g = sVar7;
                }
                if (sVar2.f12172i) {
                    e();
                    try {
                        this.f12165e = c(this.f12165e, sVar7);
                    } finally {
                        this.lockState = 0;
                    }
                } else {
                    sVar7.f12172i = true;
                }
            } else {
                sVar2 = sVar5;
            }
        }
        return sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(s sVar) {
        s sVar2;
        s sVar3;
        s sVar4 = (s) sVar.f12152d;
        s sVar5 = sVar.f12171h;
        if (sVar5 == null) {
            this.f12166f = sVar4;
        } else {
            sVar5.f12152d = sVar4;
        }
        if (sVar4 != null) {
            sVar4.f12171h = sVar5;
        }
        if (this.f12166f == null) {
            this.f12165e = null;
            return true;
        }
        s sVar6 = this.f12165e;
        if (sVar6 != null && sVar6.f12170g != null && (sVar2 = sVar6.f12169f) != null && sVar2.f12169f != null) {
            e();
            try {
                s sVar7 = sVar.f12169f;
                s sVar8 = sVar.f12170g;
                if (sVar7 == null || sVar8 == null) {
                    if (sVar7 == null) {
                        if (sVar8 != null) {
                            sVar7 = sVar8;
                        }
                        sVar7 = sVar;
                    }
                    if (sVar7 != sVar) {
                        s sVar9 = sVar.f12168e;
                        sVar7.f12168e = sVar9;
                        if (sVar9 == null) {
                            sVar6 = sVar7;
                        } else if (sVar == sVar9.f12169f) {
                            sVar9.f12169f = sVar7;
                        } else {
                            sVar9.f12170g = sVar7;
                        }
                        sVar.f12168e = null;
                        sVar.f12170g = null;
                        sVar.f12169f = null;
                    }
                    if (!sVar.f12172i) {
                        sVar6 = b(sVar6, sVar7);
                    }
                    this.f12165e = sVar6;
                    if (sVar == sVar7 && (sVar3 = sVar.f12168e) != null) {
                        if (sVar != sVar3.f12169f) {
                            sVar3.f12169f = null;
                        } else if (sVar == sVar3.f12170g) {
                            sVar3.f12170g = null;
                        }
                        sVar.f12168e = null;
                    }
                    return false;
                }
                s sVar10 = sVar8;
                while (true) {
                    s sVar11 = sVar10.f12169f;
                    if (sVar11 == null) {
                        break;
                    }
                    sVar10 = sVar11;
                }
                boolean z10 = sVar10.f12172i;
                sVar10.f12172i = sVar.f12172i;
                sVar.f12172i = z10;
                s sVar12 = sVar10.f12170g;
                s sVar13 = sVar.f12168e;
                if (sVar10 == sVar8) {
                    sVar.f12168e = sVar10;
                    sVar10.f12170g = sVar;
                } else {
                    s sVar14 = sVar10.f12168e;
                    sVar.f12168e = sVar14;
                    if (sVar14 != null) {
                        if (sVar10 == sVar14.f12169f) {
                            sVar14.f12169f = sVar;
                        } else {
                            sVar14.f12170g = sVar;
                        }
                    }
                    sVar10.f12170g = sVar8;
                    sVar8.f12168e = sVar10;
                }
                sVar.f12169f = null;
                sVar.f12170g = sVar12;
                if (sVar12 != null) {
                    sVar12.f12168e = sVar;
                }
                sVar10.f12169f = sVar7;
                sVar7.f12168e = sVar10;
                sVar10.f12168e = sVar13;
                if (sVar13 == null) {
                    sVar6 = sVar10;
                } else if (sVar == sVar13.f12169f) {
                    sVar13.f12169f = sVar10;
                } else {
                    sVar13.f12170g = sVar10;
                }
                if (sVar12 != null) {
                    sVar7 = sVar12;
                    if (sVar7 != sVar) {
                    }
                    if (!sVar.f12172i) {
                    }
                    this.f12165e = sVar6;
                    if (sVar == sVar7) {
                        if (sVar != sVar3.f12169f) {
                        }
                        sVar.f12168e = null;
                    }
                    return false;
                }
                sVar7 = sVar;
                if (sVar7 != sVar) {
                }
                if (!sVar.f12172i) {
                }
                this.f12165e = sVar6;
                if (sVar == sVar7) {
                }
                return false;
            } finally {
                this.lockState = 0;
            }
        }
        return true;
    }
}

package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f15487a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15488b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f15489d;

    /* renamed from: g  reason: collision with root package name */
    public static final r f15486g = new r("REMOVE_FROZEN");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15484e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15485f = AtomicLongFieldUpdater.newUpdater(j.class, "_state");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f15490a;

        public a(int i10) {
            this.f15490a = i10;
        }
    }

    public j(int i10, boolean z10) {
        this.f15487a = i10;
        this.f15488b = z10;
        int i11 = i10 - 1;
        this.c = i11;
        this.f15489d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(E e10) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                if ((2305843009213693952L & j2) == 0) {
                    return 1;
                }
                return 2;
            }
            int i10 = (int) ((1073741823 & j2) >> 0);
            int i11 = (int) ((1152921503533105152L & j2) >> 30);
            int i12 = this.c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f15488b && this.f15489d.get(i11 & i12) != null) {
                int i13 = this.f15487a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    break;
                }
            } else if (f15485f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i11 + 1) & 1073741823) << 30))) {
                this.f15489d.set(i11 & i12, e10);
                j<E> jVar = this;
                while ((jVar._state & 1152921504606846976L) != 0) {
                    jVar = jVar.e();
                    AtomicReferenceArray atomicReferenceArray = jVar.f15489d;
                    int i14 = jVar.c & i11;
                    Object obj = atomicReferenceArray.get(i14);
                    if ((obj instanceof a) && ((a) obj).f15490a == i11) {
                        atomicReferenceArray.set(i14, e10);
                        continue;
                    } else {
                        jVar = null;
                        continue;
                    }
                    if (jVar == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
            if (f15485f.compareAndSet(this, j2, j2 | 2305843009213693952L)) {
                return true;
            }
        }
    }

    public final int c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<E> e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) == 0) {
                long j10 = j2 | 1152921504606846976L;
                if (f15485f.compareAndSet(this, j2, j10)) {
                    j2 = j10;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            j<E> jVar = (j) this._next;
            if (jVar != null) {
                return jVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15484e;
            j jVar2 = new j(this.f15487a * 2, this.f15488b);
            int i10 = (int) ((1073741823 & j2) >> 0);
            int i11 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i12 = this.c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f15489d.get(i13);
                if (obj == null) {
                    obj = new a(i10);
                }
                jVar2.f15489d.set(jVar2.c & i10, obj);
                i10++;
            }
            jVar2._state = (-1152921504606846977L) & j2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f15486g;
            }
            int i10 = (int) ((j2 & 1073741823) >> 0);
            int i11 = this.c;
            int i12 = ((int) ((1152921503533105152L & j2) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f15489d.get(i13);
            if (obj == null) {
                if (this.f15488b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j10 = ((i10 + 1) & 1073741823) << 0;
                if (f15485f.compareAndSet(this, j2, (j2 & (-1073741824)) | j10)) {
                    this.f15489d.set(this.c & i10, null);
                    return obj;
                } else if (this.f15488b) {
                    j<E> jVar = this;
                    while (true) {
                        long j11 = jVar._state;
                        int i14 = (int) ((j11 & 1073741823) >> 0);
                        if ((j11 & 1152921504606846976L) != 0) {
                            jVar = jVar.e();
                        } else {
                            if (f15485f.compareAndSet(jVar, j11, (j11 & (-1073741824)) | j10)) {
                                jVar.f15489d.set(jVar.c & i14, null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

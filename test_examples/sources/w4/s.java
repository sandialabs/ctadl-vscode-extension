package w4;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f18334a;

    /* renamed from: b  reason: collision with root package name */
    public WorkInfo$State f18335b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public String f18336d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.work.b f18337e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.work.b f18338f;

    /* renamed from: g  reason: collision with root package name */
    public long f18339g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18340h;

    /* renamed from: i  reason: collision with root package name */
    public final long f18341i;

    /* renamed from: j  reason: collision with root package name */
    public final n4.b f18342j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18343k;

    /* renamed from: l  reason: collision with root package name */
    public final BackoffPolicy f18344l;

    /* renamed from: m  reason: collision with root package name */
    public final long f18345m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public final long f18346o;

    /* renamed from: p  reason: collision with root package name */
    public final long f18347p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18348q;

    /* renamed from: r  reason: collision with root package name */
    public final OutOfQuotaPolicy f18349r;

    /* renamed from: s  reason: collision with root package name */
    public final int f18350s;

    /* renamed from: t  reason: collision with root package name */
    public final int f18351t;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18352a;

        /* renamed from: b  reason: collision with root package name */
        public final WorkInfo$State f18353b;

        public a(WorkInfo$State workInfo$State, String str) {
            v7.g.f(str, "id");
            this.f18352a = str;
            this.f18353b = workInfo$State;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(this.f18352a, aVar.f18352a) && this.f18353b == aVar.f18353b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f18353b.hashCode() + (this.f18352a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f18352a + ", state=" + this.f18353b + ')';
        }
    }

    static {
        v7.g.e(n4.g.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public s(String str, WorkInfo$State workInfo$State, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j2, long j10, long j11, n4.b bVar3, int i10, BackoffPolicy backoffPolicy, long j12, long j13, long j14, long j15, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12) {
        v7.g.f(str, "id");
        v7.g.f(workInfo$State, "state");
        v7.g.f(str2, "workerClassName");
        v7.g.f(bVar, "input");
        v7.g.f(bVar2, "output");
        v7.g.f(bVar3, "constraints");
        v7.g.f(backoffPolicy, "backoffPolicy");
        v7.g.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f18334a = str;
        this.f18335b = workInfo$State;
        this.c = str2;
        this.f18336d = str3;
        this.f18337e = bVar;
        this.f18338f = bVar2;
        this.f18339g = j2;
        this.f18340h = j10;
        this.f18341i = j11;
        this.f18342j = bVar3;
        this.f18343k = i10;
        this.f18344l = backoffPolicy;
        this.f18345m = j12;
        this.n = j13;
        this.f18346o = j14;
        this.f18347p = j15;
        this.f18348q = z10;
        this.f18349r = outOfQuotaPolicy;
        this.f18350s = i11;
        this.f18351t = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ s(String str, WorkInfo$State workInfo$State, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j2, long j10, long j11, n4.b bVar3, int i10, BackoffPolicy backoffPolicy, long j12, long j13, long j14, long j15, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, int i13) {
        this(str, r4, str2, r6, r7, r8, (i12 & 64) != 0 ? 0L : j2, (i12 & 128) != 0 ? 0L : j10, (i12 & 256) != 0 ? 0L : j11, (i12 & 512) != 0 ? n4.b.f16075i : bVar3, (i12 & 1024) != 0 ? 0 : i10, (i12 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i12 & 4096) != 0 ? 30000L : j12, (i12 & 8192) != 0 ? 0L : j13, (i12 & 16384) != 0 ? 0L : j14, (32768 & i12) != 0 ? -1L : j15, (65536 & i12) != 0 ? false : z10, (131072 & i12) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (i12 & 262144) != 0 ? 0 : i11, 0);
        androidx.work.b bVar4;
        androidx.work.b bVar5;
        WorkInfo$State workInfo$State2 = (i12 & 2) != 0 ? WorkInfo$State.ENQUEUED : workInfo$State;
        String str4 = (i12 & 8) != 0 ? null : str3;
        if ((i12 & 16) != 0) {
            androidx.work.b bVar6 = androidx.work.b.c;
            v7.g.e(bVar6, "EMPTY");
            bVar4 = bVar6;
        } else {
            bVar4 = bVar;
        }
        if ((i12 & 32) != 0) {
            androidx.work.b bVar7 = androidx.work.b.c;
            v7.g.e(bVar7, "EMPTY");
            bVar5 = bVar7;
        } else {
            bVar5 = bVar2;
        }
    }

    public final long a() {
        boolean z10;
        long scalb;
        WorkInfo$State workInfo$State = this.f18335b;
        WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
        int i10 = this.f18343k;
        boolean z11 = false;
        if (workInfo$State == workInfo$State2 && i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f18344l == BackoffPolicy.LINEAR) {
                z11 = true;
            }
            long j2 = this.f18345m;
            if (z11) {
                scalb = j2 * i10;
            } else {
                scalb = Math.scalb((float) j2, i10 - 1);
            }
            long j10 = this.n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j10 + scalb;
        }
        long j11 = 0;
        if (c()) {
            long j12 = this.n;
            int i11 = this.f18350s;
            if (i11 == 0) {
                j12 += this.f18339g;
            }
            long j13 = this.f18341i;
            long j14 = this.f18340h;
            if (j13 != j14) {
                z11 = true;
            }
            if (z11) {
                if (i11 == 0) {
                    j11 = (-1) * j13;
                }
                j12 += j14;
            } else if (i11 != 0) {
                j11 = j14;
            }
            return j12 + j11;
        }
        long j15 = this.n;
        if (j15 == 0) {
            j15 = System.currentTimeMillis();
        }
        return j15 + this.f18339g;
    }

    public final boolean b() {
        return !v7.g.a(n4.b.f16075i, this.f18342j);
    }

    public final boolean c() {
        return this.f18340h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return v7.g.a(this.f18334a, sVar.f18334a) && this.f18335b == sVar.f18335b && v7.g.a(this.c, sVar.c) && v7.g.a(this.f18336d, sVar.f18336d) && v7.g.a(this.f18337e, sVar.f18337e) && v7.g.a(this.f18338f, sVar.f18338f) && this.f18339g == sVar.f18339g && this.f18340h == sVar.f18340h && this.f18341i == sVar.f18341i && v7.g.a(this.f18342j, sVar.f18342j) && this.f18343k == sVar.f18343k && this.f18344l == sVar.f18344l && this.f18345m == sVar.f18345m && this.n == sVar.n && this.f18346o == sVar.f18346o && this.f18347p == sVar.f18347p && this.f18348q == sVar.f18348q && this.f18349r == sVar.f18349r && this.f18350s == sVar.f18350s && this.f18351t == sVar.f18351t;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f18335b.hashCode();
        int g10 = a4.b.g(this.c, (hashCode2 + (this.f18334a.hashCode() * 31)) * 31, 31);
        String str = this.f18336d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f18337e.hashCode();
        int hashCode4 = this.f18338f.hashCode();
        long j2 = this.f18339g;
        long j10 = this.f18340h;
        long j11 = this.f18341i;
        int hashCode5 = this.f18342j.hashCode();
        int hashCode6 = this.f18344l.hashCode();
        long j12 = this.f18345m;
        long j13 = this.n;
        long j14 = this.f18346o;
        long j15 = this.f18347p;
        int i10 = (((((((((hashCode6 + ((((hashCode5 + ((((((((hashCode4 + ((hashCode3 + ((g10 + hashCode) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f18343k) * 31)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        boolean z10 = this.f18348q;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return ((((this.f18349r.hashCode() + ((i10 + i11) * 31)) * 31) + this.f18350s) * 31) + this.f18351t;
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("{WorkSpec: "), this.f18334a, '}');
    }
}

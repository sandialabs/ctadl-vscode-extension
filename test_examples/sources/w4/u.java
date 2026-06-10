package w4;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import w4.s;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18354a;

    /* renamed from: b  reason: collision with root package name */
    public final e f18355b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final h f18356d;

    /* renamed from: e  reason: collision with root package name */
    public final i f18357e;

    /* renamed from: f  reason: collision with root package name */
    public final j f18358f;

    /* renamed from: g  reason: collision with root package name */
    public final k f18359g;

    /* renamed from: h  reason: collision with root package name */
    public final l f18360h;

    /* renamed from: i  reason: collision with root package name */
    public final m f18361i;

    /* renamed from: j  reason: collision with root package name */
    public final a f18362j;

    /* renamed from: k  reason: collision with root package name */
    public final b f18363k;

    /* loaded from: classes.dex */
    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* loaded from: classes.dex */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends y3.c {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase, 1);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            int i10;
            s sVar = (s) obj;
            String str = sVar.f18334a;
            int i11 = 1;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            fVar.r(v8.b.I(sVar.f18335b), 2);
            String str2 = sVar.c;
            if (str2 == null) {
                fVar.o(3);
            } else {
                fVar.F(str2, 3);
            }
            String str3 = sVar.f18336d;
            if (str3 == null) {
                fVar.o(4);
            } else {
                fVar.F(str3, 4);
            }
            byte[] b5 = androidx.work.b.b(sVar.f18337e);
            if (b5 == null) {
                fVar.o(5);
            } else {
                fVar.E(5, b5);
            }
            byte[] b10 = androidx.work.b.b(sVar.f18338f);
            if (b10 == null) {
                fVar.o(6);
            } else {
                fVar.E(6, b10);
            }
            fVar.r(sVar.f18339g, 7);
            fVar.r(sVar.f18340h, 8);
            fVar.r(sVar.f18341i, 9);
            fVar.r(sVar.f18343k, 10);
            BackoffPolicy backoffPolicy = sVar.f18344l;
            v7.g.f(backoffPolicy, "backoffPolicy");
            int ordinal = backoffPolicy.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i10 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 0;
            }
            fVar.r(i10, 11);
            fVar.r(sVar.f18345m, 12);
            fVar.r(sVar.n, 13);
            fVar.r(sVar.f18346o, 14);
            fVar.r(sVar.f18347p, 15);
            fVar.r(sVar.f18348q ? 1L : 0L, 16);
            OutOfQuotaPolicy outOfQuotaPolicy = sVar.f18349r;
            v7.g.f(outOfQuotaPolicy, "policy");
            int ordinal2 = outOfQuotaPolicy.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0;
            }
            fVar.r(i11, 17);
            fVar.r(sVar.f18350s, 18);
            fVar.r(sVar.f18351t, 19);
            n4.b bVar = sVar.f18342j;
            if (bVar != null) {
                fVar.r(v8.b.z(bVar.f16076a), 20);
                fVar.r(bVar.f16077b ? 1L : 0L, 21);
                fVar.r(bVar.c ? 1L : 0L, 22);
                fVar.r(bVar.f16078d ? 1L : 0L, 23);
                fVar.r(bVar.f16079e ? 1L : 0L, 24);
                fVar.r(bVar.f16080f, 25);
                fVar.r(bVar.f16081g, 26);
                fVar.E(27, v8.b.G(bVar.f16082h));
                return;
            }
            fVar.o(20);
            fVar.o(21);
            fVar.o(22);
            fVar.o(23);
            fVar.o(24);
            fVar.o(25);
            fVar.o(26);
            fVar.o(27);
        }
    }

    /* loaded from: classes.dex */
    public class f extends y3.c {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase, 0);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // y3.c
        public final void e(c4.f fVar, Object obj) {
            int i10;
            s sVar = (s) obj;
            String str = sVar.f18334a;
            int i11 = 1;
            if (str == null) {
                fVar.o(1);
            } else {
                fVar.F(str, 1);
            }
            fVar.r(v8.b.I(sVar.f18335b), 2);
            String str2 = sVar.c;
            if (str2 == null) {
                fVar.o(3);
            } else {
                fVar.F(str2, 3);
            }
            String str3 = sVar.f18336d;
            if (str3 == null) {
                fVar.o(4);
            } else {
                fVar.F(str3, 4);
            }
            byte[] b5 = androidx.work.b.b(sVar.f18337e);
            if (b5 == null) {
                fVar.o(5);
            } else {
                fVar.E(5, b5);
            }
            byte[] b10 = androidx.work.b.b(sVar.f18338f);
            if (b10 == null) {
                fVar.o(6);
            } else {
                fVar.E(6, b10);
            }
            fVar.r(sVar.f18339g, 7);
            fVar.r(sVar.f18340h, 8);
            fVar.r(sVar.f18341i, 9);
            fVar.r(sVar.f18343k, 10);
            BackoffPolicy backoffPolicy = sVar.f18344l;
            v7.g.f(backoffPolicy, "backoffPolicy");
            int ordinal = backoffPolicy.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i10 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 0;
            }
            fVar.r(i10, 11);
            fVar.r(sVar.f18345m, 12);
            fVar.r(sVar.n, 13);
            fVar.r(sVar.f18346o, 14);
            fVar.r(sVar.f18347p, 15);
            fVar.r(sVar.f18348q ? 1L : 0L, 16);
            OutOfQuotaPolicy outOfQuotaPolicy = sVar.f18349r;
            v7.g.f(outOfQuotaPolicy, "policy");
            int ordinal2 = outOfQuotaPolicy.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0;
            }
            fVar.r(i11, 17);
            fVar.r(sVar.f18350s, 18);
            fVar.r(sVar.f18351t, 19);
            n4.b bVar = sVar.f18342j;
            if (bVar != null) {
                fVar.r(v8.b.z(bVar.f16076a), 20);
                fVar.r(bVar.f16077b ? 1L : 0L, 21);
                fVar.r(bVar.c ? 1L : 0L, 22);
                fVar.r(bVar.f16078d ? 1L : 0L, 23);
                fVar.r(bVar.f16079e ? 1L : 0L, 24);
                fVar.r(bVar.f16080f, 25);
                fVar.r(bVar.f16081g, 26);
                fVar.E(27, v8.b.G(bVar.f16082h));
            } else {
                fVar.o(20);
                fVar.o(21);
                fVar.o(22);
                fVar.o(23);
                fVar.o(24);
                fVar.o(25);
                fVar.o(26);
                fVar.o(27);
            }
            String str4 = sVar.f18334a;
            if (str4 == null) {
                fVar.o(28);
            } else {
                fVar.F(str4, 28);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends SharedSQLiteStatement {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class i extends SharedSQLiteStatement {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class j extends SharedSQLiteStatement {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class k extends SharedSQLiteStatement {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class l extends SharedSQLiteStatement {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class m extends SharedSQLiteStatement {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.f18354a = roomDatabase;
        this.f18355b = new e(roomDatabase);
        new f(roomDatabase);
        this.c = new g(roomDatabase);
        this.f18356d = new h(roomDatabase);
        this.f18357e = new i(roomDatabase);
        this.f18358f = new j(roomDatabase);
        this.f18359g = new k(roomDatabase);
        this.f18360h = new l(roomDatabase);
        this.f18361i = new m(roomDatabase);
        this.f18362j = new a(roomDatabase);
        this.f18363k = new b(roomDatabase);
        new c(roomDatabase);
        new d(roomDatabase);
    }

    @Override // w4.t
    public final void a(String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        g gVar = this.c;
        c4.f a10 = gVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            gVar.d(a10);
        }
    }

    @Override // w4.t
    public final ArrayList b() {
        y3.m mVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE state=1", 0);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                int i15 = U14;
                ArrayList arrayList = new ArrayList(B.getCount());
                while (B.moveToNext()) {
                    byte[] bArr = null;
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j2 = B.getLong(U7);
                    long j10 = B.getLong(U8);
                    long j11 = B.getLong(U9);
                    int i16 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j12 = B.getLong(U12);
                    long j13 = B.getLong(U13);
                    int i17 = i15;
                    long j14 = B.getLong(i17);
                    int i18 = U;
                    int i19 = U15;
                    long j15 = B.getLong(i19);
                    U15 = i19;
                    int i20 = U16;
                    if (B.getInt(i20) != 0) {
                        U16 = i20;
                        i10 = U17;
                        z10 = true;
                    } else {
                        U16 = i20;
                        i10 = U17;
                        z10 = false;
                    }
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i10));
                    U17 = i10;
                    int i21 = U18;
                    int i22 = B.getInt(i21);
                    U18 = i21;
                    int i23 = U19;
                    int i24 = B.getInt(i23);
                    U19 = i23;
                    int i25 = U20;
                    NetworkType v3 = v8.b.v(B.getInt(i25));
                    U20 = i25;
                    int i26 = U21;
                    if (B.getInt(i26) != 0) {
                        U21 = i26;
                        i11 = U22;
                        z11 = true;
                    } else {
                        U21 = i26;
                        i11 = U22;
                        z11 = false;
                    }
                    if (B.getInt(i11) != 0) {
                        U22 = i11;
                        i12 = U23;
                        z12 = true;
                    } else {
                        U22 = i11;
                        i12 = U23;
                        z12 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        U23 = i12;
                        i13 = U24;
                        z13 = true;
                    } else {
                        U23 = i12;
                        i13 = U24;
                        z13 = false;
                    }
                    if (B.getInt(i13) != 0) {
                        U24 = i13;
                        i14 = U25;
                        z14 = true;
                    } else {
                        U24 = i13;
                        i14 = U25;
                        z14 = false;
                    }
                    long j16 = B.getLong(i14);
                    U25 = i14;
                    int i27 = U26;
                    long j17 = B.getLong(i27);
                    U26 = i27;
                    int i28 = U27;
                    if (!B.isNull(i28)) {
                        bArr = B.getBlob(i28);
                    }
                    U27 = i28;
                    arrayList.add(new s(string, x3, string2, string3, a10, a11, j2, j10, j11, new n4.b(v3, z11, z12, z13, z14, j16, j17, v8.b.j(bArr)), i16, u10, j12, j13, j14, j15, z10, w10, i22, i24));
                    U = i18;
                    i15 = i17;
                }
                B.close();
                mVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final ArrayList c() {
        y3.m mVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        c10.r(200, 1);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                int i15 = U14;
                ArrayList arrayList = new ArrayList(B.getCount());
                while (B.moveToNext()) {
                    byte[] bArr = null;
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j2 = B.getLong(U7);
                    long j10 = B.getLong(U8);
                    long j11 = B.getLong(U9);
                    int i16 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j12 = B.getLong(U12);
                    long j13 = B.getLong(U13);
                    int i17 = i15;
                    long j14 = B.getLong(i17);
                    int i18 = U;
                    int i19 = U15;
                    long j15 = B.getLong(i19);
                    U15 = i19;
                    int i20 = U16;
                    if (B.getInt(i20) != 0) {
                        U16 = i20;
                        i10 = U17;
                        z10 = true;
                    } else {
                        U16 = i20;
                        i10 = U17;
                        z10 = false;
                    }
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i10));
                    U17 = i10;
                    int i21 = U18;
                    int i22 = B.getInt(i21);
                    U18 = i21;
                    int i23 = U19;
                    int i24 = B.getInt(i23);
                    U19 = i23;
                    int i25 = U20;
                    NetworkType v3 = v8.b.v(B.getInt(i25));
                    U20 = i25;
                    int i26 = U21;
                    if (B.getInt(i26) != 0) {
                        U21 = i26;
                        i11 = U22;
                        z11 = true;
                    } else {
                        U21 = i26;
                        i11 = U22;
                        z11 = false;
                    }
                    if (B.getInt(i11) != 0) {
                        U22 = i11;
                        i12 = U23;
                        z12 = true;
                    } else {
                        U22 = i11;
                        i12 = U23;
                        z12 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        U23 = i12;
                        i13 = U24;
                        z13 = true;
                    } else {
                        U23 = i12;
                        i13 = U24;
                        z13 = false;
                    }
                    if (B.getInt(i13) != 0) {
                        U24 = i13;
                        i14 = U25;
                        z14 = true;
                    } else {
                        U24 = i13;
                        i14 = U25;
                        z14 = false;
                    }
                    long j16 = B.getLong(i14);
                    U25 = i14;
                    int i27 = U26;
                    long j17 = B.getLong(i27);
                    U26 = i27;
                    int i28 = U27;
                    if (!B.isNull(i28)) {
                        bArr = B.getBlob(i28);
                    }
                    U27 = i28;
                    arrayList.add(new s(string, x3, string2, string3, a10, a11, j2, j10, j11, new n4.b(v3, z11, z12, z13, z14, j16, j17, v8.b.j(bArr)), i16, u10, j12, j13, j14, j15, z10, w10, i22, i24));
                    U = i18;
                    i15 = i17;
                }
                B.close();
                mVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final void d(String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        i iVar = this.f18357e;
        c4.f a10 = iVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            iVar.d(a10);
        }
    }

    @Override // w4.t
    public final boolean e() {
        boolean z10 = false;
        y3.m c10 = y3.m.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            if (B.moveToFirst()) {
                if (B.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final ArrayList f(String str) {
        y3.m c10 = y3.m.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(B.isNull(0) ? null : B.getString(0));
            }
            return arrayList;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final int g(long j2, String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        a aVar = this.f18362j;
        c4.f a10 = aVar.a();
        a10.r(j2, 1);
        if (str == null) {
            a10.o(2);
        } else {
            a10.F(str, 2);
        }
        roomDatabase.c();
        try {
            int k3 = a10.k();
            roomDatabase.p();
            return k3;
        } finally {
            roomDatabase.k();
            aVar.d(a10);
        }
    }

    @Override // w4.t
    public final ArrayList h(String str) {
        y3.m c10 = y3.m.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(new s.a(v8.b.x(B.getInt(1)), B.isNull(0) ? null : B.getString(0)));
            }
            return arrayList;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final ArrayList i(long j2) {
        y3.m mVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        c10.r(j2, 1);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                int i14 = U14;
                ArrayList arrayList = new ArrayList(B.getCount());
                while (B.moveToNext()) {
                    byte[] bArr = null;
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j10 = B.getLong(U7);
                    long j11 = B.getLong(U8);
                    long j12 = B.getLong(U9);
                    int i15 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j13 = B.getLong(U12);
                    long j14 = B.getLong(U13);
                    int i16 = i14;
                    long j15 = B.getLong(i16);
                    int i17 = U;
                    int i18 = U15;
                    long j16 = B.getLong(i18);
                    U15 = i18;
                    int i19 = U16;
                    int i20 = B.getInt(i19);
                    U16 = i19;
                    int i21 = U17;
                    boolean z14 = i20 != 0;
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i21));
                    U17 = i21;
                    int i22 = U18;
                    int i23 = B.getInt(i22);
                    U18 = i22;
                    int i24 = U19;
                    int i25 = B.getInt(i24);
                    U19 = i24;
                    int i26 = U20;
                    NetworkType v3 = v8.b.v(B.getInt(i26));
                    U20 = i26;
                    int i27 = U21;
                    if (B.getInt(i27) != 0) {
                        U21 = i27;
                        i10 = U22;
                        z10 = true;
                    } else {
                        U21 = i27;
                        i10 = U22;
                        z10 = false;
                    }
                    if (B.getInt(i10) != 0) {
                        U22 = i10;
                        i11 = U23;
                        z11 = true;
                    } else {
                        U22 = i10;
                        i11 = U23;
                        z11 = false;
                    }
                    if (B.getInt(i11) != 0) {
                        U23 = i11;
                        i12 = U24;
                        z12 = true;
                    } else {
                        U23 = i11;
                        i12 = U24;
                        z12 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        U24 = i12;
                        i13 = U25;
                        z13 = true;
                    } else {
                        U24 = i12;
                        i13 = U25;
                        z13 = false;
                    }
                    long j17 = B.getLong(i13);
                    U25 = i13;
                    int i28 = U26;
                    long j18 = B.getLong(i28);
                    U26 = i28;
                    int i29 = U27;
                    if (!B.isNull(i29)) {
                        bArr = B.getBlob(i29);
                    }
                    U27 = i29;
                    arrayList.add(new s(string, x3, string2, string3, a10, a11, j10, j11, j12, new n4.b(v3, z10, z11, z12, z13, j17, j18, v8.b.j(bArr)), i15, u10, j13, j14, j15, j16, z14, w10, i23, i25));
                    U = i17;
                    i14 = i16;
                }
                B.close();
                mVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final WorkInfo$State j(String str) {
        y3.m c10 = y3.m.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            WorkInfo$State workInfo$State = null;
            if (B.moveToFirst()) {
                Integer valueOf = B.isNull(0) ? null : Integer.valueOf(B.getInt(0));
                if (valueOf != null) {
                    workInfo$State = v8.b.x(valueOf.intValue());
                }
            }
            return workInfo$State;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final ArrayList k(int i10) {
        y3.m mVar;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c10.r(i10, 1);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                int i16 = U14;
                ArrayList arrayList = new ArrayList(B.getCount());
                while (B.moveToNext()) {
                    byte[] bArr = null;
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j2 = B.getLong(U7);
                    long j10 = B.getLong(U8);
                    long j11 = B.getLong(U9);
                    int i17 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j12 = B.getLong(U12);
                    long j13 = B.getLong(U13);
                    int i18 = i16;
                    long j14 = B.getLong(i18);
                    int i19 = U;
                    int i20 = U15;
                    long j15 = B.getLong(i20);
                    U15 = i20;
                    int i21 = U16;
                    if (B.getInt(i21) != 0) {
                        U16 = i21;
                        i11 = U17;
                        z10 = true;
                    } else {
                        U16 = i21;
                        i11 = U17;
                        z10 = false;
                    }
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i11));
                    U17 = i11;
                    int i22 = U18;
                    int i23 = B.getInt(i22);
                    U18 = i22;
                    int i24 = U19;
                    int i25 = B.getInt(i24);
                    U19 = i24;
                    int i26 = U20;
                    NetworkType v3 = v8.b.v(B.getInt(i26));
                    U20 = i26;
                    int i27 = U21;
                    if (B.getInt(i27) != 0) {
                        U21 = i27;
                        i12 = U22;
                        z11 = true;
                    } else {
                        U21 = i27;
                        i12 = U22;
                        z11 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        U22 = i12;
                        i13 = U23;
                        z12 = true;
                    } else {
                        U22 = i12;
                        i13 = U23;
                        z12 = false;
                    }
                    if (B.getInt(i13) != 0) {
                        U23 = i13;
                        i14 = U24;
                        z13 = true;
                    } else {
                        U23 = i13;
                        i14 = U24;
                        z13 = false;
                    }
                    if (B.getInt(i14) != 0) {
                        U24 = i14;
                        i15 = U25;
                        z14 = true;
                    } else {
                        U24 = i14;
                        i15 = U25;
                        z14 = false;
                    }
                    long j16 = B.getLong(i15);
                    U25 = i15;
                    int i28 = U26;
                    long j17 = B.getLong(i28);
                    U26 = i28;
                    int i29 = U27;
                    if (!B.isNull(i29)) {
                        bArr = B.getBlob(i29);
                    }
                    U27 = i29;
                    arrayList.add(new s(string, x3, string2, string3, a10, a11, j2, j10, j11, new n4.b(v3, z11, z12, z13, z14, j16, j17, v8.b.j(bArr)), i17, u10, j12, j13, j14, j15, z10, w10, i23, i25));
                    U = i19;
                    i16 = i18;
                }
                B.close();
                mVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final s l(String str) {
        y3.m mVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                s sVar = null;
                byte[] blob = null;
                if (B.moveToFirst()) {
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j2 = B.getLong(U7);
                    long j10 = B.getLong(U8);
                    long j11 = B.getLong(U9);
                    int i15 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j12 = B.getLong(U12);
                    long j13 = B.getLong(U13);
                    long j14 = B.getLong(U14);
                    long j15 = B.getLong(U15);
                    if (B.getInt(U16) != 0) {
                        i10 = U17;
                        z10 = true;
                    } else {
                        i10 = U17;
                        z10 = false;
                    }
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i10));
                    int i16 = B.getInt(U18);
                    int i17 = B.getInt(U19);
                    NetworkType v3 = v8.b.v(B.getInt(U20));
                    if (B.getInt(U21) != 0) {
                        i11 = U22;
                        z11 = true;
                    } else {
                        i11 = U22;
                        z11 = false;
                    }
                    if (B.getInt(i11) != 0) {
                        i12 = U23;
                        z12 = true;
                    } else {
                        i12 = U23;
                        z12 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        i13 = U24;
                        z13 = true;
                    } else {
                        i13 = U24;
                        z13 = false;
                    }
                    if (B.getInt(i13) != 0) {
                        i14 = U25;
                        z14 = true;
                    } else {
                        i14 = U25;
                        z14 = false;
                    }
                    long j16 = B.getLong(i14);
                    long j17 = B.getLong(U26);
                    if (!B.isNull(U27)) {
                        blob = B.getBlob(U27);
                    }
                    sVar = new s(string, x3, string2, string3, a10, a11, j2, j10, j11, new n4.b(v3, z11, z12, z13, z14, j16, j17, v8.b.j(blob)), i15, u10, j12, j13, j14, j15, z10, w10, i16, i17);
                }
                B.close();
                mVar.h();
                return sVar;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final int m(String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        m mVar = this.f18361i;
        c4.f a10 = mVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        roomDatabase.c();
        try {
            int k3 = a10.k();
            roomDatabase.p();
            return k3;
        } finally {
            roomDatabase.k();
            mVar.d(a10);
        }
    }

    @Override // w4.t
    public final void n(s sVar) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f18355b.g(sVar);
            roomDatabase.p();
        } finally {
            roomDatabase.k();
        }
    }

    @Override // w4.t
    public final int o(WorkInfo$State workInfo$State, String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        h hVar = this.f18356d;
        c4.f a10 = hVar.a();
        a10.r(v8.b.I(workInfo$State), 1);
        if (str == null) {
            a10.o(2);
        } else {
            a10.F(str, 2);
        }
        roomDatabase.c();
        try {
            int k3 = a10.k();
            roomDatabase.p();
            return k3;
        } finally {
            roomDatabase.k();
            hVar.d(a10);
        }
    }

    @Override // w4.t
    public final ArrayList p(String str) {
        y3.m c10 = y3.m.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(B.isNull(0) ? null : B.getString(0));
            }
            return arrayList;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final ArrayList q(String str) {
        y3.m c10 = y3.m.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c10.o(1);
        } else {
            c10.F(str, 1);
        }
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(androidx.work.b.a(B.isNull(0) ? null : B.getBlob(0)));
            }
            return arrayList;
        } finally {
            B.close();
            c10.h();
        }
    }

    @Override // w4.t
    public final int r(String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        l lVar = this.f18360h;
        c4.f a10 = lVar.a();
        if (str == null) {
            a10.o(1);
        } else {
            a10.F(str, 1);
        }
        roomDatabase.c();
        try {
            int k3 = a10.k();
            roomDatabase.p();
            return k3;
        } finally {
            roomDatabase.k();
            lVar.d(a10);
        }
    }

    @Override // w4.t
    public final ArrayList s() {
        y3.m mVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        y3.m c10 = y3.m.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        Cursor B = v8.b.B(roomDatabase, c10);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "state");
            int U3 = a1.b.U(B, "worker_class_name");
            int U4 = a1.b.U(B, "input_merger_class_name");
            int U5 = a1.b.U(B, "input");
            int U6 = a1.b.U(B, "output");
            int U7 = a1.b.U(B, "initial_delay");
            int U8 = a1.b.U(B, "interval_duration");
            int U9 = a1.b.U(B, "flex_duration");
            int U10 = a1.b.U(B, "run_attempt_count");
            int U11 = a1.b.U(B, "backoff_policy");
            int U12 = a1.b.U(B, "backoff_delay_duration");
            int U13 = a1.b.U(B, "last_enqueue_time");
            int U14 = a1.b.U(B, "minimum_retention_duration");
            mVar = c10;
            try {
                int U15 = a1.b.U(B, "schedule_requested_at");
                int U16 = a1.b.U(B, "run_in_foreground");
                int U17 = a1.b.U(B, "out_of_quota_policy");
                int U18 = a1.b.U(B, "period_count");
                int U19 = a1.b.U(B, "generation");
                int U20 = a1.b.U(B, "required_network_type");
                int U21 = a1.b.U(B, "requires_charging");
                int U22 = a1.b.U(B, "requires_device_idle");
                int U23 = a1.b.U(B, "requires_battery_not_low");
                int U24 = a1.b.U(B, "requires_storage_not_low");
                int U25 = a1.b.U(B, "trigger_content_update_delay");
                int U26 = a1.b.U(B, "trigger_max_content_delay");
                int U27 = a1.b.U(B, "content_uri_triggers");
                int i15 = U14;
                ArrayList arrayList = new ArrayList(B.getCount());
                while (B.moveToNext()) {
                    byte[] bArr = null;
                    String string = B.isNull(U) ? null : B.getString(U);
                    WorkInfo$State x3 = v8.b.x(B.getInt(U2));
                    String string2 = B.isNull(U3) ? null : B.getString(U3);
                    String string3 = B.isNull(U4) ? null : B.getString(U4);
                    androidx.work.b a10 = androidx.work.b.a(B.isNull(U5) ? null : B.getBlob(U5));
                    androidx.work.b a11 = androidx.work.b.a(B.isNull(U6) ? null : B.getBlob(U6));
                    long j2 = B.getLong(U7);
                    long j10 = B.getLong(U8);
                    long j11 = B.getLong(U9);
                    int i16 = B.getInt(U10);
                    BackoffPolicy u10 = v8.b.u(B.getInt(U11));
                    long j12 = B.getLong(U12);
                    long j13 = B.getLong(U13);
                    int i17 = i15;
                    long j14 = B.getLong(i17);
                    int i18 = U;
                    int i19 = U15;
                    long j15 = B.getLong(i19);
                    U15 = i19;
                    int i20 = U16;
                    if (B.getInt(i20) != 0) {
                        U16 = i20;
                        i10 = U17;
                        z10 = true;
                    } else {
                        U16 = i20;
                        i10 = U17;
                        z10 = false;
                    }
                    OutOfQuotaPolicy w10 = v8.b.w(B.getInt(i10));
                    U17 = i10;
                    int i21 = U18;
                    int i22 = B.getInt(i21);
                    U18 = i21;
                    int i23 = U19;
                    int i24 = B.getInt(i23);
                    U19 = i23;
                    int i25 = U20;
                    NetworkType v3 = v8.b.v(B.getInt(i25));
                    U20 = i25;
                    int i26 = U21;
                    if (B.getInt(i26) != 0) {
                        U21 = i26;
                        i11 = U22;
                        z11 = true;
                    } else {
                        U21 = i26;
                        i11 = U22;
                        z11 = false;
                    }
                    if (B.getInt(i11) != 0) {
                        U22 = i11;
                        i12 = U23;
                        z12 = true;
                    } else {
                        U22 = i11;
                        i12 = U23;
                        z12 = false;
                    }
                    if (B.getInt(i12) != 0) {
                        U23 = i12;
                        i13 = U24;
                        z13 = true;
                    } else {
                        U23 = i12;
                        i13 = U24;
                        z13 = false;
                    }
                    if (B.getInt(i13) != 0) {
                        U24 = i13;
                        i14 = U25;
                        z14 = true;
                    } else {
                        U24 = i13;
                        i14 = U25;
                        z14 = false;
                    }
                    long j16 = B.getLong(i14);
                    U25 = i14;
                    int i27 = U26;
                    long j17 = B.getLong(i27);
                    U26 = i27;
                    int i28 = U27;
                    if (!B.isNull(i28)) {
                        bArr = B.getBlob(i28);
                    }
                    U27 = i28;
                    arrayList.add(new s(string, x3, string2, string3, a10, a11, j2, j10, j11, new n4.b(v3, z11, z12, z13, z14, j16, j17, v8.b.j(bArr)), i16, u10, j12, j13, j14, j15, z10, w10, i22, i24));
                    U = i18;
                    i15 = i17;
                }
                B.close();
                mVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                B.close();
                mVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = c10;
        }
    }

    @Override // w4.t
    public final void t(String str, androidx.work.b bVar) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        j jVar = this.f18358f;
        c4.f a10 = jVar.a();
        byte[] b5 = androidx.work.b.b(bVar);
        if (b5 == null) {
            a10.o(1);
        } else {
            a10.E(1, b5);
        }
        if (str == null) {
            a10.o(2);
        } else {
            a10.F(str, 2);
        }
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            jVar.d(a10);
        }
    }

    @Override // w4.t
    public final int u() {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        b bVar = this.f18363k;
        c4.f a10 = bVar.a();
        roomDatabase.c();
        try {
            int k3 = a10.k();
            roomDatabase.p();
            return k3;
        } finally {
            roomDatabase.k();
            bVar.d(a10);
        }
    }

    @Override // w4.t
    public final void v(long j2, String str) {
        RoomDatabase roomDatabase = this.f18354a;
        roomDatabase.b();
        k kVar = this.f18359g;
        c4.f a10 = kVar.a();
        a10.r(j2, 1);
        if (str == null) {
            a10.o(2);
        } else {
            a10.F(str, 2);
        }
        roomDatabase.c();
        try {
            a10.k();
            roomDatabase.p();
        } finally {
            roomDatabase.k();
            kVar.d(a10);
        }
    }
}

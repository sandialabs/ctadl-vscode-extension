package n4;

import android.os.Build;
import androidx.work.WorkInfo$State;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import n4.h;
import w4.s;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f16093a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16094b;
    public final Set<String> c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<B, ?>, W extends k> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f16095a;

        /* renamed from: b  reason: collision with root package name */
        public s f16096b;
        public final LinkedHashSet c;

        public a(Class<? extends androidx.work.d> cls) {
            UUID randomUUID = UUID.randomUUID();
            v7.g.e(randomUUID, "randomUUID()");
            this.f16095a = randomUUID;
            String uuid = this.f16095a.toString();
            v7.g.e(uuid, "id.toString()");
            this.f16096b = new s(uuid, null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(1));
            kotlin.collections.b.u2(linkedHashSet, strArr);
            this.c = linkedHashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final W a() {
            boolean z10;
            s sVar;
            h hVar = new h((h.a) this);
            b bVar = this.f16096b.f18342j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z11 = false;
            if ((i10 < 24 || !(!bVar.f16082h.isEmpty())) && !bVar.f16078d && !bVar.f16077b && (i10 < 23 || !bVar.c)) {
                z10 = false;
                sVar = this.f16096b;
                if (sVar.f18348q) {
                    if (!z10) {
                        if (sVar.f18339g <= 0) {
                            z11 = true;
                        }
                        if (!z11) {
                            throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                    }
                }
                UUID randomUUID = UUID.randomUUID();
                v7.g.e(randomUUID, "randomUUID()");
                this.f16095a = randomUUID;
                String uuid = randomUUID.toString();
                v7.g.e(uuid, "id.toString()");
                s sVar2 = this.f16096b;
                v7.g.f(sVar2, "other");
                String str = sVar2.c;
                WorkInfo$State workInfo$State = sVar2.f18335b;
                String str2 = sVar2.f18336d;
                androidx.work.b bVar2 = new androidx.work.b(sVar2.f18337e);
                androidx.work.b bVar3 = new androidx.work.b(sVar2.f18338f);
                long j2 = sVar2.f18339g;
                long j10 = sVar2.f18340h;
                long j11 = sVar2.f18341i;
                b bVar4 = sVar2.f18342j;
                v7.g.f(bVar4, "other");
                boolean z12 = bVar4.f16077b;
                boolean z13 = bVar4.c;
                this.f16096b = new s(uuid, workInfo$State, str, str2, bVar2, bVar3, j2, j10, j11, new b(bVar4.f16076a, z12, z13, bVar4.f16078d, bVar4.f16079e, bVar4.f16080f, bVar4.f16081g, bVar4.f16082h), sVar2.f18343k, sVar2.f18344l, sVar2.f18345m, sVar2.n, sVar2.f18346o, sVar2.f18347p, sVar2.f18348q, sVar2.f18349r, sVar2.f18350s, 524288, 0);
                return hVar;
            }
            z10 = true;
            sVar = this.f16096b;
            if (sVar.f18348q) {
            }
            UUID randomUUID2 = UUID.randomUUID();
            v7.g.e(randomUUID2, "randomUUID()");
            this.f16095a = randomUUID2;
            String uuid2 = randomUUID2.toString();
            v7.g.e(uuid2, "id.toString()");
            s sVar22 = this.f16096b;
            v7.g.f(sVar22, "other");
            String str3 = sVar22.c;
            WorkInfo$State workInfo$State2 = sVar22.f18335b;
            String str22 = sVar22.f18336d;
            androidx.work.b bVar22 = new androidx.work.b(sVar22.f18337e);
            androidx.work.b bVar32 = new androidx.work.b(sVar22.f18338f);
            long j22 = sVar22.f18339g;
            long j102 = sVar22.f18340h;
            long j112 = sVar22.f18341i;
            b bVar42 = sVar22.f18342j;
            v7.g.f(bVar42, "other");
            boolean z122 = bVar42.f16077b;
            boolean z132 = bVar42.c;
            this.f16096b = new s(uuid2, workInfo$State2, str3, str22, bVar22, bVar32, j22, j102, j112, new b(bVar42.f16076a, z122, z132, bVar42.f16078d, bVar42.f16079e, bVar42.f16080f, bVar42.f16081g, bVar42.f16082h), sVar22.f18343k, sVar22.f18344l, sVar22.f18345m, sVar22.n, sVar22.f18346o, sVar22.f18347p, sVar22.f18348q, sVar22.f18349r, sVar22.f18350s, 524288, 0);
            return hVar;
        }
    }

    public k(UUID uuid, s sVar, LinkedHashSet linkedHashSet) {
        v7.g.f(uuid, "id");
        v7.g.f(sVar, "workSpec");
        v7.g.f(linkedHashSet, "tags");
        this.f16093a = uuid;
        this.f16094b = sVar;
        this.c = linkedHashSet;
    }
}

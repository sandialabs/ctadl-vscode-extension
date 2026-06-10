package t6;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.f0;
import ua.x0;

@qa.d
/* loaded from: classes.dex */
public final class e {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final long f17634a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17635b;
    public final long c;

    /* loaded from: classes.dex */
    public static final class a implements f0<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17636a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17637b;

        static {
            a aVar = new a();
            f17636a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.NoteLabel", aVar, 3);
            pluginGeneratedSerialDescriptor.l("id", true);
            pluginGeneratedSerialDescriptor.l("noteId", false);
            pluginGeneratedSerialDescriptor.l("labelId", false);
            f17637b = pluginGeneratedSerialDescriptor;
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17637b;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        @Override // qa.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(ta.d dVar, Object obj) {
            boolean z10;
            e eVar = (e) obj;
            v7.g.f(dVar, "encoder");
            v7.g.f(eVar, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17637b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = e.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n02 = b5.n0(pluginGeneratedSerialDescriptor);
            long j2 = eVar.f17634a;
            if (!n02 && j2 == 0) {
                z10 = false;
                if (z10) {
                    b5.h(pluginGeneratedSerialDescriptor, 0, j2);
                }
                b5.h(pluginGeneratedSerialDescriptor, 1, eVar.f17635b);
                b5.h(pluginGeneratedSerialDescriptor, 2, eVar.c);
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            b5.h(pluginGeneratedSerialDescriptor, 1, eVar.f17635b);
            b5.h(pluginGeneratedSerialDescriptor, 2, eVar.c);
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            x0 x0Var = x0.f18029a;
            return new qa.b[]{x0Var, x0Var, x0Var};
        }

        @Override // ua.f0
        public final void d() {
        }

        @Override // qa.a
        public final Object e(ta.c cVar) {
            v7.g.f(cVar, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17637b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            long j2 = 0;
            long j10 = 0;
            long j11 = 0;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                if (t10 != -1) {
                    if (t10 != 0) {
                        if (t10 != 1) {
                            if (t10 == 2) {
                                j11 = b5.y(pluginGeneratedSerialDescriptor, 2);
                                i10 |= 4;
                            } else {
                                throw new UnknownFieldException(t10);
                            }
                        } else {
                            j10 = b5.y(pluginGeneratedSerialDescriptor, 1);
                            i10 |= 2;
                        }
                    } else {
                        j2 = b5.y(pluginGeneratedSerialDescriptor, 0);
                        i10 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new e(i10, j2, j10, j11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<e> serializer() {
            return a.f17636a;
        }
    }

    public e(int i10, long j2, long j10, long j11) {
        if (6 != (i10 & 6)) {
            a1.b.F0(i10, 6, a.f17637b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f17634a = 0L;
        } else {
            this.f17634a = j2;
        }
        this.f17635b = j10;
        this.c = j11;
    }

    public /* synthetic */ e(long j2, long j10) {
        this(0L, j2, j10);
    }

    public e(long j2, long j10, long j11) {
        this.f17634a = j2;
        this.f17635b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f17634a == eVar.f17634a && this.f17635b == eVar.f17635b && this.c == eVar.c;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f17634a;
        long j10 = this.f17635b;
        long j11 = this.c;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteLabel(id=");
        sb.append(this.f17634a);
        sb.append(", noteId=");
        sb.append(this.f17635b);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.c, ")");
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {

    /* renamed from: u  reason: collision with root package name */
    public static final ProtoBuf$TypeParameter f14349u;

    /* renamed from: v  reason: collision with root package name */
    public static final a f14350v = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14351j;

    /* renamed from: k  reason: collision with root package name */
    public int f14352k;

    /* renamed from: l  reason: collision with root package name */
    public int f14353l;

    /* renamed from: m  reason: collision with root package name */
    public int f14354m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public Variance f14355o;

    /* renamed from: p  reason: collision with root package name */
    public List<ProtoBuf$Type> f14356p;

    /* renamed from: q  reason: collision with root package name */
    public List<Integer> f14357q;

    /* renamed from: r  reason: collision with root package name */
    public int f14358r;

    /* renamed from: s  reason: collision with root package name */
    public byte f14359s;

    /* renamed from: t  reason: collision with root package name */
    public int f14360t;

    /* loaded from: classes.dex */
    public enum Variance implements f.a {
        f14361j("IN"),
        f14362k("OUT"),
        f14363l("INV");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14365i;

        Variance(String str) {
            this.f14365i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14365i;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$TypeParameter> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$TypeParameter(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$TypeParameter, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14366l;

        /* renamed from: m  reason: collision with root package name */
        public int f14367m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f14368o;

        /* renamed from: p  reason: collision with root package name */
        public Variance f14369p = Variance.f14363l;

        /* renamed from: q  reason: collision with root package name */
        public List<ProtoBuf$Type> f14370q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        public List<Integer> f14371r = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$TypeParameter l2 = l();
            if (l2.a()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a, kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final /* bridge */ /* synthetic */ h.a g(c cVar, d dVar) {
            n(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a
        public final /* bridge */ /* synthetic */ a.AbstractC0162a h(c cVar, d dVar) {
            n(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final GeneratedMessageLite.a i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.a j(GeneratedMessageLite generatedMessageLite) {
            m((ProtoBuf$TypeParameter) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$TypeParameter l() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
            int i10 = this.f14366l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$TypeParameter.f14353l = this.f14367m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$TypeParameter.f14354m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$TypeParameter.n = this.f14368o;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$TypeParameter.f14355o = this.f14369p;
            if ((i10 & 16) == 16) {
                this.f14370q = Collections.unmodifiableList(this.f14370q);
                this.f14366l &= -17;
            }
            protoBuf$TypeParameter.f14356p = this.f14370q;
            if ((this.f14366l & 32) == 32) {
                this.f14371r = Collections.unmodifiableList(this.f14371r);
                this.f14366l &= -33;
            }
            protoBuf$TypeParameter.f14357q = this.f14371r;
            protoBuf$TypeParameter.f14352k = i11;
            return protoBuf$TypeParameter;
        }

        public final void m(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.f14349u) {
                return;
            }
            int i10 = protoBuf$TypeParameter.f14352k;
            boolean z13 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$TypeParameter.f14353l;
                this.f14366l |= 1;
                this.f14367m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$TypeParameter.f14354m;
                this.f14366l = 2 | this.f14366l;
                this.n = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                boolean z14 = protoBuf$TypeParameter.n;
                this.f14366l = 4 | this.f14366l;
                this.f14368o = z14;
            }
            if ((i10 & 8) == 8) {
                z13 = true;
            }
            if (z13) {
                Variance variance = protoBuf$TypeParameter.f14355o;
                variance.getClass();
                this.f14366l = 8 | this.f14366l;
                this.f14369p = variance;
            }
            if (!protoBuf$TypeParameter.f14356p.isEmpty()) {
                if (this.f14370q.isEmpty()) {
                    this.f14370q = protoBuf$TypeParameter.f14356p;
                    this.f14366l &= -17;
                } else {
                    if ((this.f14366l & 16) != 16) {
                        this.f14370q = new ArrayList(this.f14370q);
                        this.f14366l |= 16;
                    }
                    this.f14370q.addAll(protoBuf$TypeParameter.f14356p);
                }
            }
            if (!protoBuf$TypeParameter.f14357q.isEmpty()) {
                if (this.f14371r.isEmpty()) {
                    this.f14371r = protoBuf$TypeParameter.f14357q;
                    this.f14366l &= -33;
                } else {
                    if ((this.f14366l & 32) != 32) {
                        this.f14371r = new ArrayList(this.f14371r);
                        this.f14366l |= 32;
                    }
                    this.f14371r.addAll(protoBuf$TypeParameter.f14357q);
                }
            }
            k(protoBuf$TypeParameter);
            this.f14526i = this.f14526i.d(protoBuf$TypeParameter.f14351j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$TypeParameter protoBuf$TypeParameter;
            try {
                try {
                    ProtoBuf$TypeParameter.f14350v.getClass();
                    m(new ProtoBuf$TypeParameter(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeParameter = null;
                    if (protoBuf$TypeParameter != null) {
                        m(protoBuf$TypeParameter);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$TypeParameter = (ProtoBuf$TypeParameter) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$TypeParameter != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(0);
        f14349u = protoBuf$TypeParameter;
        protoBuf$TypeParameter.f14353l = 0;
        protoBuf$TypeParameter.f14354m = 0;
        protoBuf$TypeParameter.n = false;
        protoBuf$TypeParameter.f14355o = Variance.f14363l;
        protoBuf$TypeParameter.f14356p = Collections.emptyList();
        protoBuf$TypeParameter.f14357q = Collections.emptyList();
    }

    public ProtoBuf$TypeParameter() {
        throw null;
    }

    public ProtoBuf$TypeParameter(int i10) {
        this.f14358r = -1;
        this.f14359s = (byte) -1;
        this.f14360t = -1;
        this.f14351j = i9.a.f11832i;
    }

    public ProtoBuf$TypeParameter(c cVar, d dVar) {
        List list;
        Object g10;
        Variance variance;
        this.f14358r = -1;
        this.f14359s = (byte) -1;
        this.f14360t = -1;
        this.f14353l = 0;
        this.f14354m = 0;
        this.n = false;
        Variance variance2 = Variance.f14363l;
        this.f14355o = variance2;
        this.f14356p = Collections.emptyList();
        this.f14357q = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f14352k |= 1;
                            this.f14353l = cVar.k();
                        } else if (n == 16) {
                            this.f14352k |= 2;
                            this.f14354m = cVar.k();
                        } else if (n == 24) {
                            this.f14352k |= 4;
                            this.n = cVar.l() != 0;
                        } else if (n != 32) {
                            if (n == 42) {
                                if (!(z11 & true)) {
                                    this.f14356p = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14356p;
                                g10 = cVar.g(ProtoBuf$Type.C, dVar);
                            } else if (n == 48) {
                                if (!(z11 & true)) {
                                    this.f14357q = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14357q;
                                g10 = Integer.valueOf(cVar.k());
                            } else if (n == 50) {
                                int d5 = cVar.d(cVar.k());
                                if (!(z11 & true) && cVar.b() > 0) {
                                    this.f14357q = new ArrayList();
                                    z11 |= true;
                                }
                                while (cVar.b() > 0) {
                                    this.f14357q.add(Integer.valueOf(cVar.k()));
                                }
                                cVar.c(d5);
                            } else if (!p(cVar, j2, dVar, n)) {
                            }
                            list.add(g10);
                        } else {
                            int k3 = cVar.k();
                            if (k3 == 0) {
                                variance = Variance.f14361j;
                            } else if (k3 != 1) {
                                variance = k3 != 2 ? null : variance2;
                            } else {
                                variance = Variance.f14362k;
                            }
                            if (variance == null) {
                                j2.v(n);
                                j2.v(k3);
                            } else {
                                this.f14352k |= 8;
                                this.f14355o = variance;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11 & true) {
                        this.f14356p = Collections.unmodifiableList(this.f14356p);
                    }
                    if (z11 & true) {
                        this.f14357q = Collections.unmodifiableList(this.f14357q);
                    }
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f14351j = bVar.c();
                        throw th2;
                    }
                    this.f14351j = bVar.c();
                    n();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f14537i = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f14537i = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z11 & true) {
            this.f14356p = Collections.unmodifiableList(this.f14356p);
        }
        if (z11 & true) {
            this.f14357q = Collections.unmodifiableList(this.f14357q);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14351j = bVar.c();
            throw th3;
        }
        this.f14351j = bVar.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        byte b5 = this.f14359s;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        int i10 = this.f14352k;
        if ((i10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f14359s = (byte) 0;
            return false;
        }
        if ((i10 & 2) == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f14359s = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f14356p.size(); i11++) {
            if (!this.f14356p.get(i11).a()) {
                this.f14359s = (byte) 0;
                return false;
            }
        }
        if (!j()) {
            this.f14359s = (byte) 0;
            return false;
        }
        this.f14359s = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.f14360t;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14352k & 1) == 1) {
            i10 = CodedOutputStream.b(1, this.f14353l) + 0;
        } else {
            i10 = 0;
        }
        if ((this.f14352k & 2) == 2) {
            i10 += CodedOutputStream.b(2, this.f14354m);
        }
        if ((this.f14352k & 4) == 4) {
            i10 += CodedOutputStream.h(3) + 1;
        }
        if ((this.f14352k & 8) == 8) {
            i10 += CodedOutputStream.a(4, this.f14355o.f14365i);
        }
        for (int i12 = 0; i12 < this.f14356p.size(); i12++) {
            i10 += CodedOutputStream.d(5, this.f14356p.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f14357q.size(); i14++) {
            i13 += CodedOutputStream.c(this.f14357q.get(i14).intValue());
        }
        int i15 = i10 + i13;
        if (!this.f14357q.isEmpty()) {
            i15 = i15 + 1 + CodedOutputStream.c(i13);
        }
        this.f14358r = i13;
        int size = this.f14351j.size() + k() + i15;
        this.f14360t = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a d() {
        return new b();
    }

    @Override // i9.f
    public final h e() {
        return f14349u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14352k & 1) == 1) {
            codedOutputStream.m(1, this.f14353l);
        }
        if ((this.f14352k & 2) == 2) {
            codedOutputStream.m(2, this.f14354m);
        }
        if ((this.f14352k & 4) == 4) {
            boolean z10 = this.n;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z10 ? 1 : 0);
        }
        if ((this.f14352k & 8) == 8) {
            codedOutputStream.l(4, this.f14355o.f14365i);
        }
        for (int i10 = 0; i10 < this.f14356p.size(); i10++) {
            codedOutputStream.o(5, this.f14356p.get(i10));
        }
        if (this.f14357q.size() > 0) {
            codedOutputStream.v(50);
            codedOutputStream.v(this.f14358r);
        }
        for (int i11 = 0; i11 < this.f14357q.size(); i11++) {
            codedOutputStream.n(this.f14357q.get(i11).intValue());
        }
        aVar.a(1000, codedOutputStream);
        codedOutputStream.r(this.f14351j);
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14358r = -1;
        this.f14359s = (byte) -1;
        this.f14360t = -1;
        this.f14351j = bVar.f14526i;
    }
}

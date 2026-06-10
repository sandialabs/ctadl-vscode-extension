package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {

    /* renamed from: w  reason: collision with root package name */
    public static final ProtoBuf$TypeAlias f14326w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f14327x = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14328j;

    /* renamed from: k  reason: collision with root package name */
    public int f14329k;

    /* renamed from: l  reason: collision with root package name */
    public int f14330l;

    /* renamed from: m  reason: collision with root package name */
    public int f14331m;
    public List<ProtoBuf$TypeParameter> n;

    /* renamed from: o  reason: collision with root package name */
    public ProtoBuf$Type f14332o;

    /* renamed from: p  reason: collision with root package name */
    public int f14333p;

    /* renamed from: q  reason: collision with root package name */
    public ProtoBuf$Type f14334q;

    /* renamed from: r  reason: collision with root package name */
    public int f14335r;

    /* renamed from: s  reason: collision with root package name */
    public List<ProtoBuf$Annotation> f14336s;

    /* renamed from: t  reason: collision with root package name */
    public List<Integer> f14337t;

    /* renamed from: u  reason: collision with root package name */
    public byte f14338u;

    /* renamed from: v  reason: collision with root package name */
    public int f14339v;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$TypeAlias> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$TypeAlias(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$TypeAlias, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14340l;
        public int n;

        /* renamed from: p  reason: collision with root package name */
        public ProtoBuf$Type f14343p;

        /* renamed from: q  reason: collision with root package name */
        public int f14344q;

        /* renamed from: r  reason: collision with root package name */
        public ProtoBuf$Type f14345r;

        /* renamed from: s  reason: collision with root package name */
        public int f14346s;

        /* renamed from: t  reason: collision with root package name */
        public List<ProtoBuf$Annotation> f14347t;

        /* renamed from: u  reason: collision with root package name */
        public List<Integer> f14348u;

        /* renamed from: m  reason: collision with root package name */
        public int f14341m = 6;

        /* renamed from: o  reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f14342o = Collections.emptyList();

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
            this.f14343p = protoBuf$Type;
            this.f14345r = protoBuf$Type;
            this.f14347t = Collections.emptyList();
            this.f14348u = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$TypeAlias l2 = l();
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
            m((ProtoBuf$TypeAlias) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$TypeAlias l() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
            int i10 = this.f14340l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$TypeAlias.f14330l = this.f14341m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$TypeAlias.f14331m = this.n;
            if ((i10 & 4) == 4) {
                this.f14342o = Collections.unmodifiableList(this.f14342o);
                this.f14340l &= -5;
            }
            protoBuf$TypeAlias.n = this.f14342o;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$TypeAlias.f14332o = this.f14343p;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            protoBuf$TypeAlias.f14333p = this.f14344q;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            protoBuf$TypeAlias.f14334q = this.f14345r;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$TypeAlias.f14335r = this.f14346s;
            if ((this.f14340l & 128) == 128) {
                this.f14347t = Collections.unmodifiableList(this.f14347t);
                this.f14340l &= -129;
            }
            protoBuf$TypeAlias.f14336s = this.f14347t;
            if ((this.f14340l & 256) == 256) {
                this.f14348u = Collections.unmodifiableList(this.f14348u);
                this.f14340l &= -257;
            }
            protoBuf$TypeAlias.f14337t = this.f14348u;
            protoBuf$TypeAlias.f14329k = i11;
            return protoBuf$TypeAlias;
        }

        public final void m(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.f14326w) {
                return;
            }
            int i10 = protoBuf$TypeAlias.f14329k;
            boolean z15 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$TypeAlias.f14330l;
                this.f14340l |= 1;
                this.f14341m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$TypeAlias.f14331m;
                this.f14340l = 2 | this.f14340l;
                this.n = i12;
            }
            if (!protoBuf$TypeAlias.n.isEmpty()) {
                if (this.f14342o.isEmpty()) {
                    this.f14342o = protoBuf$TypeAlias.n;
                    this.f14340l &= -5;
                } else {
                    if ((this.f14340l & 4) != 4) {
                        this.f14342o = new ArrayList(this.f14342o);
                        this.f14340l |= 4;
                    }
                    this.f14342o.addAll(protoBuf$TypeAlias.n);
                }
            }
            if ((protoBuf$TypeAlias.f14329k & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$TypeAlias.f14332o;
                if ((this.f14340l & 8) == 8 && (protoBuf$Type2 = this.f14343p) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type2);
                    t10.m(protoBuf$Type3);
                    protoBuf$Type3 = t10.l();
                }
                this.f14343p = protoBuf$Type3;
                this.f14340l |= 8;
            }
            int i13 = protoBuf$TypeAlias.f14329k;
            if ((i13 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i14 = protoBuf$TypeAlias.f14333p;
                this.f14340l |= 16;
                this.f14344q = i14;
            }
            if ((i13 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$TypeAlias.f14334q;
                if ((this.f14340l & 32) == 32 && (protoBuf$Type = this.f14345r) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t11 = ProtoBuf$Type.t(protoBuf$Type);
                    t11.m(protoBuf$Type4);
                    protoBuf$Type4 = t11.l();
                }
                this.f14345r = protoBuf$Type4;
                this.f14340l |= 32;
            }
            if ((protoBuf$TypeAlias.f14329k & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                int i15 = protoBuf$TypeAlias.f14335r;
                this.f14340l |= 64;
                this.f14346s = i15;
            }
            if (!protoBuf$TypeAlias.f14336s.isEmpty()) {
                if (this.f14347t.isEmpty()) {
                    this.f14347t = protoBuf$TypeAlias.f14336s;
                    this.f14340l &= -129;
                } else {
                    if ((this.f14340l & 128) != 128) {
                        this.f14347t = new ArrayList(this.f14347t);
                        this.f14340l |= 128;
                    }
                    this.f14347t.addAll(protoBuf$TypeAlias.f14336s);
                }
            }
            if (!protoBuf$TypeAlias.f14337t.isEmpty()) {
                if (this.f14348u.isEmpty()) {
                    this.f14348u = protoBuf$TypeAlias.f14337t;
                    this.f14340l &= -257;
                } else {
                    if ((this.f14340l & 256) != 256) {
                        this.f14348u = new ArrayList(this.f14348u);
                        this.f14340l |= 256;
                    }
                    this.f14348u.addAll(protoBuf$TypeAlias.f14337t);
                }
            }
            k(protoBuf$TypeAlias);
            this.f14526i = this.f14526i.d(protoBuf$TypeAlias.f14328j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$TypeAlias protoBuf$TypeAlias;
            try {
                try {
                    ProtoBuf$TypeAlias.f14327x.getClass();
                    m(new ProtoBuf$TypeAlias(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeAlias = null;
                    if (protoBuf$TypeAlias != null) {
                        m(protoBuf$TypeAlias);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$TypeAlias = (ProtoBuf$TypeAlias) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$TypeAlias != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(0);
        f14326w = protoBuf$TypeAlias;
        protoBuf$TypeAlias.r();
    }

    public ProtoBuf$TypeAlias() {
        throw null;
    }

    public ProtoBuf$TypeAlias(int i10) {
        this.f14338u = (byte) -1;
        this.f14339v = -1;
        this.f14328j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ProtoBuf$TypeAlias(c cVar, d dVar) {
        List list;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar;
        Object g10;
        this.f14338u = (byte) -1;
        this.f14339v = -1;
        r();
        a.b bVar2 = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 128;
            if (z10) {
                if (z11 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (z11 & true) {
                    this.f14336s = Collections.unmodifiableList(this.f14336s);
                }
                if (z11 & true) {
                    this.f14337t = Collections.unmodifiableList(this.f14337t);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f14328j = bVar2.c();
                    throw th;
                }
                this.f14328j = bVar2.c();
                n();
                return;
            }
            try {
                try {
                    try {
                        int n = cVar.n();
                        ProtoBuf$Type.b bVar3 = null;
                        switch (n) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f14329k |= 1;
                                this.f14330l = cVar.k();
                                break;
                            case 16:
                                this.f14329k |= 2;
                                this.f14331m = cVar.k();
                                break;
                            case 26:
                                if (!(z11 & true)) {
                                    this.n = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.n;
                                bVar = ProtoBuf$TypeParameter.f14350v;
                                g10 = cVar.g(bVar, dVar);
                                list.add(g10);
                                break;
                            case 34:
                                if ((this.f14329k & 4) == 4) {
                                    ProtoBuf$Type protoBuf$Type = this.f14332o;
                                    protoBuf$Type.getClass();
                                    bVar3 = ProtoBuf$Type.t(protoBuf$Type);
                                }
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                this.f14332o = protoBuf$Type2;
                                if (bVar3 != null) {
                                    bVar3.m(protoBuf$Type2);
                                    this.f14332o = bVar3.l();
                                }
                                this.f14329k |= 4;
                                break;
                            case 40:
                                this.f14329k |= 8;
                                this.f14333p = cVar.k();
                                break;
                            case 50:
                                if ((this.f14329k & 16) == 16) {
                                    ProtoBuf$Type protoBuf$Type3 = this.f14334q;
                                    protoBuf$Type3.getClass();
                                    bVar3 = ProtoBuf$Type.t(protoBuf$Type3);
                                }
                                ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                this.f14334q = protoBuf$Type4;
                                if (bVar3 != null) {
                                    bVar3.m(protoBuf$Type4);
                                    this.f14334q = bVar3.l();
                                }
                                this.f14329k |= 16;
                                break;
                            case 56:
                                this.f14329k |= 32;
                                this.f14335r = cVar.k();
                                break;
                            case 66:
                                if (!(z11 & true)) {
                                    this.f14336s = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14336s;
                                bVar = ProtoBuf$Annotation.f13987p;
                                g10 = cVar.g(bVar, dVar);
                                list.add(g10);
                                break;
                            case 248:
                                if (!(z11 & true)) {
                                    this.f14337t = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14337t;
                                g10 = Integer.valueOf(cVar.k());
                                list.add(g10);
                                break;
                            case 250:
                                int d5 = cVar.d(cVar.k());
                                if (!(z11 & true) && cVar.b() > 0) {
                                    this.f14337t = new ArrayList();
                                    z11 |= true;
                                }
                                while (cVar.b() > 0) {
                                    this.f14337t.add(Integer.valueOf(cVar.k()));
                                }
                                cVar.c(d5);
                                break;
                            default:
                                r52 = p(cVar, j2, dVar, n);
                                if (r52 != 0) {
                                    break;
                                } else {
                                    z10 = true;
                                    break;
                                }
                        }
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f14537i = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f14537i = this;
                    throw e11;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((z11 & true) == r52) {
                    this.f14336s = Collections.unmodifiableList(this.f14336s);
                }
                if (z11 & true) {
                    this.f14337t = Collections.unmodifiableList(this.f14337t);
                }
                try {
                    j2.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f14328j = bVar2.c();
                    throw th3;
                }
                this.f14328j = bVar2.c();
                n();
                throw th2;
            }
        }
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b5 = this.f14338u;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if ((this.f14329k & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f14338u = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.n.size(); i10++) {
            if (!this.n.get(i10).a()) {
                this.f14338u = (byte) 0;
                return false;
            }
        }
        if ((this.f14329k & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.f14332o.a()) {
            this.f14338u = (byte) 0;
            return false;
        }
        if ((this.f14329k & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f14334q.a()) {
            this.f14338u = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f14336s.size(); i11++) {
            if (!this.f14336s.get(i11).a()) {
                this.f14338u = (byte) 0;
                return false;
            }
        }
        if (!j()) {
            this.f14338u = (byte) 0;
            return false;
        }
        this.f14338u = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.f14339v;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14329k & 1) == 1) {
            i10 = CodedOutputStream.b(1, this.f14330l) + 0;
        } else {
            i10 = 0;
        }
        if ((this.f14329k & 2) == 2) {
            i10 += CodedOutputStream.b(2, this.f14331m);
        }
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            i10 += CodedOutputStream.d(3, this.n.get(i12));
        }
        if ((this.f14329k & 4) == 4) {
            i10 += CodedOutputStream.d(4, this.f14332o);
        }
        if ((this.f14329k & 8) == 8) {
            i10 += CodedOutputStream.b(5, this.f14333p);
        }
        if ((this.f14329k & 16) == 16) {
            i10 += CodedOutputStream.d(6, this.f14334q);
        }
        if ((this.f14329k & 32) == 32) {
            i10 += CodedOutputStream.b(7, this.f14335r);
        }
        for (int i13 = 0; i13 < this.f14336s.size(); i13++) {
            i10 += CodedOutputStream.d(8, this.f14336s.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f14337t.size(); i15++) {
            i14 += CodedOutputStream.c(this.f14337t.get(i15).intValue());
        }
        int size = this.f14328j.size() + k() + (this.f14337t.size() * 2) + i10 + i14;
        this.f14339v = size;
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
        return f14326w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14329k & 1) == 1) {
            codedOutputStream.m(1, this.f14330l);
        }
        if ((this.f14329k & 2) == 2) {
            codedOutputStream.m(2, this.f14331m);
        }
        for (int i10 = 0; i10 < this.n.size(); i10++) {
            codedOutputStream.o(3, this.n.get(i10));
        }
        if ((this.f14329k & 4) == 4) {
            codedOutputStream.o(4, this.f14332o);
        }
        if ((this.f14329k & 8) == 8) {
            codedOutputStream.m(5, this.f14333p);
        }
        if ((this.f14329k & 16) == 16) {
            codedOutputStream.o(6, this.f14334q);
        }
        if ((this.f14329k & 32) == 32) {
            codedOutputStream.m(7, this.f14335r);
        }
        for (int i11 = 0; i11 < this.f14336s.size(); i11++) {
            codedOutputStream.o(8, this.f14336s.get(i11));
        }
        for (int i12 = 0; i12 < this.f14337t.size(); i12++) {
            codedOutputStream.m(31, this.f14337t.get(i12).intValue());
        }
        aVar.a(200, codedOutputStream);
        codedOutputStream.r(this.f14328j);
    }

    public final void r() {
        this.f14330l = 6;
        this.f14331m = 0;
        this.n = Collections.emptyList();
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        this.f14332o = protoBuf$Type;
        this.f14333p = 0;
        this.f14334q = protoBuf$Type;
        this.f14335r = 0;
        this.f14336s = Collections.emptyList();
        this.f14337t = Collections.emptyList();
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14338u = (byte) -1;
        this.f14339v = -1;
        this.f14328j = bVar.f14526i;
    }
}

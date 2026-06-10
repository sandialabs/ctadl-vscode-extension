package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
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
public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {
    public static final ProtoBuf$Class R;
    public static final a S = new a();
    public List<ProtoBuf$TypeAlias> A;
    public List<ProtoBuf$EnumEntry> B;
    public List<Integer> C;
    public int D;
    public int E;
    public ProtoBuf$Type F;
    public int G;
    public List<Integer> H;
    public int I;
    public List<ProtoBuf$Type> J;
    public List<Integer> K;
    public int L;
    public ProtoBuf$TypeTable M;
    public List<Integer> N;
    public ProtoBuf$VersionRequirementTable O;
    public byte P;
    public int Q;

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14047j;

    /* renamed from: k  reason: collision with root package name */
    public int f14048k;

    /* renamed from: l  reason: collision with root package name */
    public int f14049l;

    /* renamed from: m  reason: collision with root package name */
    public int f14050m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public List<ProtoBuf$TypeParameter> f14051o;

    /* renamed from: p  reason: collision with root package name */
    public List<ProtoBuf$Type> f14052p;

    /* renamed from: q  reason: collision with root package name */
    public List<Integer> f14053q;

    /* renamed from: r  reason: collision with root package name */
    public int f14054r;

    /* renamed from: s  reason: collision with root package name */
    public List<Integer> f14055s;

    /* renamed from: t  reason: collision with root package name */
    public int f14056t;

    /* renamed from: u  reason: collision with root package name */
    public List<ProtoBuf$Type> f14057u;

    /* renamed from: v  reason: collision with root package name */
    public List<Integer> f14058v;

    /* renamed from: w  reason: collision with root package name */
    public int f14059w;

    /* renamed from: x  reason: collision with root package name */
    public List<ProtoBuf$Constructor> f14060x;

    /* renamed from: y  reason: collision with root package name */
    public List<ProtoBuf$Function> f14061y;

    /* renamed from: z  reason: collision with root package name */
    public List<ProtoBuf$Property> f14062z;

    /* loaded from: classes.dex */
    public enum Kind implements f.a {
        f14063j("CLASS"),
        f14064k("INTERFACE"),
        f14065l("ENUM_CLASS"),
        /* JADX INFO: Fake field, exist only in values array */
        EF5("ENUM_ENTRY"),
        f14066m("ANNOTATION_CLASS"),
        /* JADX INFO: Fake field, exist only in values array */
        EF9("OBJECT"),
        n("COMPANION_OBJECT");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14068i;

        Kind(String str) {
            this.f14068i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14068i;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Class> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Class(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Class, b> {
        public int B;
        public int D;

        /* renamed from: l  reason: collision with root package name */
        public int f14069l;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f14071o;

        /* renamed from: m  reason: collision with root package name */
        public int f14070m = 6;

        /* renamed from: p  reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f14072p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        public List<ProtoBuf$Type> f14073q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        public List<Integer> f14074r = Collections.emptyList();

        /* renamed from: s  reason: collision with root package name */
        public List<Integer> f14075s = Collections.emptyList();

        /* renamed from: t  reason: collision with root package name */
        public List<ProtoBuf$Type> f14076t = Collections.emptyList();

        /* renamed from: u  reason: collision with root package name */
        public List<Integer> f14077u = Collections.emptyList();

        /* renamed from: v  reason: collision with root package name */
        public List<ProtoBuf$Constructor> f14078v = Collections.emptyList();

        /* renamed from: w  reason: collision with root package name */
        public List<ProtoBuf$Function> f14079w = Collections.emptyList();

        /* renamed from: x  reason: collision with root package name */
        public List<ProtoBuf$Property> f14080x = Collections.emptyList();

        /* renamed from: y  reason: collision with root package name */
        public List<ProtoBuf$TypeAlias> f14081y = Collections.emptyList();

        /* renamed from: z  reason: collision with root package name */
        public List<ProtoBuf$EnumEntry> f14082z = Collections.emptyList();
        public List<Integer> A = Collections.emptyList();
        public ProtoBuf$Type C = ProtoBuf$Type.B;
        public List<Integer> E = Collections.emptyList();
        public List<ProtoBuf$Type> F = Collections.emptyList();
        public List<Integer> G = Collections.emptyList();
        public ProtoBuf$TypeTable H = ProtoBuf$TypeTable.f14372o;
        public List<Integer> I = Collections.emptyList();
        public ProtoBuf$VersionRequirementTable J = ProtoBuf$VersionRequirementTable.f14426m;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Class l2 = l();
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
            m((ProtoBuf$Class) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Class l() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(this);
            int i10 = this.f14069l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Class.f14049l = this.f14070m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Class.f14050m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Class.n = this.f14071o;
            if ((i10 & 8) == 8) {
                this.f14072p = Collections.unmodifiableList(this.f14072p);
                this.f14069l &= -9;
            }
            protoBuf$Class.f14051o = this.f14072p;
            if ((this.f14069l & 16) == 16) {
                this.f14073q = Collections.unmodifiableList(this.f14073q);
                this.f14069l &= -17;
            }
            protoBuf$Class.f14052p = this.f14073q;
            if ((this.f14069l & 32) == 32) {
                this.f14074r = Collections.unmodifiableList(this.f14074r);
                this.f14069l &= -33;
            }
            protoBuf$Class.f14053q = this.f14074r;
            if ((this.f14069l & 64) == 64) {
                this.f14075s = Collections.unmodifiableList(this.f14075s);
                this.f14069l &= -65;
            }
            protoBuf$Class.f14055s = this.f14075s;
            if ((this.f14069l & 128) == 128) {
                this.f14076t = Collections.unmodifiableList(this.f14076t);
                this.f14069l &= -129;
            }
            protoBuf$Class.f14057u = this.f14076t;
            if ((this.f14069l & 256) == 256) {
                this.f14077u = Collections.unmodifiableList(this.f14077u);
                this.f14069l &= -257;
            }
            protoBuf$Class.f14058v = this.f14077u;
            if ((this.f14069l & 512) == 512) {
                this.f14078v = Collections.unmodifiableList(this.f14078v);
                this.f14069l &= -513;
            }
            protoBuf$Class.f14060x = this.f14078v;
            if ((this.f14069l & 1024) == 1024) {
                this.f14079w = Collections.unmodifiableList(this.f14079w);
                this.f14069l &= -1025;
            }
            protoBuf$Class.f14061y = this.f14079w;
            if ((this.f14069l & 2048) == 2048) {
                this.f14080x = Collections.unmodifiableList(this.f14080x);
                this.f14069l &= -2049;
            }
            protoBuf$Class.f14062z = this.f14080x;
            if ((this.f14069l & 4096) == 4096) {
                this.f14081y = Collections.unmodifiableList(this.f14081y);
                this.f14069l &= -4097;
            }
            protoBuf$Class.A = this.f14081y;
            if ((this.f14069l & 8192) == 8192) {
                this.f14082z = Collections.unmodifiableList(this.f14082z);
                this.f14069l &= -8193;
            }
            protoBuf$Class.B = this.f14082z;
            if ((this.f14069l & 16384) == 16384) {
                this.A = Collections.unmodifiableList(this.A);
                this.f14069l &= -16385;
            }
            protoBuf$Class.C = this.A;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            protoBuf$Class.E = this.B;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            protoBuf$Class.F = this.C;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            protoBuf$Class.G = this.D;
            if ((this.f14069l & 262144) == 262144) {
                this.E = Collections.unmodifiableList(this.E);
                this.f14069l &= -262145;
            }
            protoBuf$Class.H = this.E;
            if ((this.f14069l & 524288) == 524288) {
                this.F = Collections.unmodifiableList(this.F);
                this.f14069l &= -524289;
            }
            protoBuf$Class.J = this.F;
            if ((this.f14069l & 1048576) == 1048576) {
                this.G = Collections.unmodifiableList(this.G);
                this.f14069l &= -1048577;
            }
            protoBuf$Class.K = this.G;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            protoBuf$Class.M = this.H;
            if ((this.f14069l & 4194304) == 4194304) {
                this.I = Collections.unmodifiableList(this.I);
                this.f14069l &= -4194305;
            }
            protoBuf$Class.N = this.I;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            protoBuf$Class.O = this.J;
            protoBuf$Class.f14048k = i11;
            return protoBuf$Class;
        }

        public final void m(ProtoBuf$Class protoBuf$Class) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Class == ProtoBuf$Class.R) {
                return;
            }
            int i10 = protoBuf$Class.f14048k;
            boolean z17 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$Class.f14049l;
                this.f14069l |= 1;
                this.f14070m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$Class.f14050m;
                this.f14069l = 2 | this.f14069l;
                this.n = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i13 = protoBuf$Class.n;
                this.f14069l = 4 | this.f14069l;
                this.f14071o = i13;
            }
            if (!protoBuf$Class.f14051o.isEmpty()) {
                if (this.f14072p.isEmpty()) {
                    this.f14072p = protoBuf$Class.f14051o;
                    this.f14069l &= -9;
                } else {
                    if ((this.f14069l & 8) != 8) {
                        this.f14072p = new ArrayList(this.f14072p);
                        this.f14069l |= 8;
                    }
                    this.f14072p.addAll(protoBuf$Class.f14051o);
                }
            }
            if (!protoBuf$Class.f14052p.isEmpty()) {
                if (this.f14073q.isEmpty()) {
                    this.f14073q = protoBuf$Class.f14052p;
                    this.f14069l &= -17;
                } else {
                    if ((this.f14069l & 16) != 16) {
                        this.f14073q = new ArrayList(this.f14073q);
                        this.f14069l |= 16;
                    }
                    this.f14073q.addAll(protoBuf$Class.f14052p);
                }
            }
            if (!protoBuf$Class.f14053q.isEmpty()) {
                if (this.f14074r.isEmpty()) {
                    this.f14074r = protoBuf$Class.f14053q;
                    this.f14069l &= -33;
                } else {
                    if ((this.f14069l & 32) != 32) {
                        this.f14074r = new ArrayList(this.f14074r);
                        this.f14069l |= 32;
                    }
                    this.f14074r.addAll(protoBuf$Class.f14053q);
                }
            }
            if (!protoBuf$Class.f14055s.isEmpty()) {
                if (this.f14075s.isEmpty()) {
                    this.f14075s = protoBuf$Class.f14055s;
                    this.f14069l &= -65;
                } else {
                    if ((this.f14069l & 64) != 64) {
                        this.f14075s = new ArrayList(this.f14075s);
                        this.f14069l |= 64;
                    }
                    this.f14075s.addAll(protoBuf$Class.f14055s);
                }
            }
            if (!protoBuf$Class.f14057u.isEmpty()) {
                if (this.f14076t.isEmpty()) {
                    this.f14076t = protoBuf$Class.f14057u;
                    this.f14069l &= -129;
                } else {
                    if ((this.f14069l & 128) != 128) {
                        this.f14076t = new ArrayList(this.f14076t);
                        this.f14069l |= 128;
                    }
                    this.f14076t.addAll(protoBuf$Class.f14057u);
                }
            }
            if (!protoBuf$Class.f14058v.isEmpty()) {
                if (this.f14077u.isEmpty()) {
                    this.f14077u = protoBuf$Class.f14058v;
                    this.f14069l &= -257;
                } else {
                    if ((this.f14069l & 256) != 256) {
                        this.f14077u = new ArrayList(this.f14077u);
                        this.f14069l |= 256;
                    }
                    this.f14077u.addAll(protoBuf$Class.f14058v);
                }
            }
            if (!protoBuf$Class.f14060x.isEmpty()) {
                if (this.f14078v.isEmpty()) {
                    this.f14078v = protoBuf$Class.f14060x;
                    this.f14069l &= -513;
                } else {
                    if ((this.f14069l & 512) != 512) {
                        this.f14078v = new ArrayList(this.f14078v);
                        this.f14069l |= 512;
                    }
                    this.f14078v.addAll(protoBuf$Class.f14060x);
                }
            }
            if (!protoBuf$Class.f14061y.isEmpty()) {
                if (this.f14079w.isEmpty()) {
                    this.f14079w = protoBuf$Class.f14061y;
                    this.f14069l &= -1025;
                } else {
                    if ((this.f14069l & 1024) != 1024) {
                        this.f14079w = new ArrayList(this.f14079w);
                        this.f14069l |= 1024;
                    }
                    this.f14079w.addAll(protoBuf$Class.f14061y);
                }
            }
            if (!protoBuf$Class.f14062z.isEmpty()) {
                if (this.f14080x.isEmpty()) {
                    this.f14080x = protoBuf$Class.f14062z;
                    this.f14069l &= -2049;
                } else {
                    if ((this.f14069l & 2048) != 2048) {
                        this.f14080x = new ArrayList(this.f14080x);
                        this.f14069l |= 2048;
                    }
                    this.f14080x.addAll(protoBuf$Class.f14062z);
                }
            }
            if (!protoBuf$Class.A.isEmpty()) {
                if (this.f14081y.isEmpty()) {
                    this.f14081y = protoBuf$Class.A;
                    this.f14069l &= -4097;
                } else {
                    if ((this.f14069l & 4096) != 4096) {
                        this.f14081y = new ArrayList(this.f14081y);
                        this.f14069l |= 4096;
                    }
                    this.f14081y.addAll(protoBuf$Class.A);
                }
            }
            if (!protoBuf$Class.B.isEmpty()) {
                if (this.f14082z.isEmpty()) {
                    this.f14082z = protoBuf$Class.B;
                    this.f14069l &= -8193;
                } else {
                    if ((this.f14069l & 8192) != 8192) {
                        this.f14082z = new ArrayList(this.f14082z);
                        this.f14069l |= 8192;
                    }
                    this.f14082z.addAll(protoBuf$Class.B);
                }
            }
            if (!protoBuf$Class.C.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = protoBuf$Class.C;
                    this.f14069l &= -16385;
                } else {
                    if ((this.f14069l & 16384) != 16384) {
                        this.A = new ArrayList(this.A);
                        this.f14069l |= 16384;
                    }
                    this.A.addAll(protoBuf$Class.C);
                }
            }
            int i14 = protoBuf$Class.f14048k;
            if ((i14 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i15 = protoBuf$Class.E;
                this.f14069l |= 32768;
                this.B = i15;
            }
            if ((i14 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                ProtoBuf$Type protoBuf$Type2 = protoBuf$Class.F;
                if ((this.f14069l & 65536) == 65536 && (protoBuf$Type = this.C) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type);
                    t10.m(protoBuf$Type2);
                    protoBuf$Type2 = t10.l();
                }
                this.C = protoBuf$Type2;
                this.f14069l |= 65536;
            }
            if ((protoBuf$Class.f14048k & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                int i16 = protoBuf$Class.G;
                this.f14069l |= 131072;
                this.D = i16;
            }
            if (!protoBuf$Class.H.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = protoBuf$Class.H;
                    this.f14069l &= -262145;
                } else {
                    if ((this.f14069l & 262144) != 262144) {
                        this.E = new ArrayList(this.E);
                        this.f14069l |= 262144;
                    }
                    this.E.addAll(protoBuf$Class.H);
                }
            }
            if (!protoBuf$Class.J.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = protoBuf$Class.J;
                    this.f14069l &= -524289;
                } else {
                    if ((this.f14069l & 524288) != 524288) {
                        this.F = new ArrayList(this.F);
                        this.f14069l |= 524288;
                    }
                    this.F.addAll(protoBuf$Class.J);
                }
            }
            if (!protoBuf$Class.K.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = protoBuf$Class.K;
                    this.f14069l &= -1048577;
                } else {
                    if ((this.f14069l & 1048576) != 1048576) {
                        this.G = new ArrayList(this.G);
                        this.f14069l |= 1048576;
                    }
                    this.G.addAll(protoBuf$Class.K);
                }
            }
            if ((protoBuf$Class.f14048k & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Class.M;
                if ((this.f14069l & 2097152) == 2097152 && (protoBuf$TypeTable = this.H) != ProtoBuf$TypeTable.f14372o) {
                    ProtoBuf$TypeTable.b j2 = ProtoBuf$TypeTable.j(protoBuf$TypeTable);
                    j2.l(protoBuf$TypeTable2);
                    protoBuf$TypeTable2 = j2.k();
                }
                this.H = protoBuf$TypeTable2;
                this.f14069l |= 2097152;
            }
            if (!protoBuf$Class.N.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = protoBuf$Class.N;
                    this.f14069l &= -4194305;
                } else {
                    if ((this.f14069l & 4194304) != 4194304) {
                        this.I = new ArrayList(this.I);
                        this.f14069l |= 4194304;
                    }
                    this.I.addAll(protoBuf$Class.N);
                }
            }
            if ((protoBuf$Class.f14048k & 128) == 128) {
                z17 = true;
            }
            if (z17) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Class.O;
                if ((this.f14069l & 8388608) == 8388608 && (protoBuf$VersionRequirementTable = this.J) != ProtoBuf$VersionRequirementTable.f14426m) {
                    ProtoBuf$VersionRequirementTable.b bVar = new ProtoBuf$VersionRequirementTable.b();
                    bVar.l(protoBuf$VersionRequirementTable);
                    bVar.l(protoBuf$VersionRequirementTable2);
                    protoBuf$VersionRequirementTable2 = bVar.k();
                }
                this.J = protoBuf$VersionRequirementTable2;
                this.f14069l |= 8388608;
            }
            k(protoBuf$Class);
            this.f14526i = this.f14526i.d(protoBuf$Class.f14047j);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Class protoBuf$Class;
            try {
                try {
                    ProtoBuf$Class.S.getClass();
                    m(new ProtoBuf$Class(cVar, dVar));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Class = (ProtoBuf$Class) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        if (protoBuf$Class != null) {
                            m(protoBuf$Class);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                protoBuf$Class = null;
                if (protoBuf$Class != null) {
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(0);
        R = protoBuf$Class;
        protoBuf$Class.r();
    }

    public ProtoBuf$Class() {
        throw null;
    }

    public ProtoBuf$Class(int i10) {
        this.f14054r = -1;
        this.f14056t = -1;
        this.f14059w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        this.f14047j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.Integer] */
    public ProtoBuf$Class(c cVar, d dVar) {
        List list;
        int f10;
        int d5;
        h hVar;
        ProtoBuf$VersionRequirementTable.b bVar;
        this.f14054r = -1;
        this.f14056t = -1;
        this.f14059w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        r();
        a.b w10 = i9.a.w();
        CodedOutputStream j2 = CodedOutputStream.j(w10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    switch (n) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f14048k |= 1;
                            this.f14049l = cVar.f();
                            break;
                        case 16:
                            if (!(z11 & true)) {
                                this.f14053q = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14053q;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 18:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14053q = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14053q.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 24:
                            this.f14048k |= 2;
                            this.f14050m = cVar.f();
                            break;
                        case 32:
                            this.f14048k |= 4;
                            this.n = cVar.f();
                            break;
                        case 42:
                            if (!(z11 & true)) {
                                this.f14051o = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14051o;
                            hVar = cVar.g(ProtoBuf$TypeParameter.f14350v, dVar);
                            list.add(hVar);
                            break;
                        case 50:
                            if (!(z11 & true)) {
                                this.f14052p = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14052p;
                            hVar = cVar.g(ProtoBuf$Type.C, dVar);
                            list.add(hVar);
                            break;
                        case 56:
                            if (!(z11 & true)) {
                                this.f14055s = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14055s;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 58:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14055s = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14055s.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 66:
                            if (!(z11 & true)) {
                                this.f14060x = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14060x;
                            hVar = cVar.g(ProtoBuf$Constructor.f14084r, dVar);
                            list.add(hVar);
                            break;
                        case 74:
                            if (!(z11 & true)) {
                                this.f14061y = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14061y;
                            hVar = cVar.g(ProtoBuf$Function.D, dVar);
                            list.add(hVar);
                            break;
                        case 82:
                            if (!(z11 & true)) {
                                this.f14062z = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14062z;
                            hVar = cVar.g(ProtoBuf$Property.D, dVar);
                            list.add(hVar);
                            break;
                        case 90:
                            if (!(z11 & true)) {
                                this.A = new ArrayList();
                                z11 |= true;
                            }
                            list = this.A;
                            hVar = cVar.g(ProtoBuf$TypeAlias.f14327x, dVar);
                            list.add(hVar);
                            break;
                        case 106:
                            if (!(z11 & true)) {
                                this.B = new ArrayList();
                                z11 |= true;
                            }
                            list = this.B;
                            hVar = cVar.g(ProtoBuf$EnumEntry.f14125p, dVar);
                            list.add(hVar);
                            break;
                        case 128:
                            if (!(z11 & true)) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            list = this.C;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 130:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.C.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 136:
                            this.f14048k |= 8;
                            this.E = cVar.f();
                            break;
                        case 146:
                            ProtoBuf$Type.b u10 = (this.f14048k & 16) == 16 ? this.F.u() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                            this.F = protoBuf$Type;
                            if (u10 != null) {
                                u10.m(protoBuf$Type);
                                this.F = u10.l();
                            }
                            this.f14048k |= 16;
                            break;
                        case 152:
                            this.f14048k |= 32;
                            this.G = cVar.f();
                            break;
                        case 162:
                            if (!(z11 & true)) {
                                this.f14057u = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14057u;
                            hVar = cVar.g(ProtoBuf$Type.C, dVar);
                            list.add(hVar);
                            break;
                        case 168:
                            if (!(z11 & true)) {
                                this.f14058v = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14058v;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 170:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14058v = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14058v.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 176:
                            if (!(z11 & true)) {
                                this.H = new ArrayList();
                                z11 |= true;
                            }
                            list = this.H;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 178:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.H = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.H.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 186:
                            if (!(z11 & true)) {
                                this.J = new ArrayList();
                                z11 |= true;
                            }
                            list = this.J;
                            hVar = cVar.g(ProtoBuf$Type.C, dVar);
                            list.add(hVar);
                            break;
                        case 192:
                            if (!(z11 & true)) {
                                this.K = new ArrayList();
                                z11 |= true;
                            }
                            list = this.K;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 194:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.K = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.K.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d5);
                            break;
                        case 242:
                            ProtoBuf$TypeTable.b k3 = (this.f14048k & 64) == 64 ? this.M.k() : null;
                            ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) cVar.g(ProtoBuf$TypeTable.f14373p, dVar);
                            this.M = protoBuf$TypeTable;
                            if (k3 != null) {
                                k3.l(protoBuf$TypeTable);
                                this.M = k3.k();
                            }
                            this.f14048k |= 64;
                            break;
                        case 248:
                            if (!(z11 & true)) {
                                this.N = new ArrayList();
                                z11 |= true;
                            }
                            list = this.N;
                            f10 = cVar.f();
                            hVar = Integer.valueOf(f10);
                            list.add(hVar);
                            break;
                        case 250:
                            int d10 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.N = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.N.add(Integer.valueOf(cVar.f()));
                            }
                            cVar.c(d10);
                            break;
                        case 258:
                            if ((this.f14048k & 128) == 128) {
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = this.O;
                                protoBuf$VersionRequirementTable.getClass();
                                bVar = new ProtoBuf$VersionRequirementTable.b();
                                bVar.l(protoBuf$VersionRequirementTable);
                            } else {
                                bVar = null;
                            }
                            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) cVar.g(ProtoBuf$VersionRequirementTable.n, dVar);
                            this.O = protoBuf$VersionRequirementTable2;
                            if (bVar != null) {
                                bVar.l(protoBuf$VersionRequirementTable2);
                                this.O = bVar.k();
                            }
                            this.f14048k |= 128;
                            break;
                        default:
                            if (p(cVar, j2, dVar, n)) {
                                break;
                            }
                            z10 = true;
                            break;
                    }
                } catch (Throwable th) {
                    if (z11 & true) {
                        this.f14053q = Collections.unmodifiableList(this.f14053q);
                    }
                    if (z11 & true) {
                        this.f14051o = Collections.unmodifiableList(this.f14051o);
                    }
                    if (z11 & true) {
                        this.f14052p = Collections.unmodifiableList(this.f14052p);
                    }
                    if (z11 & true) {
                        this.f14055s = Collections.unmodifiableList(this.f14055s);
                    }
                    if (z11 & true) {
                        this.f14060x = Collections.unmodifiableList(this.f14060x);
                    }
                    if (z11 & true) {
                        this.f14061y = Collections.unmodifiableList(this.f14061y);
                    }
                    if (z11 & true) {
                        this.f14062z = Collections.unmodifiableList(this.f14062z);
                    }
                    if (z11 & true) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if (z11 & true) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (z11 & true) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if (z11 & true) {
                        this.f14057u = Collections.unmodifiableList(this.f14057u);
                    }
                    if (z11 & true) {
                        this.f14058v = Collections.unmodifiableList(this.f14058v);
                    }
                    if (z11 & true) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (z11 & true) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if (z11 & true) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if (z11 & true) {
                        this.N = Collections.unmodifiableList(this.N);
                    }
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f14047j = w10.c();
                        throw th2;
                    }
                    this.f14047j = w10.c();
                    n();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.a(this);
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.a(this);
                throw invalidProtocolBufferException;
            }
        }
        if (z11 & true) {
            this.f14053q = Collections.unmodifiableList(this.f14053q);
        }
        if (z11 & true) {
            this.f14051o = Collections.unmodifiableList(this.f14051o);
        }
        if (z11 & true) {
            this.f14052p = Collections.unmodifiableList(this.f14052p);
        }
        if (z11 & true) {
            this.f14055s = Collections.unmodifiableList(this.f14055s);
        }
        if (z11 & true) {
            this.f14060x = Collections.unmodifiableList(this.f14060x);
        }
        if (z11 & true) {
            this.f14061y = Collections.unmodifiableList(this.f14061y);
        }
        if (z11 & true) {
            this.f14062z = Collections.unmodifiableList(this.f14062z);
        }
        if (z11 & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if (z11 & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if (z11 & true) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if (z11 & true) {
            this.f14057u = Collections.unmodifiableList(this.f14057u);
        }
        if (z11 & true) {
            this.f14058v = Collections.unmodifiableList(this.f14058v);
        }
        if (z11 & true) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if (z11 & true) {
            this.J = Collections.unmodifiableList(this.J);
        }
        if (z11 & true) {
            this.K = Collections.unmodifiableList(this.K);
        }
        if (z11 & true) {
            this.N = Collections.unmodifiableList(this.N);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14047j = w10.c();
            throw th3;
        }
        this.f14047j = w10.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b5 = this.P;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if ((this.f14048k & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.P = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f14051o.size(); i10++) {
            if (!this.f14051o.get(i10).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f14052p.size(); i11++) {
            if (!this.f14052p.get(i11).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f14057u.size(); i12++) {
            if (!this.f14057u.get(i12).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f14060x.size(); i13++) {
            if (!this.f14060x.get(i13).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f14061y.size(); i14++) {
            if (!this.f14061y.get(i14).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f14062z.size(); i15++) {
            if (!this.f14062z.get(i15).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.A.size(); i16++) {
            if (!this.A.get(i16).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.B.size(); i17++) {
            if (!this.B.get(i17).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        if ((this.f14048k & 16) == 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.F.a()) {
            this.P = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.J.size(); i18++) {
            if (!this.J.get(i18).a()) {
                this.P = (byte) 0;
                return false;
            }
        }
        if ((this.f14048k & 64) == 64) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.M.a()) {
            this.P = (byte) 0;
            return false;
        } else if (!j()) {
            this.P = (byte) 0;
            return false;
        } else {
            this.P = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.Q;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14048k & 1) == 1) {
            i10 = CodedOutputStream.b(1, this.f14049l) + 0;
        } else {
            i10 = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f14053q.size(); i13++) {
            i12 += CodedOutputStream.c(this.f14053q.get(i13).intValue());
        }
        int i14 = i10 + i12;
        if (!this.f14053q.isEmpty()) {
            i14 = i14 + 1 + CodedOutputStream.c(i12);
        }
        this.f14054r = i12;
        if ((this.f14048k & 2) == 2) {
            i14 += CodedOutputStream.b(3, this.f14050m);
        }
        if ((this.f14048k & 4) == 4) {
            i14 += CodedOutputStream.b(4, this.n);
        }
        for (int i15 = 0; i15 < this.f14051o.size(); i15++) {
            i14 += CodedOutputStream.d(5, this.f14051o.get(i15));
        }
        for (int i16 = 0; i16 < this.f14052p.size(); i16++) {
            i14 += CodedOutputStream.d(6, this.f14052p.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f14055s.size(); i18++) {
            i17 += CodedOutputStream.c(this.f14055s.get(i18).intValue());
        }
        int i19 = i14 + i17;
        if (!this.f14055s.isEmpty()) {
            i19 = i19 + 1 + CodedOutputStream.c(i17);
        }
        this.f14056t = i17;
        for (int i20 = 0; i20 < this.f14060x.size(); i20++) {
            i19 += CodedOutputStream.d(8, this.f14060x.get(i20));
        }
        for (int i21 = 0; i21 < this.f14061y.size(); i21++) {
            i19 += CodedOutputStream.d(9, this.f14061y.get(i21));
        }
        for (int i22 = 0; i22 < this.f14062z.size(); i22++) {
            i19 += CodedOutputStream.d(10, this.f14062z.get(i22));
        }
        for (int i23 = 0; i23 < this.A.size(); i23++) {
            i19 += CodedOutputStream.d(11, this.A.get(i23));
        }
        for (int i24 = 0; i24 < this.B.size(); i24++) {
            i19 += CodedOutputStream.d(13, this.B.get(i24));
        }
        int i25 = 0;
        for (int i26 = 0; i26 < this.C.size(); i26++) {
            i25 += CodedOutputStream.c(this.C.get(i26).intValue());
        }
        int i27 = i19 + i25;
        if (!this.C.isEmpty()) {
            i27 = i27 + 2 + CodedOutputStream.c(i25);
        }
        this.D = i25;
        if ((this.f14048k & 8) == 8) {
            i27 += CodedOutputStream.b(17, this.E);
        }
        if ((this.f14048k & 16) == 16) {
            i27 += CodedOutputStream.d(18, this.F);
        }
        if ((this.f14048k & 32) == 32) {
            i27 += CodedOutputStream.b(19, this.G);
        }
        for (int i28 = 0; i28 < this.f14057u.size(); i28++) {
            i27 += CodedOutputStream.d(20, this.f14057u.get(i28));
        }
        int i29 = 0;
        for (int i30 = 0; i30 < this.f14058v.size(); i30++) {
            i29 += CodedOutputStream.c(this.f14058v.get(i30).intValue());
        }
        int i31 = i27 + i29;
        if (!this.f14058v.isEmpty()) {
            i31 = i31 + 2 + CodedOutputStream.c(i29);
        }
        this.f14059w = i29;
        int i32 = 0;
        for (int i33 = 0; i33 < this.H.size(); i33++) {
            i32 += CodedOutputStream.c(this.H.get(i33).intValue());
        }
        int i34 = i31 + i32;
        if (!this.H.isEmpty()) {
            i34 = i34 + 2 + CodedOutputStream.c(i32);
        }
        this.I = i32;
        for (int i35 = 0; i35 < this.J.size(); i35++) {
            i34 += CodedOutputStream.d(23, this.J.get(i35));
        }
        int i36 = 0;
        for (int i37 = 0; i37 < this.K.size(); i37++) {
            i36 += CodedOutputStream.c(this.K.get(i37).intValue());
        }
        int i38 = i34 + i36;
        if (!this.K.isEmpty()) {
            i38 = i38 + 2 + CodedOutputStream.c(i36);
        }
        this.L = i36;
        if ((this.f14048k & 64) == 64) {
            i38 += CodedOutputStream.d(30, this.M);
        }
        int i39 = 0;
        for (int i40 = 0; i40 < this.N.size(); i40++) {
            i39 += CodedOutputStream.c(this.N.get(i40).intValue());
        }
        int size = (this.N.size() * 2) + i38 + i39;
        if ((this.f14048k & 128) == 128) {
            size += CodedOutputStream.d(32, this.O);
        }
        int size2 = this.f14047j.size() + k() + size;
        this.Q = size2;
        return size2;
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
        return R;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14048k & 1) == 1) {
            codedOutputStream.m(1, this.f14049l);
        }
        if (this.f14053q.size() > 0) {
            codedOutputStream.v(18);
            codedOutputStream.v(this.f14054r);
        }
        for (int i10 = 0; i10 < this.f14053q.size(); i10++) {
            codedOutputStream.n(this.f14053q.get(i10).intValue());
        }
        if ((this.f14048k & 2) == 2) {
            codedOutputStream.m(3, this.f14050m);
        }
        if ((this.f14048k & 4) == 4) {
            codedOutputStream.m(4, this.n);
        }
        for (int i11 = 0; i11 < this.f14051o.size(); i11++) {
            codedOutputStream.o(5, this.f14051o.get(i11));
        }
        for (int i12 = 0; i12 < this.f14052p.size(); i12++) {
            codedOutputStream.o(6, this.f14052p.get(i12));
        }
        if (this.f14055s.size() > 0) {
            codedOutputStream.v(58);
            codedOutputStream.v(this.f14056t);
        }
        for (int i13 = 0; i13 < this.f14055s.size(); i13++) {
            codedOutputStream.n(this.f14055s.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f14060x.size(); i14++) {
            codedOutputStream.o(8, this.f14060x.get(i14));
        }
        for (int i15 = 0; i15 < this.f14061y.size(); i15++) {
            codedOutputStream.o(9, this.f14061y.get(i15));
        }
        for (int i16 = 0; i16 < this.f14062z.size(); i16++) {
            codedOutputStream.o(10, this.f14062z.get(i16));
        }
        for (int i17 = 0; i17 < this.A.size(); i17++) {
            codedOutputStream.o(11, this.A.get(i17));
        }
        for (int i18 = 0; i18 < this.B.size(); i18++) {
            codedOutputStream.o(13, this.B.get(i18));
        }
        if (this.C.size() > 0) {
            codedOutputStream.v(130);
            codedOutputStream.v(this.D);
        }
        for (int i19 = 0; i19 < this.C.size(); i19++) {
            codedOutputStream.n(this.C.get(i19).intValue());
        }
        if ((this.f14048k & 8) == 8) {
            codedOutputStream.m(17, this.E);
        }
        if ((this.f14048k & 16) == 16) {
            codedOutputStream.o(18, this.F);
        }
        if ((this.f14048k & 32) == 32) {
            codedOutputStream.m(19, this.G);
        }
        for (int i20 = 0; i20 < this.f14057u.size(); i20++) {
            codedOutputStream.o(20, this.f14057u.get(i20));
        }
        if (this.f14058v.size() > 0) {
            codedOutputStream.v(170);
            codedOutputStream.v(this.f14059w);
        }
        for (int i21 = 0; i21 < this.f14058v.size(); i21++) {
            codedOutputStream.n(this.f14058v.get(i21).intValue());
        }
        if (this.H.size() > 0) {
            codedOutputStream.v(178);
            codedOutputStream.v(this.I);
        }
        for (int i22 = 0; i22 < this.H.size(); i22++) {
            codedOutputStream.n(this.H.get(i22).intValue());
        }
        for (int i23 = 0; i23 < this.J.size(); i23++) {
            codedOutputStream.o(23, this.J.get(i23));
        }
        if (this.K.size() > 0) {
            codedOutputStream.v(194);
            codedOutputStream.v(this.L);
        }
        for (int i24 = 0; i24 < this.K.size(); i24++) {
            codedOutputStream.n(this.K.get(i24).intValue());
        }
        if ((this.f14048k & 64) == 64) {
            codedOutputStream.o(30, this.M);
        }
        for (int i25 = 0; i25 < this.N.size(); i25++) {
            codedOutputStream.m(31, this.N.get(i25).intValue());
        }
        if ((this.f14048k & 128) == 128) {
            codedOutputStream.o(32, this.O);
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f14047j);
    }

    public final void r() {
        this.f14049l = 6;
        this.f14050m = 0;
        this.n = 0;
        this.f14051o = Collections.emptyList();
        this.f14052p = Collections.emptyList();
        this.f14053q = Collections.emptyList();
        this.f14055s = Collections.emptyList();
        this.f14057u = Collections.emptyList();
        this.f14058v = Collections.emptyList();
        this.f14060x = Collections.emptyList();
        this.f14061y = Collections.emptyList();
        this.f14062z = Collections.emptyList();
        this.A = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = 0;
        this.F = ProtoBuf$Type.B;
        this.G = 0;
        this.H = Collections.emptyList();
        this.J = Collections.emptyList();
        this.K = Collections.emptyList();
        this.M = ProtoBuf$TypeTable.f14372o;
        this.N = Collections.emptyList();
        this.O = ProtoBuf$VersionRequirementTable.f14426m;
    }

    public ProtoBuf$Class(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14054r = -1;
        this.f14056t = -1;
        this.f14059w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        this.f14047j = bVar.f14526i;
    }
}

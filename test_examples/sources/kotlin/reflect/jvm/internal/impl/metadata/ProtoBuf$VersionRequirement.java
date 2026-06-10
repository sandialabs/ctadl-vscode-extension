package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.f;
import java.io.IOException;
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
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements f {

    /* renamed from: s  reason: collision with root package name */
    public static final ProtoBuf$VersionRequirement f14399s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f14400t = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14401i;

    /* renamed from: j  reason: collision with root package name */
    public int f14402j;

    /* renamed from: k  reason: collision with root package name */
    public int f14403k;

    /* renamed from: l  reason: collision with root package name */
    public int f14404l;

    /* renamed from: m  reason: collision with root package name */
    public Level f14405m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f14406o;

    /* renamed from: p  reason: collision with root package name */
    public VersionKind f14407p;

    /* renamed from: q  reason: collision with root package name */
    public byte f14408q;

    /* renamed from: r  reason: collision with root package name */
    public int f14409r;

    /* loaded from: classes.dex */
    public enum Level implements f.a {
        f14410j("WARNING"),
        f14411k("ERROR"),
        f14412l("HIDDEN");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14414i;

        Level(String str) {
            this.f14414i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14414i;
        }
    }

    /* loaded from: classes.dex */
    public enum VersionKind implements f.a {
        f14415j("LANGUAGE_VERSION"),
        f14416k("COMPILER_VERSION"),
        f14417l("API_VERSION");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14419i;

        VersionKind(String str) {
            this.f14419i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14419i;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$VersionRequirement> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$VersionRequirement(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$VersionRequirement, b> implements i9.f {

        /* renamed from: j  reason: collision with root package name */
        public int f14420j;

        /* renamed from: k  reason: collision with root package name */
        public int f14421k;

        /* renamed from: l  reason: collision with root package name */
        public int f14422l;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f14424o;

        /* renamed from: m  reason: collision with root package name */
        public Level f14423m = Level.f14411k;

        /* renamed from: p  reason: collision with root package name */
        public VersionKind f14425p = VersionKind.f14415j;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$VersionRequirement k3 = k();
            if (k3.a()) {
                return k3;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a, kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final /* bridge */ /* synthetic */ h.a g(c cVar, d dVar) {
            m(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a
        public final /* bridge */ /* synthetic */ a.AbstractC0162a h(c cVar, d dVar) {
            m(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final b i() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            l(protoBuf$VersionRequirement);
            return this;
        }

        public final ProtoBuf$VersionRequirement k() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this);
            int i10 = this.f14420j;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$VersionRequirement.f14403k = this.f14421k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$VersionRequirement.f14404l = this.f14422l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$VersionRequirement.f14405m = this.f14423m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$VersionRequirement.n = this.n;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$VersionRequirement.f14406o = this.f14424o;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            protoBuf$VersionRequirement.f14407p = this.f14425p;
            protoBuf$VersionRequirement.f14402j = i11;
            return protoBuf$VersionRequirement;
        }

        public final void l(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.f14399s) {
                return;
            }
            int i10 = protoBuf$VersionRequirement.f14402j;
            boolean z15 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$VersionRequirement.f14403k;
                this.f14420j |= 1;
                this.f14421k = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$VersionRequirement.f14404l;
                this.f14420j = 2 | this.f14420j;
                this.f14422l = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                Level level = protoBuf$VersionRequirement.f14405m;
                level.getClass();
                this.f14420j = 4 | this.f14420j;
                this.f14423m = level;
            }
            int i13 = protoBuf$VersionRequirement.f14402j;
            if ((i13 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i14 = protoBuf$VersionRequirement.n;
                this.f14420j = 8 | this.f14420j;
                this.n = i14;
            }
            if ((i13 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i15 = protoBuf$VersionRequirement.f14406o;
                this.f14420j = 16 | this.f14420j;
                this.f14424o = i15;
            }
            if ((i13 & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                VersionKind versionKind = protoBuf$VersionRequirement.f14407p;
                versionKind.getClass();
                this.f14420j = 32 | this.f14420j;
                this.f14425p = versionKind;
            }
            this.f14526i = this.f14526i.d(protoBuf$VersionRequirement.f14401i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement;
            try {
                try {
                    ProtoBuf$VersionRequirement.f14400t.getClass();
                    l(new ProtoBuf$VersionRequirement(cVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$VersionRequirement = null;
                    if (protoBuf$VersionRequirement != null) {
                        l(protoBuf$VersionRequirement);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$VersionRequirement != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement();
        f14399s = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.f14403k = 0;
        protoBuf$VersionRequirement.f14404l = 0;
        protoBuf$VersionRequirement.f14405m = Level.f14411k;
        protoBuf$VersionRequirement.n = 0;
        protoBuf$VersionRequirement.f14406o = 0;
        protoBuf$VersionRequirement.f14407p = VersionKind.f14415j;
    }

    public ProtoBuf$VersionRequirement() {
        this.f14408q = (byte) -1;
        this.f14409r = -1;
        this.f14401i = i9.a.f11832i;
    }

    public ProtoBuf$VersionRequirement(c cVar) {
        int k3;
        this.f14408q = (byte) -1;
        this.f14409r = -1;
        boolean z10 = false;
        this.f14403k = 0;
        this.f14404l = 0;
        Level level = Level.f14411k;
        this.f14405m = level;
        this.n = 0;
        this.f14406o = 0;
        VersionKind versionKind = VersionKind.f14415j;
        this.f14407p = versionKind;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f14402j |= 1;
                            this.f14403k = cVar.k();
                        } else if (n != 16) {
                            VersionKind versionKind2 = null;
                            Level level2 = null;
                            if (n == 24) {
                                k3 = cVar.k();
                                if (k3 == 0) {
                                    level2 = Level.f14410j;
                                } else if (k3 == 1) {
                                    level2 = level;
                                } else if (k3 == 2) {
                                    level2 = Level.f14412l;
                                }
                                if (level2 == null) {
                                    j2.v(n);
                                    j2.v(k3);
                                } else {
                                    this.f14402j |= 4;
                                    this.f14405m = level2;
                                }
                            } else if (n == 32) {
                                this.f14402j |= 8;
                                this.n = cVar.k();
                            } else if (n == 40) {
                                this.f14402j |= 16;
                                this.f14406o = cVar.k();
                            } else if (n != 48) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                k3 = cVar.k();
                                if (k3 == 0) {
                                    versionKind2 = versionKind;
                                } else if (k3 == 1) {
                                    versionKind2 = VersionKind.f14416k;
                                } else if (k3 == 2) {
                                    versionKind2 = VersionKind.f14417l;
                                }
                                if (versionKind2 != null) {
                                    this.f14402j |= 32;
                                    this.f14407p = versionKind2;
                                } else {
                                    j2.v(n);
                                    j2.v(k3);
                                }
                            }
                        } else {
                            this.f14402j |= 2;
                            this.f14404l = cVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f14401i = bVar.c();
                        throw th2;
                    }
                    this.f14401i = bVar.c();
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
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14401i = bVar.c();
            throw th3;
        }
        this.f14401i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14408q;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        this.f14408q = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14409r;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        if ((this.f14402j & 1) == 1) {
            i11 = 0 + CodedOutputStream.b(1, this.f14403k);
        }
        if ((this.f14402j & 2) == 2) {
            i11 += CodedOutputStream.b(2, this.f14404l);
        }
        if ((this.f14402j & 4) == 4) {
            i11 += CodedOutputStream.a(3, this.f14405m.f14414i);
        }
        if ((this.f14402j & 8) == 8) {
            i11 += CodedOutputStream.b(4, this.n);
        }
        if ((this.f14402j & 16) == 16) {
            i11 += CodedOutputStream.b(5, this.f14406o);
        }
        if ((this.f14402j & 32) == 32) {
            i11 += CodedOutputStream.a(6, this.f14407p.f14419i);
        }
        int size = this.f14401i.size() + i11;
        this.f14409r = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a d() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f14402j & 1) == 1) {
            codedOutputStream.m(1, this.f14403k);
        }
        if ((this.f14402j & 2) == 2) {
            codedOutputStream.m(2, this.f14404l);
        }
        if ((this.f14402j & 4) == 4) {
            codedOutputStream.l(3, this.f14405m.f14414i);
        }
        if ((this.f14402j & 8) == 8) {
            codedOutputStream.m(4, this.n);
        }
        if ((this.f14402j & 16) == 16) {
            codedOutputStream.m(5, this.f14406o);
        }
        if ((this.f14402j & 32) == 32) {
            codedOutputStream.l(6, this.f14407p.f14419i);
        }
        codedOutputStream.r(this.f14401i);
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14408q = (byte) -1;
        this.f14409r = -1;
        this.f14401i = aVar.f14526i;
    }
}

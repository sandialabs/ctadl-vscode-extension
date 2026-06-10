package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {

    /* renamed from: s  reason: collision with root package name */
    public static final ProtoBuf$Package f14190s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f14191t = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14192j;

    /* renamed from: k  reason: collision with root package name */
    public int f14193k;

    /* renamed from: l  reason: collision with root package name */
    public List<ProtoBuf$Function> f14194l;

    /* renamed from: m  reason: collision with root package name */
    public List<ProtoBuf$Property> f14195m;
    public List<ProtoBuf$TypeAlias> n;

    /* renamed from: o  reason: collision with root package name */
    public ProtoBuf$TypeTable f14196o;

    /* renamed from: p  reason: collision with root package name */
    public ProtoBuf$VersionRequirementTable f14197p;

    /* renamed from: q  reason: collision with root package name */
    public byte f14198q;

    /* renamed from: r  reason: collision with root package name */
    public int f14199r;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Package> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Package(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Package, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14200l;

        /* renamed from: m  reason: collision with root package name */
        public List<ProtoBuf$Function> f14201m = Collections.emptyList();
        public List<ProtoBuf$Property> n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        public List<ProtoBuf$TypeAlias> f14202o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        public ProtoBuf$TypeTable f14203p = ProtoBuf$TypeTable.f14372o;

        /* renamed from: q  reason: collision with root package name */
        public ProtoBuf$VersionRequirementTable f14204q = ProtoBuf$VersionRequirementTable.f14426m;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Package l2 = l();
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
            m((ProtoBuf$Package) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Package l() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
            int i10 = this.f14200l;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f14201m = Collections.unmodifiableList(this.f14201m);
                this.f14200l &= -2;
            }
            protoBuf$Package.f14194l = this.f14201m;
            if ((this.f14200l & 2) == 2) {
                this.n = Collections.unmodifiableList(this.n);
                this.f14200l &= -3;
            }
            protoBuf$Package.f14195m = this.n;
            if ((this.f14200l & 4) == 4) {
                this.f14202o = Collections.unmodifiableList(this.f14202o);
                this.f14200l &= -5;
            }
            protoBuf$Package.n = this.f14202o;
            if ((i10 & 8) != 8) {
                i11 = 0;
            }
            protoBuf$Package.f14196o = this.f14203p;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            protoBuf$Package.f14197p = this.f14204q;
            protoBuf$Package.f14193k = i11;
            return protoBuf$Package;
        }

        public final void m(ProtoBuf$Package protoBuf$Package) {
            boolean z10;
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            if (protoBuf$Package == ProtoBuf$Package.f14190s) {
                return;
            }
            boolean z11 = true;
            if (!protoBuf$Package.f14194l.isEmpty()) {
                if (this.f14201m.isEmpty()) {
                    this.f14201m = protoBuf$Package.f14194l;
                    this.f14200l &= -2;
                } else {
                    if ((this.f14200l & 1) != 1) {
                        this.f14201m = new ArrayList(this.f14201m);
                        this.f14200l |= 1;
                    }
                    this.f14201m.addAll(protoBuf$Package.f14194l);
                }
            }
            if (!protoBuf$Package.f14195m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = protoBuf$Package.f14195m;
                    this.f14200l &= -3;
                } else {
                    if ((this.f14200l & 2) != 2) {
                        this.n = new ArrayList(this.n);
                        this.f14200l |= 2;
                    }
                    this.n.addAll(protoBuf$Package.f14195m);
                }
            }
            if (!protoBuf$Package.n.isEmpty()) {
                if (this.f14202o.isEmpty()) {
                    this.f14202o = protoBuf$Package.n;
                    this.f14200l &= -5;
                } else {
                    if ((this.f14200l & 4) != 4) {
                        this.f14202o = new ArrayList(this.f14202o);
                        this.f14200l |= 4;
                    }
                    this.f14202o.addAll(protoBuf$Package.n);
                }
            }
            if ((protoBuf$Package.f14193k & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Package.f14196o;
                if ((this.f14200l & 8) == 8 && (protoBuf$TypeTable = this.f14203p) != ProtoBuf$TypeTable.f14372o) {
                    ProtoBuf$TypeTable.b j2 = ProtoBuf$TypeTable.j(protoBuf$TypeTable);
                    j2.l(protoBuf$TypeTable2);
                    protoBuf$TypeTable2 = j2.k();
                }
                this.f14203p = protoBuf$TypeTable2;
                this.f14200l |= 8;
            }
            if ((protoBuf$Package.f14193k & 2) != 2) {
                z11 = false;
            }
            if (z11) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Package.f14197p;
                if ((this.f14200l & 16) == 16 && (protoBuf$VersionRequirementTable = this.f14204q) != ProtoBuf$VersionRequirementTable.f14426m) {
                    ProtoBuf$VersionRequirementTable.b bVar = new ProtoBuf$VersionRequirementTable.b();
                    bVar.l(protoBuf$VersionRequirementTable);
                    bVar.l(protoBuf$VersionRequirementTable2);
                    protoBuf$VersionRequirementTable2 = bVar.k();
                }
                this.f14204q = protoBuf$VersionRequirementTable2;
                this.f14200l |= 16;
            }
            k(protoBuf$Package);
            this.f14526i = this.f14526i.d(protoBuf$Package.f14192j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Package protoBuf$Package;
            try {
                try {
                    ProtoBuf$Package.f14191t.getClass();
                    m(new ProtoBuf$Package(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Package = null;
                    if (protoBuf$Package != null) {
                        m(protoBuf$Package);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Package = (ProtoBuf$Package) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Package != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(0);
        f14190s = protoBuf$Package;
        protoBuf$Package.f14194l = Collections.emptyList();
        protoBuf$Package.f14195m = Collections.emptyList();
        protoBuf$Package.n = Collections.emptyList();
        protoBuf$Package.f14196o = ProtoBuf$TypeTable.f14372o;
        protoBuf$Package.f14197p = ProtoBuf$VersionRequirementTable.f14426m;
    }

    public ProtoBuf$Package() {
        throw null;
    }

    public ProtoBuf$Package(int i10) {
        this.f14198q = (byte) -1;
        this.f14199r = -1;
        this.f14192j = i9.a.f11832i;
    }

    public ProtoBuf$Package(c cVar, d dVar) {
        List list;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar;
        this.f14198q = (byte) -1;
        this.f14199r = -1;
        this.f14194l = Collections.emptyList();
        this.f14195m = Collections.emptyList();
        this.n = Collections.emptyList();
        this.f14196o = ProtoBuf$TypeTable.f14372o;
        this.f14197p = ProtoBuf$VersionRequirementTable.f14426m;
        a.b bVar2 = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 26) {
                                if (!(z11 & true)) {
                                    this.f14194l = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14194l;
                                bVar = ProtoBuf$Function.D;
                            } else if (n == 34) {
                                if (!(z11 & true)) {
                                    this.f14195m = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14195m;
                                bVar = ProtoBuf$Property.D;
                            } else if (n != 42) {
                                ProtoBuf$VersionRequirementTable.b bVar3 = null;
                                ProtoBuf$TypeTable.b bVar4 = null;
                                if (n == 242) {
                                    if ((this.f14193k & 1) == 1) {
                                        ProtoBuf$TypeTable protoBuf$TypeTable = this.f14196o;
                                        protoBuf$TypeTable.getClass();
                                        bVar4 = ProtoBuf$TypeTable.j(protoBuf$TypeTable);
                                    }
                                    ProtoBuf$TypeTable protoBuf$TypeTable2 = (ProtoBuf$TypeTable) cVar.g(ProtoBuf$TypeTable.f14373p, dVar);
                                    this.f14196o = protoBuf$TypeTable2;
                                    if (bVar4 != null) {
                                        bVar4.l(protoBuf$TypeTable2);
                                        this.f14196o = bVar4.k();
                                    }
                                    this.f14193k |= 1;
                                } else if (n == 258) {
                                    if ((this.f14193k & 2) == 2) {
                                        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = this.f14197p;
                                        protoBuf$VersionRequirementTable.getClass();
                                        bVar3 = new ProtoBuf$VersionRequirementTable.b();
                                        bVar3.l(protoBuf$VersionRequirementTable);
                                    }
                                    ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) cVar.g(ProtoBuf$VersionRequirementTable.n, dVar);
                                    this.f14197p = protoBuf$VersionRequirementTable2;
                                    if (bVar3 != null) {
                                        bVar3.l(protoBuf$VersionRequirementTable2);
                                        this.f14197p = bVar3.k();
                                    }
                                    this.f14193k |= 2;
                                } else if (!p(cVar, j2, dVar, n)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.n = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.n;
                                bVar = ProtoBuf$TypeAlias.f14327x;
                            }
                            list.add(cVar.g(bVar, dVar));
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f14537i = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14194l = Collections.unmodifiableList(this.f14194l);
                }
                if (z11 & true) {
                    this.f14195m = Collections.unmodifiableList(this.f14195m);
                }
                if (z11 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14192j = bVar2.c();
                    throw th2;
                }
                this.f14192j = bVar2.c();
                n();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14194l = Collections.unmodifiableList(this.f14194l);
        }
        if (z11 & true) {
            this.f14195m = Collections.unmodifiableList(this.f14195m);
        }
        if (z11 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14192j = bVar2.c();
            throw th3;
        }
        this.f14192j = bVar2.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        byte b5 = this.f14198q;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14194l.size(); i10++) {
            if (!this.f14194l.get(i10).a()) {
                this.f14198q = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f14195m.size(); i11++) {
            if (!this.f14195m.get(i11).a()) {
                this.f14198q = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            if (!this.n.get(i12).a()) {
                this.f14198q = (byte) 0;
                return false;
            }
        }
        if ((this.f14193k & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f14196o.a()) {
            this.f14198q = (byte) 0;
            return false;
        } else if (!j()) {
            this.f14198q = (byte) 0;
            return false;
        } else {
            this.f14198q = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14199r;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14194l.size(); i12++) {
            i11 += CodedOutputStream.d(3, this.f14194l.get(i12));
        }
        for (int i13 = 0; i13 < this.f14195m.size(); i13++) {
            i11 += CodedOutputStream.d(4, this.f14195m.get(i13));
        }
        for (int i14 = 0; i14 < this.n.size(); i14++) {
            i11 += CodedOutputStream.d(5, this.n.get(i14));
        }
        if ((this.f14193k & 1) == 1) {
            i11 += CodedOutputStream.d(30, this.f14196o);
        }
        if ((this.f14193k & 2) == 2) {
            i11 += CodedOutputStream.d(32, this.f14197p);
        }
        int size = this.f14192j.size() + k() + i11;
        this.f14199r = size;
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
        return f14190s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        for (int i10 = 0; i10 < this.f14194l.size(); i10++) {
            codedOutputStream.o(3, this.f14194l.get(i10));
        }
        for (int i11 = 0; i11 < this.f14195m.size(); i11++) {
            codedOutputStream.o(4, this.f14195m.get(i11));
        }
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            codedOutputStream.o(5, this.n.get(i12));
        }
        if ((this.f14193k & 1) == 1) {
            codedOutputStream.o(30, this.f14196o);
        }
        if ((this.f14193k & 2) == 2) {
            codedOutputStream.o(32, this.f14197p);
        }
        aVar.a(200, codedOutputStream);
        codedOutputStream.r(this.f14192j);
    }

    public ProtoBuf$Package(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14198q = (byte) -1;
        this.f14199r = -1;
        this.f14192j = bVar.f14526i;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.f;
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
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoBuf$VersionRequirementTable f14426m;
    public static final a n = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14427i;

    /* renamed from: j  reason: collision with root package name */
    public List<ProtoBuf$VersionRequirement> f14428j;

    /* renamed from: k  reason: collision with root package name */
    public byte f14429k;

    /* renamed from: l  reason: collision with root package name */
    public int f14430l;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$VersionRequirementTable> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$VersionRequirementTable(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$VersionRequirementTable, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14431j;

        /* renamed from: k  reason: collision with root package name */
        public List<ProtoBuf$VersionRequirement> f14432k = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$VersionRequirementTable k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            l(protoBuf$VersionRequirementTable);
            return this;
        }

        public final ProtoBuf$VersionRequirementTable k() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this);
            if ((this.f14431j & 1) == 1) {
                this.f14432k = Collections.unmodifiableList(this.f14432k);
                this.f14431j &= -2;
            }
            protoBuf$VersionRequirementTable.f14428j = this.f14432k;
            return protoBuf$VersionRequirementTable;
        }

        public final void l(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.f14426m) {
                return;
            }
            if (!protoBuf$VersionRequirementTable.f14428j.isEmpty()) {
                if (this.f14432k.isEmpty()) {
                    this.f14432k = protoBuf$VersionRequirementTable.f14428j;
                    this.f14431j &= -2;
                } else {
                    if ((this.f14431j & 1) != 1) {
                        this.f14432k = new ArrayList(this.f14432k);
                        this.f14431j |= 1;
                    }
                    this.f14432k.addAll(protoBuf$VersionRequirementTable.f14428j);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$VersionRequirementTable.f14427i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            try {
                try {
                    ProtoBuf$VersionRequirementTable.n.getClass();
                    l(new ProtoBuf$VersionRequirementTable(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$VersionRequirementTable = null;
                    if (protoBuf$VersionRequirementTable != null) {
                        l(protoBuf$VersionRequirementTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$VersionRequirementTable != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable();
        f14426m = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.f14428j = Collections.emptyList();
    }

    public ProtoBuf$VersionRequirementTable() {
        this.f14429k = (byte) -1;
        this.f14430l = -1;
        this.f14427i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$VersionRequirementTable(c cVar, d dVar) {
        this.f14429k = (byte) -1;
        this.f14430l = -1;
        this.f14428j = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = cVar.n();
                    if (n10 != 0) {
                        if (n10 == 10) {
                            if (!(z11 & true)) {
                                this.f14428j = new ArrayList();
                                z11 |= true;
                            }
                            this.f14428j.add(cVar.g(ProtoBuf$VersionRequirement.f14400t, dVar));
                        } else if (!cVar.q(n10, j2)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f14537i = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14428j = Collections.unmodifiableList(this.f14428j);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14427i = bVar.c();
                    throw th2;
                }
                this.f14427i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14428j = Collections.unmodifiableList(this.f14428j);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14427i = bVar.c();
            throw th3;
        }
        this.f14427i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14429k;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        this.f14429k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14430l;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14428j.size(); i12++) {
            i11 += CodedOutputStream.d(1, this.f14428j.get(i12));
        }
        int size = this.f14427i.size() + i11;
        this.f14430l = size;
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
        for (int i10 = 0; i10 < this.f14428j.size(); i10++) {
            codedOutputStream.o(1, this.f14428j.get(i10));
        }
        codedOutputStream.r(this.f14427i);
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14429k = (byte) -1;
        this.f14430l = -1;
        this.f14427i = aVar.f14526i;
    }
}

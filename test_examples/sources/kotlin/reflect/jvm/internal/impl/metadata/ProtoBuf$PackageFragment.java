package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {

    /* renamed from: r  reason: collision with root package name */
    public static final ProtoBuf$PackageFragment f14205r;

    /* renamed from: s  reason: collision with root package name */
    public static final a f14206s = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14207j;

    /* renamed from: k  reason: collision with root package name */
    public int f14208k;

    /* renamed from: l  reason: collision with root package name */
    public ProtoBuf$StringTable f14209l;

    /* renamed from: m  reason: collision with root package name */
    public ProtoBuf$QualifiedNameTable f14210m;
    public ProtoBuf$Package n;

    /* renamed from: o  reason: collision with root package name */
    public List<ProtoBuf$Class> f14211o;

    /* renamed from: p  reason: collision with root package name */
    public byte f14212p;

    /* renamed from: q  reason: collision with root package name */
    public int f14213q;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$PackageFragment> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$PackageFragment(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$PackageFragment, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14214l;

        /* renamed from: m  reason: collision with root package name */
        public ProtoBuf$StringTable f14215m = ProtoBuf$StringTable.f14272m;
        public ProtoBuf$QualifiedNameTable n = ProtoBuf$QualifiedNameTable.f14248m;

        /* renamed from: o  reason: collision with root package name */
        public ProtoBuf$Package f14216o = ProtoBuf$Package.f14190s;

        /* renamed from: p  reason: collision with root package name */
        public List<ProtoBuf$Class> f14217p = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$PackageFragment l2 = l();
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
            m((ProtoBuf$PackageFragment) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$PackageFragment l() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
            int i10 = this.f14214l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$PackageFragment.f14209l = this.f14215m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$PackageFragment.f14210m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$PackageFragment.n = this.f14216o;
            if ((i10 & 8) == 8) {
                this.f14217p = Collections.unmodifiableList(this.f14217p);
                this.f14214l &= -9;
            }
            protoBuf$PackageFragment.f14211o = this.f14217p;
            protoBuf$PackageFragment.f14208k = i11;
            return protoBuf$PackageFragment;
        }

        public final void m(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            boolean z10;
            boolean z11;
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$StringTable protoBuf$StringTable;
            if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.f14205r) {
                return;
            }
            boolean z12 = true;
            if ((protoBuf$PackageFragment.f14208k & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ProtoBuf$StringTable protoBuf$StringTable2 = protoBuf$PackageFragment.f14209l;
                if ((this.f14214l & 1) == 1 && (protoBuf$StringTable = this.f14215m) != ProtoBuf$StringTable.f14272m) {
                    ProtoBuf$StringTable.b bVar = new ProtoBuf$StringTable.b();
                    bVar.l(protoBuf$StringTable);
                    bVar.l(protoBuf$StringTable2);
                    protoBuf$StringTable2 = bVar.k();
                }
                this.f14215m = protoBuf$StringTable2;
                this.f14214l |= 1;
            }
            if ((protoBuf$PackageFragment.f14208k & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = protoBuf$PackageFragment.f14210m;
                if ((this.f14214l & 2) == 2 && (protoBuf$QualifiedNameTable = this.n) != ProtoBuf$QualifiedNameTable.f14248m) {
                    ProtoBuf$QualifiedNameTable.b bVar2 = new ProtoBuf$QualifiedNameTable.b();
                    bVar2.l(protoBuf$QualifiedNameTable);
                    bVar2.l(protoBuf$QualifiedNameTable2);
                    protoBuf$QualifiedNameTable2 = bVar2.k();
                }
                this.n = protoBuf$QualifiedNameTable2;
                this.f14214l |= 2;
            }
            if ((protoBuf$PackageFragment.f14208k & 4) != 4) {
                z12 = false;
            }
            if (z12) {
                ProtoBuf$Package protoBuf$Package2 = protoBuf$PackageFragment.n;
                if ((this.f14214l & 4) == 4 && (protoBuf$Package = this.f14216o) != ProtoBuf$Package.f14190s) {
                    ProtoBuf$Package.b bVar3 = new ProtoBuf$Package.b();
                    bVar3.m(protoBuf$Package);
                    bVar3.m(protoBuf$Package2);
                    protoBuf$Package2 = bVar3.l();
                }
                this.f14216o = protoBuf$Package2;
                this.f14214l |= 4;
            }
            if (!protoBuf$PackageFragment.f14211o.isEmpty()) {
                if (this.f14217p.isEmpty()) {
                    this.f14217p = protoBuf$PackageFragment.f14211o;
                    this.f14214l &= -9;
                } else {
                    if ((this.f14214l & 8) != 8) {
                        this.f14217p = new ArrayList(this.f14217p);
                        this.f14214l |= 8;
                    }
                    this.f14217p.addAll(protoBuf$PackageFragment.f14211o);
                }
            }
            k(protoBuf$PackageFragment);
            this.f14526i = this.f14526i.d(protoBuf$PackageFragment.f14207j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            try {
                try {
                    ProtoBuf$PackageFragment.f14206s.getClass();
                    m(new ProtoBuf$PackageFragment(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$PackageFragment = null;
                    if (protoBuf$PackageFragment != null) {
                        m(protoBuf$PackageFragment);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$PackageFragment = (ProtoBuf$PackageFragment) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$PackageFragment != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(0);
        f14205r = protoBuf$PackageFragment;
        protoBuf$PackageFragment.f14209l = ProtoBuf$StringTable.f14272m;
        protoBuf$PackageFragment.f14210m = ProtoBuf$QualifiedNameTable.f14248m;
        protoBuf$PackageFragment.n = ProtoBuf$Package.f14190s;
        protoBuf$PackageFragment.f14211o = Collections.emptyList();
    }

    public ProtoBuf$PackageFragment() {
        throw null;
    }

    public ProtoBuf$PackageFragment(int i10) {
        this.f14212p = (byte) -1;
        this.f14213q = -1;
        this.f14207j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$PackageFragment(c cVar, d dVar) {
        int i10;
        this.f14212p = (byte) -1;
        this.f14213q = -1;
        this.f14209l = ProtoBuf$StringTable.f14272m;
        this.f14210m = ProtoBuf$QualifiedNameTable.f14248m;
        this.n = ProtoBuf$Package.f14190s;
        this.f14211o = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            ProtoBuf$QualifiedNameTable.b bVar2 = null;
                            ProtoBuf$StringTable.b bVar3 = null;
                            ProtoBuf$Package.b bVar4 = null;
                            if (n != 10) {
                                if (n == 18) {
                                    i10 = 2;
                                    if ((this.f14208k & 2) == 2) {
                                        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = this.f14210m;
                                        protoBuf$QualifiedNameTable.getClass();
                                        bVar2 = new ProtoBuf$QualifiedNameTable.b();
                                        bVar2.l(protoBuf$QualifiedNameTable);
                                    }
                                    ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = (ProtoBuf$QualifiedNameTable) cVar.g(ProtoBuf$QualifiedNameTable.n, dVar);
                                    this.f14210m = protoBuf$QualifiedNameTable2;
                                    if (bVar2 != null) {
                                        bVar2.l(protoBuf$QualifiedNameTable2);
                                        this.f14210m = bVar2.k();
                                    }
                                } else if (n == 26) {
                                    i10 = 4;
                                    if ((this.f14208k & 4) == 4) {
                                        ProtoBuf$Package protoBuf$Package = this.n;
                                        protoBuf$Package.getClass();
                                        bVar4 = new ProtoBuf$Package.b();
                                        bVar4.m(protoBuf$Package);
                                    }
                                    ProtoBuf$Package protoBuf$Package2 = (ProtoBuf$Package) cVar.g(ProtoBuf$Package.f14191t, dVar);
                                    this.n = protoBuf$Package2;
                                    if (bVar4 != null) {
                                        bVar4.m(protoBuf$Package2);
                                        this.n = bVar4.l();
                                    }
                                } else if (n == 34) {
                                    if (!(z11 & true)) {
                                        this.f14211o = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f14211o.add(cVar.g(ProtoBuf$Class.S, dVar));
                                } else if (!p(cVar, j2, dVar, n)) {
                                }
                                this.f14208k |= i10;
                            } else {
                                if ((this.f14208k & 1) == 1) {
                                    ProtoBuf$StringTable protoBuf$StringTable = this.f14209l;
                                    protoBuf$StringTable.getClass();
                                    bVar3 = new ProtoBuf$StringTable.b();
                                    bVar3.l(protoBuf$StringTable);
                                }
                                ProtoBuf$StringTable protoBuf$StringTable2 = (ProtoBuf$StringTable) cVar.g(ProtoBuf$StringTable.n, dVar);
                                this.f14209l = protoBuf$StringTable2;
                                if (bVar3 != null) {
                                    bVar3.l(protoBuf$StringTable2);
                                    this.f14209l = bVar3.k();
                                }
                                this.f14208k |= 1;
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f14537i = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f14537i = this;
                    throw e11;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14211o = Collections.unmodifiableList(this.f14211o);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14207j = bVar.c();
                    throw th2;
                }
                this.f14207j = bVar.c();
                n();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14211o = Collections.unmodifiableList(this.f14211o);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14207j = bVar.c();
            throw th3;
        }
        this.f14207j = bVar.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        byte b5 = this.f14212p;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if ((this.f14208k & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f14210m.a()) {
            this.f14212p = (byte) 0;
            return false;
        }
        if ((this.f14208k & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.n.a()) {
            this.f14212p = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f14211o.size(); i10++) {
            if (!this.f14211o.get(i10).a()) {
                this.f14212p = (byte) 0;
                return false;
            }
        }
        if (!j()) {
            this.f14212p = (byte) 0;
            return false;
        }
        this.f14212p = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14213q;
        if (i10 != -1) {
            return i10;
        }
        int d5 = (this.f14208k & 1) == 1 ? CodedOutputStream.d(1, this.f14209l) + 0 : 0;
        if ((this.f14208k & 2) == 2) {
            d5 += CodedOutputStream.d(2, this.f14210m);
        }
        if ((this.f14208k & 4) == 4) {
            d5 += CodedOutputStream.d(3, this.n);
        }
        for (int i11 = 0; i11 < this.f14211o.size(); i11++) {
            d5 += CodedOutputStream.d(4, this.f14211o.get(i11));
        }
        int size = this.f14207j.size() + k() + d5;
        this.f14213q = size;
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
        return f14205r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14208k & 1) == 1) {
            codedOutputStream.o(1, this.f14209l);
        }
        if ((this.f14208k & 2) == 2) {
            codedOutputStream.o(2, this.f14210m);
        }
        if ((this.f14208k & 4) == 4) {
            codedOutputStream.o(3, this.n);
        }
        for (int i10 = 0; i10 < this.f14211o.size(); i10++) {
            codedOutputStream.o(4, this.f14211o.get(i10));
        }
        aVar.a(200, codedOutputStream);
        codedOutputStream.r(this.f14207j);
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14212p = (byte) -1;
        this.f14213q = -1;
        this.f14207j = bVar.f14526i;
    }
}

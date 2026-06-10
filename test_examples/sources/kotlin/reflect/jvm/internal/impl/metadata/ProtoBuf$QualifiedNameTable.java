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
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoBuf$QualifiedNameTable f14248m;
    public static final a n = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14249i;

    /* renamed from: j  reason: collision with root package name */
    public List<QualifiedName> f14250j;

    /* renamed from: k  reason: collision with root package name */
    public byte f14251k;

    /* renamed from: l  reason: collision with root package name */
    public int f14252l;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$QualifiedNameTable> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$QualifiedNameTable(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$QualifiedNameTable, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14270j;

        /* renamed from: k  reason: collision with root package name */
        public List<QualifiedName> f14271k = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$QualifiedNameTable k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            l(protoBuf$QualifiedNameTable);
            return this;
        }

        public final ProtoBuf$QualifiedNameTable k() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this);
            if ((this.f14270j & 1) == 1) {
                this.f14271k = Collections.unmodifiableList(this.f14271k);
                this.f14270j &= -2;
            }
            protoBuf$QualifiedNameTable.f14250j = this.f14271k;
            return protoBuf$QualifiedNameTable;
        }

        public final void l(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.f14248m) {
                return;
            }
            if (!protoBuf$QualifiedNameTable.f14250j.isEmpty()) {
                if (this.f14271k.isEmpty()) {
                    this.f14271k = protoBuf$QualifiedNameTable.f14250j;
                    this.f14270j &= -2;
                } else {
                    if ((this.f14270j & 1) != 1) {
                        this.f14271k = new ArrayList(this.f14271k);
                        this.f14270j |= 1;
                    }
                    this.f14271k.addAll(protoBuf$QualifiedNameTable.f14250j);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$QualifiedNameTable.f14249i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            try {
                try {
                    ProtoBuf$QualifiedNameTable.n.getClass();
                    l(new ProtoBuf$QualifiedNameTable(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$QualifiedNameTable = null;
                    if (protoBuf$QualifiedNameTable != null) {
                        l(protoBuf$QualifiedNameTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$QualifiedNameTable != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable();
        f14248m = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.f14250j = Collections.emptyList();
    }

    public ProtoBuf$QualifiedNameTable() {
        this.f14251k = (byte) -1;
        this.f14252l = -1;
        this.f14249i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$QualifiedNameTable(c cVar, d dVar) {
        this.f14251k = (byte) -1;
        this.f14252l = -1;
        this.f14250j = Collections.emptyList();
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
                                this.f14250j = new ArrayList();
                                z11 |= true;
                            }
                            this.f14250j.add(cVar.g(QualifiedName.f14254q, dVar));
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
                    this.f14250j = Collections.unmodifiableList(this.f14250j);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14249i = bVar.c();
                    throw th2;
                }
                this.f14249i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14250j = Collections.unmodifiableList(this.f14250j);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14249i = bVar.c();
            throw th3;
        }
        this.f14249i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14251k;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14250j.size(); i10++) {
            if (!this.f14250j.get(i10).a()) {
                this.f14251k = (byte) 0;
                return false;
            }
        }
        this.f14251k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14252l;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14250j.size(); i12++) {
            i11 += CodedOutputStream.d(1, this.f14250j.get(i12));
        }
        int size = this.f14249i.size() + i11;
        this.f14252l = size;
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
        for (int i10 = 0; i10 < this.f14250j.size(); i10++) {
            codedOutputStream.o(1, this.f14250j.get(i10));
        }
        codedOutputStream.r(this.f14249i);
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14251k = (byte) -1;
        this.f14252l = -1;
        this.f14249i = aVar.f14526i;
    }

    /* loaded from: classes.dex */
    public static final class QualifiedName extends GeneratedMessageLite implements f {

        /* renamed from: p  reason: collision with root package name */
        public static final QualifiedName f14253p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f14254q = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14255i;

        /* renamed from: j  reason: collision with root package name */
        public int f14256j;

        /* renamed from: k  reason: collision with root package name */
        public int f14257k;

        /* renamed from: l  reason: collision with root package name */
        public int f14258l;

        /* renamed from: m  reason: collision with root package name */
        public Kind f14259m;
        public byte n;

        /* renamed from: o  reason: collision with root package name */
        public int f14260o;

        /* loaded from: classes.dex */
        public enum Kind implements f.a {
            f14261j("CLASS"),
            f14262k("PACKAGE"),
            f14263l("LOCAL");
            

            /* renamed from: i  reason: collision with root package name */
            public final int f14265i;

            Kind(String str) {
                this.f14265i = r2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
            public final int c() {
                return this.f14265i;
            }
        }

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedName> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new QualifiedName(cVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<QualifiedName, b> implements i9.f {

            /* renamed from: j  reason: collision with root package name */
            public int f14266j;

            /* renamed from: l  reason: collision with root package name */
            public int f14268l;

            /* renamed from: k  reason: collision with root package name */
            public int f14267k = -1;

            /* renamed from: m  reason: collision with root package name */
            public Kind f14269m = Kind.f14262k;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                QualifiedName k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(QualifiedName qualifiedName) {
                l(qualifiedName);
                return this;
            }

            public final QualifiedName k() {
                QualifiedName qualifiedName = new QualifiedName(this);
                int i10 = this.f14266j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                qualifiedName.f14257k = this.f14267k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                qualifiedName.f14258l = this.f14268l;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                qualifiedName.f14259m = this.f14269m;
                qualifiedName.f14256j = i11;
                return qualifiedName;
            }

            public final void l(QualifiedName qualifiedName) {
                boolean z10;
                boolean z11;
                if (qualifiedName == QualifiedName.f14253p) {
                    return;
                }
                int i10 = qualifiedName.f14256j;
                boolean z12 = false;
                if ((i10 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i11 = qualifiedName.f14257k;
                    this.f14266j |= 1;
                    this.f14267k = i11;
                }
                if ((i10 & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i12 = qualifiedName.f14258l;
                    this.f14266j = 2 | this.f14266j;
                    this.f14268l = i12;
                }
                if ((i10 & 4) == 4) {
                    z12 = true;
                }
                if (z12) {
                    Kind kind = qualifiedName.f14259m;
                    kind.getClass();
                    this.f14266j = 4 | this.f14266j;
                    this.f14269m = kind;
                }
                this.f14526i = this.f14526i.d(qualifiedName.f14255i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                QualifiedName qualifiedName;
                try {
                    try {
                        QualifiedName.f14254q.getClass();
                        l(new QualifiedName(cVar));
                    } catch (Throwable th) {
                        th = th;
                        qualifiedName = null;
                        if (qualifiedName != null) {
                            l(qualifiedName);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    qualifiedName = (QualifiedName) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName();
            f14253p = qualifiedName;
            qualifiedName.f14257k = -1;
            qualifiedName.f14258l = 0;
            qualifiedName.f14259m = Kind.f14262k;
        }

        public QualifiedName() {
            this.n = (byte) -1;
            this.f14260o = -1;
            this.f14255i = i9.a.f11832i;
        }

        public QualifiedName(c cVar) {
            Kind kind;
            this.n = (byte) -1;
            this.f14260o = -1;
            this.f14257k = -1;
            boolean z10 = false;
            this.f14258l = 0;
            Kind kind2 = Kind.f14262k;
            this.f14259m = kind2;
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.f14256j |= 1;
                                this.f14257k = cVar.k();
                            } else if (n == 16) {
                                this.f14256j |= 2;
                                this.f14258l = cVar.k();
                            } else if (n != 24) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                int k3 = cVar.k();
                                if (k3 == 0) {
                                    kind = Kind.f14261j;
                                } else if (k3 != 1) {
                                    kind = k3 != 2 ? null : Kind.f14263l;
                                } else {
                                    kind = kind2;
                                }
                                if (kind == null) {
                                    j2.v(n);
                                    j2.v(k3);
                                } else {
                                    this.f14256j |= 4;
                                    this.f14259m = kind;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14255i = bVar.c();
                            throw th2;
                        }
                        this.f14255i = bVar.c();
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
                this.f14255i = bVar.c();
                throw th3;
            }
            this.f14255i = bVar.c();
        }

        @Override // i9.f
        public final boolean a() {
            boolean z10;
            byte b5 = this.n;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if ((this.f14256j & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.n = (byte) 0;
                return false;
            }
            this.n = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.f14260o;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f14256j & 1) == 1) {
                i11 = 0 + CodedOutputStream.b(1, this.f14257k);
            }
            if ((this.f14256j & 2) == 2) {
                i11 += CodedOutputStream.b(2, this.f14258l);
            }
            if ((this.f14256j & 4) == 4) {
                i11 += CodedOutputStream.a(3, this.f14259m.f14265i);
            }
            int size = this.f14255i.size() + i11;
            this.f14260o = size;
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
            if ((this.f14256j & 1) == 1) {
                codedOutputStream.m(1, this.f14257k);
            }
            if ((this.f14256j & 2) == 2) {
                codedOutputStream.m(2, this.f14258l);
            }
            if ((this.f14256j & 4) == 4) {
                codedOutputStream.l(3, this.f14259m.f14265i);
            }
            codedOutputStream.r(this.f14255i);
        }

        public QualifiedName(GeneratedMessageLite.a aVar) {
            super(0);
            this.n = (byte) -1;
            this.f14260o = -1;
            this.f14255i = aVar.f14526i;
        }
    }
}

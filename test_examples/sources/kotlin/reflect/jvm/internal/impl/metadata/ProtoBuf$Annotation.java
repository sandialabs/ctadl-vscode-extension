package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.datastore.preferences.PreferencesProto$Value;
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
import ma.i;

/* loaded from: classes.dex */
public final class ProtoBuf$Annotation extends GeneratedMessageLite implements f {

    /* renamed from: o  reason: collision with root package name */
    public static final ProtoBuf$Annotation f13986o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f13987p = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f13988i;

    /* renamed from: j  reason: collision with root package name */
    public int f13989j;

    /* renamed from: k  reason: collision with root package name */
    public int f13990k;

    /* renamed from: l  reason: collision with root package name */
    public List<Argument> f13991l;

    /* renamed from: m  reason: collision with root package name */
    public byte f13992m;
    public int n;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Annotation> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Annotation(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$Annotation, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14044j;

        /* renamed from: k  reason: collision with root package name */
        public int f14045k;

        /* renamed from: l  reason: collision with root package name */
        public List<Argument> f14046l = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Annotation k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$Annotation protoBuf$Annotation) {
            l(protoBuf$Annotation);
            return this;
        }

        public final ProtoBuf$Annotation k() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this);
            int i10 = this.f14044j;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Annotation.f13990k = this.f14045k;
            if ((i10 & 2) == 2) {
                this.f14046l = Collections.unmodifiableList(this.f14046l);
                this.f14044j &= -3;
            }
            protoBuf$Annotation.f13991l = this.f14046l;
            protoBuf$Annotation.f13989j = i11;
            return protoBuf$Annotation;
        }

        public final void l(ProtoBuf$Annotation protoBuf$Annotation) {
            boolean z10;
            if (protoBuf$Annotation == ProtoBuf$Annotation.f13986o) {
                return;
            }
            if ((protoBuf$Annotation.f13989j & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = protoBuf$Annotation.f13990k;
                this.f14044j = 1 | this.f14044j;
                this.f14045k = i10;
            }
            if (!protoBuf$Annotation.f13991l.isEmpty()) {
                if (this.f14046l.isEmpty()) {
                    this.f14046l = protoBuf$Annotation.f13991l;
                    this.f14044j &= -3;
                } else {
                    if ((this.f14044j & 2) != 2) {
                        this.f14046l = new ArrayList(this.f14046l);
                        this.f14044j |= 2;
                    }
                    this.f14046l.addAll(protoBuf$Annotation.f13991l);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$Annotation.f13988i);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$Annotation protoBuf$Annotation;
            try {
                try {
                    l((ProtoBuf$Annotation) ProtoBuf$Annotation.f13987p.a(cVar, dVar));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Annotation = (ProtoBuf$Annotation) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        if (protoBuf$Annotation != null) {
                            l(protoBuf$Annotation);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                protoBuf$Annotation = null;
                if (protoBuf$Annotation != null) {
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation();
        f13986o = protoBuf$Annotation;
        protoBuf$Annotation.f13990k = 0;
        protoBuf$Annotation.f13991l = Collections.emptyList();
    }

    public ProtoBuf$Annotation() {
        this.f13992m = (byte) -1;
        this.n = -1;
        this.f13988i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Annotation(c cVar, d dVar) {
        this.f13992m = (byte) -1;
        this.n = -1;
        boolean z10 = false;
        this.f13990k = 0;
        this.f13991l = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f13989j |= 1;
                            this.f13990k = cVar.k();
                        } else if (n == 18) {
                            if (!(z11 & true)) {
                                this.f13991l = new ArrayList();
                                z11 |= true;
                            }
                            this.f13991l.add(cVar.g(Argument.f13994p, dVar));
                        } else if (!cVar.q(n, j2)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11 & true) {
                        this.f13991l = Collections.unmodifiableList(this.f13991l);
                    }
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f13988i = bVar.c();
                        throw th2;
                    }
                    this.f13988i = bVar.c();
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
            this.f13991l = Collections.unmodifiableList(this.f13991l);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13988i = bVar.c();
            throw th3;
        }
        this.f13988i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        byte b5 = this.f13992m;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if ((this.f13989j & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13992m = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f13991l.size(); i10++) {
            if (!this.f13991l.get(i10).a()) {
                this.f13992m = (byte) 0;
                return false;
            }
        }
        this.f13992m = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.n;
        if (i10 != -1) {
            return i10;
        }
        int b5 = (this.f13989j & 1) == 1 ? CodedOutputStream.b(1, this.f13990k) + 0 : 0;
        for (int i11 = 0; i11 < this.f13991l.size(); i11++) {
            b5 += CodedOutputStream.d(2, this.f13991l.get(i11));
        }
        int size = this.f13988i.size() + b5;
        this.n = size;
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
        if ((this.f13989j & 1) == 1) {
            codedOutputStream.m(1, this.f13990k);
        }
        for (int i10 = 0; i10 < this.f13991l.size(); i10++) {
            codedOutputStream.o(2, this.f13991l.get(i10));
        }
        codedOutputStream.r(this.f13988i);
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.a aVar) {
        super(0);
        this.f13992m = (byte) -1;
        this.n = -1;
        this.f13988i = aVar.f14526i;
    }

    /* loaded from: classes.dex */
    public static final class Argument extends GeneratedMessageLite implements f {

        /* renamed from: o  reason: collision with root package name */
        public static final Argument f13993o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f13994p = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f13995i;

        /* renamed from: j  reason: collision with root package name */
        public int f13996j;

        /* renamed from: k  reason: collision with root package name */
        public int f13997k;

        /* renamed from: l  reason: collision with root package name */
        public Value f13998l;

        /* renamed from: m  reason: collision with root package name */
        public byte f13999m;
        public int n;

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new Argument(cVar, dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<Argument, b> implements f {

            /* renamed from: j  reason: collision with root package name */
            public int f14041j;

            /* renamed from: k  reason: collision with root package name */
            public int f14042k;

            /* renamed from: l  reason: collision with root package name */
            public Value f14043l = Value.f14000x;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                Argument k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(Argument argument) {
                l(argument);
                return this;
            }

            public final Argument k() {
                Argument argument = new Argument(this);
                int i10 = this.f14041j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                argument.f13997k = this.f14042k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                argument.f13998l = this.f14043l;
                argument.f13996j = i11;
                return argument;
            }

            public final void l(Argument argument) {
                boolean z10;
                Value value;
                if (argument == Argument.f13993o) {
                    return;
                }
                int i10 = argument.f13996j;
                boolean z11 = false;
                if ((i10 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i11 = argument.f13997k;
                    this.f14041j |= 1;
                    this.f14042k = i11;
                }
                if ((i10 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    Value value2 = argument.f13998l;
                    if ((this.f14041j & 2) == 2 && (value = this.f14043l) != Value.f14000x) {
                        Value.b bVar = new Value.b();
                        bVar.l(value);
                        bVar.l(value2);
                        value2 = bVar.k();
                    }
                    this.f14043l = value2;
                    this.f14041j |= 2;
                }
                this.f14526i = this.f14526i.d(argument.f13995i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                Argument argument;
                try {
                    try {
                        Argument.f13994p.getClass();
                        l(new Argument(cVar, dVar));
                    } catch (Throwable th) {
                        th = th;
                        argument = null;
                        if (argument != null) {
                            l(argument);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    argument = (Argument) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            Argument argument = new Argument();
            f13993o = argument;
            argument.f13997k = 0;
            argument.f13998l = Value.f14000x;
        }

        public Argument() {
            this.f13999m = (byte) -1;
            this.n = -1;
            this.f13995i = i9.a.f11832i;
        }

        public Argument(c cVar, d dVar) {
            Value.b bVar;
            this.f13999m = (byte) -1;
            this.n = -1;
            boolean z10 = false;
            this.f13997k = 0;
            this.f13998l = Value.f14000x;
            a.b bVar2 = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
            while (!z10) {
                try {
                    try {
                        try {
                            int n = cVar.n();
                            if (n != 0) {
                                if (n == 8) {
                                    this.f13996j |= 1;
                                    this.f13997k = cVar.k();
                                } else if (n != 18) {
                                    if (!cVar.q(n, j2)) {
                                    }
                                } else {
                                    if ((this.f13996j & 2) == 2) {
                                        Value value = this.f13998l;
                                        value.getClass();
                                        bVar = new Value.b();
                                        bVar.l(value);
                                    } else {
                                        bVar = null;
                                    }
                                    Value value2 = (Value) cVar.g(Value.f14001y, dVar);
                                    this.f13998l = value2;
                                    if (bVar != null) {
                                        bVar.l(value2);
                                        this.f13998l = bVar.k();
                                    }
                                    this.f13996j |= 2;
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
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f13995i = bVar2.c();
                        throw th2;
                    }
                    this.f13995i = bVar2.c();
                    throw th;
                }
            }
            try {
                j2.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f13995i = bVar2.c();
                throw th3;
            }
            this.f13995i = bVar2.c();
        }

        @Override // i9.f
        public final boolean a() {
            boolean z10;
            boolean z11;
            byte b5 = this.f13999m;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            int i10 = this.f13996j;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f13999m = (byte) 0;
                return false;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f13999m = (byte) 0;
                return false;
            } else if (!this.f13998l.a()) {
                this.f13999m = (byte) 0;
                return false;
            } else {
                this.f13999m = (byte) 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.n;
            if (i10 != -1) {
                return i10;
            }
            int b5 = (this.f13996j & 1) == 1 ? 0 + CodedOutputStream.b(1, this.f13997k) : 0;
            if ((this.f13996j & 2) == 2) {
                b5 += CodedOutputStream.d(2, this.f13998l);
            }
            int size = this.f13995i.size() + b5;
            this.n = size;
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
            if ((this.f13996j & 1) == 1) {
                codedOutputStream.m(1, this.f13997k);
            }
            if ((this.f13996j & 2) == 2) {
                codedOutputStream.o(2, this.f13998l);
            }
            codedOutputStream.r(this.f13995i);
        }

        public Argument(GeneratedMessageLite.a aVar) {
            super(0);
            this.f13999m = (byte) -1;
            this.n = -1;
            this.f13995i = aVar.f14526i;
        }

        /* loaded from: classes.dex */
        public static final class Value extends GeneratedMessageLite implements f {

            /* renamed from: x  reason: collision with root package name */
            public static final Value f14000x;

            /* renamed from: y  reason: collision with root package name */
            public static final a f14001y = new a();

            /* renamed from: i  reason: collision with root package name */
            public final i9.a f14002i;

            /* renamed from: j  reason: collision with root package name */
            public int f14003j;

            /* renamed from: k  reason: collision with root package name */
            public Type f14004k;

            /* renamed from: l  reason: collision with root package name */
            public long f14005l;

            /* renamed from: m  reason: collision with root package name */
            public float f14006m;
            public double n;

            /* renamed from: o  reason: collision with root package name */
            public int f14007o;

            /* renamed from: p  reason: collision with root package name */
            public int f14008p;

            /* renamed from: q  reason: collision with root package name */
            public int f14009q;

            /* renamed from: r  reason: collision with root package name */
            public ProtoBuf$Annotation f14010r;

            /* renamed from: s  reason: collision with root package name */
            public List<Value> f14011s;

            /* renamed from: t  reason: collision with root package name */
            public int f14012t;

            /* renamed from: u  reason: collision with root package name */
            public int f14013u;

            /* renamed from: v  reason: collision with root package name */
            public byte f14014v;

            /* renamed from: w  reason: collision with root package name */
            public int f14015w;

            /* loaded from: classes.dex */
            public enum Type implements f.a {
                f14016j("BYTE"),
                f14017k("CHAR"),
                f14018l("SHORT"),
                f14019m("INT"),
                n("LONG"),
                f14020o("FLOAT"),
                f14021p("DOUBLE"),
                f14022q("BOOLEAN"),
                f14023r("STRING"),
                f14024s("CLASS"),
                f14025t("ENUM"),
                f14026u("ANNOTATION"),
                f14027v("ARRAY");
                

                /* renamed from: i  reason: collision with root package name */
                public final int f14029i;

                Type(String str) {
                    this.f14029i = r2;
                }

                public static Type a(int i10) {
                    switch (i10) {
                        case 0:
                            return f14016j;
                        case 1:
                            return f14017k;
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            return f14018l;
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                            return f14019m;
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            return n;
                        case 5:
                            return f14020o;
                        case 6:
                            return f14021p;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            return f14022q;
                        case 8:
                            return f14023r;
                        case i.f16046m /* 9 */:
                            return f14024s;
                        case i.f16047o /* 10 */:
                            return f14025t;
                        case 11:
                            return f14026u;
                        case 12:
                            return f14027v;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
                public final int c() {
                    return this.f14029i;
                }
            }

            /* loaded from: classes.dex */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Value> {
                @Override // i9.g
                public final Object a(c cVar, d dVar) {
                    return new Value(cVar, dVar);
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends GeneratedMessageLite.a<Value, b> implements i9.f {

                /* renamed from: j  reason: collision with root package name */
                public int f14030j;

                /* renamed from: l  reason: collision with root package name */
                public long f14032l;

                /* renamed from: m  reason: collision with root package name */
                public float f14033m;
                public double n;

                /* renamed from: o  reason: collision with root package name */
                public int f14034o;

                /* renamed from: p  reason: collision with root package name */
                public int f14035p;

                /* renamed from: q  reason: collision with root package name */
                public int f14036q;

                /* renamed from: t  reason: collision with root package name */
                public int f14039t;

                /* renamed from: u  reason: collision with root package name */
                public int f14040u;

                /* renamed from: k  reason: collision with root package name */
                public Type f14031k = Type.f14016j;

                /* renamed from: r  reason: collision with root package name */
                public ProtoBuf$Annotation f14037r = ProtoBuf$Annotation.f13986o;

                /* renamed from: s  reason: collision with root package name */
                public List<Value> f14038s = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final h build() {
                    Value k3 = k();
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
                public final /* bridge */ /* synthetic */ b j(Value value) {
                    l(value);
                    return this;
                }

                public final Value k() {
                    Value value = new Value(this);
                    int i10 = this.f14030j;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    value.f14004k = this.f14031k;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    value.f14005l = this.f14032l;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    value.f14006m = this.f14033m;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    value.n = this.n;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    value.f14007o = this.f14034o;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    value.f14008p = this.f14035p;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    value.f14009q = this.f14036q;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    value.f14010r = this.f14037r;
                    if ((i10 & 256) == 256) {
                        this.f14038s = Collections.unmodifiableList(this.f14038s);
                        this.f14030j &= -257;
                    }
                    value.f14011s = this.f14038s;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    value.f14012t = this.f14039t;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    value.f14013u = this.f14040u;
                    value.f14003j = i11;
                    return value;
                }

                public final void l(Value value) {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    boolean z16;
                    boolean z17;
                    boolean z18;
                    ProtoBuf$Annotation protoBuf$Annotation;
                    if (value == Value.f14000x) {
                        return;
                    }
                    boolean z19 = true;
                    if ((value.f14003j & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Type type = value.f14004k;
                        type.getClass();
                        this.f14030j |= 1;
                        this.f14031k = type;
                    }
                    int i10 = value.f14003j;
                    if ((i10 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        long j2 = value.f14005l;
                        this.f14030j |= 2;
                        this.f14032l = j2;
                    }
                    if ((i10 & 4) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        float f10 = value.f14006m;
                        this.f14030j = 4 | this.f14030j;
                        this.f14033m = f10;
                    }
                    if ((i10 & 8) == 8) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        double d5 = value.n;
                        this.f14030j |= 8;
                        this.n = d5;
                    }
                    if ((i10 & 16) == 16) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        int i11 = value.f14007o;
                        this.f14030j = 16 | this.f14030j;
                        this.f14034o = i11;
                    }
                    if ((i10 & 32) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        int i12 = value.f14008p;
                        this.f14030j = 32 | this.f14030j;
                        this.f14035p = i12;
                    }
                    if ((i10 & 64) == 64) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        int i13 = value.f14009q;
                        this.f14030j = 64 | this.f14030j;
                        this.f14036q = i13;
                    }
                    if ((i10 & 128) == 128) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        ProtoBuf$Annotation protoBuf$Annotation2 = value.f14010r;
                        if ((this.f14030j & 128) == 128 && (protoBuf$Annotation = this.f14037r) != ProtoBuf$Annotation.f13986o) {
                            b bVar = new b();
                            bVar.l(protoBuf$Annotation);
                            bVar.l(protoBuf$Annotation2);
                            protoBuf$Annotation2 = bVar.k();
                        }
                        this.f14037r = protoBuf$Annotation2;
                        this.f14030j |= 128;
                    }
                    if (!value.f14011s.isEmpty()) {
                        if (this.f14038s.isEmpty()) {
                            this.f14038s = value.f14011s;
                            this.f14030j &= -257;
                        } else {
                            if ((this.f14030j & 256) != 256) {
                                this.f14038s = new ArrayList(this.f14038s);
                                this.f14030j |= 256;
                            }
                            this.f14038s.addAll(value.f14011s);
                        }
                    }
                    int i14 = value.f14003j;
                    if ((i14 & 256) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        int i15 = value.f14012t;
                        this.f14030j |= 512;
                        this.f14039t = i15;
                    }
                    if ((i14 & 512) != 512) {
                        z19 = false;
                    }
                    if (z19) {
                        int i16 = value.f14013u;
                        this.f14030j |= 1024;
                        this.f14040u = i16;
                    }
                    this.f14526i = this.f14526i.d(value.f14002i);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m(c cVar, d dVar) {
                    Value value;
                    try {
                        try {
                            Value.f14001y.getClass();
                            l(new Value(cVar, dVar));
                        } catch (Throwable th) {
                            th = th;
                            value = null;
                            if (value != null) {
                                l(value);
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        value = (Value) e10.f14537i;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                            }
                            throw th;
                        }
                    }
                }
            }

            static {
                Value value = new Value();
                f14000x = value;
                value.j();
            }

            public Value() {
                this.f14014v = (byte) -1;
                this.f14015w = -1;
                this.f14002i = i9.a.f11832i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Value(c cVar, d dVar) {
                b bVar;
                this.f14014v = (byte) -1;
                this.f14015w = -1;
                j();
                a.b bVar2 = new a.b();
                CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int n = cVar.n();
                            switch (n) {
                                case 0:
                                    break;
                                case 8:
                                    int k3 = cVar.k();
                                    Type a10 = Type.a(k3);
                                    if (a10 == null) {
                                        j2.v(n);
                                        j2.v(k3);
                                    } else {
                                        this.f14003j |= 1;
                                        this.f14004k = a10;
                                        continue;
                                    }
                                case 16:
                                    this.f14003j |= 2;
                                    long l2 = cVar.l();
                                    this.f14005l = (-(l2 & 1)) ^ (l2 >>> 1);
                                    continue;
                                case 29:
                                    this.f14003j |= 4;
                                    this.f14006m = Float.intBitsToFloat(cVar.i());
                                    continue;
                                case 33:
                                    this.f14003j |= 8;
                                    this.n = Double.longBitsToDouble(cVar.j());
                                    continue;
                                case 40:
                                    this.f14003j |= 16;
                                    this.f14007o = cVar.k();
                                    continue;
                                case 48:
                                    this.f14003j |= 32;
                                    this.f14008p = cVar.k();
                                    continue;
                                case 56:
                                    this.f14003j |= 64;
                                    this.f14009q = cVar.k();
                                    continue;
                                case 66:
                                    if ((this.f14003j & 128) == 128) {
                                        ProtoBuf$Annotation protoBuf$Annotation = this.f14010r;
                                        protoBuf$Annotation.getClass();
                                        bVar = new b();
                                        bVar.l(protoBuf$Annotation);
                                    } else {
                                        bVar = null;
                                    }
                                    ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) cVar.g(ProtoBuf$Annotation.f13987p, dVar);
                                    this.f14010r = protoBuf$Annotation2;
                                    if (bVar != null) {
                                        bVar.l(protoBuf$Annotation2);
                                        this.f14010r = bVar.k();
                                    }
                                    this.f14003j |= 128;
                                    continue;
                                case 74:
                                    if (!(z11 & true)) {
                                        this.f14011s = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f14011s.add(cVar.g(f14001y, dVar));
                                    continue;
                                case 80:
                                    this.f14003j |= 512;
                                    this.f14013u = cVar.k();
                                    continue;
                                case 88:
                                    this.f14003j |= 256;
                                    this.f14012t = cVar.k();
                                    continue;
                                default:
                                    if (!cVar.q(n, j2)) {
                                        break;
                                    } else {
                                        continue;
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
                            this.f14011s = Collections.unmodifiableList(this.f14011s);
                        }
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14002i = bVar2.c();
                            throw th2;
                        }
                        this.f14002i = bVar2.c();
                        throw th;
                    }
                }
                if (z11 & true) {
                    this.f14011s = Collections.unmodifiableList(this.f14011s);
                }
                try {
                    j2.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f14002i = bVar2.c();
                    throw th3;
                }
                this.f14002i = bVar2.c();
            }

            @Override // i9.f
            public final boolean a() {
                boolean z10;
                byte b5 = this.f14014v;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                if ((this.f14003j & 128) == 128) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !this.f14010r.a()) {
                    this.f14014v = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < this.f14011s.size(); i10++) {
                    if (!this.f14011s.get(i10).a()) {
                        this.f14014v = (byte) 0;
                        return false;
                    }
                }
                this.f14014v = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
            public final int b() {
                int i10;
                int i11 = this.f14015w;
                if (i11 != -1) {
                    return i11;
                }
                if ((this.f14003j & 1) == 1) {
                    i10 = CodedOutputStream.a(1, this.f14004k.f14029i) + 0;
                } else {
                    i10 = 0;
                }
                if ((this.f14003j & 2) == 2) {
                    long j2 = this.f14005l;
                    i10 += CodedOutputStream.g((j2 >> 63) ^ (j2 << 1)) + CodedOutputStream.h(2);
                }
                if ((this.f14003j & 4) == 4) {
                    i10 += CodedOutputStream.h(3) + 4;
                }
                if ((this.f14003j & 8) == 8) {
                    i10 += CodedOutputStream.h(4) + 8;
                }
                if ((this.f14003j & 16) == 16) {
                    i10 += CodedOutputStream.b(5, this.f14007o);
                }
                if ((this.f14003j & 32) == 32) {
                    i10 += CodedOutputStream.b(6, this.f14008p);
                }
                if ((this.f14003j & 64) == 64) {
                    i10 += CodedOutputStream.b(7, this.f14009q);
                }
                if ((this.f14003j & 128) == 128) {
                    i10 += CodedOutputStream.d(8, this.f14010r);
                }
                for (int i12 = 0; i12 < this.f14011s.size(); i12++) {
                    i10 += CodedOutputStream.d(9, this.f14011s.get(i12));
                }
                if ((this.f14003j & 512) == 512) {
                    i10 += CodedOutputStream.b(10, this.f14013u);
                }
                if ((this.f14003j & 256) == 256) {
                    i10 += CodedOutputStream.b(11, this.f14012t);
                }
                int size = this.f14002i.size() + i10;
                this.f14015w = size;
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
                if ((this.f14003j & 1) == 1) {
                    codedOutputStream.l(1, this.f14004k.f14029i);
                }
                if ((this.f14003j & 2) == 2) {
                    long j2 = this.f14005l;
                    codedOutputStream.x(2, 0);
                    codedOutputStream.w((j2 >> 63) ^ (j2 << 1));
                }
                if ((this.f14003j & 4) == 4) {
                    float f10 = this.f14006m;
                    codedOutputStream.x(3, 5);
                    codedOutputStream.t(Float.floatToRawIntBits(f10));
                }
                if ((this.f14003j & 8) == 8) {
                    double d5 = this.n;
                    codedOutputStream.x(4, 1);
                    codedOutputStream.u(Double.doubleToRawLongBits(d5));
                }
                if ((this.f14003j & 16) == 16) {
                    codedOutputStream.m(5, this.f14007o);
                }
                if ((this.f14003j & 32) == 32) {
                    codedOutputStream.m(6, this.f14008p);
                }
                if ((this.f14003j & 64) == 64) {
                    codedOutputStream.m(7, this.f14009q);
                }
                if ((this.f14003j & 128) == 128) {
                    codedOutputStream.o(8, this.f14010r);
                }
                for (int i10 = 0; i10 < this.f14011s.size(); i10++) {
                    codedOutputStream.o(9, this.f14011s.get(i10));
                }
                if ((this.f14003j & 512) == 512) {
                    codedOutputStream.m(10, this.f14013u);
                }
                if ((this.f14003j & 256) == 256) {
                    codedOutputStream.m(11, this.f14012t);
                }
                codedOutputStream.r(this.f14002i);
            }

            public final void j() {
                this.f14004k = Type.f14016j;
                this.f14005l = 0L;
                this.f14006m = 0.0f;
                this.n = 0.0d;
                this.f14007o = 0;
                this.f14008p = 0;
                this.f14009q = 0;
                this.f14010r = ProtoBuf$Annotation.f13986o;
                this.f14011s = Collections.emptyList();
                this.f14012t = 0;
                this.f14013u = 0;
            }

            public Value(GeneratedMessageLite.a aVar) {
                super(0);
                this.f14014v = (byte) -1;
                this.f14015w = -1;
                this.f14002i = aVar.f14526i;
            }
        }
    }
}

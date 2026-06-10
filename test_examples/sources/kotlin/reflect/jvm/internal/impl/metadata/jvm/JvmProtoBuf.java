package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import i9.a;
import i9.e;
import i9.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class JvmProtoBuf {

    /* renamed from: a  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Constructor, JvmMethodSignature> f14435a;

    /* renamed from: b  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Function, JvmMethodSignature> f14436b;
    public static final GeneratedMessageLite.d<ProtoBuf$Function, Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Property, JvmPropertySignature> f14437d;

    /* renamed from: e  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Property, Integer> f14438e;

    /* renamed from: f  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Type, List<ProtoBuf$Annotation>> f14439f;

    /* renamed from: g  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Type, Boolean> f14440g;

    /* renamed from: h  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> f14441h;

    /* renamed from: i  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Class, Integer> f14442i;

    /* renamed from: j  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Class, List<ProtoBuf$Property>> f14443j;

    /* renamed from: k  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Class, Integer> f14444k;

    /* renamed from: l  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Class, Integer> f14445l;

    /* renamed from: m  reason: collision with root package name */
    public static final GeneratedMessageLite.d<ProtoBuf$Package, Integer> f14446m;
    public static final GeneratedMessageLite.d<ProtoBuf$Package, List<ProtoBuf$Property>> n;

    static {
        ProtoBuf$Constructor protoBuf$Constructor = ProtoBuf$Constructor.f14083q;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f14457o;
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.n;
        f14435a = GeneratedMessageLite.i(protoBuf$Constructor, jvmMethodSignature, jvmMethodSignature, 100, wireFormat$FieldType, JvmMethodSignature.class);
        ProtoBuf$Function protoBuf$Function = ProtoBuf$Function.C;
        f14436b = GeneratedMessageLite.i(protoBuf$Function, jvmMethodSignature, jvmMethodSignature, 100, wireFormat$FieldType, JvmMethodSignature.class);
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.f14538k;
        c = GeneratedMessageLite.i(protoBuf$Function, 0, null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Property protoBuf$Property = ProtoBuf$Property.C;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.f14467r;
        f14437d = GeneratedMessageLite.i(protoBuf$Property, jvmPropertySignature, jvmPropertySignature, 100, wireFormat$FieldType, JvmPropertySignature.class);
        f14438e = GeneratedMessageLite.i(protoBuf$Property, 0, null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        ProtoBuf$Annotation protoBuf$Annotation = ProtoBuf$Annotation.f13986o;
        f14439f = GeneratedMessageLite.h(protoBuf$Type, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        f14440g = GeneratedMessageLite.i(protoBuf$Type, Boolean.FALSE, null, 101, WireFormat$FieldType.f14539l, Boolean.class);
        f14441h = GeneratedMessageLite.h(ProtoBuf$TypeParameter.f14349u, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        ProtoBuf$Class protoBuf$Class = ProtoBuf$Class.R;
        f14442i = GeneratedMessageLite.i(protoBuf$Class, 0, null, 101, wireFormat$FieldType2, Integer.class);
        f14443j = GeneratedMessageLite.h(protoBuf$Class, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
        f14444k = GeneratedMessageLite.i(protoBuf$Class, 0, null, 103, wireFormat$FieldType2, Integer.class);
        f14445l = GeneratedMessageLite.i(protoBuf$Class, 0, null, 104, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Package protoBuf$Package = ProtoBuf$Package.f14190s;
        f14446m = GeneratedMessageLite.i(protoBuf$Package, 0, null, 101, wireFormat$FieldType2, Integer.class);
        n = GeneratedMessageLite.h(protoBuf$Package, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
    }

    /* loaded from: classes.dex */
    public static final class JvmFieldSignature extends GeneratedMessageLite implements f {

        /* renamed from: o  reason: collision with root package name */
        public static final JvmFieldSignature f14447o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f14448p = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14449i;

        /* renamed from: j  reason: collision with root package name */
        public int f14450j;

        /* renamed from: k  reason: collision with root package name */
        public int f14451k;

        /* renamed from: l  reason: collision with root package name */
        public int f14452l;

        /* renamed from: m  reason: collision with root package name */
        public byte f14453m;
        public int n;

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmFieldSignature> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new JvmFieldSignature(cVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<JvmFieldSignature, b> implements f {

            /* renamed from: j  reason: collision with root package name */
            public int f14454j;

            /* renamed from: k  reason: collision with root package name */
            public int f14455k;

            /* renamed from: l  reason: collision with root package name */
            public int f14456l;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                JvmFieldSignature k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(JvmFieldSignature jvmFieldSignature) {
                l(jvmFieldSignature);
                return this;
            }

            public final JvmFieldSignature k() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f14454j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmFieldSignature.f14451k = this.f14455k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f14452l = this.f14456l;
                jvmFieldSignature.f14450j = i11;
                return jvmFieldSignature;
            }

            public final void l(JvmFieldSignature jvmFieldSignature) {
                boolean z10;
                if (jvmFieldSignature == JvmFieldSignature.f14447o) {
                    return;
                }
                int i10 = jvmFieldSignature.f14450j;
                boolean z11 = false;
                if ((i10 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i11 = jvmFieldSignature.f14451k;
                    this.f14454j |= 1;
                    this.f14455k = i11;
                }
                if ((i10 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    int i12 = jvmFieldSignature.f14452l;
                    this.f14454j = 2 | this.f14454j;
                    this.f14456l = i12;
                }
                this.f14526i = this.f14526i.d(jvmFieldSignature.f14449i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                JvmFieldSignature jvmFieldSignature;
                try {
                    try {
                        JvmFieldSignature.f14448p.getClass();
                        l(new JvmFieldSignature(cVar));
                    } catch (Throwable th) {
                        th = th;
                        jvmFieldSignature = null;
                        if (jvmFieldSignature != null) {
                            l(jvmFieldSignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    jvmFieldSignature = (JvmFieldSignature) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (jvmFieldSignature != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f14447o = jvmFieldSignature;
            jvmFieldSignature.f14451k = 0;
            jvmFieldSignature.f14452l = 0;
        }

        public JvmFieldSignature() {
            this.f14453m = (byte) -1;
            this.n = -1;
            this.f14449i = i9.a.f11832i;
        }

        public JvmFieldSignature(c cVar) {
            this.f14453m = (byte) -1;
            this.n = -1;
            boolean z10 = false;
            this.f14451k = 0;
            this.f14452l = 0;
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.f14450j |= 1;
                                this.f14451k = cVar.k();
                            } else if (n != 16) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                this.f14450j |= 2;
                                this.f14452l = cVar.k();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14449i = bVar.c();
                            throw th2;
                        }
                        this.f14449i = bVar.c();
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
                this.f14449i = bVar.c();
                throw th3;
            }
            this.f14449i = bVar.c();
        }

        @Override // i9.f
        public final boolean a() {
            byte b5 = this.f14453m;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f14453m = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.n;
            if (i10 != -1) {
                return i10;
            }
            int b5 = (this.f14450j & 1) == 1 ? 0 + CodedOutputStream.b(1, this.f14451k) : 0;
            if ((this.f14450j & 2) == 2) {
                b5 += CodedOutputStream.b(2, this.f14452l);
            }
            int size = this.f14449i.size() + b5;
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
            if ((this.f14450j & 1) == 1) {
                codedOutputStream.m(1, this.f14451k);
            }
            if ((this.f14450j & 2) == 2) {
                codedOutputStream.m(2, this.f14452l);
            }
            codedOutputStream.r(this.f14449i);
        }

        public JvmFieldSignature(GeneratedMessageLite.a aVar) {
            super(0);
            this.f14453m = (byte) -1;
            this.n = -1;
            this.f14449i = aVar.f14526i;
        }
    }

    /* loaded from: classes.dex */
    public static final class JvmMethodSignature extends GeneratedMessageLite implements f {

        /* renamed from: o  reason: collision with root package name */
        public static final JvmMethodSignature f14457o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f14458p = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14459i;

        /* renamed from: j  reason: collision with root package name */
        public int f14460j;

        /* renamed from: k  reason: collision with root package name */
        public int f14461k;

        /* renamed from: l  reason: collision with root package name */
        public int f14462l;

        /* renamed from: m  reason: collision with root package name */
        public byte f14463m;
        public int n;

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmMethodSignature> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new JvmMethodSignature(cVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<JvmMethodSignature, b> implements f {

            /* renamed from: j  reason: collision with root package name */
            public int f14464j;

            /* renamed from: k  reason: collision with root package name */
            public int f14465k;

            /* renamed from: l  reason: collision with root package name */
            public int f14466l;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                JvmMethodSignature k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(JvmMethodSignature jvmMethodSignature) {
                l(jvmMethodSignature);
                return this;
            }

            public final JvmMethodSignature k() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f14464j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmMethodSignature.f14461k = this.f14465k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f14462l = this.f14466l;
                jvmMethodSignature.f14460j = i11;
                return jvmMethodSignature;
            }

            public final void l(JvmMethodSignature jvmMethodSignature) {
                boolean z10;
                if (jvmMethodSignature == JvmMethodSignature.f14457o) {
                    return;
                }
                int i10 = jvmMethodSignature.f14460j;
                boolean z11 = false;
                if ((i10 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i11 = jvmMethodSignature.f14461k;
                    this.f14464j |= 1;
                    this.f14465k = i11;
                }
                if ((i10 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    int i12 = jvmMethodSignature.f14462l;
                    this.f14464j = 2 | this.f14464j;
                    this.f14466l = i12;
                }
                this.f14526i = this.f14526i.d(jvmMethodSignature.f14459i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                JvmMethodSignature jvmMethodSignature;
                try {
                    try {
                        JvmMethodSignature.f14458p.getClass();
                        l(new JvmMethodSignature(cVar));
                    } catch (Throwable th) {
                        th = th;
                        jvmMethodSignature = null;
                        if (jvmMethodSignature != null) {
                            l(jvmMethodSignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    jvmMethodSignature = (JvmMethodSignature) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (jvmMethodSignature != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f14457o = jvmMethodSignature;
            jvmMethodSignature.f14461k = 0;
            jvmMethodSignature.f14462l = 0;
        }

        public JvmMethodSignature() {
            this.f14463m = (byte) -1;
            this.n = -1;
            this.f14459i = i9.a.f11832i;
        }

        public JvmMethodSignature(c cVar) {
            this.f14463m = (byte) -1;
            this.n = -1;
            boolean z10 = false;
            this.f14461k = 0;
            this.f14462l = 0;
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.f14460j |= 1;
                                this.f14461k = cVar.k();
                            } else if (n != 16) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                this.f14460j |= 2;
                                this.f14462l = cVar.k();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14459i = bVar.c();
                            throw th2;
                        }
                        this.f14459i = bVar.c();
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
                this.f14459i = bVar.c();
                throw th3;
            }
            this.f14459i = bVar.c();
        }

        public static b j(JvmMethodSignature jvmMethodSignature) {
            b bVar = new b();
            bVar.l(jvmMethodSignature);
            return bVar;
        }

        @Override // i9.f
        public final boolean a() {
            byte b5 = this.f14463m;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f14463m = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.n;
            if (i10 != -1) {
                return i10;
            }
            int b5 = (this.f14460j & 1) == 1 ? 0 + CodedOutputStream.b(1, this.f14461k) : 0;
            if ((this.f14460j & 2) == 2) {
                b5 += CodedOutputStream.b(2, this.f14462l);
            }
            int size = this.f14459i.size() + b5;
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final h.a c() {
            return j(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final h.a d() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f14460j & 1) == 1) {
                codedOutputStream.m(1, this.f14461k);
            }
            if ((this.f14460j & 2) == 2) {
                codedOutputStream.m(2, this.f14462l);
            }
            codedOutputStream.r(this.f14459i);
        }

        public JvmMethodSignature(GeneratedMessageLite.a aVar) {
            super(0);
            this.f14463m = (byte) -1;
            this.n = -1;
            this.f14459i = aVar.f14526i;
        }
    }

    /* loaded from: classes.dex */
    public static final class StringTableTypes extends GeneratedMessageLite implements f {

        /* renamed from: o  reason: collision with root package name */
        public static final StringTableTypes f14482o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f14483p = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14484i;

        /* renamed from: j  reason: collision with root package name */
        public List<Record> f14485j;

        /* renamed from: k  reason: collision with root package name */
        public List<Integer> f14486k;

        /* renamed from: l  reason: collision with root package name */
        public int f14487l;

        /* renamed from: m  reason: collision with root package name */
        public byte f14488m;
        public int n;

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTableTypes> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new StringTableTypes(cVar, dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<StringTableTypes, b> implements f {

            /* renamed from: j  reason: collision with root package name */
            public int f14513j;

            /* renamed from: k  reason: collision with root package name */
            public List<Record> f14514k = Collections.emptyList();

            /* renamed from: l  reason: collision with root package name */
            public List<Integer> f14515l = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                StringTableTypes k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(StringTableTypes stringTableTypes) {
                l(stringTableTypes);
                return this;
            }

            public final StringTableTypes k() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f14513j & 1) == 1) {
                    this.f14514k = Collections.unmodifiableList(this.f14514k);
                    this.f14513j &= -2;
                }
                stringTableTypes.f14485j = this.f14514k;
                if ((this.f14513j & 2) == 2) {
                    this.f14515l = Collections.unmodifiableList(this.f14515l);
                    this.f14513j &= -3;
                }
                stringTableTypes.f14486k = this.f14515l;
                return stringTableTypes;
            }

            public final void l(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.f14482o) {
                    return;
                }
                if (!stringTableTypes.f14485j.isEmpty()) {
                    if (this.f14514k.isEmpty()) {
                        this.f14514k = stringTableTypes.f14485j;
                        this.f14513j &= -2;
                    } else {
                        if ((this.f14513j & 1) != 1) {
                            this.f14514k = new ArrayList(this.f14514k);
                            this.f14513j |= 1;
                        }
                        this.f14514k.addAll(stringTableTypes.f14485j);
                    }
                }
                if (!stringTableTypes.f14486k.isEmpty()) {
                    if (this.f14515l.isEmpty()) {
                        this.f14515l = stringTableTypes.f14486k;
                        this.f14513j &= -3;
                    } else {
                        if ((this.f14513j & 2) != 2) {
                            this.f14515l = new ArrayList(this.f14515l);
                            this.f14513j |= 2;
                        }
                        this.f14515l.addAll(stringTableTypes.f14486k);
                    }
                }
                this.f14526i = this.f14526i.d(stringTableTypes.f14484i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                StringTableTypes stringTableTypes;
                try {
                    try {
                        StringTableTypes.f14483p.getClass();
                        l(new StringTableTypes(cVar, dVar));
                    } catch (Throwable th) {
                        th = th;
                        stringTableTypes = null;
                        if (stringTableTypes != null) {
                            l(stringTableTypes);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    stringTableTypes = (StringTableTypes) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (stringTableTypes != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f14482o = stringTableTypes;
            stringTableTypes.f14485j = Collections.emptyList();
            stringTableTypes.f14486k = Collections.emptyList();
        }

        public StringTableTypes() {
            this.f14487l = -1;
            this.f14488m = (byte) -1;
            this.n = -1;
            this.f14484i = i9.a.f11832i;
        }

        public StringTableTypes(c cVar, d dVar) {
            List list;
            Object g10;
            this.f14487l = -1;
            this.f14488m = (byte) -1;
            this.n = -1;
            this.f14485j = Collections.emptyList();
            this.f14486k = Collections.emptyList();
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 10) {
                                if (!(z11 & true)) {
                                    this.f14485j = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14485j;
                                g10 = cVar.g(Record.f14490v, dVar);
                            } else if (n == 40) {
                                if (!(z11 & true)) {
                                    this.f14486k = new ArrayList();
                                    z11 |= true;
                                }
                                list = this.f14486k;
                                g10 = Integer.valueOf(cVar.k());
                            } else if (n != 42) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                int d5 = cVar.d(cVar.k());
                                if (!(z11 & true) && cVar.b() > 0) {
                                    this.f14486k = new ArrayList();
                                    z11 |= true;
                                }
                                while (cVar.b() > 0) {
                                    this.f14486k.add(Integer.valueOf(cVar.k()));
                                }
                                cVar.c(d5);
                            }
                            list.add(g10);
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        if (z11 & true) {
                            this.f14485j = Collections.unmodifiableList(this.f14485j);
                        }
                        if (z11 & true) {
                            this.f14486k = Collections.unmodifiableList(this.f14486k);
                        }
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14484i = bVar.c();
                            throw th2;
                        }
                        this.f14484i = bVar.c();
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
                this.f14485j = Collections.unmodifiableList(this.f14485j);
            }
            if (z11 & true) {
                this.f14486k = Collections.unmodifiableList(this.f14486k);
            }
            try {
                j2.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f14484i = bVar.c();
                throw th3;
            }
            this.f14484i = bVar.c();
        }

        @Override // i9.f
        public final boolean a() {
            byte b5 = this.f14488m;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f14488m = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.n;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f14485j.size(); i12++) {
                i11 += CodedOutputStream.d(1, this.f14485j.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f14486k.size(); i14++) {
                i13 += CodedOutputStream.c(this.f14486k.get(i14).intValue());
            }
            int i15 = i11 + i13;
            if (!this.f14486k.isEmpty()) {
                i15 = i15 + 1 + CodedOutputStream.c(i13);
            }
            this.f14487l = i13;
            int size = this.f14484i.size() + i15;
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
            for (int i10 = 0; i10 < this.f14485j.size(); i10++) {
                codedOutputStream.o(1, this.f14485j.get(i10));
            }
            if (this.f14486k.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.f14487l);
            }
            for (int i11 = 0; i11 < this.f14486k.size(); i11++) {
                codedOutputStream.n(this.f14486k.get(i11).intValue());
            }
            codedOutputStream.r(this.f14484i);
        }

        public StringTableTypes(GeneratedMessageLite.a aVar) {
            super(0);
            this.f14487l = -1;
            this.f14488m = (byte) -1;
            this.n = -1;
            this.f14484i = aVar.f14526i;
        }

        /* loaded from: classes.dex */
        public static final class Record extends GeneratedMessageLite implements f {

            /* renamed from: u  reason: collision with root package name */
            public static final Record f14489u;

            /* renamed from: v  reason: collision with root package name */
            public static final a f14490v = new a();

            /* renamed from: i  reason: collision with root package name */
            public final i9.a f14491i;

            /* renamed from: j  reason: collision with root package name */
            public int f14492j;

            /* renamed from: k  reason: collision with root package name */
            public int f14493k;

            /* renamed from: l  reason: collision with root package name */
            public int f14494l;

            /* renamed from: m  reason: collision with root package name */
            public Object f14495m;
            public Operation n;

            /* renamed from: o  reason: collision with root package name */
            public List<Integer> f14496o;

            /* renamed from: p  reason: collision with root package name */
            public int f14497p;

            /* renamed from: q  reason: collision with root package name */
            public List<Integer> f14498q;

            /* renamed from: r  reason: collision with root package name */
            public int f14499r;

            /* renamed from: s  reason: collision with root package name */
            public byte f14500s;

            /* renamed from: t  reason: collision with root package name */
            public int f14501t;

            /* loaded from: classes.dex */
            public enum Operation implements f.a {
                f14502j("NONE"),
                f14503k("INTERNAL_TO_CLASS_ID"),
                f14504l("DESC_TO_CLASS_ID");
                

                /* renamed from: i  reason: collision with root package name */
                public final int f14506i;

                Operation(String str) {
                    this.f14506i = r2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
                public final int c() {
                    return this.f14506i;
                }
            }

            /* loaded from: classes.dex */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Record> {
                @Override // i9.g
                public final Object a(c cVar, d dVar) {
                    return new Record(cVar);
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends GeneratedMessageLite.a<Record, b> implements i9.f {

                /* renamed from: j  reason: collision with root package name */
                public int f14507j;

                /* renamed from: l  reason: collision with root package name */
                public int f14509l;

                /* renamed from: k  reason: collision with root package name */
                public int f14508k = 1;

                /* renamed from: m  reason: collision with root package name */
                public Object f14510m = "";
                public Operation n = Operation.f14502j;

                /* renamed from: o  reason: collision with root package name */
                public List<Integer> f14511o = Collections.emptyList();

                /* renamed from: p  reason: collision with root package name */
                public List<Integer> f14512p = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final h build() {
                    Record k3 = k();
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
                public final /* bridge */ /* synthetic */ b j(Record record) {
                    l(record);
                    return this;
                }

                public final Record k() {
                    Record record = new Record(this);
                    int i10 = this.f14507j;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    record.f14493k = this.f14508k;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f14494l = this.f14509l;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f14495m = this.f14510m;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.n = this.n;
                    if ((i10 & 16) == 16) {
                        this.f14511o = Collections.unmodifiableList(this.f14511o);
                        this.f14507j &= -17;
                    }
                    record.f14496o = this.f14511o;
                    if ((this.f14507j & 32) == 32) {
                        this.f14512p = Collections.unmodifiableList(this.f14512p);
                        this.f14507j &= -33;
                    }
                    record.f14498q = this.f14512p;
                    record.f14492j = i11;
                    return record;
                }

                public final void l(Record record) {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    if (record == Record.f14489u) {
                        return;
                    }
                    int i10 = record.f14492j;
                    boolean z13 = false;
                    if ((i10 & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i11 = record.f14493k;
                        this.f14507j |= 1;
                        this.f14508k = i11;
                    }
                    if ((i10 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        int i12 = record.f14494l;
                        this.f14507j = 2 | this.f14507j;
                        this.f14509l = i12;
                    }
                    if ((i10 & 4) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f14507j |= 4;
                        this.f14510m = record.f14495m;
                    }
                    if ((i10 & 8) == 8) {
                        z13 = true;
                    }
                    if (z13) {
                        Operation operation = record.n;
                        operation.getClass();
                        this.f14507j = 8 | this.f14507j;
                        this.n = operation;
                    }
                    if (!record.f14496o.isEmpty()) {
                        if (this.f14511o.isEmpty()) {
                            this.f14511o = record.f14496o;
                            this.f14507j &= -17;
                        } else {
                            if ((this.f14507j & 16) != 16) {
                                this.f14511o = new ArrayList(this.f14511o);
                                this.f14507j |= 16;
                            }
                            this.f14511o.addAll(record.f14496o);
                        }
                    }
                    if (!record.f14498q.isEmpty()) {
                        if (this.f14512p.isEmpty()) {
                            this.f14512p = record.f14498q;
                            this.f14507j &= -33;
                        } else {
                            if ((this.f14507j & 32) != 32) {
                                this.f14512p = new ArrayList(this.f14512p);
                                this.f14507j |= 32;
                            }
                            this.f14512p.addAll(record.f14498q);
                        }
                    }
                    this.f14526i = this.f14526i.d(record.f14491i);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m(c cVar, d dVar) {
                    Record record;
                    try {
                        try {
                            Record.f14490v.getClass();
                            l(new Record(cVar));
                        } catch (Throwable th) {
                            th = th;
                            record = null;
                            if (record != null) {
                                l(record);
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        record = (Record) e10.f14537i;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (record != null) {
                            }
                            throw th;
                        }
                    }
                }
            }

            static {
                Record record = new Record();
                f14489u = record;
                record.f14493k = 1;
                record.f14494l = 0;
                record.f14495m = "";
                record.n = Operation.f14502j;
                record.f14496o = Collections.emptyList();
                record.f14498q = Collections.emptyList();
            }

            public Record() {
                this.f14497p = -1;
                this.f14499r = -1;
                this.f14500s = (byte) -1;
                this.f14501t = -1;
                this.f14491i = i9.a.f11832i;
            }

            public Record(c cVar) {
                List<Integer> list;
                int d5;
                Operation operation;
                this.f14497p = -1;
                this.f14499r = -1;
                this.f14500s = (byte) -1;
                this.f14501t = -1;
                this.f14493k = 1;
                boolean z10 = false;
                this.f14494l = 0;
                this.f14495m = "";
                Operation operation2 = Operation.f14502j;
                this.n = operation2;
                this.f14496o = Collections.emptyList();
                this.f14498q = Collections.emptyList();
                a.b bVar = new a.b();
                CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int n = cVar.n();
                            if (n != 0) {
                                if (n == 8) {
                                    this.f14492j |= 1;
                                    this.f14493k = cVar.k();
                                } else if (n == 16) {
                                    this.f14492j |= 2;
                                    this.f14494l = cVar.k();
                                } else if (n != 24) {
                                    if (n != 32) {
                                        if (n == 34) {
                                            d5 = cVar.d(cVar.k());
                                            if (!(z11 & true) && cVar.b() > 0) {
                                                this.f14496o = new ArrayList();
                                                z11 |= true;
                                            }
                                            while (cVar.b() > 0) {
                                                this.f14496o.add(Integer.valueOf(cVar.k()));
                                            }
                                        } else if (n == 40) {
                                            if (!(z11 & true)) {
                                                this.f14498q = new ArrayList();
                                                z11 |= true;
                                            }
                                            list = this.f14498q;
                                        } else if (n == 42) {
                                            d5 = cVar.d(cVar.k());
                                            if (!(z11 & true) && cVar.b() > 0) {
                                                this.f14498q = new ArrayList();
                                                z11 |= true;
                                            }
                                            while (cVar.b() > 0) {
                                                this.f14498q.add(Integer.valueOf(cVar.k()));
                                            }
                                        } else if (n != 50) {
                                            if (!cVar.q(n, j2)) {
                                            }
                                        } else {
                                            e e10 = cVar.e();
                                            this.f14492j |= 4;
                                            this.f14495m = e10;
                                        }
                                        cVar.c(d5);
                                    } else {
                                        if (!(z11 & true)) {
                                            this.f14496o = new ArrayList();
                                            z11 |= true;
                                        }
                                        list = this.f14496o;
                                    }
                                    list.add(Integer.valueOf(cVar.k()));
                                } else {
                                    int k3 = cVar.k();
                                    if (k3 == 0) {
                                        operation = operation2;
                                    } else if (k3 != 1) {
                                        operation = k3 != 2 ? null : Operation.f14504l;
                                    } else {
                                        operation = Operation.f14503k;
                                    }
                                    if (operation == null) {
                                        j2.v(n);
                                        j2.v(k3);
                                    } else {
                                        this.f14492j |= 8;
                                        this.n = operation;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (Throwable th) {
                            if (z11 & true) {
                                this.f14496o = Collections.unmodifiableList(this.f14496o);
                            }
                            if (z11 & true) {
                                this.f14498q = Collections.unmodifiableList(this.f14498q);
                            }
                            try {
                                j2.i();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f14491i = bVar.c();
                                throw th2;
                            }
                            this.f14491i = bVar.c();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f14537i = this;
                        throw e11;
                    } catch (IOException e12) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                        invalidProtocolBufferException.f14537i = this;
                        throw invalidProtocolBufferException;
                    }
                }
                if (z11 & true) {
                    this.f14496o = Collections.unmodifiableList(this.f14496o);
                }
                if (z11 & true) {
                    this.f14498q = Collections.unmodifiableList(this.f14498q);
                }
                try {
                    j2.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f14491i = bVar.c();
                    throw th3;
                }
                this.f14491i = bVar.c();
            }

            @Override // i9.f
            public final boolean a() {
                byte b5 = this.f14500s;
                if (b5 == 1) {
                    return true;
                }
                if (b5 == 0) {
                    return false;
                }
                this.f14500s = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
            public final int b() {
                int i10;
                i9.a aVar;
                int i11 = this.f14501t;
                if (i11 != -1) {
                    return i11;
                }
                if ((this.f14492j & 1) == 1) {
                    i10 = CodedOutputStream.b(1, this.f14493k) + 0;
                } else {
                    i10 = 0;
                }
                if ((this.f14492j & 2) == 2) {
                    i10 += CodedOutputStream.b(2, this.f14494l);
                }
                if ((this.f14492j & 8) == 8) {
                    i10 += CodedOutputStream.a(3, this.n.f14506i);
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.f14496o.size(); i13++) {
                    i12 += CodedOutputStream.c(this.f14496o.get(i13).intValue());
                }
                int i14 = i10 + i12;
                if (!this.f14496o.isEmpty()) {
                    i14 = i14 + 1 + CodedOutputStream.c(i12);
                }
                this.f14497p = i12;
                int i15 = 0;
                for (int i16 = 0; i16 < this.f14498q.size(); i16++) {
                    i15 += CodedOutputStream.c(this.f14498q.get(i16).intValue());
                }
                int i17 = i14 + i15;
                if (!this.f14498q.isEmpty()) {
                    i17 = i17 + 1 + CodedOutputStream.c(i15);
                }
                this.f14499r = i15;
                if ((this.f14492j & 4) == 4) {
                    Object obj = this.f14495m;
                    if (obj instanceof String) {
                        try {
                            aVar = new e(((String) obj).getBytes("UTF-8"));
                            this.f14495m = aVar;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        aVar = (i9.a) obj;
                    }
                    i17 += aVar.size() + CodedOutputStream.f(aVar.size()) + CodedOutputStream.h(6);
                }
                int size = this.f14491i.size() + i17;
                this.f14501t = size;
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
                i9.a aVar;
                b();
                if ((this.f14492j & 1) == 1) {
                    codedOutputStream.m(1, this.f14493k);
                }
                if ((this.f14492j & 2) == 2) {
                    codedOutputStream.m(2, this.f14494l);
                }
                if ((this.f14492j & 8) == 8) {
                    codedOutputStream.l(3, this.n.f14506i);
                }
                if (this.f14496o.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.f14497p);
                }
                for (int i10 = 0; i10 < this.f14496o.size(); i10++) {
                    codedOutputStream.n(this.f14496o.get(i10).intValue());
                }
                if (this.f14498q.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.f14499r);
                }
                for (int i11 = 0; i11 < this.f14498q.size(); i11++) {
                    codedOutputStream.n(this.f14498q.get(i11).intValue());
                }
                if ((this.f14492j & 4) == 4) {
                    Object obj = this.f14495m;
                    if (obj instanceof String) {
                        try {
                            aVar = new e(((String) obj).getBytes("UTF-8"));
                            this.f14495m = aVar;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        aVar = (i9.a) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(aVar.size());
                    codedOutputStream.r(aVar);
                }
                codedOutputStream.r(this.f14491i);
            }

            public Record(GeneratedMessageLite.a aVar) {
                super(0);
                this.f14497p = -1;
                this.f14499r = -1;
                this.f14500s = (byte) -1;
                this.f14501t = -1;
                this.f14491i = aVar.f14526i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class JvmPropertySignature extends GeneratedMessageLite implements i9.f {

        /* renamed from: r  reason: collision with root package name */
        public static final JvmPropertySignature f14467r;

        /* renamed from: s  reason: collision with root package name */
        public static final a f14468s = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14469i;

        /* renamed from: j  reason: collision with root package name */
        public int f14470j;

        /* renamed from: k  reason: collision with root package name */
        public JvmFieldSignature f14471k;

        /* renamed from: l  reason: collision with root package name */
        public JvmMethodSignature f14472l;

        /* renamed from: m  reason: collision with root package name */
        public JvmMethodSignature f14473m;
        public JvmMethodSignature n;

        /* renamed from: o  reason: collision with root package name */
        public JvmMethodSignature f14474o;

        /* renamed from: p  reason: collision with root package name */
        public byte f14475p;

        /* renamed from: q  reason: collision with root package name */
        public int f14476q;

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmPropertySignature> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new JvmPropertySignature(cVar, dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<JvmPropertySignature, b> implements i9.f {

            /* renamed from: j  reason: collision with root package name */
            public int f14477j;

            /* renamed from: k  reason: collision with root package name */
            public JvmFieldSignature f14478k = JvmFieldSignature.f14447o;

            /* renamed from: l  reason: collision with root package name */
            public JvmMethodSignature f14479l;

            /* renamed from: m  reason: collision with root package name */
            public JvmMethodSignature f14480m;
            public JvmMethodSignature n;

            /* renamed from: o  reason: collision with root package name */
            public JvmMethodSignature f14481o;

            public b() {
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f14457o;
                this.f14479l = jvmMethodSignature;
                this.f14480m = jvmMethodSignature;
                this.n = jvmMethodSignature;
                this.f14481o = jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                JvmPropertySignature k3 = k();
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
            public final /* bridge */ /* synthetic */ b j(JvmPropertySignature jvmPropertySignature) {
                l(jvmPropertySignature);
                return this;
            }

            public final JvmPropertySignature k() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f14477j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmPropertySignature.f14471k = this.f14478k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f14472l = this.f14479l;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f14473m = this.f14480m;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.n = this.n;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f14474o = this.f14481o;
                jvmPropertySignature.f14470j = i11;
                return jvmPropertySignature;
            }

            public final void l(JvmPropertySignature jvmPropertySignature) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.f14467r) {
                    return;
                }
                boolean z14 = true;
                if ((jvmPropertySignature.f14470j & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.f14471k;
                    if ((this.f14477j & 1) == 1 && (jvmFieldSignature = this.f14478k) != JvmFieldSignature.f14447o) {
                        JvmFieldSignature.b bVar = new JvmFieldSignature.b();
                        bVar.l(jvmFieldSignature);
                        bVar.l(jvmFieldSignature2);
                        jvmFieldSignature2 = bVar.k();
                    }
                    this.f14478k = jvmFieldSignature2;
                    this.f14477j |= 1;
                }
                if ((jvmPropertySignature.f14470j & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.f14472l;
                    if ((this.f14477j & 2) == 2 && (jvmMethodSignature4 = this.f14479l) != JvmMethodSignature.f14457o) {
                        JvmMethodSignature.b j2 = JvmMethodSignature.j(jvmMethodSignature4);
                        j2.l(jvmMethodSignature5);
                        jvmMethodSignature5 = j2.k();
                    }
                    this.f14479l = jvmMethodSignature5;
                    this.f14477j |= 2;
                }
                if ((jvmPropertySignature.f14470j & 4) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.f14473m;
                    if ((this.f14477j & 4) == 4 && (jvmMethodSignature3 = this.f14480m) != JvmMethodSignature.f14457o) {
                        JvmMethodSignature.b j10 = JvmMethodSignature.j(jvmMethodSignature3);
                        j10.l(jvmMethodSignature6);
                        jvmMethodSignature6 = j10.k();
                    }
                    this.f14480m = jvmMethodSignature6;
                    this.f14477j |= 4;
                }
                if ((jvmPropertySignature.f14470j & 8) == 8) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    JvmMethodSignature jvmMethodSignature7 = jvmPropertySignature.n;
                    if ((this.f14477j & 8) == 8 && (jvmMethodSignature2 = this.n) != JvmMethodSignature.f14457o) {
                        JvmMethodSignature.b j11 = JvmMethodSignature.j(jvmMethodSignature2);
                        j11.l(jvmMethodSignature7);
                        jvmMethodSignature7 = j11.k();
                    }
                    this.n = jvmMethodSignature7;
                    this.f14477j |= 8;
                }
                if ((jvmPropertySignature.f14470j & 16) != 16) {
                    z14 = false;
                }
                if (z14) {
                    JvmMethodSignature jvmMethodSignature8 = jvmPropertySignature.f14474o;
                    if ((this.f14477j & 16) == 16 && (jvmMethodSignature = this.f14481o) != JvmMethodSignature.f14457o) {
                        JvmMethodSignature.b j12 = JvmMethodSignature.j(jvmMethodSignature);
                        j12.l(jvmMethodSignature8);
                        jvmMethodSignature8 = j12.k();
                    }
                    this.f14481o = jvmMethodSignature8;
                    this.f14477j |= 16;
                }
                this.f14526i = this.f14526i.d(jvmPropertySignature.f14469i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                JvmPropertySignature jvmPropertySignature;
                try {
                    try {
                        JvmPropertySignature.f14468s.getClass();
                        l(new JvmPropertySignature(cVar, dVar));
                    } catch (Throwable th) {
                        th = th;
                        jvmPropertySignature = null;
                        if (jvmPropertySignature != null) {
                            l(jvmPropertySignature);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    jvmPropertySignature = (JvmPropertySignature) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (jvmPropertySignature != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f14467r = jvmPropertySignature;
            jvmPropertySignature.f14471k = JvmFieldSignature.f14447o;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f14457o;
            jvmPropertySignature.f14472l = jvmMethodSignature;
            jvmPropertySignature.f14473m = jvmMethodSignature;
            jvmPropertySignature.n = jvmMethodSignature;
            jvmPropertySignature.f14474o = jvmMethodSignature;
        }

        public JvmPropertySignature() {
            this.f14475p = (byte) -1;
            this.f14476q = -1;
            this.f14469i = i9.a.f11832i;
        }

        public JvmPropertySignature(c cVar, d dVar) {
            int i10;
            this.f14475p = (byte) -1;
            this.f14476q = -1;
            this.f14471k = JvmFieldSignature.f14447o;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f14457o;
            this.f14472l = jvmMethodSignature;
            this.f14473m = jvmMethodSignature;
            this.n = jvmMethodSignature;
            this.f14474o = jvmMethodSignature;
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            JvmMethodSignature.b bVar2 = null;
                            JvmFieldSignature.b bVar3 = null;
                            JvmMethodSignature.b bVar4 = null;
                            JvmMethodSignature.b bVar5 = null;
                            JvmMethodSignature.b bVar6 = null;
                            if (n != 10) {
                                if (n == 18) {
                                    i10 = 2;
                                    if ((this.f14470j & 2) == 2) {
                                        JvmMethodSignature jvmMethodSignature2 = this.f14472l;
                                        jvmMethodSignature2.getClass();
                                        bVar2 = JvmMethodSignature.j(jvmMethodSignature2);
                                    }
                                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) cVar.g(JvmMethodSignature.f14458p, dVar);
                                    this.f14472l = jvmMethodSignature3;
                                    if (bVar2 != null) {
                                        bVar2.l(jvmMethodSignature3);
                                        this.f14472l = bVar2.k();
                                    }
                                } else if (n == 26) {
                                    i10 = 4;
                                    if ((this.f14470j & 4) == 4) {
                                        JvmMethodSignature jvmMethodSignature4 = this.f14473m;
                                        jvmMethodSignature4.getClass();
                                        bVar6 = JvmMethodSignature.j(jvmMethodSignature4);
                                    }
                                    JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) cVar.g(JvmMethodSignature.f14458p, dVar);
                                    this.f14473m = jvmMethodSignature5;
                                    if (bVar6 != null) {
                                        bVar6.l(jvmMethodSignature5);
                                        this.f14473m = bVar6.k();
                                    }
                                } else if (n == 34) {
                                    i10 = 8;
                                    if ((this.f14470j & 8) == 8) {
                                        JvmMethodSignature jvmMethodSignature6 = this.n;
                                        jvmMethodSignature6.getClass();
                                        bVar5 = JvmMethodSignature.j(jvmMethodSignature6);
                                    }
                                    JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) cVar.g(JvmMethodSignature.f14458p, dVar);
                                    this.n = jvmMethodSignature7;
                                    if (bVar5 != null) {
                                        bVar5.l(jvmMethodSignature7);
                                        this.n = bVar5.k();
                                    }
                                } else if (n != 42) {
                                    if (!cVar.q(n, j2)) {
                                    }
                                } else {
                                    i10 = 16;
                                    if ((this.f14470j & 16) == 16) {
                                        JvmMethodSignature jvmMethodSignature8 = this.f14474o;
                                        jvmMethodSignature8.getClass();
                                        bVar4 = JvmMethodSignature.j(jvmMethodSignature8);
                                    }
                                    JvmMethodSignature jvmMethodSignature9 = (JvmMethodSignature) cVar.g(JvmMethodSignature.f14458p, dVar);
                                    this.f14474o = jvmMethodSignature9;
                                    if (bVar4 != null) {
                                        bVar4.l(jvmMethodSignature9);
                                        this.f14474o = bVar4.k();
                                    }
                                }
                                this.f14470j |= i10;
                            } else {
                                if ((this.f14470j & 1) == 1) {
                                    JvmFieldSignature jvmFieldSignature = this.f14471k;
                                    jvmFieldSignature.getClass();
                                    bVar3 = new JvmFieldSignature.b();
                                    bVar3.l(jvmFieldSignature);
                                }
                                JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) cVar.g(JvmFieldSignature.f14448p, dVar);
                                this.f14471k = jvmFieldSignature2;
                                if (bVar3 != null) {
                                    bVar3.l(jvmFieldSignature2);
                                    this.f14471k = bVar3.k();
                                }
                                this.f14470j |= 1;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f14469i = bVar.c();
                            throw th2;
                        }
                        this.f14469i = bVar.c();
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
                this.f14469i = bVar.c();
                throw th3;
            }
            this.f14469i = bVar.c();
        }

        @Override // i9.f
        public final boolean a() {
            byte b5 = this.f14475p;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            this.f14475p = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.f14476q;
            if (i10 != -1) {
                return i10;
            }
            int d5 = (this.f14470j & 1) == 1 ? 0 + CodedOutputStream.d(1, this.f14471k) : 0;
            if ((this.f14470j & 2) == 2) {
                d5 += CodedOutputStream.d(2, this.f14472l);
            }
            if ((this.f14470j & 4) == 4) {
                d5 += CodedOutputStream.d(3, this.f14473m);
            }
            if ((this.f14470j & 8) == 8) {
                d5 += CodedOutputStream.d(4, this.n);
            }
            if ((this.f14470j & 16) == 16) {
                d5 += CodedOutputStream.d(5, this.f14474o);
            }
            int size = this.f14469i.size() + d5;
            this.f14476q = size;
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
            if ((this.f14470j & 1) == 1) {
                codedOutputStream.o(1, this.f14471k);
            }
            if ((this.f14470j & 2) == 2) {
                codedOutputStream.o(2, this.f14472l);
            }
            if ((this.f14470j & 4) == 4) {
                codedOutputStream.o(3, this.f14473m);
            }
            if ((this.f14470j & 8) == 8) {
                codedOutputStream.o(4, this.n);
            }
            if ((this.f14470j & 16) == 16) {
                codedOutputStream.o(5, this.f14474o);
            }
            codedOutputStream.r(this.f14469i);
        }

        public JvmPropertySignature(GeneratedMessageLite.a aVar) {
            super(0);
            this.f14475p = (byte) -1;
            this.f14476q = -1;
            this.f14469i = aVar.f14526i;
        }
    }
}

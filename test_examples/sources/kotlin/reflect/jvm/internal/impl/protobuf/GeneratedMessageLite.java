package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends GeneratedMessageLite, BuilderType extends a> extends a.AbstractC0162a<BuilderType> {

        /* renamed from: i  reason: collision with root package name */
        public i9.a f14526i = i9.a.f11832i;

        @Override // 
        /* renamed from: i */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType j(MessageType messagetype);
    }

    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends ExtendableMessage<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements i9.f {

        /* renamed from: j  reason: collision with root package name */
        public e<c> f14527j = e.f14568d;

        /* renamed from: k  reason: collision with root package name */
        public boolean f14528k;

        public final void k(MessageType messagetype) {
            i iVar;
            if (!this.f14528k) {
                this.f14527j = this.f14527j.clone();
                this.f14528k = true;
            }
            e<c> eVar = this.f14527j;
            e<c> eVar2 = messagetype.f14523i;
            eVar.getClass();
            int i10 = 0;
            while (true) {
                int size = eVar2.f14569a.f14575j.size();
                iVar = eVar2.f14569a;
                if (i10 >= size) {
                    break;
                }
                eVar.i(iVar.f14575j.get(i10));
                i10++;
            }
            for (Map.Entry<Object, Object> entry : iVar.c()) {
                eVar.i(entry);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e.a<c> {

        /* renamed from: i  reason: collision with root package name */
        public final int f14529i;

        /* renamed from: j  reason: collision with root package name */
        public final WireFormat$FieldType f14530j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f14531k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f14532l = false;

        public c(int i10, WireFormat$FieldType wireFormat$FieldType, boolean z10) {
            this.f14529i = i10;
            this.f14530j = wireFormat$FieldType;
            this.f14531k = z10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final int c() {
            return this.f14529i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f14529i - ((c) obj).f14529i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final boolean d() {
            return this.f14531k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final WireFormat$FieldType e() {
            return this.f14530j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final WireFormat$JavaType f() {
            return this.f14530j.f14543i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final boolean g() {
            return this.f14532l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.e.a
        public final a h(h.a aVar, h hVar) {
            return ((a) aVar).j((GeneratedMessageLite) hVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d<ContainingType extends h, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final ContainingType f14533a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f14534b;
        public final h c;

        /* renamed from: d  reason: collision with root package name */
        public final c f14535d;

        /* renamed from: e  reason: collision with root package name */
        public final Method f14536e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, c cVar, Class cls) {
            Method method;
            if (extendableMessage != null) {
                if (cVar.f14530j == WireFormat$FieldType.n && generatedMessageLite == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f14533a = extendableMessage;
                this.f14534b = obj;
                this.c = generatedMessageLite;
                this.f14535d = cVar;
                if (f.a.class.isAssignableFrom(cls)) {
                    try {
                        method = cls.getMethod("valueOf", Integer.TYPE);
                    } catch (NoSuchMethodException e10) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                        sb.append("Generated message class \"");
                        sb.append(name);
                        sb.append("\" missing method \"valueOf\".");
                        throw new RuntimeException(sb.toString(), e10);
                    }
                } else {
                    method = null;
                }
                this.f14536e = method;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        public final Object a(Object obj) {
            if (this.f14535d.f14530j.f14543i == WireFormat$JavaType.f14551q) {
                try {
                    return this.f14536e.invoke(null, (Integer) obj);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
                } catch (InvocationTargetException e11) {
                    Throwable cause = e11.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                    }
                    throw ((RuntimeException) cause);
                }
            }
            return obj;
        }
    }

    public GeneratedMessageLite() {
    }

    public GeneratedMessageLite(int i10) {
    }

    public static d h(ExtendableMessage extendableMessage, GeneratedMessageLite generatedMessageLite, int i10, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new d(extendableMessage, Collections.emptyList(), generatedMessageLite, new c(i10, wireFormat$FieldType, true), cls);
    }

    public static d i(ExtendableMessage extendableMessage, Serializable serializable, GeneratedMessageLite generatedMessageLite, int i10, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new d(extendableMessage, serializable, generatedMessageLite, new c(i10, wireFormat$FieldType, false), cls);
    }

    /* loaded from: classes.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements i9.f {

        /* renamed from: i  reason: collision with root package name */
        public final e<c> f14523i;

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final Iterator<Map.Entry<c, Object>> f14524a;

            /* renamed from: b  reason: collision with root package name */
            public Map.Entry<c, Object> f14525b;
            public final boolean c;

            public a(ExtendableMessage extendableMessage) {
                Iterator<Map.Entry<c, Object>> it;
                e<c> eVar = extendableMessage.f14523i;
                boolean z10 = eVar.c;
                i iVar = eVar.f14569a;
                if (z10) {
                    it = new g.b<>(((j.d) iVar.entrySet()).iterator());
                } else {
                    it = ((j.d) iVar.entrySet()).iterator();
                }
                this.f14524a = it;
                if (it.hasNext()) {
                    this.f14525b = it.next();
                }
                this.c = false;
            }

            public final void a(int i10, CodedOutputStream codedOutputStream) {
                Map.Entry<c, Object> entry;
                while (true) {
                    Map.Entry<c, Object> entry2 = this.f14525b;
                    if (entry2 != null && entry2.getKey().f14529i < i10) {
                        c key = this.f14525b.getKey();
                        int i11 = 0;
                        if (this.c && key.f14530j.f14543i == WireFormat$JavaType.f14552r && !key.f14531k) {
                            codedOutputStream.x(1, 3);
                            codedOutputStream.x(2, 0);
                            codedOutputStream.v(key.f14529i);
                            codedOutputStream.o(3, (h) this.f14525b.getValue());
                            codedOutputStream.x(1, 4);
                        } else {
                            Object value = this.f14525b.getValue();
                            e eVar = e.f14568d;
                            WireFormat$FieldType e10 = key.e();
                            int c = key.c();
                            if (key.d()) {
                                List<Object> list = (List) value;
                                if (key.g()) {
                                    codedOutputStream.x(c, 2);
                                    for (Object obj : list) {
                                        i11 += e.d(e10, obj);
                                    }
                                    codedOutputStream.v(i11);
                                    for (Object obj2 : list) {
                                        e.n(codedOutputStream, e10, obj2);
                                    }
                                } else {
                                    for (Object obj3 : list) {
                                        e.m(codedOutputStream, e10, c, obj3);
                                    }
                                }
                            } else if (value instanceof g) {
                                e.m(codedOutputStream, e10, c, ((g) value).a());
                            } else {
                                e.m(codedOutputStream, e10, c, value);
                            }
                        }
                        Iterator<Map.Entry<c, Object>> it = this.f14524a;
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                        this.f14525b = entry;
                    } else {
                        return;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f14523i = new e<>();
        }

        public final boolean j() {
            int i10 = 0;
            while (true) {
                i iVar = this.f14523i.f14569a;
                if (i10 < iVar.f14575j.size()) {
                    if (!e.g(iVar.f14575j.get(i10))) {
                        return false;
                    }
                    i10++;
                } else {
                    for (Map.Entry<Object, Object> entry : iVar.c()) {
                        if (!e.g(entry)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        public final int k() {
            i iVar;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                iVar = this.f14523i.f14569a;
                if (i10 >= iVar.f14575j.size()) {
                    break;
                }
                j<K, V>.b bVar = iVar.f14575j.get(i10);
                i11 += e.e((e.a) bVar.getKey(), bVar.getValue());
                i10++;
            }
            for (Map.Entry<Object, Object> entry : iVar.c()) {
                i11 += e.e((e.a) entry.getKey(), entry.getValue());
            }
            return i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type l(d<MessageType, Type> dVar) {
            q(dVar);
            e<c> eVar = this.f14523i;
            c cVar = dVar.f14535d;
            Type type = (Type) eVar.f(cVar);
            if (type == null) {
                return dVar.f14534b;
            }
            if (cVar.f14531k) {
                if (cVar.f14530j.f14543i == WireFormat$JavaType.f14551q) {
                    ?? r1 = (Type) new ArrayList();
                    for (Object obj : (List) type) {
                        r1.add(dVar.a(obj));
                    }
                    return r1;
                }
                return type;
            }
            return (Type) dVar.a(type);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean m(d<MessageType, Type> dVar) {
            q(dVar);
            e<c> eVar = this.f14523i;
            eVar.getClass();
            c cVar = dVar.f14535d;
            if (!cVar.f14531k) {
                if (eVar.f14569a.get(cVar) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void n() {
            this.f14523i.h();
        }

        public final ExtendableMessage<MessageType>.a o() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean p(kotlin.reflect.jvm.internal.impl.protobuf.c cVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.d dVar, int i10) {
            boolean z10;
            boolean z11;
            h.a aVar;
            Object build;
            h hVar;
            h e10 = e();
            int i11 = i10 & 7;
            dVar.getClass();
            d<?, ?> dVar2 = dVar.f14565a.get(new d.a(i10 >>> 3, e10));
            if (dVar2 != null) {
                c cVar2 = dVar2.f14535d;
                WireFormat$FieldType wireFormat$FieldType = cVar2.f14530j;
                e eVar = e.f14568d;
                if (i11 == wireFormat$FieldType.f14544j) {
                    z10 = false;
                    z11 = false;
                    if (z10) {
                        return cVar.q(i10, codedOutputStream);
                    }
                    e<c> eVar2 = this.f14523i;
                    if (z11) {
                        int d5 = cVar.d(cVar.k());
                        c cVar3 = dVar2.f14535d;
                        if (cVar3.f14530j == WireFormat$FieldType.f14541o) {
                            if (cVar.b() > 0) {
                                cVar.k();
                                cVar3.getClass();
                                throw null;
                            }
                        } else {
                            while (cVar.b() > 0) {
                                eVar2.a(cVar3, e.j(cVar, cVar3.f14530j));
                            }
                        }
                        cVar.c(d5);
                        return true;
                    }
                    int ordinal = dVar2.f14535d.f14530j.f14543i.ordinal();
                    c cVar4 = dVar2.f14535d;
                    if (ordinal != 7) {
                        if (ordinal != 8) {
                            build = e.j(cVar, cVar4.f14530j);
                        } else {
                            if (!cVar4.f14531k && (hVar = (h) eVar2.f(cVar4)) != null) {
                                aVar = hVar.c();
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                                aVar = dVar2.c.d();
                            }
                            if (cVar4.f14530j == WireFormat$FieldType.f14540m) {
                                int i12 = cVar.f14563i;
                                if (i12 < 64) {
                                    cVar.f14563i = i12 + 1;
                                    aVar.g(cVar, dVar);
                                    cVar.a((cVar4.f14529i << 3) | 4);
                                    cVar.f14563i--;
                                } else {
                                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                                }
                            } else {
                                int k3 = cVar.k();
                                if (cVar.f14563i < 64) {
                                    int d10 = cVar.d(k3);
                                    cVar.f14563i++;
                                    aVar.g(cVar, dVar);
                                    cVar.a(0);
                                    cVar.f14563i--;
                                    cVar.c(d10);
                                } else {
                                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                                }
                            }
                            build = aVar.build();
                        }
                        boolean z12 = cVar4.f14531k;
                        if (cVar4.f14530j.f14543i == WireFormat$JavaType.f14551q) {
                            build = Integer.valueOf(((f.a) build).c());
                        }
                        if (z12) {
                            eVar2.a(cVar4, build);
                            return true;
                        }
                        eVar2.k(cVar4, build);
                        return true;
                    }
                    cVar.k();
                    cVar4.getClass();
                    throw null;
                } else if (cVar2.f14531k && wireFormat$FieldType.a() && i11 == 2) {
                    z10 = false;
                    z11 = true;
                    if (z10) {
                    }
                }
            }
            z10 = true;
            z11 = false;
            if (z10) {
            }
        }

        public final void q(d<MessageType, ?> dVar) {
            if (dVar.f14533a == e()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public ExtendableMessage(b<MessageType, ?> bVar) {
            bVar.f14527j.h();
            bVar.f14528k = false;
            this.f14523i = bVar.f14527j;
        }
    }
}

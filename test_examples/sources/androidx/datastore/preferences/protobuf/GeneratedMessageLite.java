package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected c1 unknownFields = c1.f4851f;
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        /* JADX INFO: Fake field, exist only in values array */
        GET_PARSER
    }

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0035a<MessageType, BuilderType> {

        /* renamed from: i  reason: collision with root package name */
        public final MessageType f4804i;

        /* renamed from: j  reason: collision with root package name */
        public MessageType f4805j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4806k = false;

        public a(MessageType messagetype) {
            this.f4804i = messagetype;
            this.f4805j = (MessageType) messagetype.k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        public static void l(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            s0 s0Var = s0.c;
            s0Var.getClass();
            s0Var.a(generatedMessageLite.getClass()).a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() {
            a aVar = (a) this.f4804i.k(MethodToInvoke.NEW_BUILDER);
            MessageType j2 = j();
            aVar.k();
            l(aVar.f4805j, j2);
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.j0
        public final GeneratedMessageLite f() {
            return this.f4804i;
        }

        public final MessageType i() {
            MessageType j2 = j();
            if (j2.a()) {
                return j2;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType j() {
            if (this.f4806k) {
                return this.f4805j;
            }
            MessageType messagetype = this.f4805j;
            messagetype.getClass();
            s0 s0Var = s0.c;
            s0Var.getClass();
            s0Var.a(messagetype.getClass()).c(messagetype);
            this.f4806k = true;
            return this.f4805j;
        }

        public final void k() {
            if (this.f4806k) {
                MessageType messagetype = (MessageType) this.f4805j.k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                l(messagetype, this.f4805j);
                this.f4805j = messagetype;
                this.f4806k = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
        public b(T t10) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements j0 {
        protected q<d> extensions = q.f4929d;

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.i0
        public final a c() {
            a aVar = (a) k(MethodToInvoke.NEW_BUILDER);
            aVar.k();
            a.l(aVar.f4805j, this);
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.i0
        public final a d() {
            return (a) k(MethodToInvoke.NEW_BUILDER);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.j0
        public final GeneratedMessageLite f() {
            return (GeneratedMessageLite) k(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q.a<d> {
        @Override // androidx.datastore.preferences.protobuf.q.a
        public final void c() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q.a
        public final void d() {
        }

        @Override // androidx.datastore.preferences.protobuf.q.a
        public final void e() {
        }

        @Override // androidx.datastore.preferences.protobuf.q.a
        public final WireFormat$JavaType f() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.q.a
        public final void g() {
        }

        @Override // androidx.datastore.preferences.protobuf.q.a
        public final a t(i0.a aVar, i0 i0Var) {
            a aVar2 = (a) aVar;
            aVar2.k();
            a.l(aVar2.f4805j, (GeneratedMessageLite) i0Var);
            return aVar2;
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends i0, Type> extends k {
    }

    public static <T extends GeneratedMessageLite<?, ?>> T l(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) f1.a(cls)).k(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (generatedMessageLite != null) {
                defaultInstanceMap.put(cls, generatedMessageLite);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) generatedMessageLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object m(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T n(T t10, g gVar, m mVar) {
        T t11 = (T) t10.k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            s0 s0Var = s0.c;
            s0Var.getClass();
            w0 a10 = s0Var.a(t11.getClass());
            h hVar = gVar.f4878d;
            if (hVar == null) {
                hVar = new h(gVar);
            }
            a10.b(t11, hVar, mVar);
            a10.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void o(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean a() {
        byte byteValue = ((Byte) k(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        s0 s0Var = s0.c;
        s0Var.getClass();
        boolean e10 = s0Var.a(getClass()).e(this);
        k(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return e10;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final int b() {
        if (this.memoizedSerializedSize == -1) {
            s0 s0Var = s0.c;
            s0Var.getClass();
            this.memoizedSerializedSize = s0Var.a(getClass()).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public a c() {
        a aVar = (a) k(MethodToInvoke.NEW_BUILDER);
        aVar.k();
        a.l(aVar.f4805j, this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public a d() {
        return (a) k(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void e(CodedOutputStream codedOutputStream) {
        s0 s0Var = s0.c;
        s0Var.getClass();
        w0 a10 = s0Var.a(getClass());
        i iVar = codedOutputStream.f4782i;
        if (iVar == null) {
            iVar = new i(codedOutputStream);
        }
        a10.d(this, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) k(MethodToInvoke.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        s0 s0Var = s0.c;
        s0Var.getClass();
        return s0Var.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public GeneratedMessageLite f() {
        return (GeneratedMessageLite) k(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int g() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        s0 s0Var = s0.c;
        s0Var.getClass();
        int i11 = s0Var.a(getClass()).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void j(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public abstract Object k(MethodToInvoke methodToInvoke);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        k0.c(this, sb, 0);
        return sb.toString();
    }
}

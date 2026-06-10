package n8;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import v7.g;
import w9.h;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16135a = new a();

        @Override // n8.c
        public final boolean d(DeserializedClassDescriptor deserializedClassDescriptor, h hVar) {
            g.f(deserializedClassDescriptor, "classDescriptor");
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16136a = new b();

        @Override // n8.c
        public final boolean d(DeserializedClassDescriptor deserializedClassDescriptor, h hVar) {
            g.f(deserializedClassDescriptor, "classDescriptor");
            return !hVar.getAnnotations().i(d.f16137a);
        }
    }

    boolean d(DeserializedClassDescriptor deserializedClassDescriptor, h hVar);
}

package n8;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import v7.g;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: n8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0194a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0194a f16134a = new C0194a();

        @Override // n8.a
        public final Collection a(DeserializedClassDescriptor deserializedClassDescriptor) {
            g.f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f12981i;
        }

        @Override // n8.a
        public final Collection b(DeserializedClassDescriptor deserializedClassDescriptor) {
            g.f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f12981i;
        }

        @Override // n8.a
        public final Collection c(h9.e eVar, DeserializedClassDescriptor deserializedClassDescriptor) {
            g.f(eVar, "name");
            g.f(deserializedClassDescriptor, "classDescriptor");
            return EmptyList.f12981i;
        }

        @Override // n8.a
        public final Collection e(DeserializedClassDescriptor deserializedClassDescriptor) {
            return EmptyList.f12981i;
        }
    }

    Collection a(DeserializedClassDescriptor deserializedClassDescriptor);

    Collection b(DeserializedClassDescriptor deserializedClassDescriptor);

    Collection c(h9.e eVar, DeserializedClassDescriptor deserializedClassDescriptor);

    Collection e(DeserializedClassDescriptor deserializedClassDescriptor);
}

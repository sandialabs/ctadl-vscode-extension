package u9;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0231a f17900a = new C0231a();

        /* renamed from: u9.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0231a implements d {
            @Override // u9.d
            public final void a(ProtoBuf$Function protoBuf$Function, w9.h hVar, f9.g gVar, TypeDeserializer typeDeserializer) {
                v7.g.f(protoBuf$Function, "proto");
                v7.g.f(gVar, "typeTable");
                v7.g.f(typeDeserializer, "typeDeserializer");
            }
        }
    }

    void a(ProtoBuf$Function protoBuf$Function, w9.h hVar, f9.g gVar, TypeDeserializer typeDeserializer);
}

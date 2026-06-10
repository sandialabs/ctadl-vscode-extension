package u9;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import y9.v;

/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17930a = new a();

        @Override // u9.k
        public final y9.r a(ProtoBuf$Type protoBuf$Type, String str, v vVar, v vVar2) {
            v7.g.f(protoBuf$Type, "proto");
            v7.g.f(str, "flexibleId");
            v7.g.f(vVar, "lowerBound");
            v7.g.f(vVar2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    y9.r a(ProtoBuf$Type protoBuf$Type, String str, v vVar, v vVar2);
}

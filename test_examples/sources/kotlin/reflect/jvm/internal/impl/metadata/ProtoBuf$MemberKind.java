package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* loaded from: classes.dex */
public enum ProtoBuf$MemberKind implements f.a {
    /* JADX INFO: Fake field, exist only in values array */
    EF5("DECLARATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("FAKE_OVERRIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("DELEGATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("SYNTHESIZED");
    

    /* renamed from: i  reason: collision with root package name */
    public final int f14187i;

    ProtoBuf$MemberKind(String str) {
        this.f14187i = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
    public final int c() {
        return this.f14187i;
    }
}

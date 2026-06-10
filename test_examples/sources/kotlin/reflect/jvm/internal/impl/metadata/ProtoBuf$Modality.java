package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* loaded from: classes.dex */
public enum ProtoBuf$Modality implements f.a {
    /* JADX INFO: Fake field, exist only in values array */
    EF5("FINAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("OPEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("ABSTRACT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("SEALED");
    

    /* renamed from: i  reason: collision with root package name */
    public final int f14189i;

    ProtoBuf$Modality(String str) {
        this.f14189i = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
    public final int c() {
        return this.f14189i;
    }
}

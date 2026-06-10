package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* loaded from: classes.dex */
public enum ProtoBuf$Visibility implements f.a {
    /* JADX INFO: Fake field, exist only in values array */
    EF5("INTERNAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PROTECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("PRIVATE_TO_THIS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("LOCAL");
    

    /* renamed from: i  reason: collision with root package name */
    public final int f14434i;

    ProtoBuf$Visibility(String str) {
        this.f14434i = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
    public final int c() {
        return this.f14434i;
    }
}

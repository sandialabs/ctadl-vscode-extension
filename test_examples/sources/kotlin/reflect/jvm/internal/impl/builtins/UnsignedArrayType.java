package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes.dex */
public enum UnsignedArrayType {
    UBYTEARRAY(h9.b.e("kotlin/UByteArray")),
    USHORTARRAY(h9.b.e("kotlin/UShortArray")),
    UINTARRAY(h9.b.e("kotlin/UIntArray")),
    ULONGARRAY(h9.b.e("kotlin/ULongArray"));
    

    /* renamed from: i  reason: collision with root package name */
    public final h9.e f13316i;

    UnsignedArrayType(h9.b bVar) {
        h9.e j2 = bVar.j();
        v7.g.e(j2, "classId.shortClassName");
        this.f13316i = j2;
    }
}

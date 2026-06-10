package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes.dex */
public enum UnsignedType {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(h9.b.f("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(h9.b.f("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(h9.b.f("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(h9.b.f("kotlin/ULong", false));
    

    /* renamed from: i  reason: collision with root package name */
    public final h9.b f13318i;

    /* renamed from: j  reason: collision with root package name */
    public final h9.e f13319j;

    /* renamed from: k  reason: collision with root package name */
    public final h9.b f13320k;

    UnsignedType(h9.b bVar) {
        this.f13318i = bVar;
        h9.e j2 = bVar.j();
        v7.g.e(j2, "classId.shortClassName");
        this.f13319j = j2;
        h9.c h10 = bVar.h();
        this.f13320k = new h9.b(h10, h9.e.k(j2.b() + "Array"));
    }
}

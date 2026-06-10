package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class u0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f4944a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4945b;
    public final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4946d;

    public u0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        char charAt;
        this.f4944a = generatedMessageLite;
        this.f4945b = str;
        this.c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 1;
            int i12 = 13;
            while (true) {
                int i13 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
            charAt2 = i10 | (charAt << i12);
        }
        this.f4946d = charAt2;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean a() {
        return (this.f4946d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final ProtoSyntax b() {
        return (this.f4946d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final i0 c() {
        return this.f4944a;
    }

    public final Object[] d() {
        return this.c;
    }

    public final String e() {
        return this.f4945b;
    }
}

package ua;

/* loaded from: classes.dex */
public final class j extends j1<Byte, byte[], i> {
    public static final j c = new j();

    public j() {
        super(k.f17982a);
    }

    @Override // ua.a
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        v7.g.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // ua.t, ua.a
    public final void k(ta.a aVar, int i10, Object obj, boolean z10) {
        i iVar = (i) obj;
        v7.g.f(iVar, "builder");
        byte K = aVar.K(this.f17981b, i10);
        iVar.b(iVar.d() + 1);
        byte[] bArr = iVar.f17977a;
        int i11 = iVar.f17978b;
        iVar.f17978b = i11 + 1;
        bArr[i11] = K;
    }

    @Override // ua.a
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        v7.g.f(bArr, "<this>");
        return new i(bArr);
    }

    @Override // ua.j1
    public final byte[] o() {
        return new byte[0];
    }

    @Override // ua.j1
    public final void p(ta.b bVar, byte[] bArr, int i10) {
        byte[] bArr2 = bArr;
        v7.g.f(bVar, "encoder");
        v7.g.f(bArr2, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.z(this.f17981b, i11, bArr2[i11]);
        }
    }
}

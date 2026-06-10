package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<p3.a> f5001d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f5002a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5003b;
    public volatile int c = 0;

    public i(n nVar, int i10) {
        this.f5003b = nVar;
        this.f5002a = i10;
    }

    public final int a(int i10) {
        p3.a c = c();
        int a10 = c.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = c.f16751b;
            int i11 = a10 + c.f16750a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        p3.a c = c();
        int a10 = c.a(16);
        if (a10 != 0) {
            int i10 = a10 + c.f16750a;
            return c.f16751b.getInt(c.f16751b.getInt(i10) + i10);
        }
        return 0;
    }

    public final p3.a c() {
        short s10;
        ThreadLocal<p3.a> threadLocal = f5001d;
        p3.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new p3.a();
            threadLocal.set(aVar);
        }
        p3.b bVar = this.f5003b.f5023a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f16750a;
            int i11 = (this.f5002a * 4) + bVar.f16751b.getInt(i10) + i10 + 4;
            int i12 = bVar.f16751b.getInt(i11) + i11;
            ByteBuffer byteBuffer = bVar.f16751b;
            aVar.f16751b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f16750a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.c = i13;
                s10 = aVar.f16751b.getShort(i13);
            } else {
                s10 = 0;
                aVar.f16750a = 0;
                aVar.c = 0;
            }
            aVar.f16752d = s10;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        p3.a c = c();
        int a10 = c.a(4);
        if (a10 != 0) {
            i10 = c.f16751b.getInt(a10 + c.f16750a);
        } else {
            i10 = 0;
        }
        sb.append(Integer.toHexString(i10));
        sb.append(", codepoints:");
        int b5 = b();
        for (int i11 = 0; i11 < b5; i11++) {
            sb.append(Integer.toHexString(a(i11)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

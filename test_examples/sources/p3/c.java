package p3;

import ja.y;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f16750a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f16751b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f16752d;

    public c() {
        if (y.f12810b == null) {
            y.f12810b = new y();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f16752d) {
            return this.f16751b.getShort(this.c + i10);
        }
        return 0;
    }
}

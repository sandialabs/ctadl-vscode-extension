package kotlin.reflect.jvm.internal.impl.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14571a;

    /* loaded from: classes.dex */
    public interface a {
        int c();
    }

    /* loaded from: classes.dex */
    public interface b<T extends a> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f14571a = bArr;
        ByteBuffer.wrap(bArr);
    }
}

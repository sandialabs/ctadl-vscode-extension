package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4942a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4943b;

    /* loaded from: classes.dex */
    public interface a {
        int c();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface c<E> extends List<E>, RandomAccess {
        void f();

        c<E> k(int i10);

        boolean r();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4943b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new g.a(bArr, 0, 0, false).e(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static GeneratedMessageLite c(Object obj, Object obj2) {
        GeneratedMessageLite.a c10 = ((i0) obj).c();
        i0 i0Var = (i0) obj2;
        c10.getClass();
        if (c10.f4804i.getClass().isInstance(i0Var)) {
            c10.k();
            GeneratedMessageLite.a.l(c10.f4805j, (GeneratedMessageLite) ((androidx.datastore.preferences.protobuf.a) i0Var));
            return c10.j();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

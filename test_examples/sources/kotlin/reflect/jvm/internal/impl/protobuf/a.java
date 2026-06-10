package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public abstract class a implements h {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0162a<BuilderType extends AbstractC0162a> implements h.a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0163a extends FilterInputStream {

            /* renamed from: i  reason: collision with root package name */
            public int f14555i;

            public C0163a(int i10, ByteArrayInputStream byteArrayInputStream) {
                super(byteArrayInputStream);
                this.f14555i = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f14555i);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() {
                if (this.f14555i <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f14555i--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i10, int i11) {
                int i12 = this.f14555i;
                if (i12 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i10, Math.min(i11, i12));
                if (read >= 0) {
                    this.f14555i -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j2) {
                long skip = super.skip(Math.min(j2, this.f14555i));
                if (skip >= 0) {
                    this.f14555i = (int) (this.f14555i - skip);
                }
                return skip;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        /* renamed from: h */
        public abstract BuilderType g(c cVar, d dVar);
    }
}

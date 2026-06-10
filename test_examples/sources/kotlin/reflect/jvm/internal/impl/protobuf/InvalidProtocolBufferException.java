package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: i  reason: collision with root package name */
    public h f14537i;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f14537i = null;
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(h hVar) {
        this.f14537i = hVar;
    }
}

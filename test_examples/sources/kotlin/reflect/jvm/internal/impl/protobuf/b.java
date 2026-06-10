package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public abstract class b<MessageType extends h> implements i9.g<MessageType> {
    static {
        int i10 = d.f14564b;
    }

    public static void b(h hVar) {
        UninitializedMessageException uninitializedMessageException;
        if (hVar != null && !hVar.a()) {
            if (hVar instanceof a) {
                a aVar = (a) hVar;
                uninitializedMessageException = new UninitializedMessageException();
            } else {
                uninitializedMessageException = new UninitializedMessageException();
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
            invalidProtocolBufferException.f14537i = hVar;
            throw invalidProtocolBufferException;
        }
    }

    public final h c(ByteArrayInputStream byteArrayInputStream, d dVar) {
        h hVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                hVar = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i10 = 7;
                    while (true) {
                        if (i10 < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i10;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i10 += 7;
                            } else {
                                throw InvalidProtocolBufferException.b();
                            }
                        } else {
                            while (i10 < 64) {
                                int read3 = byteArrayInputStream.read();
                                if (read3 != -1) {
                                    if ((read3 & 128) != 0) {
                                        i10 += 7;
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.b();
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                c cVar = new c(new a.AbstractC0162a.C0163a(read, byteArrayInputStream));
                h hVar2 = (h) a(cVar, dVar);
                try {
                    cVar.a(0);
                    hVar = hVar2;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f14537i = hVar2;
                    throw e10;
                }
            }
            b(hVar);
            return hVar;
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }
}

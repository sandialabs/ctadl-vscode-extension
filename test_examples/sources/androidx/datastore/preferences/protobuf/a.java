package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0035a;
import androidx.datastore.preferences.protobuf.i0;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0035a<MessageType, BuilderType>> implements i0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0035a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0035a<MessageType, BuilderType>> implements i0.a {
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final ByteString h() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int b5 = generatedMessageLite.b();
            ByteString byteString = ByteString.f4776j;
            byte[] bArr = new byte[b5];
            Logger logger = CodedOutputStream.f4780j;
            CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, b5);
            generatedMessageLite.e(bVar);
            if (bVar.f4786m - bVar.n == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final int i(w0 w0Var) {
        int g10 = g();
        if (g10 == -1) {
            int g11 = w0Var.g(this);
            j(g11);
            return g11;
        }
        return g10;
    }

    public void j(int i10) {
        throw new UnsupportedOperationException();
    }
}

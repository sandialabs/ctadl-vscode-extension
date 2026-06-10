package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public interface i0 extends j0 {

    /* loaded from: classes.dex */
    public interface a extends j0, Cloneable {
    }

    int b();

    GeneratedMessageLite.a c();

    GeneratedMessageLite.a d();

    void e(CodedOutputStream codedOutputStream);

    ByteString h();
}

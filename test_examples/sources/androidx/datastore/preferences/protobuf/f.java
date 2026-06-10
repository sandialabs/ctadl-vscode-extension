package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;

/* loaded from: classes.dex */
public final class f extends ByteString.a {

    /* renamed from: i  reason: collision with root package name */
    public int f4863i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final int f4864j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ByteString f4865k;

    public f(ByteString byteString) {
        this.f4865k = byteString;
        this.f4864j = byteString.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f4863i < this.f4864j;
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.u;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class x extends c<String> implements y, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f4951j;

    static {
        new x(10).f4845i = false;
    }

    public x(int i10) {
        this(new ArrayList(i10));
    }

    public x(ArrayList<Object> arrayList) {
        this.f4951j = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final y a() {
        if (this.f4845i) {
            return new e1(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        c();
        this.f4951j.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof y) {
            collection = ((y) collection).b();
        }
        boolean addAll = this.f4951j.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final List<?> b() {
        return Collections.unmodifiableList(this.f4951j);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f4951j.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r5 != false) goto L14;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f4951j;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            Charset charset = u.f4942a;
            if (byteString.size() == 0) {
                str = "";
            } else {
                str = byteString.u(charset);
            }
            if (byteString.s()) {
                arrayList.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        str = new String(bArr, u.f4942a);
        Utf8.b bVar = Utf8.f4824a;
        boolean z10 = false;
        if (Utf8.f4824a.c(0, bArr.length, bArr) == 0) {
            z10 = true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u.c
    public final u.c k(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f4951j);
            return new x(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final void n(ByteString byteString) {
        c();
        this.f4951j.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final Object q(int i10) {
        return this.f4951j.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        Object remove = this.f4951j.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof ByteString) {
            ByteString byteString = (ByteString) remove;
            byteString.getClass();
            Charset charset = u.f4942a;
            if (byteString.size() == 0) {
                return "";
            }
            return byteString.u(charset);
        }
        return new String((byte[]) remove, u.f4942a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        Object obj2 = this.f4951j.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ByteString) {
            ByteString byteString = (ByteString) obj2;
            byteString.getClass();
            Charset charset = u.f4942a;
            if (byteString.size() == 0) {
                return "";
            }
            return byteString.u(charset);
        }
        return new String((byte[]) obj2, u.f4942a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4951j.size();
    }
}

package i9;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends AbstractList<String> implements RandomAccess, d {

    /* renamed from: j  reason: collision with root package name */
    public static final i f11840j = new i(new c());

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f11841i;

    public c() {
        this.f11841i = new ArrayList();
    }

    public c(d dVar) {
        this.f11841i = new ArrayList(dVar.size());
        addAll(dVar);
    }

    @Override // i9.d
    public final i a() {
        return new i(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f11841i.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof d) {
            collection = ((d) collection).b();
        }
        boolean addAll = this.f11841i.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // i9.d
    public final List<?> b() {
        return Collections.unmodifiableList(this.f11841i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f11841i.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r4 != false) goto L14;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f11841i;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.getClass();
            try {
                str = aVar.A();
                if (aVar.u()) {
                    arrayList.set(i10, str);
                }
                return str;
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = kotlin.reflect.jvm.internal.impl.protobuf.f.f14571a;
        try {
            str = new String(bArr, "UTF-8");
            boolean z10 = false;
            if (a1.b.w0(bArr, 0, bArr.length) == 0) {
                z10 = true;
            }
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // i9.d
    public final a m(int i10) {
        a eVar;
        ArrayList arrayList = this.f11841i;
        Object obj = arrayList.get(i10);
        if (obj instanceof a) {
            eVar = (a) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            e eVar2 = a.f11832i;
            try {
                eVar = new e(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            e eVar3 = a.f11832i;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            eVar = new e(bArr2);
        }
        if (eVar != obj) {
            arrayList.set(i10, eVar);
        }
        return eVar;
    }

    @Override // i9.d
    public final void o(e eVar) {
        this.f11841i.add(eVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object remove = this.f11841i.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof a) {
            a aVar = (a) remove;
            aVar.getClass();
            try {
                return aVar.A();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = kotlin.reflect.jvm.internal.impl.protobuf.f.f14571a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f11841i.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            aVar.getClass();
            try {
                return aVar.A();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = kotlin.reflect.jvm.internal.impl.protobuf.f.f14571a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11841i.size();
    }
}

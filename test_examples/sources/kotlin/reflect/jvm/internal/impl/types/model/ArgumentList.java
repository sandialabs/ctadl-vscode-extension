package kotlin.reflect.jvm.internal.impl.types.model;

import ba.h;
import ba.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ArgumentList extends ArrayList<i> implements h {
    public ArgumentList(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof i;
        }
        if (!z10) {
            return false;
        }
        return super.contains((i) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof i;
        }
        if (!z10) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof i;
        }
        if (!z10) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof i;
        }
        if (!z10) {
            return false;
        }
        return super.remove((i) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return super.size();
    }
}

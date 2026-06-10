package l8;

import ba.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class t<Type extends ba.g> extends j0<Type> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Pair<h9.e, Type>> f15860a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<h9.e, Type> f15861b;

    public t(ArrayList arrayList) {
        boolean z10;
        this.f15860a = arrayList;
        Map<h9.e, Type> N1 = kotlin.collections.d.N1(arrayList);
        if (N1.size() == arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f15861b = N1;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // l8.j0
    public final List<Pair<h9.e, Type>> a() {
        return this.f15860a;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f15860a + ')';
    }
}

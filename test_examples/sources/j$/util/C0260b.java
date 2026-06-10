package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.util.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0260b implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f12104b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0260b(Comparator comparator, Object obj, int i10) {
        this.f12103a = i10;
        this.f12104b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f12103a;
        Comparator comparator = this.f12104b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}

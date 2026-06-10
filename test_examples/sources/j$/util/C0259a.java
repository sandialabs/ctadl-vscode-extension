package j$.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.Function;
import j$.util.function.N0;
import j$.util.function.Q0;
import j$.util.function.T0;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0259a implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12099b;

    public /* synthetic */ C0259a(int i10, Object obj) {
        this.f12098a = i10;
        this.f12099b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f12098a;
        Object obj3 = this.f12099b;
        switch (i10) {
            case 0:
                N0 n02 = (N0) obj3;
                return Double.compare(n02.applyAsDouble(obj), n02.applyAsDouble(obj2));
            case 1:
                Q0 q02 = (Q0) obj3;
                return Integer.compare(q02.applyAsInt(obj), q02.applyAsInt(obj2));
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                T0 t02 = (T0) obj3;
                return Long.compare(t02.applyAsLong(obj), t02.applyAsLong(obj2));
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}

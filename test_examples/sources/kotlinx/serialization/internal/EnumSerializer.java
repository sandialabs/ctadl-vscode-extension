package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import m7.e;
import qa.b;
import ta.c;
import ta.d;
import v7.g;

/* loaded from: classes.dex */
public final class EnumSerializer<T extends Enum<T>> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f15622a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15623b;

    public EnumSerializer(String str, T[] tArr) {
        g.f(tArr, "values");
        this.f15622a = tArr;
        this.f15623b = kotlin.a.b(new EnumSerializer$descriptor$2(this, str));
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return (sa.e) this.f15623b.getValue();
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        Enum r52 = (Enum) obj;
        g.f(dVar, "encoder");
        g.f(r52, "value");
        T[] tArr = this.f15622a;
        int p22 = kotlin.collections.b.p2(r52, tArr);
        if (p22 != -1) {
            dVar.n(a(), p22);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        sb.append(" is not a valid enum ");
        sb.append(a().b());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(tArr);
        g.e(arrays, "toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    @Override // qa.a
    public final Object e(c cVar) {
        boolean z10;
        g.f(cVar, "decoder");
        int V = cVar.V(a());
        T[] tArr = this.f15622a;
        if (V >= 0 && V < tArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return tArr[V];
        }
        throw new SerializationException(V + " is not among valid " + a().b() + " enum values, values size is " + tArr.length);
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().b() + '>';
    }
}

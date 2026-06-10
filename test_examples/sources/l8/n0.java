package l8;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15855a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15856b;

    public n0(String str, boolean z10) {
        this.f15855a = str;
        this.f15856b = z10;
    }

    public Integer a(n0 n0Var) {
        v7.g.f(n0Var, "visibility");
        MapBuilder mapBuilder = m0.f15854a;
        if (this == n0Var) {
            return 0;
        }
        MapBuilder mapBuilder2 = m0.f15854a;
        Integer num = (Integer) mapBuilder2.get(this);
        Integer num2 = (Integer) mapBuilder2.get(n0Var);
        if (num != null && num2 != null && !v7.g.a(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String b() {
        return this.f15855a;
    }

    public n0 c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}

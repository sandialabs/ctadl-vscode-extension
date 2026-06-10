package m0;

import androidx.activity.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f15889a;

    public a() {
        this(0);
    }

    public a(int i10) {
        this.f15889a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15889a == ((a) obj).f15889a;
    }

    public final int hashCode() {
        return this.f15889a;
    }

    public final String toString() {
        return e.h(new StringBuilder("DeltaCounter(count="), this.f15889a, ')');
    }
}

package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f5449a;

    public a(int i10) {
        this.f5449a = i10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        return new Bundle();
    }

    @Override // androidx.navigation.o
    public final int b() {
        return this.f5449a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f5449a == ((a) obj).f5449a;
    }

    public final int hashCode() {
        return 31 + this.f5449a;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.f5449a + ")";
    }
}

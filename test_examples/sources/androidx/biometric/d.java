package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f1184a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1185b;

    public d(int i10, CharSequence charSequence) {
        this.f1184a = i10;
        this.f1185b = charSequence;
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z10;
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1184a != dVar.f1184a) {
            return false;
        }
        String str2 = null;
        CharSequence charSequence = this.f1185b;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        CharSequence charSequence2 = dVar.f1185b;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f1184a);
        CharSequence charSequence = this.f1185b;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        objArr[1] = str;
        return Arrays.hashCode(objArr);
    }
}

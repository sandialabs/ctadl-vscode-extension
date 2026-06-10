package o6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f16362a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16363b;
    public final String c;

    public d(String str, String str2, String str3) {
        this.f16362a = str;
        this.f16363b = str2;
        this.c = str3;
    }

    public static final d fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", d.class, "confirmation")) {
            String string = bundle.getString("confirmation");
            if (string != null) {
                if (bundle.containsKey("description")) {
                    String string2 = bundle.getString("description");
                    if (string2 != null) {
                        if (bundle.containsKey("btn_text")) {
                            String string3 = bundle.getString("btn_text");
                            if (string3 != null) {
                                return new d(string, string2, string3);
                            }
                            throw new IllegalArgumentException("Argument \"btn_text\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"btn_text\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"confirmation\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"confirmation\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return v7.g.a(this.f16362a, dVar.f16362a) && v7.g.a(this.f16363b, dVar.f16363b) && v7.g.a(this.c, dVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f16363b, this.f16362a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmationDialogFragmentArgs(confirmation=");
        sb.append(this.f16362a);
        sb.append(", description=");
        sb.append(this.f16363b);
        sb.append(", btnText=");
        return androidx.activity.e.k(sb, this.c, ")");
    }
}

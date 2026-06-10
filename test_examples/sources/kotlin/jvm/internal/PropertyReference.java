package kotlin.jvm.internal;

import a4.b;
import androidx.activity.e;
import c8.a;
import c8.j;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import v7.g;

/* loaded from: classes.dex */
public abstract class PropertyReference extends CallableReference implements j {
    public PropertyReference() {
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return d().equals(propertyReference.d()) && this.f13050l.equals(propertyReference.f13050l) && this.f13051m.equals(propertyReference.f13051m) && g.a(this.f13048j, propertyReference.f13048j);
        } else if (obj instanceof j) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public final j f() {
        a b5 = b();
        if (b5 != this) {
            return (j) b5;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public final int hashCode() {
        return this.f13051m.hashCode() + b.g(this.f13050l, d().hashCode() * 31, 31);
    }

    public final String toString() {
        a b5 = b();
        if (b5 != this) {
            return b5.toString();
        }
        return e.k(new StringBuilder("property "), this.f13050l, " (Kotlin reflection is not available)");
    }
}

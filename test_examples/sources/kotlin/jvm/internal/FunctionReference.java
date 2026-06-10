package kotlin.jvm.internal;

import c8.a;
import c8.e;
import v7.f;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public class FunctionReference extends CallableReference implements f, e {

    /* renamed from: p  reason: collision with root package name */
    public final int f13053p;

    /* renamed from: q  reason: collision with root package name */
    public final int f13054q;

    public FunctionReference(int i10) {
        this(i10, CallableReference.f13046o, null, null, null, 0);
    }

    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f13053p = i10;
        this.f13054q = i11 >> 1;
    }

    @Override // v7.f
    public final int D() {
        return this.f13053p;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final a c() {
        return i.f18169a.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && e().equals(functionReference.e()) && this.f13054q == functionReference.f13054q && this.f13053p == functionReference.f13053p && g.a(this.f13048j, functionReference.f13048j) && g.a(d(), functionReference.d());
        } else if (obj instanceof e) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return e().hashCode() + ((getName().hashCode() + (d() == null ? 0 : d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a b5 = b();
        if (b5 != this) {
            return b5.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}

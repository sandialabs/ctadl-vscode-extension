package va;

import wa.v;

/* loaded from: classes.dex */
public final class k extends kotlinx.serialization.json.c {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f18222i;

    /* renamed from: j  reason: collision with root package name */
    public final sa.e f18223j;

    /* renamed from: k  reason: collision with root package name */
    public final String f18224k;

    public k(Object obj, boolean z10) {
        v7.g.f(obj, "body");
        this.f18222i = z10;
        this.f18223j = null;
        this.f18224k = obj.toString();
    }

    @Override // kotlinx.serialization.json.c
    public final String c() {
        return this.f18224k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            return this.f18222i == kVar.f18222i && v7.g.a(this.f18224k, kVar.f18224k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18224k.hashCode() + ((this.f18222i ? 1231 : 1237) * 31);
    }

    @Override // kotlinx.serialization.json.c
    public final String toString() {
        String str = this.f18224k;
        if (this.f18222i) {
            StringBuilder sb = new StringBuilder();
            v.a(str, sb);
            String sb2 = sb.toString();
            v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        return str;
    }
}

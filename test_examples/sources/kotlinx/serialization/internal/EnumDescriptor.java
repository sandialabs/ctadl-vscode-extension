package kotlinx.serialization.internal;

import kotlin.collections.c;
import m0.b;
import m7.e;
import sa.f;
import sa.h;
import v7.g;

/* loaded from: classes.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: l  reason: collision with root package name */
    public final h.b f15617l;

    /* renamed from: m  reason: collision with root package name */
    public final e f15618m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String str, int i10) {
        super(str, null, i10);
        g.f(str, "name");
        this.f15617l = h.b.f17531a;
        this.f15618m = kotlin.a.b(new EnumDescriptor$elementDescriptors$2(i10, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof sa.e)) {
            sa.e eVar = (sa.e) obj;
            if (eVar.h() != h.b.f17531a) {
                return false;
            }
            return g.a(this.f15635a, eVar.b()) && g.a(b.z(this), b.z(eVar));
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, sa.e
    public final h h() {
        return this.f15617l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int i10;
        int hashCode = this.f15635a.hashCode();
        f fVar = new f(this);
        int i11 = 1;
        while (fVar.hasNext()) {
            int i12 = i11 * 31;
            String str = (String) fVar.next();
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return (hashCode * 31) + i11;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, sa.e
    public final sa.e j(int i10) {
        return ((sa.e[]) this.f15618m.getValue())[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return c.t2(new sa.g(this), ", ", androidx.activity.e.j(new StringBuilder(), this.f15635a, '('), ")", null, 56);
    }
}

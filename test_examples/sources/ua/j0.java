package ua;

import java.util.Arrays;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class j0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f17980l;

    public j0(String str, k0 k0Var) {
        super(str, k0Var, 1);
        this.f17980l = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            sa.e eVar = (sa.e) obj;
            if (v7.g.a(this.f15635a, eVar.b())) {
                j0 j0Var = (j0) obj;
                if (j0Var.f17980l && Arrays.equals((sa.e[]) this.f15643j.getValue(), (sa.e[]) j0Var.f15643j.getValue())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int c = eVar.c();
                    int i10 = this.c;
                    if (i10 == c) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (v7.g.a(j(i11).b(), eVar.j(i11).b()) && v7.g.a(j(i11).h(), eVar.j(i11).h())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, sa.e
    public final boolean i() {
        return this.f17980l;
    }
}

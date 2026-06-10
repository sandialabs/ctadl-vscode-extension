package c9;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.d0;
import y9.r;

/* loaded from: classes.dex */
public final class a implements m8.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6564a = new a();

    @Override // m8.c
    public final Map<h9.e, m9.g<?>> a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // m8.c
    public final r b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // m8.c
    public final h9.c e() {
        l8.b d5 = DescriptorUtilsKt.d(this);
        if (d5 != null) {
            if (aa.h.f(d5)) {
                d5 = null;
            }
            if (d5 != null) {
                return DescriptorUtilsKt.c(d5);
            }
            return null;
        }
        return null;
    }

    @Override // m8.c
    public final d0 j() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}

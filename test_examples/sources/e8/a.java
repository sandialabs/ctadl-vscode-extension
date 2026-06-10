package e8;

import c8.f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.KProperty0Impl;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(KProperty0Impl kProperty0Impl) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (kProperty0Impl instanceof f) {
            Field a10 = b.a(kProperty0Impl);
            if (a10 != null) {
                z12 = a10.isAccessible();
            } else {
                z12 = true;
            }
            if (z12) {
                Method b5 = b.b(kProperty0Impl.i());
                if (b5 != null) {
                    z13 = b5.isAccessible();
                } else {
                    z13 = true;
                }
                if (z13) {
                    Method b10 = b.b(((f) kProperty0Impl).l());
                    if (b10 != null) {
                        z14 = b10.isAccessible();
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        return true;
                    }
                }
            }
        } else {
            Field a11 = b.a(kProperty0Impl);
            if (a11 != null) {
                z10 = a11.isAccessible();
            } else {
                z10 = true;
            }
            if (z10) {
                Method b11 = b.b(kProperty0Impl.i());
                if (b11 != null) {
                    z11 = b11.isAccessible();
                } else {
                    z11 = true;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }
}

package j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0262a {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j2, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j2, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j2) != null) {
                return false;
            }
        }
        return true;
    }
}

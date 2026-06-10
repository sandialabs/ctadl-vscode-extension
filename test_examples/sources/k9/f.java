package k9;

import java.util.Comparator;
import l8.h0;
import l8.z;

/* loaded from: classes.dex */
public final class f implements Comparator<l8.f> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f12941a = new f();

    public static int a(l8.f fVar) {
        if (d.m(fVar)) {
            return 8;
        }
        if (fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
            return 7;
        }
        if (fVar instanceof z) {
            return ((z) fVar).R() == null ? 6 : 5;
        } else if (fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) fVar).R() == null ? 4 : 3;
        } else if (fVar instanceof l8.b) {
            return 2;
        } else {
            return fVar instanceof h0 ? 1 : 0;
        }
    }

    @Override // java.util.Comparator
    public final int compare(l8.f fVar, l8.f fVar2) {
        Integer num;
        l8.f fVar3 = fVar;
        l8.f fVar4 = fVar2;
        int a10 = a(fVar4) - a(fVar3);
        if (a10 != 0) {
            num = Integer.valueOf(a10);
        } else if (d.m(fVar3) && d.m(fVar4)) {
            num = 0;
        } else {
            int compareTo = fVar3.getName().f11572i.compareTo(fVar4.getName().f11572i);
            if (compareTo != 0) {
                num = Integer.valueOf(compareTo);
            } else {
                num = null;
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}

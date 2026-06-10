package i8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import l8.u;
import y9.r;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<h9.e> f11828a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<h9.e> f11829b;
    public static final HashMap<h9.b, h9.b> c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<h9.b, h9.b> f11830d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashSet f11831e;

    static {
        UnsignedType[] values;
        UnsignedType[] values2 = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (UnsignedType unsignedType : values2) {
            arrayList.add(unsignedType.f13319j);
        }
        f11828a = kotlin.collections.c.Q2(arrayList);
        UnsignedArrayType[] values3 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (UnsignedArrayType unsignedArrayType : values3) {
            arrayList2.add(unsignedArrayType.f13316i);
        }
        f11829b = kotlin.collections.c.Q2(arrayList2);
        c = new HashMap<>();
        f11830d = new HashMap<>();
        Pair[] pairArr = {new Pair(UnsignedArrayType.UBYTEARRAY, h9.e.k("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, h9.e.k("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, h9.e.k("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, h9.e.k("ulongArrayOf"))};
        HashMap hashMap = new HashMap(m0.b.O0(4));
        for (int i10 = 0; i10 < 4; i10++) {
            Pair pair = pairArr[i10];
            hashMap.put(pair.f12962i, pair.f12963j);
        }
        UnsignedType[] values4 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : values4) {
            linkedHashSet.add(unsignedType2.f13320k.j());
        }
        f11831e = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            HashMap<h9.b, h9.b> hashMap2 = c;
            h9.b bVar = unsignedType3.f13320k;
            h9.b bVar2 = unsignedType3.f13318i;
            hashMap2.put(bVar, bVar2);
            f11830d.put(bVar2, unsignedType3.f13320k);
        }
    }

    public static final boolean a(r rVar) {
        l8.d c10;
        if (kotlin.reflect.jvm.internal.impl.types.r.q(rVar) || (c10 = rVar.U0().c()) == null) {
            return false;
        }
        l8.f c11 = c10.c();
        if (!(c11 instanceof u) || !v7.g.a(((u) c11).e(), kotlin.reflect.jvm.internal.impl.builtins.g.f13354k) || !f11828a.contains(c10.getName())) {
            return false;
        }
        return true;
    }
}

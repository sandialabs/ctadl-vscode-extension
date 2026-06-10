package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import y9.v;

/* loaded from: classes.dex */
public final class d implements u7.a<e.a> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f13323i;

    public d(e eVar) {
        this.f13323i = eVar;
    }

    @Override // u7.a
    public final e.a k0() {
        PrimitiveType[] values;
        EnumMap enumMap = new EnumMap(PrimitiveType.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (PrimitiveType primitiveType : PrimitiveType.values()) {
            String b5 = primitiveType.f13305i.b();
            e eVar = this.f13323i;
            v b10 = e.b(eVar, b5);
            v b11 = e.b(eVar, primitiveType.f13306j.b());
            enumMap.put((EnumMap) primitiveType, (PrimitiveType) b11);
            hashMap.put(b10, b11);
            hashMap2.put(b11, b10);
        }
        return new e.a(enumMap, hashMap, hashMap2);
    }
}

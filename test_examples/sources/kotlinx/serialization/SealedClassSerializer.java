package kotlinx.serialization;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import m7.e;
import ua.b;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public final class SealedClassSerializer<T> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c8.b<T> f15580a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptyList f15581b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<c8.b<? extends T>, qa.b<? extends T>> f15582d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f15583e;

    public SealedClassSerializer(String str, c8.b<T> bVar, c8.b<? extends T>[] bVarArr, qa.b<? extends T>[] bVarArr2) {
        g.f(bVar, "baseClass");
        this.f15580a = bVar;
        this.f15581b = EmptyList.f12981i;
        this.c = a.a(LazyThreadSafetyMode.PUBLICATION, new SealedClassSerializer$descriptor$2(str, this));
        if (bVarArr.length == bVarArr2.length) {
            Map<c8.b<? extends T>, qa.b<? extends T>> N1 = d.N1(kotlin.collections.b.z2(bVarArr, bVarArr2));
            this.f15582d = N1;
            Set<Map.Entry<c8.b<? extends T>, qa.b<? extends T>>> entrySet = N1.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String b5 = ((qa.b) entry.getValue()).a().b();
                Object obj = linkedHashMap.get(b5);
                if (obj == null) {
                    linkedHashMap.containsKey(b5);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(b5, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f15580a + "' have the same serial name '" + b5 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.b.O0(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (qa.b) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f15583e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + bVar.d() + " should be marked @Serializable");
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return (sa.e) this.c.getValue();
    }

    @Override // ua.b
    public final qa.a<T> f(ta.a aVar, String str) {
        g.f(aVar, "decoder");
        qa.b bVar = (qa.b) this.f15583e.get(str);
        return bVar != null ? bVar : super.f(aVar, str);
    }

    @Override // ua.b
    public final qa.e<T> g(ta.d dVar, T t10) {
        g.f(dVar, "encoder");
        g.f(t10, "value");
        qa.b<? extends T> bVar = this.f15582d.get(i.a(t10.getClass()));
        if (bVar == null) {
            bVar = super.g(dVar, t10);
        }
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // ua.b
    public final c8.b<T> h() {
        return this.f15580a;
    }
}

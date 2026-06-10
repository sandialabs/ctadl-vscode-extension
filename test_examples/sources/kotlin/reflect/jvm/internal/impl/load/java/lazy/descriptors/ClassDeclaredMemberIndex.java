package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.g;
import b9.n;
import b9.p;
import b9.q;
import b9.v;
import ga.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import u7.l;

/* loaded from: classes.dex */
public final class ClassDeclaredMemberIndex implements a {

    /* renamed from: a  reason: collision with root package name */
    public final g f13703a;

    /* renamed from: b  reason: collision with root package name */
    public final l<p, Boolean> f13704b;
    public final l<q, Boolean> c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f13705d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f13706e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f13707f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(g gVar, l<? super p, Boolean> lVar) {
        v7.g.f(gVar, "jClass");
        v7.g.f(lVar, "memberFilter");
        this.f13703a = gVar;
        this.f13704b = lVar;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.c = classDeclaredMemberIndex$methodFilter$1;
        e R0 = kotlin.sequences.a.R0(kotlin.collections.c.g2(gVar.N()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e.a aVar = new e.a(R0);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            h9.e name = ((q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f13705d = linkedHashMap;
        e R02 = kotlin.sequences.a.R0(kotlin.collections.c.g2(this.f13703a.F()), this.f13704b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e.a aVar2 = new e.a(R02);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((n) next2).getName(), next2);
        }
        this.f13706e = linkedHashMap2;
        ArrayList r3 = this.f13703a.r();
        l<p, Boolean> lVar2 = this.f13704b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : r3) {
            if (((Boolean) lVar2.U(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int O0 = m0.b.O0(n7.l.Z1(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(O0 < 16 ? 16 : O0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((v) next3).getName(), next3);
        }
        this.f13707f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final Set<h9.e> a() {
        e R0 = kotlin.sequences.a.R0(kotlin.collections.c.g2(this.f13703a.N()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a(R0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((q) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final v b(h9.e eVar) {
        v7.g.f(eVar, "name");
        return (v) this.f13707f.get(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final Collection<q> c(h9.e eVar) {
        v7.g.f(eVar, "name");
        List list = (List) this.f13705d.get(eVar);
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final Set<h9.e> d() {
        return this.f13707f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final n e(h9.e eVar) {
        v7.g.f(eVar, "name");
        return (n) this.f13706e.get(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
    public final Set<h9.e> f() {
        e R0 = kotlin.sequences.a.R0(kotlin.collections.c.g2(this.f13703a.F()), this.f13704b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a(R0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((n) aVar.next()).getName());
        }
        return linkedHashSet;
    }
}

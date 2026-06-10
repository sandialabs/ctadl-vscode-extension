package kotlin.reflect.jvm.internal.impl.load.java.components;

import a1.c;
import b9.m;
import h9.e;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import m9.b;
import m9.g;
import m9.i;
import n7.l;
import n7.n;
import u7.a;
import v8.d;

/* loaded from: classes.dex */
public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<e, ? extends g<? extends Object>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JavaTargetAnnotationDescriptor f13674j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.f13674j = javaTargetAnnotationDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<e, ? extends g<? extends Object>> k0() {
        b bVar;
        Iterable N0;
        String str;
        b9.b bVar2 = this.f13674j.f13661d;
        Map<e, ? extends g<? extends Object>> map = null;
        if (bVar2 instanceof b9.e) {
            Map<String, EnumSet<KotlinTarget>> map2 = d.f18184a;
            N0 = ((b9.e) bVar2).c();
        } else if (bVar2 instanceof m) {
            Map<String, EnumSet<KotlinTarget>> map3 = d.f18184a;
            N0 = c.N0(bVar2);
        } else {
            bVar = null;
            if (bVar != null) {
                map = m0.b.P0(new Pair(v8.c.f18182b, bVar));
            }
            if (map != null) {
                return kotlin.collections.d.K1();
            }
            return map;
        }
        v7.g.f(N0, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : N0) {
            if (obj instanceof m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e a10 = ((m) it.next()).a();
            if (a10 != null) {
                str = a10.b();
            } else {
                str = null;
            }
            EnumSet<KotlinTarget> enumSet = d.f18184a.get(str);
            if (enumSet == null) {
                enumSet = EmptySet.f12983i;
            }
            n.f2(enumSet, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(l.Z1(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new i(h9.b.l(g.a.f13378u), e.k(((KotlinTarget) it2.next()).name())));
        }
        bVar = new b(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.f13665j);
        if (bVar != null) {
        }
        if (map != null) {
        }
    }
}

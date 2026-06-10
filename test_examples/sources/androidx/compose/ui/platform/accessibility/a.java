package androidx.compose.ui.platform.accessibility;

import a1.c;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import b3.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import o1.b;
import o1.j;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(ArrayList arrayList) {
        ?? r02;
        Object n22;
        long j2;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() != 0 && arrayList.size() != 1) {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int B0 = c.B0(arrayList);
            int i10 = 0;
            while (i10 < B0) {
                i10++;
                Object obj2 = arrayList.get(i10);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                r02.add(new u0.c(c.s(Math.abs(u0.c.b(semanticsNode2.d().a()) - u0.c.b(semanticsNode.d().a())), Math.abs(u0.c.c(semanticsNode2.d().a()) - u0.c.c(semanticsNode.d().a())))));
                obj = obj2;
            }
            if (r02.size() != 1) {
                n22 = kotlin.collections.c.n2(r02);
            } else if (!r02.isEmpty()) {
                n22 = kotlin.collections.c.n2(r02);
                int B02 = c.B0(r02);
                if (1 <= B02) {
                    int i11 = 1;
                    while (true) {
                        n22 = new u0.c(u0.c.f(((u0.c) n22).f17724a, ((u0.c) r02.get(i11)).f17724a));
                        if (i11 == B02) {
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            j2 = ((u0.c) n22).f17724a;
            if (u0.c.c(j2) >= u0.c.b(j2)) {
                return true;
            }
            return false;
        }
        r02 = EmptyList.f12981i;
        if (r02.size() != 1) {
        }
        j2 = ((u0.c) n22).f17724a;
        if (u0.c.c(j2) >= u0.c.b(j2)) {
        }
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3950f) == null && SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3949e) == null) {
            return false;
        }
        return true;
    }

    public static final void c(g gVar, SemanticsNode semanticsNode) {
        int size;
        if (((b) SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3950f)) != null) {
            gVar.j(g.b.a(0, 0, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3949e) != null) {
            List e10 = semanticsNode.e(false);
            int size2 = e10.size();
            for (int i10 = 0; i10 < size2; i10++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) e10.get(i10);
                if (semanticsNode2.f().d(SemanticsProperties.f3963t)) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i11 = 1;
        if (!arrayList.isEmpty()) {
            boolean a10 = a(arrayList);
            if (a10) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (a10) {
                i11 = arrayList.size();
            }
            gVar.j(g.b.a(size, i11, 0));
        }
    }

    public static final void d(g gVar, SemanticsNode semanticsNode) {
        int i10;
        int i11 = 0;
        if (((o1.c) SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3951g)) != null) {
            j f10 = semanticsNode.f();
            androidx.compose.ui.semantics.a<Boolean> aVar = SemanticsProperties.f3963t;
            CollectionInfoKt$toAccessibilityCollectionItemInfo$1 collectionInfoKt$toAccessibilityCollectionItemInfo$1 = CollectionInfoKt$toAccessibilityCollectionItemInfo$1.f3828j;
            f10.getClass();
            v7.g.f(aVar, "key");
            v7.g.f(collectionInfoKt$toAccessibilityCollectionItemInfo$1, "defaultValue");
            Object obj = f10.f16206i.get(aVar);
            if (obj == null) {
                obj = collectionInfoKt$toAccessibilityCollectionItemInfo$1.k0();
            }
            gVar.k(g.c.a(0, 0, 0, 0, ((Boolean) obj).booleanValue()));
        }
        SemanticsNode g10 = semanticsNode.g();
        if (g10 != null && SemanticsConfigurationKt.a(g10.f(), SemanticsProperties.f3949e) != null) {
            b bVar = (b) SemanticsConfigurationKt.a(g10.f(), SemanticsProperties.f3950f);
            if (!semanticsNode.f().d(SemanticsProperties.f3963t)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List e10 = g10.e(false);
            int size = e10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) e10.get(i13);
                if (semanticsNode2.f().d(SemanticsProperties.f3963t)) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.c.B < semanticsNode.c.B) {
                        i12++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean a10 = a(arrayList);
                if (a10) {
                    i10 = 0;
                } else {
                    i10 = i12;
                }
                if (a10) {
                    i11 = i12;
                }
                j f11 = semanticsNode.f();
                androidx.compose.ui.semantics.a<Boolean> aVar2 = SemanticsProperties.f3963t;
                CollectionInfoKt$setCollectionItemInfo$itemInfo$1 collectionInfoKt$setCollectionItemInfo$itemInfo$1 = CollectionInfoKt$setCollectionItemInfo$itemInfo$1.f3827j;
                f11.getClass();
                v7.g.f(aVar2, "key");
                v7.g.f(collectionInfoKt$setCollectionItemInfo$itemInfo$1, "defaultValue");
                Object obj2 = f11.f16206i.get(aVar2);
                if (obj2 == null) {
                    obj2 = collectionInfoKt$setCollectionItemInfo$itemInfo$1.k0();
                }
                gVar.k(g.c.a(i10, 1, i11, 1, ((Boolean) obj2).booleanValue()));
            }
        }
    }
}

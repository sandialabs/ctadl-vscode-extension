package androidx.compose.ui.modifier;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import h0.e;
import java.util.HashSet;
import k1.c;
import kotlin.Pair;
import l1.b0;
import q0.d;
import v0.p;
import v7.g;

/* loaded from: classes.dex */
public final class ModifierLocalManager {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f3367a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Pair<BackwardsCompatNode, c<?>>> f3368b;
    public final e<Pair<BackwardsCompatNode, c<?>>> c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Pair<LayoutNode, c<?>>> f3369d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3370e;

    public ModifierLocalManager(b0 b0Var) {
        g.f(b0Var, "owner");
        this.f3367a = b0Var;
        this.f3368b = new e<>(new Pair[16]);
        this.c = new e<>(new Pair[16]);
        this.f3369d = new e<>(new Pair[16]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002b -> B:32:0x0068). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002e -> B:32:0x0068). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(d.c cVar, c cVar2, HashSet hashSet) {
        boolean z10;
        d.c cVar3 = cVar.f16825i;
        if (cVar3.f16830o) {
            e eVar = new e(new d.c[16]);
            d.c cVar4 = cVar3.f16829m;
            if (cVar4 != null) {
                eVar.b(cVar4);
                while (eVar.j()) {
                }
                return;
            }
            p.b(eVar, cVar3);
            while (eVar.j()) {
                cVar3 = (d.c) eVar.n(eVar.f11334k - 1);
                if ((cVar3.f16827k & 32) != 0) {
                    for (d.c cVar5 = cVar3; cVar5 != null; cVar5 = cVar5.f16829m) {
                        if ((cVar5.f16826j & 32) != 0) {
                            if (cVar5 instanceof k1.e) {
                                k1.e eVar2 = (k1.e) cVar5;
                                if (eVar2 instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) eVar2;
                                    if ((backwardsCompatNode.f3381p instanceof k1.d) && backwardsCompatNode.f3385t.contains(cVar2)) {
                                        hashSet.add(eVar2);
                                    }
                                }
                                if (eVar2.c().r0(cVar2)) {
                                    z10 = false;
                                    if (!z10) {
                                    }
                                }
                            }
                            z10 = true;
                            if (!z10) {
                                break;
                            }
                        }
                    }
                }
                p.b(eVar, cVar3);
                while (eVar.j()) {
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a() {
        if (this.f3370e) {
            return;
        }
        this.f3370e = true;
        this.f3367a.s(new ModifierLocalManager$invalidate$1(this));
    }
}

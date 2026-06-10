package androidx.compose.ui.modifier;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import h0.e;
import java.util.HashSet;
import java.util.Iterator;
import k1.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ModifierLocalManager$invalidate$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ModifierLocalManager f3371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(ModifierLocalManager modifierLocalManager) {
        super(0);
        this.f3371j = modifierLocalManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[LOOP:3: B:27:0x0087->B:29:0x008d, LOOP_END] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n k0() {
        int i10;
        int i11;
        Iterator it;
        ModifierLocalManager modifierLocalManager = this.f3371j;
        int i12 = 0;
        modifierLocalManager.f3370e = false;
        HashSet hashSet = new HashSet();
        e<Pair<LayoutNode, c<?>>> eVar = modifierLocalManager.f3369d;
        int i13 = eVar.f11334k;
        if (i13 > 0) {
            Pair<LayoutNode, c<?>>[] pairArr = eVar.f11332i;
            g.d(pairArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i14 = 0;
            do {
                Pair<LayoutNode, c<?>> pair = pairArr[i14];
                LayoutNode layoutNode = pair.f12962i;
                c<?> cVar = pair.f12963j;
                if (layoutNode.z()) {
                    ModifierLocalManager.b(layoutNode.J.f15781e, cVar, hashSet);
                }
                i14++;
            } while (i14 < i13);
            eVar.g();
            e<Pair<BackwardsCompatNode, c<?>>> eVar2 = modifierLocalManager.f3368b;
            i10 = eVar2.f11334k;
            if (i10 <= 0) {
                Pair<BackwardsCompatNode, c<?>>[] pairArr2 = eVar2.f11332i;
                g.d(pairArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i15 = 0;
                do {
                    Pair<BackwardsCompatNode, c<?>> pair2 = pairArr2[i15];
                    BackwardsCompatNode backwardsCompatNode = pair2.f12962i;
                    c<?> cVar2 = pair2.f12963j;
                    if (backwardsCompatNode.f16830o) {
                        ModifierLocalManager.b(backwardsCompatNode, cVar2, hashSet);
                    }
                    i15++;
                } while (i15 < i10);
                eVar2.g();
                e<Pair<BackwardsCompatNode, c<?>>> eVar3 = modifierLocalManager.c;
                i11 = eVar3.f11334k;
                if (i11 <= 0) {
                    Pair<BackwardsCompatNode, c<?>>[] pairArr3 = eVar3.f11332i;
                    g.d(pairArr3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        Pair<BackwardsCompatNode, c<?>> pair3 = pairArr3[i12];
                        BackwardsCompatNode backwardsCompatNode2 = pair3.f12962i;
                        c<?> cVar3 = pair3.f12963j;
                        if (backwardsCompatNode2.f16830o) {
                            ModifierLocalManager.b(backwardsCompatNode2, cVar3, hashSet);
                        }
                        i12++;
                    } while (i12 < i11);
                    eVar3.g();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((BackwardsCompatNode) it.next()).z();
                    }
                    return n.f16010a;
                }
                eVar3.g();
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                return n.f16010a;
            }
            eVar2.g();
            e<Pair<BackwardsCompatNode, c<?>>> eVar32 = modifierLocalManager.c;
            i11 = eVar32.f11334k;
            if (i11 <= 0) {
            }
        } else {
            eVar.g();
            e<Pair<BackwardsCompatNode, c<?>>> eVar22 = modifierLocalManager.f3368b;
            i10 = eVar22.f11334k;
            if (i10 <= 0) {
            }
        }
    }
}

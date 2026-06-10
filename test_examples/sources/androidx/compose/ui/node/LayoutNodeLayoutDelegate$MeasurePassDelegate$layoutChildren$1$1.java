package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.datastore.preferences.PreferencesProto$Value;
import h0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f3484j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate f3485k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f3486l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/a;", "it", "Lm7/n;", "invoke", "(Ll1/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<l1.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f3487j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final n U(l1.a aVar) {
            l1.a aVar2 = aVar;
            g.f(aVar2, "it");
            aVar2.f().getClass();
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/a;", "it", "Lm7/n;", "invoke", "(Ll1/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements l<l1.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass2 f3488j = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // u7.l
        public final n U(l1.a aVar) {
            l1.a aVar2 = aVar;
            g.f(aVar2, "it");
            aVar2.f().f3375e = aVar2.f().f3374d;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate, LayoutNode layoutNode) {
        super(0);
        this.f3484j = layoutNodeLayoutDelegate;
        this.f3485k = measurePassDelegate;
        this.f3486l = layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n k0() {
        int i10;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3484j;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.f3443a;
        int i11 = 0;
        layoutNode.D = 0;
        e<LayoutNode> r3 = layoutNode.r();
        int i12 = r3.f11334k;
        if (i12 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i13 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i13];
                layoutNode2.C = layoutNode2.B;
                layoutNode2.B = Integer.MAX_VALUE;
                if (layoutNode2.E == LayoutNode.UsageByParent.InLayoutBlock) {
                    layoutNode2.E = LayoutNode.UsageByParent.NotUsed;
                }
                i13++;
            } while (i13 < i12);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f3487j;
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f3485k;
            measurePassDelegate.r(anonymousClass1);
            this.f3486l.J.f15779b.C0().g();
            LayoutNode layoutNode3 = layoutNodeLayoutDelegate.f3443a;
            e<LayoutNode> r10 = layoutNode3.r();
            i10 = r10.f11334k;
            if (i10 <= 0) {
                LayoutNode[] layoutNodeArr2 = r10.f11332i;
                g.d(layoutNodeArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode4 = layoutNodeArr2[i11];
                    if (layoutNode4.C != layoutNode4.B) {
                        layoutNode3.F();
                        layoutNode3.u();
                        if (layoutNode4.B == Integer.MAX_VALUE) {
                            layoutNode4.C();
                        }
                    }
                    i11++;
                } while (i11 < i10);
                measurePassDelegate.r(AnonymousClass2.f3488j);
                return n.f16010a;
            }
            measurePassDelegate.r(AnonymousClass2.f3488j);
            return n.f16010a;
        }
        AnonymousClass1 anonymousClass12 = AnonymousClass1.f3487j;
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate2 = this.f3485k;
        measurePassDelegate2.r(anonymousClass12);
        this.f3486l.J.f15779b.C0().g();
        LayoutNode layoutNode32 = layoutNodeLayoutDelegate.f3443a;
        e<LayoutNode> r102 = layoutNode32.r();
        i10 = r102.f11334k;
        if (i10 <= 0) {
        }
    }
}

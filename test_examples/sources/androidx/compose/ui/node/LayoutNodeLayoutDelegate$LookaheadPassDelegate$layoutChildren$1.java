package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.datastore.preferences.PreferencesProto$Value;
import h0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.r;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate f3465j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f3466k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r f3467l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/a;", "child", "Lm7/n;", "invoke", "(Ll1/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements l<l1.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass3 f3468j = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // u7.l
        public final n U(l1.a aVar) {
            l1.a aVar2 = aVar;
            g.f(aVar2, "child");
            aVar2.f().f3374d = false;
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll1/a;", "child", "Lm7/n;", "invoke", "(Ll1/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends Lambda implements l<l1.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass4 f3469j = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // u7.l
        public final n U(l1.a aVar) {
            l1.a aVar2 = aVar;
            g.f(aVar2, "child");
            aVar2.f().f3375e = aVar2.f().f3374d;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, r rVar) {
        super(0);
        this.f3465j = lookaheadPassDelegate;
        this.f3466k = layoutNodeLayoutDelegate;
        this.f3467l = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n k0() {
        int i10;
        int i11;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f3465j;
        e<LayoutNode> r3 = LayoutNodeLayoutDelegate.this.f3443a.r();
        int i12 = r3.f11334k;
        int i13 = 0;
        if (i12 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i14 = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeArr[i14].K.f3453l;
                g.c(lookaheadPassDelegate2);
                lookaheadPassDelegate2.f3458r = lookaheadPassDelegate2.f3457q;
                lookaheadPassDelegate2.f3457q = false;
                i14++;
            } while (i14 < i12);
            e<LayoutNode> r10 = this.f3466k.f3443a.r();
            i10 = r10.f11334k;
            if (i10 <= 0) {
                LayoutNode[] layoutNodeArr2 = r10.f11332i;
                g.d(layoutNodeArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i15 = 0;
                do {
                    LayoutNode layoutNode = layoutNodeArr2[i15];
                    if (layoutNode.F == LayoutNode.UsageByParent.InLayoutBlock) {
                        layoutNode.F = LayoutNode.UsageByParent.NotUsed;
                    }
                    i15++;
                } while (i15 < i10);
                lookaheadPassDelegate.r(AnonymousClass3.f3468j);
                this.f3467l.C0().g();
                lookaheadPassDelegate.r(AnonymousClass4.f3469j);
                e<LayoutNode> r11 = LayoutNodeLayoutDelegate.this.f3443a.r();
                i11 = r11.f11334k;
                if (i11 <= 0) {
                    LayoutNode[] layoutNodeArr3 = r11.f11332i;
                    g.d(layoutNodeArr3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeArr3[i13].K.f3453l;
                        g.c(lookaheadPassDelegate3);
                        if (!lookaheadPassDelegate3.f3457q) {
                            lookaheadPassDelegate3.x0();
                        }
                        i13++;
                    } while (i13 < i11);
                    return n.f16010a;
                }
                return n.f16010a;
            }
            lookaheadPassDelegate.r(AnonymousClass3.f3468j);
            this.f3467l.C0().g();
            lookaheadPassDelegate.r(AnonymousClass4.f3469j);
            e<LayoutNode> r112 = LayoutNodeLayoutDelegate.this.f3443a.r();
            i11 = r112.f11334k;
            if (i11 <= 0) {
            }
        } else {
            e<LayoutNode> r102 = this.f3466k.f3443a.r();
            i10 = r102.f11334k;
            if (i10 <= 0) {
            }
        }
    }
}

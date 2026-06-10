package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends Lambda implements u7.l<LayoutNode, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 f3652j = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(LayoutNode layoutNode) {
        o1.j jVar;
        boolean z10;
        LayoutNode layoutNode2 = layoutNode;
        v7.g.f(layoutNode2, "it");
        l1.h0 r3 = v0.p.r(layoutNode2);
        if (r3 != null) {
            jVar = m0.b.E(r3);
        } else {
            jVar = null;
        }
        boolean z11 = false;
        if (jVar != null && jVar.f16207j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && jVar.d(o1.i.f16198g)) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}

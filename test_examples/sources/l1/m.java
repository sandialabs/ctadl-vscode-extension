package l1;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15756a;

    public /* synthetic */ m(int i10) {
        this.f15756a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.f15756a) {
            case 0:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f10 = layoutNode.L;
                float f11 = layoutNode2.L;
                if (f10 == f11) {
                    z10 = true;
                }
                if (z10) {
                    return v7.g.h(layoutNode.B, layoutNode2.B);
                }
                return Float.compare(f10, f11);
            case 1:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f12963j).intValue() - ((Number) pair.f12962i).intValue()) - (((Number) pair2.f12963j).intValue() - ((Number) pair2.f12962i).intValue());
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b5 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b5 != b10) {
                        return b5 - b10;
                    }
                }
                return 0;
        }
    }
}

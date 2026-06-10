package i5;

import a3.b1;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import u5.n;

/* loaded from: classes.dex */
public final class b implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f11811a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f11812b;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f11812b = bottomSheetBehavior;
        this.f11811a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    @Override // u5.n.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b1 a(View view, b1 b1Var, n.c cVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        q2.b a10 = b1Var.a(7);
        q2.b a11 = b1Var.a(32);
        int i12 = a10.f16872b;
        BottomSheetBehavior bottomSheetBehavior = this.f11812b;
        bottomSheetBehavior.f6904w = i12;
        boolean e10 = n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z12 = bottomSheetBehavior.f6896o;
        if (z12) {
            int c = b1Var.c();
            bottomSheetBehavior.f6903v = c;
            paddingBottom = c + cVar.f17832d;
        }
        boolean z13 = bottomSheetBehavior.f6897p;
        int i13 = a10.f16871a;
        if (z13) {
            if (e10) {
                i11 = cVar.c;
            } else {
                i11 = cVar.f17830a;
            }
            paddingLeft = i11 + i13;
        }
        boolean z14 = bottomSheetBehavior.f6898q;
        int i14 = a10.c;
        if (z14) {
            if (e10) {
                i10 = cVar.f17830a;
            } else {
                i10 = cVar.c;
            }
            paddingRight = i10 + i14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z15 = true;
        if (bottomSheetBehavior.f6900s && marginLayoutParams.leftMargin != i13) {
            marginLayoutParams.leftMargin = i13;
            z10 = true;
        } else {
            z10 = false;
        }
        if (bottomSheetBehavior.f6901t && marginLayoutParams.rightMargin != i14) {
            marginLayoutParams.rightMargin = i14;
            z10 = true;
        }
        if (bottomSheetBehavior.f6902u) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = a10.f16872b;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
                if (z15) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z11 = this.f11811a;
                if (z11) {
                    bottomSheetBehavior.f6895m = a11.f16873d;
                }
                if (!z12 || z11) {
                    bottomSheetBehavior.L();
                }
                return b1Var;
            }
        }
        z15 = z10;
        if (z15) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z11 = this.f11811a;
        if (z11) {
        }
        if (!z12) {
        }
        bottomSheetBehavior.L();
        return b1Var;
    }
}

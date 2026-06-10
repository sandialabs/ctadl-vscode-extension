package f5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class h<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public i f10936a;

    /* renamed from: b  reason: collision with root package name */
    public int f10937b;

    public h() {
        this.f10937b = 0;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10937b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        t(coordinatorLayout, v3, i10);
        if (this.f10936a == null) {
            this.f10936a = new i(v3);
        }
        i iVar = this.f10936a;
        View view = iVar.f10938a;
        iVar.f10939b = view.getTop();
        iVar.c = view.getLeft();
        this.f10936a.a();
        int i11 = this.f10937b;
        if (i11 != 0) {
            i iVar2 = this.f10936a;
            if (iVar2.f10940d != i11) {
                iVar2.f10940d = i11;
                iVar2.a();
            }
            this.f10937b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        i iVar = this.f10936a;
        if (iVar != null) {
            return iVar.f10940d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        coordinatorLayout.r(v3, i10);
    }
}

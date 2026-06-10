package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: i  reason: collision with root package name */
    public boolean f4570i;

    public d(Context context) {
        super(context);
        this.f4570i = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f4570i = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f4570i && aVar.f4421a == i10) {
            return;
        }
        aVar.f4421a = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f4570i && aVar.f4423b == i10) {
            return;
        }
        aVar.f4423b = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f4570i && aVar.c == f10) {
            return;
        }
        aVar.c = f10;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}

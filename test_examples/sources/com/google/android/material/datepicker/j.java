package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class j extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f7073a = c0.d(null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f7074b = c0.d(null);
    public final /* synthetic */ MaterialCalendar c;

    public j(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Long l2;
        int i10;
        int width;
        if ((recyclerView.getAdapter() instanceof e0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            e0 e0Var = (e0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            for (z2.c<Long, Long> cVar : materialCalendar.f7015f0.n()) {
                Long l4 = cVar.f19113a;
                if (l4 != null && (l2 = cVar.f19114b) != null) {
                    long longValue = l4.longValue();
                    Calendar calendar = this.f7073a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l2.longValue();
                    Calendar calendar2 = this.f7074b;
                    calendar2.setTimeInMillis(longValue2);
                    int i11 = calendar.get(1) - e0Var.f7065d.f7016g0.f7035i.f7102k;
                    int i12 = calendar2.get(1) - e0Var.f7065d.f7016g0.f7035i.f7102k;
                    View u10 = gridLayoutManager.u(i11);
                    View u11 = gridLayoutManager.u(i12);
                    int i13 = gridLayoutManager.G;
                    int i14 = i11 / i13;
                    int i15 = i12 / i13;
                    for (int i16 = i14; i16 <= i15; i16++) {
                        View u12 = gridLayoutManager.u(gridLayoutManager.G * i16);
                        if (u12 != null) {
                            int top = u12.getTop() + materialCalendar.f7020k0.f7056d.f7047a.top;
                            int bottom = u12.getBottom() - materialCalendar.f7020k0.f7056d.f7047a.bottom;
                            if (i16 == i14) {
                                i10 = (u10.getWidth() / 2) + u10.getLeft();
                            } else {
                                i10 = 0;
                            }
                            if (i16 == i15) {
                                width = (u11.getWidth() / 2) + u11.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i10, top, width, bottom, materialCalendar.f7020k0.f7060h);
                        }
                    }
                }
            }
        }
    }
}

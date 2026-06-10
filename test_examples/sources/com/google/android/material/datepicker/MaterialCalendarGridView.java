package com.google.android.material.datepicker;

import a3.j0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.noto.R;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: i  reason: collision with root package name */
    public final Calendar f7033i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7034j;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7033i = c0.d(null);
        if (p.j0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f7034j = p.k0(getContext(), R.attr.nestedScrollable);
        j0.p(this, new o());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final v getAdapter2() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008e A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int b5;
        int width;
        int b10;
        int width2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter2 = getAdapter2();
        d<?> dVar = adapter2.f7109j;
        c cVar = adapter2.f7111l;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int b11 = adapter2.b();
        u uVar = adapter2.f7108i;
        int min = Math.min((b11 + uVar.f7104m) - 1, getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<z2.c<Long, Long>> it = dVar.n().iterator();
        while (it.hasNext()) {
            z2.c<Long, Long> next = it.next();
            Long l2 = next.f19113a;
            if (l2 != null) {
                Long l4 = next.f19114b;
                if (l4 != null) {
                    long longValue = l2.longValue();
                    long longValue2 = l4.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z10 = false;
                        if (z10) {
                            boolean e10 = u5.n.e(this);
                            long longValue3 = item.longValue();
                            Calendar calendar = materialCalendarGridView.f7033i;
                            if (longValue < longValue3) {
                                if (max % uVar.f7103l == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    width = 0;
                                } else {
                                    View b12 = materialCalendarGridView.b(max - 1);
                                    if (!e10) {
                                        width = b12.getRight();
                                    } else {
                                        width = b12.getLeft();
                                    }
                                }
                                b5 = max;
                            } else {
                                calendar.setTimeInMillis(longValue);
                                b5 = adapter2.b() + (calendar.get(5) - 1);
                                View b13 = materialCalendarGridView.b(b5);
                                width = (b13.getWidth() / 2) + b13.getLeft();
                            }
                            if (longValue2 > item2.longValue()) {
                                if ((min + 1) % uVar.f7103l == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    width2 = getWidth();
                                } else {
                                    View b14 = materialCalendarGridView.b(min);
                                    if (!e10) {
                                        width2 = b14.getRight();
                                    } else {
                                        width2 = b14.getLeft();
                                    }
                                }
                                b10 = min;
                            } else {
                                calendar.setTimeInMillis(longValue2);
                                b10 = adapter2.b() + (calendar.get(5) - 1);
                                View b15 = materialCalendarGridView.b(b10);
                                width2 = (b15.getWidth() / 2) + b15.getLeft();
                            }
                            int itemId = (int) adapter2.getItemId(b5);
                            int i14 = max;
                            int i15 = min;
                            int itemId2 = (int) adapter2.getItemId(b10);
                            while (itemId <= itemId2) {
                                int numColumns = getNumColumns() * itemId;
                                v vVar = adapter2;
                                int numColumns2 = (getNumColumns() + numColumns) - 1;
                                View b16 = materialCalendarGridView.b(numColumns);
                                int top = b16.getTop() + cVar.f7054a.f7047a.top;
                                Iterator<z2.c<Long, Long>> it2 = it;
                                int bottom = b16.getBottom() - cVar.f7054a.f7047a.bottom;
                                if (!e10) {
                                    if (numColumns > b5) {
                                        i12 = 0;
                                    } else {
                                        i12 = width;
                                    }
                                    if (b10 > numColumns2) {
                                        i13 = getWidth();
                                    } else {
                                        i13 = width2;
                                    }
                                } else {
                                    if (b10 > numColumns2) {
                                        i10 = 0;
                                    } else {
                                        i10 = width2;
                                    }
                                    if (numColumns > b5) {
                                        i11 = getWidth();
                                    } else {
                                        i11 = width;
                                    }
                                    int i16 = i11;
                                    i12 = i10;
                                    i13 = i16;
                                }
                                canvas.drawRect(i12, top, i13, bottom, cVar.f7060h);
                                itemId++;
                                materialCalendarGridView = this;
                                itemId2 = itemId2;
                                adapter2 = vVar;
                                it = it2;
                            }
                            materialCalendarGridView = this;
                            max = i14;
                            min = i15;
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int b5;
        if (z10) {
            if (i10 == 33) {
                v adapter2 = getAdapter2();
                b5 = (adapter2.b() + adapter2.f7108i.f7104m) - 1;
            } else if (i10 == 130) {
                b5 = getAdapter2().b();
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
            setSelection(b5);
            return;
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < getAdapter2().b()) {
                if (19 == i10) {
                    setSelection(getAdapter2().b());
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f7034j) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            i10 = getAdapter2().b();
        }
        super.setSelection(i10);
    }
}

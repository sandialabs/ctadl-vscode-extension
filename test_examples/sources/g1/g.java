package g1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public long f11145a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f11146b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f11147d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f11148e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f11149f = -1;

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a(MotionEvent motionEvent, x xVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int pointerCount;
        int i12;
        int actionMasked;
        int pointerId;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        boolean z14;
        long j2;
        long j10;
        long a10;
        long a11;
        int toolType;
        int i13;
        int historySize;
        int i14;
        long j11;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        x xVar2 = xVar;
        v7.g.f(motionEvent, "motionEvent");
        v7.g.f(xVar2, "positionCalculator");
        int actionMasked2 = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f11146b;
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked2 == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f11148e || source != this.f11149f) {
                this.f11148e = toolType2;
                this.f11149f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked3 = motionEvent.getActionMasked();
        long j12 = 1;
        if (actionMasked3 != 0 && actionMasked3 != 5) {
            if (actionMasked3 == 9) {
                int pointerId2 = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                    long j13 = this.f11145a;
                    this.f11145a = j13 + 1;
                    sparseLongArray.put(pointerId2, j13);
                }
            }
        } else {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId3) < 0) {
                long j14 = this.f11145a;
                this.f11145a = 1 + j14;
                sparseLongArray.put(pointerId3, j14);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId3, true);
                }
            }
        }
        if (actionMasked2 != 10 && actionMasked2 != 7 && actionMasked2 != 9) {
            z10 = false;
            if (actionMasked2 != 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10) {
                i10 = 1;
                sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            } else {
                i10 = 1;
            }
            if (actionMasked2 == i10) {
                if (actionMasked2 != 6) {
                    i11 = -1;
                } else {
                    i11 = motionEvent.getActionIndex();
                }
            } else {
                i11 = 0;
            }
            ArrayList arrayList2 = this.f11147d;
            arrayList2.clear();
            pointerCount = motionEvent.getPointerCount();
            i12 = 0;
            while (i12 < pointerCount) {
                if (!z10 && i12 != i11 && (!z11 || motionEvent.getButtonState() != 0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int pointerId4 = motionEvent.getPointerId(i12);
                int indexOfKey = sparseLongArray.indexOfKey(pointerId4);
                if (indexOfKey >= 0) {
                    z14 = z10;
                    arrayList = arrayList2;
                    j2 = sparseLongArray.valueAt(indexOfKey);
                } else {
                    arrayList = arrayList2;
                    long j15 = this.f11145a;
                    z14 = z10;
                    this.f11145a = j15 + j12;
                    sparseLongArray.put(pointerId4, j15);
                    j2 = j15;
                }
                float pressure = motionEvent.getPressure(i12);
                long s10 = a1.c.s(motionEvent.getX(i12), motionEvent.getY(i12));
                if (i12 == 0) {
                    a11 = a1.c.s(motionEvent.getRawX(), motionEvent.getRawY());
                } else if (Build.VERSION.SDK_INT >= 29) {
                    a11 = h.f11150a.a(motionEvent, i12);
                } else {
                    j10 = s10;
                    a10 = xVar2.a(s10);
                    toolType = motionEvent.getToolType(i12);
                    if (toolType != 0) {
                        if (toolType != 1) {
                            if (toolType != 2) {
                                if (toolType != 3) {
                                    if (toolType == 4) {
                                        i13 = 4;
                                    }
                                } else {
                                    i13 = 2;
                                }
                            } else {
                                i13 = 3;
                            }
                        } else {
                            i13 = 1;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        historySize = motionEvent.getHistorySize();
                        i14 = 0;
                        while (i14 < historySize) {
                            float historicalX = motionEvent.getHistoricalX(i12, i14);
                            float historicalY = motionEvent.getHistoricalY(i12, i14);
                            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (!Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    i15 = i11;
                                    i16 = historySize;
                                    arrayList3.add(new e(motionEvent.getHistoricalEventTime(i14), a1.c.s(historicalX, historicalY)));
                                    i14++;
                                    i11 = i15;
                                    historySize = i16;
                                }
                            }
                            i15 = i11;
                            i16 = historySize;
                            i14++;
                            i11 = i15;
                            historySize = i16;
                        }
                        int i17 = i11;
                        if (motionEvent.getActionMasked() == 8) {
                            j11 = a1.c.s(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                        } else {
                            j11 = u0.c.f17721b;
                        }
                        r rVar = new r(j2, motionEvent.getEventTime(), a10, j10, z13, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList3, j11);
                        ArrayList arrayList4 = arrayList;
                        arrayList4.add(rVar);
                        i12++;
                        xVar2 = xVar;
                        arrayList2 = arrayList4;
                        i11 = i17;
                        z10 = z14;
                        j12 = 1;
                    }
                    i13 = 0;
                    ArrayList arrayList32 = new ArrayList();
                    historySize = motionEvent.getHistorySize();
                    i14 = 0;
                    while (i14 < historySize) {
                    }
                    int i172 = i11;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    r rVar2 = new r(j2, motionEvent.getEventTime(), a10, j10, z13, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList32, j11);
                    ArrayList arrayList42 = arrayList;
                    arrayList42.add(rVar2);
                    i12++;
                    xVar2 = xVar;
                    arrayList2 = arrayList42;
                    i11 = i172;
                    z10 = z14;
                    j12 = 1;
                }
                a10 = a11;
                j10 = xVar2.q(a11);
                toolType = motionEvent.getToolType(i12);
                if (toolType != 0) {
                }
                i13 = 0;
                ArrayList arrayList322 = new ArrayList();
                historySize = motionEvent.getHistorySize();
                i14 = 0;
                while (i14 < historySize) {
                }
                int i1722 = i11;
                if (motionEvent.getActionMasked() == 8) {
                }
                r rVar22 = new r(j2, motionEvent.getEventTime(), a10, j10, z13, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList322, j11);
                ArrayList arrayList422 = arrayList;
                arrayList422.add(rVar22);
                i12++;
                xVar2 = xVar;
                arrayList2 = arrayList422;
                i11 = i1722;
                z10 = z14;
                j12 = 1;
            }
            ArrayList arrayList5 = arrayList2;
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 || actionMasked == 6) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!sparseBooleanArray.get(pointerId, false)) {
                    sparseLongArray.delete(pointerId);
                    sparseBooleanArray.delete(pointerId);
                }
            }
            if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                    int keyAt = sparseLongArray.keyAt(size);
                    int pointerCount2 = motionEvent.getPointerCount();
                    int i18 = 0;
                    while (true) {
                        if (i18 < pointerCount2) {
                            if (motionEvent.getPointerId(i18) == keyAt) {
                                z12 = true;
                                break;
                            }
                            i18++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (!z12) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                    }
                }
            }
            return new q(motionEvent.getEventTime(), arrayList5, motionEvent);
        }
        z10 = true;
        if (actionMasked2 != 8) {
        }
        if (!z10) {
        }
        if (actionMasked2 == i10) {
        }
        ArrayList arrayList22 = this.f11147d;
        arrayList22.clear();
        pointerCount = motionEvent.getPointerCount();
        i12 = 0;
        while (i12 < pointerCount) {
        }
        ArrayList arrayList52 = arrayList22;
        actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
        }
        pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (!sparseBooleanArray.get(pointerId, false)) {
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
        }
        return new q(motionEvent.getEventTime(), arrayList52, motionEvent);
    }
}

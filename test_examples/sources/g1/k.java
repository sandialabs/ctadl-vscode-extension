package g1;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f11159a;

    /* renamed from: b  reason: collision with root package name */
    public int f11160b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(List<o> list) {
        this(list, null);
        v7.g.f(list, "changes");
    }

    public k(List<o> list, f fVar) {
        v7.g.f(list, "changes");
        this.f11159a = list;
        MotionEvent motionEvent = fVar != null ? (MotionEvent) fVar.f11144b.f11177d : null;
        int i10 = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = fVar != null ? (MotionEvent) fVar.f11144b.f11177d : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = fVar != null ? (MotionEvent) fVar.f11144b.f11177d : null;
        int i11 = 3;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                o oVar = list.get(i10);
                if (v0.p.g(oVar)) {
                    i11 = 2;
                    break;
                } else if (v0.p.f(oVar)) {
                    i11 = 1;
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i10 = 6;
                                break;
                            case ma.i.f16046m /* 9 */:
                                i10 = 4;
                                break;
                            case ma.i.f16047o /* 10 */:
                                i10 = 5;
                                break;
                        }
                        i11 = i10;
                    }
                    i10 = 3;
                    i11 = i10;
                }
                i10 = 2;
                i11 = i10;
            }
            i10 = 1;
            i11 = i10;
        }
        this.f11160b = i11;
    }
}

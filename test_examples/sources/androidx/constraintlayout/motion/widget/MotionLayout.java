package androidx.constraintlayout.motion.widget;

import a3.v;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import i2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class MotionLayout extends ConstraintLayout implements v {
    public static final /* synthetic */ int S = 0;
    public int A;
    public int B;
    public float C;
    public float D;
    public long E;
    public float F;
    public c G;
    public h2.b H;
    public boolean I;
    public ArrayList<h2.c> J;
    public ArrayList<h2.c> K;
    public CopyOnWriteArrayList<c> L;
    public int M;
    public float N;
    public boolean O;
    public b P;
    public boolean Q;
    public TransitionState R;

    /* renamed from: y  reason: collision with root package name */
    public float f4377y;

    /* renamed from: z  reason: collision with root package name */
    public int f4378z;

    /* loaded from: classes.dex */
    public enum TransitionState {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.P.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f4384a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f4385b = Float.NaN;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f4386d = -1;

        public b() {
        }

        public final void a() {
            androidx.constraintlayout.widget.b bVar;
            androidx.constraintlayout.widget.b bVar2;
            a.C0128a c0128a;
            int i10 = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f4386d != -1) {
                TransitionState transitionState = TransitionState.SETUP;
                if (i10 == -1) {
                    motionLayout.r(this.f4386d);
                } else {
                    int i11 = this.f4386d;
                    if (i11 == -1) {
                        motionLayout.setState(transitionState);
                        motionLayout.A = i10;
                        motionLayout.f4378z = -1;
                        motionLayout.B = -1;
                        i2.a aVar = motionLayout.f4416s;
                        if (aVar != null) {
                            float f10 = -1;
                            int i12 = aVar.f11676b;
                            SparseArray<a.C0128a> sparseArray = aVar.f11677d;
                            int i13 = 0;
                            if (i12 == i10) {
                                if (i10 == -1) {
                                    c0128a = sparseArray.valueAt(0);
                                } else {
                                    c0128a = sparseArray.get(i12);
                                }
                                a.C0128a c0128a2 = c0128a;
                                int i14 = aVar.c;
                                if (i14 == -1 || !c0128a2.f11680b.get(i14).a(f10, f10)) {
                                    while (true) {
                                        ArrayList<a.b> arrayList = c0128a2.f11680b;
                                        if (i13 < arrayList.size()) {
                                            if (arrayList.get(i13).a(f10, f10)) {
                                                break;
                                            }
                                            i13++;
                                        } else {
                                            i13 = -1;
                                            break;
                                        }
                                    }
                                    if (aVar.c != i13) {
                                        ArrayList<a.b> arrayList2 = c0128a2.f11680b;
                                        if (i13 == -1) {
                                            bVar2 = null;
                                        } else {
                                            bVar2 = arrayList2.get(i13).f11686f;
                                        }
                                        if (i13 != -1) {
                                            int i15 = arrayList2.get(i13).f11685e;
                                        }
                                        if (bVar2 == null) {
                                        }
                                        aVar.c = i13;
                                        bVar2.a(aVar.f11675a);
                                    }
                                }
                            } else {
                                aVar.f11676b = i10;
                                a.C0128a c0128a3 = sparseArray.get(i10);
                                while (true) {
                                    ArrayList<a.b> arrayList3 = c0128a3.f11680b;
                                    if (i13 < arrayList3.size()) {
                                        if (arrayList3.get(i13).a(f10, f10)) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                ArrayList<a.b> arrayList4 = c0128a3.f11680b;
                                if (i13 == -1) {
                                    bVar = c0128a3.f11681d;
                                } else {
                                    bVar = arrayList4.get(i13).f11686f;
                                }
                                if (i13 != -1) {
                                    int i16 = arrayList4.get(i13).f11685e;
                                }
                                if (bVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =-1.0, -1.0");
                                } else {
                                    bVar2 = bVar;
                                    aVar.c = i13;
                                    bVar2.a(aVar.f11675a);
                                }
                            }
                        }
                    } else {
                        motionLayout.q(i10, i11);
                    }
                }
                motionLayout.setState(transitionState);
            }
            if (Float.isNaN(this.f4385b)) {
                if (Float.isNaN(this.f4384a)) {
                    return;
                }
                motionLayout.setProgress(this.f4384a);
                return;
            }
            motionLayout.p(this.f4384a, this.f4385b);
            this.f4384a = Float.NaN;
            this.f4385b = Float.NaN;
            this.c = -1;
            this.f4386d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        if (this.E == -1) {
            this.E = getNanoTime();
        }
        float f10 = this.D;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.A = -1;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (this.I) {
            float signum = Math.signum(this.F - f10);
            long nanoTime = getNanoTime();
            float f11 = ((((float) (nanoTime - this.E)) * signum) * 1.0E-9f) / 0.0f;
            float f12 = this.D + f11;
            int i12 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i12 > 0 && f12 >= this.F) || (signum <= 0.0f && f12 <= this.F)) {
                f12 = this.F;
            }
            this.D = f12;
            this.C = f12;
            this.E = nanoTime;
            this.f4377y = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(TransitionState.MOVING);
            }
            if ((i12 > 0 && f12 >= this.F) || (signum <= 0.0f && f12 <= this.F)) {
                f12 = this.F;
            }
            TransitionState transitionState = TransitionState.FINISHED;
            int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
            if (i13 >= 0 || f12 <= 0.0f) {
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.I = false;
            getNanoTime();
            if (childCount <= 0) {
                if ((i12 > 0 && f12 >= this.F) || (signum <= 0.0f && f12 <= this.F)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!this.I && z10) {
                    setState(transitionState);
                }
                boolean z13 = (!z10) | this.I;
                this.I = z13;
                if (f12 <= 0.0f && (i10 = this.f4378z) != -1 && this.A != i10) {
                    this.A = i10;
                    throw null;
                }
                if (f12 >= 1.0d) {
                    int i14 = this.A;
                    int i15 = this.B;
                    if (i14 != i15) {
                        this.A = i15;
                        throw null;
                    }
                }
                if (!z13) {
                    if ((i12 > 0 && i13 == 0) || (signum < 0.0f && f12 == 0.0f)) {
                        setState(transitionState);
                    }
                } else {
                    invalidate();
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f13 = this.D;
        if (f13 >= 1.0f) {
            int i16 = this.A;
            i11 = this.B;
            if (i16 != i11) {
                this.A = i11;
                z12 = z11;
                if (z12 && !this.O) {
                    requestLayout();
                }
                this.C = this.D;
                super.dispatchDraw(canvas);
            }
            z11 = false;
            this.A = i11;
            z12 = z11;
            if (z12) {
                requestLayout();
            }
            this.C = this.D;
            super.dispatchDraw(canvas);
        }
        if (f13 <= 0.0f) {
            int i17 = this.A;
            i11 = this.f4378z;
            if (i17 != i11) {
                this.A = i11;
                z12 = z11;
            }
            z11 = false;
            this.A = i11;
            z12 = z11;
        }
        if (z12) {
        }
        this.C = this.D;
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void e(int i10) {
        this.f4416s = null;
    }

    @Override // a3.u
    public final void f(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.A;
    }

    public ArrayList<a.C0029a> getDefinedTransitions() {
        return null;
    }

    public h2.b getDesignTool() {
        if (this.H == null) {
            this.H = new h2.b();
        }
        return this.H;
    }

    public int getEndState() {
        return this.B;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.D;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return null;
    }

    public int getStartState() {
        return this.f4378z;
    }

    public float getTargetPosition() {
        return this.F;
    }

    public Bundle getTransitionState() {
        if (this.P == null) {
            this.P = new b();
        }
        b bVar = this.P;
        MotionLayout motionLayout = MotionLayout.this;
        bVar.f4386d = motionLayout.B;
        bVar.c = motionLayout.f4378z;
        bVar.f4385b = motionLayout.getVelocity();
        bVar.f4384a = motionLayout.getProgress();
        b bVar2 = this.P;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f4384a);
        bundle.putFloat("motion.velocity", bVar2.f4385b);
        bundle.putInt("motion.StartState", bVar2.c);
        bundle.putInt("motion.EndState", bVar2.f4386d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return 0.0f;
    }

    public float getVelocity() {
        return this.f4377y;
    }

    @Override // a3.u
    public final void i(View view, int i10) {
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // a3.u
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public final void k() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.G == null && ((copyOnWriteArrayList = this.L) == null || copyOnWriteArrayList.isEmpty())) || this.N == this.C) {
            return;
        }
        if (this.M != -1) {
            c cVar = this.G;
            if (cVar != null) {
                cVar.b();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.L;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
        this.M = -1;
        this.N = this.C;
        c cVar2 = this.G;
        if (cVar2 != null) {
            cVar2.a();
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.L;
        if (copyOnWriteArrayList3 != null) {
            Iterator<c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.G == null && ((copyOnWriteArrayList2 = this.L) == null || copyOnWriteArrayList2.isEmpty())) || this.M != -1) {
            if (this.G == null && ((copyOnWriteArrayList = this.L) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.M = this.A;
        throw null;
    }

    @Override // a3.v
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
    }

    @Override // a3.u
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // a3.u
    public final boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.P;
        if (bVar != null) {
            if (this.Q) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.O = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.O = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h2.c) {
            h2.c cVar = (h2.c) view;
            if (this.L == null) {
                this.L = new CopyOnWriteArrayList<>();
            }
            this.L.add(cVar);
            if (cVar.f11353q) {
                if (this.J == null) {
                    this.J = new ArrayList<>();
                }
                this.J.add(cVar);
            }
            if (cVar.f11354r) {
                if (this.K == null) {
                    this.K = new ArrayList<>();
                }
                this.K.add(cVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h2.c> arrayList = this.J;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h2.c> arrayList2 = this.K;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.P == null) {
                this.P = new b();
            }
            b bVar = this.P;
            bVar.f4384a = f10;
            bVar.f4385b = f11;
            return;
        }
        setProgress(f10);
        setState(TransitionState.MOVING);
        this.f4377y = f11;
    }

    public final void q(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.P == null) {
                this.P = new b();
            }
            b bVar = this.P;
            bVar.c = i10;
            bVar.f4386d = i11;
        }
    }

    public final void r(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.P == null) {
                this.P = new b();
            }
            this.P.f4386d = i10;
            return;
        }
        int i11 = this.A;
        if (i11 != i10 && this.f4378z != i10 && this.B != i10) {
            this.B = i10;
            if (i11 != -1) {
                q(i11, i10);
                this.D = 0.0f;
                return;
            }
            this.F = 1.0f;
            this.C = 0.0f;
            this.D = 0.0f;
            this.E = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i10 = this.A;
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.Q = z10;
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h2.c> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h2.c> arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.J.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.P == null) {
                this.P = new b();
            }
            this.P.f4384a = f10;
            return;
        }
        TransitionState transitionState = TransitionState.FINISHED;
        TransitionState transitionState2 = TransitionState.MOVING;
        if (i10 <= 0) {
            if (this.D == 1.0f && this.A == this.B) {
                setState(transitionState2);
            }
            this.A = this.f4378z;
            if (this.D != 0.0f) {
                return;
            }
        } else if (f10 >= 1.0f) {
            if (this.D == 0.0f && this.A == this.f4378z) {
                setState(transitionState2);
            }
            this.A = this.B;
            if (this.D != 1.0f) {
                return;
            }
        } else {
            this.A = -1;
            setState(transitionState2);
            return;
        }
        setState(transitionState);
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        d();
        throw null;
    }

    public void setStartState(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.P == null) {
                this.P = new b();
            }
            b bVar = this.P;
            bVar.c = i10;
            bVar.f4386d = i10;
            return;
        }
        this.A = i10;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.A == -1) {
            return;
        }
        TransitionState transitionState3 = this.R;
        this.R = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            k();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (transitionState == transitionState4) {
                k();
            }
            if (transitionState != transitionState2) {
                return;
            }
        } else if (ordinal != 2 || transitionState != transitionState2) {
            return;
        }
        l();
    }

    public void setTransition(int i10) {
    }

    public void setTransition(a.C0029a c0029a) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.G = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.P == null) {
            this.P = new b();
        }
        b bVar = this.P;
        bVar.getClass();
        bVar.f4384a = bundle.getFloat("motion.progress");
        bVar.f4385b = bundle.getFloat("motion.velocity");
        bVar.c = bundle.getInt("motion.StartState");
        bVar.f4386d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.P.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return h2.a.a(context, this.f4378z) + "->" + h2.a.a(context, this.B) + " (pos:" + this.D + " Dpos/Dt:" + this.f4377y;
    }
}

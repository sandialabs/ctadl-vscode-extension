package i3;

import a3.j0;
import a3.v0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b3.g;
import b3.h;
import b3.j;
import i3.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p.i;

/* loaded from: classes.dex */
public abstract class a extends a3.a {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0129a f11689o = new C0129a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f11690p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f11695h;

    /* renamed from: i  reason: collision with root package name */
    public final View f11696i;

    /* renamed from: j  reason: collision with root package name */
    public c f11697j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f11691d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f11692e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f11693f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f11694g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f11698k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f11699l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f11700m = Integer.MIN_VALUE;

    /* renamed from: i3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0129a implements b.a<g> {
    }

    /* loaded from: classes.dex */
    public class b {
    }

    /* loaded from: classes.dex */
    public class c extends h {
        public c() {
        }

        @Override // b3.h
        public final g a(int i10) {
            return new g(AccessibilityNodeInfo.obtain(a.this.r(i10).f6357a));
        }

        @Override // b3.h
        public final g b(int i10) {
            a aVar = a.this;
            int i11 = i10 == 2 ? aVar.f11698k : aVar.f11699l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        @Override // b3.h
        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            View view = aVar.f11696i;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 64) {
                            if (i11 != 128) {
                                return aVar.s(i10, i11, bundle);
                            }
                            if (aVar.f11698k == i10) {
                                aVar.f11698k = Integer.MIN_VALUE;
                                view.invalidate();
                                aVar.x(i10, 65536);
                            }
                            z10 = false;
                        } else {
                            AccessibilityManager accessibilityManager = aVar.f11695h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = aVar.f11698k) != i10) {
                                if (i12 != Integer.MIN_VALUE) {
                                    aVar.f11698k = Integer.MIN_VALUE;
                                    aVar.f11696i.invalidate();
                                    aVar.x(i12, 65536);
                                }
                                aVar.f11698k = i10;
                                view.invalidate();
                                aVar.x(i10, 32768);
                            }
                            z10 = false;
                        }
                        return z10;
                    }
                    return aVar.j(i10);
                }
                return aVar.w(i10);
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            return j0.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f11696i = view;
            this.f11695h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.d.c(view) == 0) {
                j0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // a3.a
    public final h b(View view) {
        if (this.f11697j == null) {
            this.f11697j = new c();
        }
        return this.f11697j;
    }

    @Override // a3.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // a3.a
    public final void d(View view, g gVar) {
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        t(gVar);
    }

    public final boolean j(int i10) {
        if (this.f11699l != i10) {
            return false;
        }
        this.f11699l = Integer.MIN_VALUE;
        v(i10, false);
        x(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        View view = this.f11696i;
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            g r3 = r(i10);
            obtain.getText().add(r3.g());
            AccessibilityNodeInfo accessibilityNodeInfo = r3.f6357a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            j.a(obtain, view, i10);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final g l(int i10) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.i("android.view.View");
        Rect rect = n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        gVar.f6358b = -1;
        View view = this.f11696i;
        obtain.setParent(view);
        u(i10, gVar);
        if (gVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f11692e;
        gVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    gVar.c = i10;
                    obtain.setSource(view, i10);
                    boolean z11 = false;
                    if (this.f11698k == i10) {
                        obtain.setAccessibilityFocused(true);
                        gVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        gVar.a(64);
                    }
                    if (this.f11699l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar.a(2);
                    } else if (obtain.isFocusable()) {
                        gVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f11694g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f11691d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        gVar.d(rect3);
                        if (gVar.f6358b != -1) {
                            g gVar2 = new g(AccessibilityNodeInfo.obtain());
                            int i11 = gVar.f6358b;
                            while (true) {
                                accessibilityNodeInfo = gVar2.f6357a;
                                if (i11 == -1) {
                                    break;
                                }
                                gVar2.f6358b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                u(i11, gVar2);
                                gVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i11 = gVar2.f6358b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f11693f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f6357a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                while (true) {
                                    ViewParent parent = view.getParent();
                                    if (parent instanceof View) {
                                        view = (View) parent;
                                        if (view.getAlpha() > 0.0f) {
                                            if (view.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                accessibilityNodeInfo2.setVisibleToUser(true);
                            }
                        }
                    }
                    return gVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f11695h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || (i10 = this.f11700m) == Integer.MIN_VALUE) {
                    return false;
                }
                if (i10 != Integer.MIN_VALUE) {
                    this.f11700m = Integer.MIN_VALUE;
                    x(Integer.MIN_VALUE, 128);
                    x(i10, 256);
                }
                return true;
            }
            int n10 = n(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f11700m;
            if (i11 != n10) {
                this.f11700m = n10;
                x(n10, 128);
                x(i11, 256);
            }
            if (n10 == Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract int n(float f10, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i10) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f11695h.isEnabled() && (parent = (view = this.f11696i).getParent()) != null) {
            AccessibilityEvent k3 = k(i10, 2048);
            b3.b.b(k3, 0);
            parent.requestSendAccessibilityEvent(view, k3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(int i10, Rect rect) {
        g gVar;
        boolean z10;
        g gVar2;
        g gVar3;
        int lastIndexOf;
        g gVar4;
        int i11;
        int i12;
        int width;
        int h10;
        int i13;
        boolean z11;
        int height;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        i iVar = new i();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iVar.f(((Integer) arrayList.get(i14)).intValue(), l(((Integer) arrayList.get(i14)).intValue()));
        }
        int i15 = this.f11699l;
        int i16 = Integer.MIN_VALUE;
        if (i15 == Integer.MIN_VALUE) {
            gVar = null;
        } else {
            gVar = (g) iVar.e(i15, null);
        }
        C0129a c0129a = f11689o;
        b bVar = f11690p;
        View view = this.f11696i;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i17 = this.f11699l;
            if (i17 != Integer.MIN_VALUE) {
                r(i17).d(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                rect2.set(0, -1, width2, -1);
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect2.set(-1, 0, -1, height2);
                        }
                    } else {
                        rect2.set(0, height2, width2, height2);
                    }
                } else {
                    rect2.set(width2, 0, width2, height2);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i10 != 17) {
                if (i10 != 33) {
                    if (i10 != 66) {
                        if (i10 == 130) {
                            height = -(rect2.height() + 1);
                        } else {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                    } else {
                        width = -(rect2.width() + 1);
                        i12 = 0;
                    }
                } else {
                    height = rect2.height() + 1;
                }
                rect3.offset(0, height);
                bVar.getClass();
                h10 = iVar.h();
                Rect rect4 = new Rect();
                g gVar5 = null;
                for (i13 = 0; i13 < h10; i13++) {
                    g gVar6 = (g) iVar.i(i13);
                    if (gVar6 != gVar) {
                        c0129a.getClass();
                        gVar6.d(rect4);
                        if (i3.b.c(i10, rect2, rect4)) {
                            if (i3.b.c(i10, rect2, rect3) && !i3.b.a(i10, rect2, rect4, rect3)) {
                                if (!i3.b.a(i10, rect2, rect3, rect4)) {
                                    int d5 = i3.b.d(i10, rect2, rect4);
                                    int e10 = i3.b.e(i10, rect2, rect4);
                                    int i18 = (e10 * e10) + (d5 * 13 * d5);
                                    int d10 = i3.b.d(i10, rect2, rect3);
                                    int e11 = i3.b.e(i10, rect2, rect3);
                                }
                            }
                            z11 = true;
                            if (!z11) {
                                rect3.set(rect4);
                                gVar5 = gVar6;
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                gVar3 = gVar5;
            } else {
                i12 = 0;
                width = rect2.width() + 1;
            }
            rect3.offset(width, i12);
            bVar.getClass();
            h10 = iVar.h();
            Rect rect42 = new Rect();
            g gVar52 = null;
            while (i13 < h10) {
            }
            gVar3 = gVar52;
        } else {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.getClass();
            int h11 = iVar.h();
            ArrayList arrayList2 = new ArrayList(h11);
            for (int i19 = 0; i19 < h11; i19++) {
                arrayList2.add((g) iVar.i(i19));
            }
            Collections.sort(arrayList2, new b.C0130b(z10, c0129a));
            if (i10 != 1) {
                if (i10 == 2) {
                    int size = arrayList2.size();
                    if (gVar == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(gVar);
                    }
                    int i20 = lastIndexOf + 1;
                    if (i20 < size) {
                        gVar4 = arrayList2.get(i20);
                    } else {
                        gVar4 = null;
                    }
                    gVar2 = gVar4;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (gVar != null) {
                    size2 = arrayList2.indexOf(gVar);
                }
                int i21 = size2 - 1;
                if (i21 >= 0) {
                    gVar2 = arrayList2.get(i21);
                } else {
                    gVar2 = null;
                }
            }
            gVar3 = gVar2;
        }
        if (gVar3 != null) {
            if (iVar.f16582i) {
                iVar.d();
            }
            int i22 = 0;
            while (true) {
                if (i22 < iVar.f16585l) {
                    if (iVar.f16584k[i22] == gVar3) {
                        i11 = i22;
                        break;
                    }
                    i22++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (iVar.f16582i) {
                iVar.d();
            }
            i16 = iVar.f16583j[i11];
        }
        return w(i16);
    }

    public final g r(int i10) {
        if (i10 == -1) {
            View view = this.f11696i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            g gVar = new g(obtain);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                gVar.f6357a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return gVar;
        }
        return l(i10);
    }

    public abstract boolean s(int i10, int i11, Bundle bundle);

    public void t(g gVar) {
    }

    public abstract void u(int i10, g gVar);

    public void v(int i10, boolean z10) {
    }

    public final boolean w(int i10) {
        int i11;
        View view = this.f11696i;
        if ((view.isFocused() || view.requestFocus()) && (i11 = this.f11699l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                j(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f11699l = i10;
            v(i10, true);
            x(i10, 8);
            return true;
        }
        return false;
    }

    public final void x(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f11695h.isEnabled() || (parent = (view = this.f11696i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i10, i11));
    }
}

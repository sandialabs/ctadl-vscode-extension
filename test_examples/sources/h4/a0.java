package h4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.noto.R;
import h4.j;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a0 extends j {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public int F = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f11359a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11360b;
        public final ViewGroup c;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11362e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11363f = false;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f11361d = true;

        public a(View view, int i10) {
            this.f11359a = view;
            this.f11360b = i10;
            this.c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // h4.j.d
        public final void a(j jVar) {
        }

        @Override // h4.j.d
        public final void b() {
            f(false);
        }

        @Override // h4.j.d
        public final void c() {
            f(true);
        }

        @Override // h4.j.d
        public final void d() {
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            if (!this.f11363f) {
                t.f11432a.x1(this.f11359a, this.f11360b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            jVar.x(this);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f11361d || this.f11362e == z10 || (viewGroup = this.c) == null) {
                return;
            }
            this.f11362e = z10;
            s.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f11363f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f11363f) {
                t.f11432a.x1(this.f11359a, this.f11360b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f11363f) {
                t.f11432a.x1(this.f11359a, this.f11360b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f11363f) {
                t.f11432a.x1(this.f11359a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11364a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11365b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11366d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f11367e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f11368f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r0.c == 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b K(q qVar, q qVar2) {
        b bVar = new b();
        bVar.f11364a = false;
        bVar.f11365b = false;
        if (qVar != null) {
            HashMap hashMap = qVar.f11426a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                bVar.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                bVar.f11367e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (qVar2 != null) {
                    HashMap hashMap2 = qVar2.f11426a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        bVar.f11366d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        bVar.f11368f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (qVar != null || qVar2 == null) {
                            if (qVar == null || bVar.f11366d != 0) {
                                if (qVar2 == null) {
                                }
                                return bVar;
                            }
                            bVar.f11365b = true;
                        } else {
                            int i10 = bVar.c;
                            int i11 = bVar.f11366d;
                            if (i10 == i11 && bVar.f11367e == bVar.f11368f) {
                                return bVar;
                            }
                            if (i10 != i11) {
                                if (i10 != 0) {
                                    if (i11 == 0) {
                                        bVar.f11365b = true;
                                    }
                                    return bVar;
                                }
                                bVar.f11365b = false;
                            } else if (bVar.f11368f != null) {
                                if (bVar.f11367e == null) {
                                    bVar.f11365b = true;
                                }
                                return bVar;
                            } else {
                                bVar.f11365b = false;
                            }
                        }
                        bVar.f11364a = true;
                        return bVar;
                    }
                }
                bVar.f11366d = -1;
                bVar.f11368f = null;
                if (qVar != null) {
                }
                if (qVar == null) {
                }
                if (qVar2 == null) {
                }
                return bVar;
            }
        }
        bVar.c = -1;
        bVar.f11367e = null;
        if (qVar2 != null) {
        }
        bVar.f11366d = -1;
        bVar.f11368f = null;
        if (qVar != null) {
        }
        if (qVar == null) {
        }
        if (qVar2 == null) {
        }
        return bVar;
    }

    public final void J(q qVar) {
        View view = qVar.f11427b;
        int visibility = view.getVisibility();
        HashMap hashMap = qVar.f11426a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public abstract Animator L(ViewGroup viewGroup, View view, q qVar);

    public abstract Animator M(ViewGroup viewGroup, View view, q qVar);

    @Override // h4.j
    public final void e(q qVar) {
        J(qVar);
    }

    @Override // h4.j
    public void i(q qVar) {
        J(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
        if (r5 == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
        r11 = r3;
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    @Override // h4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        View view;
        boolean z10;
        View view2;
        int i10;
        View view3;
        boolean z11;
        boolean z12;
        ViewGroup viewGroup2;
        int i11;
        Bitmap bitmap;
        a0 a0Var;
        Animator M;
        z zVar;
        b K = K(qVar, qVar2);
        if (K.f11364a && (K.f11367e != null || K.f11368f != null)) {
            boolean z13 = true;
            if (K.f11365b) {
                if ((this.F & 1) == 1 && qVar2 != null) {
                    View view4 = qVar2.f11427b;
                    if (qVar == null) {
                        View view5 = (View) view4.getParent();
                        if (K(p(view5, false), s(view5, false)).f11364a) {
                        }
                    }
                    return L(viewGroup, view4, qVar);
                }
                return null;
            }
            int i12 = K.f11366d;
            if ((this.F & 2) == 2 && qVar != null) {
                if (qVar2 != null) {
                    view = qVar2.f11427b;
                } else {
                    view = null;
                }
                View view6 = qVar.f11427b;
                View view7 = (View) view6.getTag(R.id.save_overlay_view);
                if (view7 != null) {
                    i10 = i12;
                    view3 = null;
                } else {
                    if (view != null && view.getParent() != null) {
                        if (i12 != 4) {
                        }
                        view7 = null;
                        z10 = false;
                        if (z10) {
                            if (view6.getParent() == null) {
                                view2 = view;
                                i10 = i12;
                                view7 = view6;
                            } else if (view6.getParent() instanceof View) {
                                View view8 = (View) view6.getParent();
                                if (!K(s(view8, true), p(view8, true)).f11364a) {
                                    boolean z14 = p.f11424a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view8.getScrollX(), -view8.getScrollY());
                                    v vVar = t.f11432a;
                                    vVar.b2(view6, matrix);
                                    vVar.c2(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view6.getWidth(), view6.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view6.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (p.f11424a) {
                                        z11 = !view6.isAttachedToWindow();
                                        z12 = viewGroup.isAttachedToWindow();
                                    } else {
                                        z11 = false;
                                        z12 = false;
                                    }
                                    boolean z15 = p.f11425b;
                                    if (z15 && z11) {
                                        if (!z12) {
                                            view2 = view;
                                            i10 = i12;
                                            bitmap = null;
                                            if (bitmap != null) {
                                                imageView.setImageBitmap(bitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view7 = imageView;
                                        } else {
                                            viewGroup2 = (ViewGroup) view6.getParent();
                                            int indexOfChild = viewGroup2.indexOfChild(view6);
                                            viewGroup.getOverlay().add(view6);
                                            i11 = indexOfChild;
                                        }
                                    } else {
                                        viewGroup2 = null;
                                        i11 = 0;
                                    }
                                    view2 = view;
                                    int round5 = Math.round(rectF.width());
                                    i10 = i12;
                                    int round6 = Math.round(rectF.height());
                                    if (round5 > 0 && round6 > 0) {
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (p.c) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view6.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view6.draw(canvas);
                                        }
                                    } else {
                                        bitmap = null;
                                    }
                                    if (z15 && z11) {
                                        viewGroup.getOverlay().remove(view6);
                                        viewGroup2.addView(view6, i11);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view7 = imageView;
                                } else {
                                    view2 = view;
                                    i10 = i12;
                                    int id = view8.getId();
                                    if (view8.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                            }
                            view3 = view2;
                            z13 = false;
                        }
                        view2 = view;
                        i10 = i12;
                        view3 = view2;
                        z13 = false;
                    }
                    view = null;
                    view7 = null;
                    z10 = true;
                    if (z10) {
                    }
                    view2 = view;
                    i10 = i12;
                    view3 = view2;
                    z13 = false;
                }
                if (view7 != null) {
                    if (!z13) {
                        int[] iArr = (int[]) qVar.f11426a.get("android:visibility:screenLocation");
                        int i13 = iArr[0];
                        int i14 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i13 - iArr2[0]) - view7.getLeft());
                        view7.offsetTopAndBottom((i14 - iArr2[1]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    a0Var = this;
                    M = a0Var.M(viewGroup, view7, qVar);
                    if (!z13) {
                        if (M == null) {
                            viewGroup.getOverlay().remove(view7);
                            return M;
                        }
                        view6.setTag(R.id.save_overlay_view, view7);
                        zVar = new z(a0Var, viewGroup, view7, view6);
                    } else {
                        return M;
                    }
                } else {
                    a0Var = this;
                    if (view3 != null) {
                        int visibility = view3.getVisibility();
                        v vVar2 = t.f11432a;
                        vVar2.x1(view3, 0);
                        M = a0Var.M(viewGroup, view3, qVar);
                        if (M != null) {
                            a aVar = new a(view3, i10);
                            M.addListener(aVar);
                            M.addPauseListener(aVar);
                            zVar = aVar;
                        } else {
                            vVar2.x1(view3, visibility);
                            return M;
                        }
                    }
                    return null;
                }
                a0Var.a(zVar);
                return M;
            }
            return null;
        }
        return null;
    }

    @Override // h4.j
    public final String[] r() {
        return G;
    }

    @Override // h4.j
    public final boolean t(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar == null || qVar2 == null || qVar2.f11426a.containsKey("android:visibility:visibility") == qVar.f11426a.containsKey("android:visibility:visibility")) {
            b K = K(qVar, qVar2);
            if (K.f11364a) {
                return K.c == 0 || K.f11366d == 0;
            }
            return false;
        }
        return false;
    }
}

package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import com.noto.R;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f5253a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f5254b;

        public a(Animator animator) {
            this.f5253a = null;
            this.f5254b = animator;
        }

        public a(Animation animation) {
            this.f5253a = animation;
            this.f5254b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final ViewGroup f5255i;

        /* renamed from: j  reason: collision with root package name */
        public final View f5256j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5257k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5258l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5259m;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f5259m = true;
            this.f5255i = viewGroup;
            this.f5256j = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j2, Transformation transformation) {
            this.f5259m = true;
            if (this.f5257k) {
                return !this.f5258l;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f5257k = true;
                a3.a0.a(this.f5255i, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j2, Transformation transformation, float f10) {
            this.f5259m = true;
            if (this.f5257k) {
                return !this.f5258l;
            }
            if (!super.getTransformation(j2, transformation, f10)) {
                this.f5257k = true;
                a3.a0.a(this.f5255i, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f5257k;
            ViewGroup viewGroup = this.f5255i;
            if (z10 || !this.f5259m) {
                viewGroup.endViewTransition(this.f5256j);
                this.f5258l = true;
                return;
            }
            this.f5259m = false;
            viewGroup.post(this);
        }
    }

    public static a a(Context context, Fragment fragment, boolean z10, boolean z11) {
        int i10;
        int i11;
        Fragment.b bVar = fragment.P;
        boolean z12 = false;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.f5059f;
        }
        if (z11) {
            if (z10) {
                if (bVar != null) {
                    i11 = bVar.f5057d;
                }
                i11 = 0;
            } else if (bVar == null) {
                i11 = 0;
            } else {
                i11 = bVar.f5058e;
            }
        } else if (z10) {
            if (bVar == null) {
                i11 = 0;
            } else {
                i11 = bVar.f5056b;
            }
        } else if (bVar == null) {
            i11 = 0;
        } else {
            i11 = bVar.c;
        }
        fragment.V(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.L;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.L.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.L;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i11 == 0 && i10 != 0) {
            if (i10 != 4097) {
                if (i10 != 4099) {
                    if (i10 != 8194) {
                        i11 = -1;
                    } else if (z10) {
                        i11 = R.animator.fragment_close_enter;
                    } else {
                        i11 = R.animator.fragment_close_exit;
                    }
                } else if (z10) {
                    i11 = R.animator.fragment_fade_enter;
                } else {
                    i11 = R.animator.fragment_fade_exit;
                }
            } else if (z10) {
                i11 = R.animator.fragment_open_enter;
            } else {
                i11 = R.animator.fragment_open_exit;
            }
        }
        if (i11 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i11));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i11);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i11);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }
}

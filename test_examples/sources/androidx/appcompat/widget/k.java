package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.s0;
import com.noto.R;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f980b = PorterDuff.Mode.SRC_IN;
    public static k c;

    /* renamed from: a  reason: collision with root package name */
    public s0 f981a;

    /* loaded from: classes.dex */
    public class a implements s0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f982a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f983b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f984d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f985e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f986f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c = y0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{y0.f1162b, y0.f1163d, y0.c, y0.f1165f}, new int[]{y0.b(context, R.attr.colorButtonNormal), q2.a.b(c, i10), q2.a.b(c, i10), i10});
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = j0.f971a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = k.f980b;
            }
            mutate.setColorFilter(k.c(i10, mode));
        }

        public final ColorStateList c(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return n2.a.c(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return n2.a.c(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d5 = y0.d(context, R.attr.colorSwitchThumbNormal);
                if (d5 != null && d5.isStateful()) {
                    int[] iArr3 = y0.f1162b;
                    iArr[0] = iArr3;
                    iArr2[0] = d5.getColorForState(iArr3, 0);
                    iArr[1] = y0.f1164e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f1165f;
                    iArr2[2] = d5.getDefaultColor();
                } else {
                    iArr[0] = y0.f1162b;
                    iArr2[0] = y0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = y0.f1164e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f1165f;
                    iArr2[2] = y0.c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, y0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, y0.c(context, R.attr.colorAccent));
                }
                if (i10 != R.drawable.abc_spinner_mtrl_am_alpha && i10 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(this.f983b, i10)) {
                        return y0.d(context, R.attr.colorControlNormal);
                    }
                    if (a(this.f985e, i10)) {
                        return n2.a.c(context, R.color.abc_tint_default);
                    }
                    if (a(this.f986f, i10)) {
                        return n2.a.c(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i10 == R.drawable.abc_seekbar_thumb_material) {
                        return n2.a.c(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return n2.a.c(context, R.color.abc_tint_spinner);
            }
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (c == null) {
                d();
            }
            kVar = c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (k.class) {
            h10 = s0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (k.class) {
            if (c == null) {
                k kVar = new k();
                c = kVar;
                kVar.f981a = s0.d();
                c.f981a.l(new a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Drawable drawable, b1 b1Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = s0.f1098h;
        int[] state = drawable.getState();
        int[] iArr2 = j0.f971a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = b1Var.f861d;
        if (!z11 && !b1Var.c) {
            drawable.clearColorFilter();
            if (Build.VERSION.SDK_INT > 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z11) {
            colorStateList = b1Var.f859a;
        } else {
            colorStateList = null;
        }
        if (b1Var.c) {
            mode = b1Var.f860b;
        } else {
            mode = s0.f1098h;
        }
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = s0.h(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
        if (Build.VERSION.SDK_INT > 23) {
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f981a.f(context, i10);
    }
}

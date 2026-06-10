package com.google.android.material.datepicker;

import a3.d1;
import a3.j0;
import a3.v0;
import a3.y0;
import a3.z0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.noto.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p<S> extends androidx.fragment.app.m {
    public static final /* synthetic */ int T0 = 0;
    public com.google.android.material.datepicker.a A0;
    public f B0;
    public MaterialCalendar<S> C0;
    public int D0;
    public CharSequence E0;
    public boolean F0;
    public int G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public TextView L0;
    public TextView M0;
    public CheckableImageButton N0;
    public b6.g O0;
    public Button P0;
    public boolean Q0;
    public CharSequence R0;
    public CharSequence S0;

    /* renamed from: t0  reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f7081t0 = new LinkedHashSet<>();

    /* renamed from: u0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f7082u0 = new LinkedHashSet<>();

    /* renamed from: v0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f7083v0 = new LinkedHashSet<>();

    /* renamed from: w0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f7084w0 = new LinkedHashSet<>();

    /* renamed from: x0  reason: collision with root package name */
    public int f7085x0;

    /* renamed from: y0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f7086y0;

    /* renamed from: z0  reason: collision with root package name */
    public z<S> f7087z0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator<s<? super S>> it = pVar.f7081t0.iterator();
            while (it.hasNext()) {
                pVar.g0().x();
                it.next().a();
            }
            pVar.a0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends a3.a {
        public b() {
        }

        @Override // a3.a
        public final void d(View view, b3.g gVar) {
            this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
            StringBuilder sb = new StringBuilder();
            int i10 = p.T0;
            sb.append(p.this.g0().I());
            sb.append(", ");
            sb.append((Object) gVar.g());
            gVar.l(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator<View.OnClickListener> it = pVar.f7082u0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            pVar.a0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class d extends y<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            p pVar = p.this;
            com.google.android.material.datepicker.d<S> g02 = pVar.g0();
            pVar.j();
            String l2 = g02.l();
            TextView textView = pVar.M0;
            com.google.android.material.datepicker.d<S> g03 = pVar.g0();
            pVar.S();
            textView.setContentDescription(g03.s());
            pVar.M0.setText(l2);
            pVar.P0.setEnabled(pVar.g0().q());
        }
    }

    public static int h0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c10 = c0.c();
        c10.set(5, 1);
        Calendar b5 = c0.b(c10);
        b5.get(2);
        b5.get(1);
        int maximum = b5.getMaximum(7);
        b5.getActualMaximum(5);
        b5.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean j0(Context context) {
        return k0(context, 16843277);
    }

    public static boolean k0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x5.b.c(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void F(Bundle bundle) {
        u K;
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7085x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7086y0);
        a.b bVar = new a.b(this.A0);
        u uVar = this.C0.f7018i0;
        if (uVar != null) {
            bVar.c = Long.valueOf(uVar.n);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f7046e);
        u K2 = u.K(bVar.f7043a);
        u K3 = u.K(bVar.f7044b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = bVar.c;
        if (l2 == null) {
            K = null;
        } else {
            K = u.K(l2.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(K2, K3, cVar, K, bVar.f7045d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.B0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.K0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        d1.e aVar;
        d1.e eVar;
        int i13;
        d1.e aVar2;
        d1.e eVar2;
        super.G();
        Window window = d0().getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.O0);
            if (!this.Q0) {
                View findViewById = T().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i14 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                    int S = a1.b.S(window.getContext(), 16842801, -16777216);
                    if (z10) {
                        num = Integer.valueOf(S);
                    }
                    Integer valueOf = Integer.valueOf(S);
                    if (i14 < 30) {
                        z0.a(window, false);
                    } else {
                        y0.a(window, false);
                    }
                    Context context = window.getContext();
                    if (i14 >= 23) {
                        i10 = q2.a.d(a1.b.S(context, 16843857, -16777216), 128);
                    } else {
                        i10 = 0;
                    }
                    Context context2 = window.getContext();
                    if (i14 >= 27) {
                        i11 = q2.a.d(a1.b.S(context2, 16843858, -16777216), 128);
                    } else {
                        i11 = 0;
                    }
                    window.setStatusBarColor(i10);
                    window.setNavigationBarColor(i11);
                    boolean j02 = a1.b.j0(num.intValue());
                    if (!a1.b.j0(i10) && (i10 != 0 || !j02)) {
                        z11 = false;
                        View decorView = window.getDecorView();
                        i12 = Build.VERSION.SDK_INT;
                        if (i12 < 30) {
                            eVar = new d1.d(window);
                        } else {
                            if (i12 >= 26) {
                                aVar = new d1.c(window, decorView);
                            } else if (i12 >= 23) {
                                aVar = new d1.b(window, decorView);
                            } else {
                                aVar = new d1.a(window, decorView);
                            }
                            eVar = aVar;
                        }
                        eVar.d(z11);
                        boolean j03 = a1.b.j0(valueOf.intValue());
                        if (!a1.b.j0(i11) || (i11 == 0 && j03)) {
                            z12 = true;
                        }
                        View decorView2 = window.getDecorView();
                        i13 = Build.VERSION.SDK_INT;
                        if (i13 < 30) {
                            eVar2 = new d1.d(window);
                        } else {
                            if (i13 >= 26) {
                                aVar2 = new d1.c(window, decorView2);
                            } else if (i13 >= 23) {
                                aVar2 = new d1.b(window, decorView2);
                            } else {
                                aVar2 = new d1.a(window, decorView2);
                            }
                            eVar2 = aVar2;
                        }
                        eVar2.c(z12);
                        q qVar = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        j0.i.u(findViewById, qVar);
                        this.Q0 = true;
                    }
                    z11 = true;
                    View decorView3 = window.getDecorView();
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 < 30) {
                    }
                    eVar.d(z11);
                    boolean j032 = a1.b.j0(valueOf.intValue());
                    if (!a1.b.j0(i11)) {
                    }
                    z12 = true;
                    View decorView22 = window.getDecorView();
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 < 30) {
                    }
                    eVar2.c(z12);
                    q qVar2 = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                    j0.i.u(findViewById, qVar2);
                    this.Q0 = true;
                }
                z10 = true;
                int S2 = a1.b.S(window.getContext(), 16842801, -16777216);
                if (z10) {
                }
                Integer valueOf2 = Integer.valueOf(S2);
                if (i14 < 30) {
                }
                Context context3 = window.getContext();
                if (i14 >= 23) {
                }
                Context context22 = window.getContext();
                if (i14 >= 27) {
                }
                window.setStatusBarColor(i10);
                window.setNavigationBarColor(i11);
                boolean j022 = a1.b.j0(num.intValue());
                if (!a1.b.j0(i10)) {
                    z11 = false;
                    View decorView32 = window.getDecorView();
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 < 30) {
                    }
                    eVar.d(z11);
                    boolean j0322 = a1.b.j0(valueOf2.intValue());
                    if (!a1.b.j0(i11)) {
                    }
                    z12 = true;
                    View decorView222 = window.getDecorView();
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 < 30) {
                    }
                    eVar2.c(z12);
                    q qVar22 = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                    WeakHashMap<View, v0> weakHashMap22 = j0.f188a;
                    j0.i.u(findViewById, qVar22);
                    this.Q0 = true;
                }
                z11 = true;
                View decorView322 = window.getDecorView();
                i12 = Build.VERSION.SDK_INT;
                if (i12 < 30) {
                }
                eVar.d(z11);
                boolean j03222 = a1.b.j0(valueOf2.intValue());
                if (!a1.b.j0(i11)) {
                }
                z12 = true;
                View decorView2222 = window.getDecorView();
                i13 = Build.VERSION.SDK_INT;
                if (i13 < 30) {
                }
                eVar2.c(z12);
                q qVar222 = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, v0> weakHashMap222 = j0.f188a;
                j0.i.u(findViewById, qVar222);
                this.Q0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = n().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.O0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p5.a(d0(), rect));
        }
        l0();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void H() {
        this.f7087z0.f7122d0.clear();
        super.H();
    }

    @Override // androidx.fragment.app.m
    public final Dialog c0() {
        Context S = S();
        S();
        int i10 = this.f7085x0;
        if (i10 == 0) {
            i10 = g0().m();
        }
        Dialog dialog = new Dialog(S, i10);
        Context context = dialog.getContext();
        this.F0 = j0(context);
        int i11 = x5.b.c(R.attr.colorSurface, context, p.class.getCanonicalName()).data;
        b6.g gVar = new b6.g(context, null, R.attr.materialCalendarStyle, 2132083768);
        this.O0 = gVar;
        gVar.k(context);
        this.O0.n(ColorStateList.valueOf(i11));
        b6.g gVar2 = this.O0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        gVar2.m(j0.i.i(decorView));
        return dialog;
    }

    public final com.google.android.material.datepicker.d<S> g0() {
        if (this.f7086y0 == null) {
            this.f7086y0 = (com.google.android.material.datepicker.d) this.n.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f7086y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0() {
        z<S> zVar;
        CharSequence charSequence;
        androidx.fragment.app.a aVar;
        boolean z10;
        S();
        int i10 = this.f7085x0;
        if (i10 == 0) {
            i10 = g0().m();
        }
        com.google.android.material.datepicker.d<S> g02 = g0();
        com.google.android.material.datepicker.a aVar2 = this.A0;
        f fVar = this.B0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", g02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar2.f7038l);
        materialCalendar.W(bundle);
        this.C0 = materialCalendar;
        boolean isChecked = this.N0.isChecked();
        if (isChecked) {
            com.google.android.material.datepicker.d<S> g03 = g0();
            com.google.android.material.datepicker.a aVar3 = this.A0;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", g03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar3);
            zVar.W(bundle2);
        } else {
            zVar = this.C0;
        }
        this.f7087z0 = zVar;
        TextView textView = this.L0;
        if (isChecked) {
            if (n().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                charSequence = this.S0;
                textView.setText(charSequence);
                com.google.android.material.datepicker.d<S> g04 = g0();
                j();
                String l2 = g04.l();
                TextView textView2 = this.M0;
                com.google.android.material.datepicker.d<S> g05 = g0();
                S();
                textView2.setContentDescription(g05.s());
                this.M0.setText(l2);
                androidx.fragment.app.z h10 = h();
                h10.getClass();
                aVar = new androidx.fragment.app.a(h10);
                aVar.e(R.id.mtrl_calendar_frame, this.f7087z0, null, 2);
                if (aVar.f5169g) {
                    aVar.f5170h = false;
                    aVar.f5098q.z(aVar, false);
                    this.f7087z0.Z(new d());
                    return;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        charSequence = this.R0;
        textView.setText(charSequence);
        com.google.android.material.datepicker.d<S> g042 = g0();
        j();
        String l22 = g042.l();
        TextView textView22 = this.M0;
        com.google.android.material.datepicker.d<S> g052 = g0();
        S();
        textView22.setContentDescription(g052.s());
        this.M0.setText(l22);
        androidx.fragment.app.z h102 = h();
        h102.getClass();
        aVar = new androidx.fragment.app.a(h102);
        aVar.e(R.id.mtrl_calendar_frame, this.f7087z0, null, 2);
        if (aVar.f5169g) {
        }
    }

    public final void m0(CheckableImageButton checkableImageButton) {
        this.N0.setContentDescription(checkableImageButton.getContext().getString(this.N0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f7083v0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f7084w0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.M;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.n;
        }
        this.f7085x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f7086y0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G0 = bundle.getInt("INPUT_MODE_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.E0;
        if (charSequence == null) {
            charSequence = S().getResources().getText(this.D0);
        }
        this.R0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.S0 = charSequence;
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z10;
        if (this.F0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.B0;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.F0) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(h0(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(h0(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.M0 = textView;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.g.f(textView, 1);
        this.N0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.L0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.N0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.N0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.N0;
        if (this.G0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        j0.p(this.N0, null);
        m0(this.N0);
        this.N0.setOnClickListener(new r(this));
        this.P0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (g0().q()) {
            this.P0.setEnabled(true);
        } else {
            this.P0.setEnabled(false);
        }
        this.P0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.I0;
        if (charSequence != null) {
            this.P0.setText(charSequence);
        } else {
            int i11 = this.H0;
            if (i11 != 0) {
                this.P0.setText(i11);
            }
        }
        this.P0.setOnClickListener(new a());
        j0.p(this.P0, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.K0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i12 = this.J0;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }
}

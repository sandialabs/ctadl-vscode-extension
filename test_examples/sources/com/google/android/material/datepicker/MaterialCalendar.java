package com.google.android.material.datepicker;

import a3.j0;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.p;
import com.noto.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends z<S> {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f7013r0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public int f7014e0;

    /* renamed from: f0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f7015f0;

    /* renamed from: g0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f7016g0;

    /* renamed from: h0  reason: collision with root package name */
    public f f7017h0;

    /* renamed from: i0  reason: collision with root package name */
    public u f7018i0;

    /* renamed from: j0  reason: collision with root package name */
    public CalendarSelector f7019j0;

    /* renamed from: k0  reason: collision with root package name */
    public com.google.android.material.datepicker.c f7020k0;

    /* renamed from: l0  reason: collision with root package name */
    public RecyclerView f7021l0;

    /* renamed from: m0  reason: collision with root package name */
    public RecyclerView f7022m0;

    /* renamed from: n0  reason: collision with root package name */
    public View f7023n0;

    /* renamed from: o0  reason: collision with root package name */
    public View f7024o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f7025p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f7026q0;

    /* loaded from: classes.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f7030i;

        public a(int i10) {
            this.f7030i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MaterialCalendar.this.f7022m0.j0(this.f7030i);
        }
    }

    /* loaded from: classes.dex */
    public class b extends a3.a {
        @Override // a3.a
        public final void d(View view, b3.g gVar) {
            this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
            gVar.j(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends a0 {
        public final /* synthetic */ int F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11) {
            super(i10);
            this.F = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void J0(RecyclerView.x xVar, int[] iArr) {
            int i10 = this.F;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i10 == 0) {
                iArr[0] = materialCalendar.f7022m0.getWidth();
                iArr[1] = materialCalendar.f7022m0.getWidth();
                return;
            }
            iArr[0] = materialCalendar.f7022m0.getHeight();
            iArr[1] = materialCalendar.f7022m0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // androidx.fragment.app.Fragment
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7014e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7015f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7016g0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f7017h0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7018i0);
    }

    @Override // com.google.android.material.datepicker.z
    public final boolean Z(p.d dVar) {
        return super.Z(dVar);
    }

    public final void a0(int i10) {
        this.f7022m0.post(new a(i10));
    }

    public final void b0(u uVar) {
        boolean z10;
        RecyclerView recyclerView;
        int i10;
        u uVar2 = ((x) this.f7022m0.getAdapter()).f7115d.f7035i;
        Calendar calendar = uVar2.f7100i;
        if (calendar instanceof GregorianCalendar) {
            int i11 = uVar.f7102k;
            int i12 = uVar2.f7102k;
            int i13 = uVar.f7101j;
            int i14 = uVar2.f7101j;
            int i15 = (i13 - i14) + ((i11 - i12) * 12);
            u uVar3 = this.f7018i0;
            if (calendar instanceof GregorianCalendar) {
                int i16 = i15 - ((uVar3.f7101j - i14) + ((uVar3.f7102k - i12) * 12));
                boolean z11 = false;
                if (Math.abs(i16) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 > 0) {
                    z11 = true;
                }
                this.f7018i0 = uVar;
                if (z10 && z11) {
                    recyclerView = this.f7022m0;
                    i10 = i15 - 3;
                } else {
                    if (z10) {
                        recyclerView = this.f7022m0;
                        i10 = i15 + 3;
                    }
                    a0(i15);
                    return;
                }
                recyclerView.f0(i10);
                a0(i15);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void c0(CalendarSelector calendarSelector) {
        this.f7019j0 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f7021l0.getLayoutManager().w0(this.f7018i0.f7102k - ((e0) this.f7021l0.getAdapter()).f7065d.f7016g0.f7035i.f7102k);
            this.f7025p0.setVisibility(0);
            this.f7026q0.setVisibility(8);
            this.f7023n0.setVisibility(8);
            this.f7024o0.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f7025p0.setVisibility(8);
            this.f7026q0.setVisibility(0);
            this.f7023n0.setVisibility(0);
            this.f7024o0.setVisibility(0);
            b0(this.f7018i0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.n;
        }
        this.f7014e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7015f0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7016g0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7017h0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f7018i0 = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(j(), this.f7014e0);
        this.f7020k0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar = this.f7016g0.f7035i;
        if (p.j0(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = S().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f7106o;
        int i13 = dimensionPixelOffset + dimensionPixelSize;
        inflate.setMinimumHeight(i13 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        j0.p(gridView, new b());
        int i14 = this.f7016g0.f7039m;
        if (i14 > 0) {
            gVar = new g(i14);
        } else {
            gVar = new g();
        }
        gridView.setAdapter((ListAdapter) gVar);
        gridView.setNumColumns(uVar.f7103l);
        gridView.setEnabled(false);
        this.f7022m0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        j();
        this.f7022m0.setLayoutManager(new c(i11, i11));
        this.f7022m0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f7015f0, this.f7016g0, this.f7017h0, new d());
        this.f7022m0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f7021l0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7021l0.setLayoutManager(new GridLayoutManager(integer));
            this.f7021l0.setAdapter(new e0(this));
            this.f7021l0.g(new j(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            j0.p(materialButton, new k(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f7023n0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f7024o0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f7025p0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f7026q0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            c0(CalendarSelector.DAY);
            materialButton.setText(this.f7018i0.L());
            this.f7022m0.h(new l(this, xVar, materialButton));
            materialButton.setOnClickListener(new m(this));
            this.f7024o0.setOnClickListener(new n(this, xVar));
            this.f7023n0.setOnClickListener(new h(this, xVar));
        }
        if (!p.j0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.y().a(this.f7022m0);
        }
        RecyclerView recyclerView2 = this.f7022m0;
        u uVar2 = this.f7018i0;
        u uVar3 = xVar.f7115d.f7035i;
        if (uVar3.f7100i instanceof GregorianCalendar) {
            recyclerView2.f0((uVar2.f7101j - uVar3.f7101j) + ((uVar2.f7102k - uVar3.f7102k) * 12));
            j0.p(this.f7022m0, new i());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}

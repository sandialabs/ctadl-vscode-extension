package androidx.appcompat.widget;

import a3.j0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f835q = {16843505};

    /* renamed from: i  reason: collision with root package name */
    public final androidx.appcompat.widget.e f836i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f837j;

    /* renamed from: k  reason: collision with root package name */
    public final z f838k;

    /* renamed from: l  reason: collision with root package name */
    public SpinnerAdapter f839l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f840m;
    public final i n;

    /* renamed from: o  reason: collision with root package name */
    public int f841o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f842p;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a0 a0Var = a0.this;
            if (!a0Var.getInternalPopup().c()) {
                a0Var.n.m(c.b(a0Var), c.a(a0Var));
            }
            ViewTreeObserver viewTreeObserver = a0Var.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            dropDownViewTheme = themedSpinnerAdapter.getDropDownViewTheme();
            if (!z2.b.a(dropDownViewTheme, theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.app.b f844i;

        /* renamed from: j  reason: collision with root package name */
        public ListAdapter f845j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f846k;

        public e() {
        }

        @Override // androidx.appcompat.widget.a0.i
        public final boolean c() {
            androidx.appcompat.app.b bVar = this.f844i;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f844i;
            if (bVar != null) {
                bVar.dismiss();
                this.f844i = null;
            }
        }

        @Override // androidx.appcompat.widget.a0.i
        public final Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void h(CharSequence charSequence) {
            this.f846k = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void m(int i10, int i11) {
            if (this.f845j == null) {
                return;
            }
            a0 a0Var = a0.this;
            b.a aVar = new b.a(a0Var.getPopupContext());
            CharSequence charSequence = this.f846k;
            AlertController.b bVar = aVar.f536a;
            if (charSequence != null) {
                bVar.f522d = charSequence;
            }
            ListAdapter listAdapter = this.f845j;
            int selectedItemPosition = a0Var.getSelectedItemPosition();
            bVar.f527i = listAdapter;
            bVar.f528j = this;
            bVar.f531m = selectedItemPosition;
            bVar.f530l = true;
            androidx.appcompat.app.b a10 = aVar.a();
            this.f844i = a10;
            AlertController.RecycleListView recycleListView = a10.f535m.f497f;
            c.d(recycleListView, i10);
            c.c(recycleListView, i11);
            this.f844i.show();
        }

        @Override // androidx.appcompat.widget.a0.i
        public final int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final CharSequence o() {
            return this.f846k;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            a0 a0Var = a0.this;
            a0Var.setSelection(i10);
            if (a0Var.getOnItemClickListener() != null) {
                a0Var.performItemClick(null, i10, this.f845j.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void p(ListAdapter listAdapter) {
            this.f845j = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: i  reason: collision with root package name */
        public final SpinnerAdapter f848i;

        /* renamed from: j  reason: collision with root package name */
        public final ListAdapter f849j;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f848i = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f849j = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof z0) {
                    z0 z0Var = (z0) spinnerAdapter;
                    if (z0Var.getDropDownViewTheme() == null) {
                        z0Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f849j;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f848i;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f849j;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f848i;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends p0 implements i {
        public CharSequence L;
        public ListAdapter M;
        public final Rect N;
        public int O;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
                g gVar = g.this;
                a0.this.setSelection(i10);
                if (a0.this.getOnItemClickListener() != null) {
                    a0.this.performItemClick(view, i10, gVar.M.getItemId(i10));
                }
                gVar.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                a0 a0Var = a0.this;
                gVar.getClass();
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                if (j0.g.b(a0Var) && a0Var.getGlobalVisibleRect(gVar.N)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    gVar.dismiss();
                    return;
                }
                gVar.s();
                gVar.a();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f852i;

            public c(b bVar) {
                this.f852i = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f852i);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.N = new Rect();
            this.f1078w = a0.this;
            this.G = true;
            this.H.setFocusable(true);
            this.f1079x = new a();
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void h(CharSequence charSequence) {
            this.L = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void k(int i10) {
            this.O = i10;
        }

        @Override // androidx.appcompat.widget.a0.i
        public final void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            s();
            s sVar = this.H;
            sVar.setInputMethodMode(2);
            a();
            k0 k0Var = this.f1067k;
            k0Var.setChoiceMode(1);
            c.d(k0Var, i10);
            c.c(k0Var, i11);
            a0 a0Var = a0.this;
            int selectedItemPosition = a0Var.getSelectedItemPosition();
            k0 k0Var2 = this.f1067k;
            if (c() && k0Var2 != null) {
                k0Var2.setListSelectionHidden(false);
                k0Var2.setSelection(selectedItemPosition);
                if (k0Var2.getChoiceMode() != 0) {
                    k0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!c10 && (viewTreeObserver = a0Var.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                sVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.a0.i
        public final CharSequence o() {
            return this.L;
        }

        @Override // androidx.appcompat.widget.p0, androidx.appcompat.widget.a0.i
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.M = listAdapter;
        }

        public final void s() {
            int i10;
            int i11;
            Drawable f10 = f();
            a0 a0Var = a0.this;
            if (f10 != null) {
                f10.getPadding(a0Var.f842p);
                if (n1.a(a0Var)) {
                    i10 = a0Var.f842p.right;
                } else {
                    i10 = -a0Var.f842p.left;
                }
            } else {
                Rect rect = a0Var.f842p;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = a0Var.getPaddingLeft();
            int paddingRight = a0Var.getPaddingRight();
            int width = a0Var.getWidth();
            int i12 = a0Var.f841o;
            if (i12 == -2) {
                int a10 = a0Var.a((SpinnerAdapter) this.M, f());
                int i13 = a0Var.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = a0Var.f842p;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                i12 = Math.max(a10, (width - paddingLeft) - paddingRight);
            } else if (i12 == -1) {
                i12 = (width - paddingLeft) - paddingRight;
            }
            r(i12);
            if (n1.a(a0Var)) {
                i11 = (((width - paddingRight) - this.f1069m) - this.O) + i10;
            } else {
                i11 = paddingLeft + this.O + i10;
            }
            this.n = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public boolean f854i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f854i = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f854i ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean c();

        int d();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Exception e10;
        TypedArray typedArray;
        this.f842p = new Rect();
        y0.a(this, getContext());
        int[] iArr = a1.b.F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        this.f836i = new androidx.appcompat.widget.e(this);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f837j = new i.c(context, resourceId);
        } else {
            this.f837j = context;
        }
        int i11 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, f835q, i10, 0);
                try {
                    if (typedArray.hasValue(0)) {
                        i11 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e10);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i11 != 0) {
            if (i11 == 1) {
                g gVar = new g(this.f837j, attributeSet, i10);
                d1 m10 = d1.m(this.f837j, attributeSet, iArr, i10);
                this.f841o = m10.f903b.getLayoutDimension(3, -2);
                gVar.i(m10.e(1));
                gVar.L = obtainStyledAttributes.getString(2);
                m10.n();
                this.n = gVar;
                this.f838k = new z(this, this, gVar);
            }
        } else {
            e eVar = new e();
            this.n = eVar;
            eVar.f846k = obtainStyledAttributes.getString(2);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.f840m = true;
        SpinnerAdapter spinnerAdapter = this.f839l;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f839l = null;
        }
        this.f836i.d(attributeSet, i10);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f842p;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.n;
        return iVar != null ? iVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.n;
        return iVar != null ? iVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.n != null ? this.f841o : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.n;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.n;
        return iVar != null ? iVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f837j;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.n;
        return iVar != null ? iVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.n;
        if (iVar == null || !iVar.c()) {
            return;
        }
        iVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.n == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.f854i || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.n;
        hVar.f854i = iVar != null && iVar.c();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z zVar = this.f838k;
        if (zVar == null || !zVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.n;
        if (iVar != null) {
            if (!iVar.c()) {
                iVar.m(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f840m) {
            this.f839l = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.n;
        if (iVar != null) {
            Context context = this.f837j;
            if (context == null) {
                context = getContext();
            }
            iVar.p(new f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.n;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        iVar.k(i10);
        iVar.l(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.n != null) {
            this.f841o = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(e.a.a(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.n;
        if (iVar != null) {
            iVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f836i;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}

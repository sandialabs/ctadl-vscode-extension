package androidx.appcompat.widget;

import a3.j0;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.noto.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends n0 implements i.b {

    /* renamed from: o0  reason: collision with root package name */
    public static final o f754o0;
    public final View A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public q G;
    public final Rect H;
    public final Rect I;
    public final int[] J;
    public final int[] K;
    public final ImageView L;
    public final Drawable M;
    public final int N;
    public final int O;
    public final Intent P;
    public final Intent Q;
    public final CharSequence R;
    public View.OnFocusChangeListener S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public f3.a W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f755a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f756b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f757d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f758e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f759f0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f760g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f761h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f762i0;

    /* renamed from: j0  reason: collision with root package name */
    public SearchableInfo f763j0;

    /* renamed from: k0  reason: collision with root package name */
    public Bundle f764k0;

    /* renamed from: l0  reason: collision with root package name */
    public final b f765l0;

    /* renamed from: m0  reason: collision with root package name */
    public final c f766m0;

    /* renamed from: n0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f767n0;

    /* renamed from: x  reason: collision with root package name */
    public final SearchAutoComplete f768x;

    /* renamed from: y  reason: collision with root package name */
    public final View f769y;

    /* renamed from: z  reason: collision with root package name */
    public final View f770z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: m  reason: collision with root package name */
        public int f771m;
        public SearchView n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f772o;

        /* renamed from: p  reason: collision with root package name */
        public final a f773p;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f772o) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f772o = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f773p = new a();
            this.f771m = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f754o0;
            oVar.getClass();
            o.a();
            Method method = oVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f771m > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f772o) {
                a aVar = this.f773p;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.n;
            searchView.w(searchView.V);
            searchView.post(searchView.f765l0);
            if (searchView.f768x.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.n.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.n.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f772o = true;
                Context context = getContext();
                o oVar = SearchView.f754o0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f773p;
            if (!z10) {
                this.f772o = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f772o = true;
            } else {
                this.f772o = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.n = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f771m = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f768x.getText();
            searchView.f760g0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f759f0 && !searchView.V && z11) {
                searchView.C.setVisibility(8);
                i13 = 0;
            }
            searchView.E.setVisibility(i13);
            searchView.r();
            searchView.u();
            charSequence.toString();
            searchView.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f3.a aVar = SearchView.this.W;
            if (aVar instanceof w0) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            View view2 = searchView.F;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f770z.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = n1.a(searchView);
                if (searchView.U) {
                    i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.f768x;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i19);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.B;
            SearchAutoComplete searchAutoComplete = searchView.f768x;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.T;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.D) {
                searchView.m();
            } else if (view == searchView.C) {
                searchView.q();
            } else if (view == searchView.E) {
                SearchableInfo searchableInfo = searchView.f763j0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.P);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.Q, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
            r8 = 0;
         */
        @Override // android.view.View.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            SearchView searchView = SearchView.this;
            if (searchView.f763j0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f768x;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f763j0 == null || searchView.W == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i10 != 66 && i10 != 84 && i10 != 61) {
                    if (i10 != 21 && i10 != 22) {
                        if (i10 != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    int length = searchAutoComplete.length();
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                searchView.n(searchAutoComplete.getListSelection());
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
            SearchView.this.n(i10);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j2) {
            SearchView.this.o(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public final Method f785a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f786b;
        public final Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f785a = null;
            this.f786b = null;
            this.c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f785a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f786b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends h3.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f787k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new p[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f787k = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f787k + "}";
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeValue(Boolean.valueOf(this.f787k));
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f788a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f789b;
        public final Rect c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f790d;

        /* renamed from: e  reason: collision with root package name */
        public final int f791e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f792f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f791e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f789b = rect3;
            Rect rect4 = new Rect();
            this.f790d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f788a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x3 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f792f;
                    if (z11 && !this.f790d.contains(x3, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f792f;
                    this.f792f = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f789b.contains(x3, y10)) {
                    this.f792f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                Rect rect = this.c;
                View view = this.f788a;
                if (!z10 || rect.contains(x3, y10)) {
                    f10 = x3 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = view.getWidth() / 2;
                    i10 = view.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return view.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f754o0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.H = new Rect();
        this.I = new Rect();
        this.J = new int[2];
        this.K = new int[2];
        this.f765l0 = new b();
        this.f766m0 = new c();
        this.f767n0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = a1.b.E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d1 d1Var = new d1(context, obtainStyledAttributes);
        a3.j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        LayoutInflater.from(context).inflate(d1Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f768x = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f769y = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f770z = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.A = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.B = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.C = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.D = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.E = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.L = imageView5;
        j0.d.q(findViewById, d1Var.e(18));
        j0.d.q(findViewById2, d1Var.e(23));
        imageView.setImageDrawable(d1Var.e(21));
        imageView2.setImageDrawable(d1Var.e(13));
        imageView3.setImageDrawable(d1Var.e(10));
        imageView4.setImageDrawable(d1Var.e(26));
        imageView5.setImageDrawable(d1Var.e(21));
        this.M = d1Var.e(20);
        i1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.N = d1Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.O = d1Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(d1Var.a(16, true));
        int d5 = d1Var.d(2, -1);
        if (d5 != -1) {
            setMaxWidth(d5);
        }
        this.R = d1Var.k(12);
        this.f756b0 = d1Var.k(19);
        int h10 = d1Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = d1Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(d1Var.a(1, true));
        d1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.P = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.F = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.U);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f768x;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f757d0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f768x;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f757d0 = false;
    }

    public int getImeOptions() {
        return this.f768x.getImeOptions();
    }

    public int getInputType() {
        return this.f768x.getInputType();
    }

    public int getMaxWidth() {
        return this.f758e0;
    }

    public CharSequence getQuery() {
        return this.f768x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f756b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f763j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.R : getContext().getText(this.f763j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.O;
    }

    public int getSuggestionRowLayout() {
        return this.N;
    }

    public f3.a getSuggestionsAdapter() {
        return this.W;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f760g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f764k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f763j0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f764k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f768x;
        if (i10 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = f754o0;
        oVar.getClass();
        o.a();
        Method method = oVar.f785a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f786b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f768x;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.U) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i10) {
        int i11;
        Uri parse;
        String i12;
        Cursor cursor = this.W.f10900k;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = w0.F;
                String i14 = w0.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i14 == null) {
                    i14 = this.f763j0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = w0.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i15 == null) {
                    i15 = this.f763j0.getSuggestIntentData();
                }
                if (i15 != null && (i12 = w0.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    i15 = i15 + "/" + Uri.encode(i12);
                }
                if (i15 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(i15);
                }
                intent = j(i14, parse, w0.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), w0.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f768x;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i10) {
        String d5;
        Editable text = this.f768x.getText();
        Cursor cursor = this.W.f10900k;
        if (cursor != null) {
            if (cursor.moveToPosition(i10) && (d5 = this.W.d(cursor)) != null) {
                setQuery(d5);
            } else {
                setQuery(text);
            }
        }
    }

    @Override // i.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f768x;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f760g0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f762i0);
        this.f761h0 = false;
    }

    @Override // i.b
    public final void onActionViewExpanded() {
        if (this.f761h0) {
            return;
        }
        this.f761h0 = true;
        SearchAutoComplete searchAutoComplete = this.f768x;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f762i0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f765l0);
        post(this.f766m0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f768x;
            int[] iArr = this.J;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.K;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            Rect rect = this.H;
            rect.set(i15, i14, searchAutoComplete.getWidth() + i15, searchAutoComplete.getHeight() + i14);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.I;
            rect2.set(i16, 0, i17, i18);
            q qVar = this.G;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.G = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.f789b.set(rect2);
            Rect rect3 = qVar.f790d;
            rect3.set(rect2);
            int i19 = -qVar.f791e;
            rect3.inset(i19, i19);
            qVar.c.set(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.n0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int mode;
        if (this.V) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824 && (i12 = this.f758e0) > 0) {
                }
            } else {
                size = this.f758e0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
            mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    size2 = getPreferredHeight();
                }
            } else {
                size2 = Math.min(getPreferredHeight(), size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i12 = this.f758e0;
        if (i12 <= 0) {
            i12 = getPreferredWidth();
            size = Math.min(i12, size);
            mode = View.MeasureSpec.getMode(i11);
            int size22 = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
        }
        size = Math.min(i12, size);
        mode = View.MeasureSpec.getMode(i11);
        int size222 = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size222, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f11358i);
        w(pVar.f787k);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f787k = this.V;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f765l0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f768x;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f763j0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f768x.getText());
        int i10 = 0;
        if (!z11 && (!this.U || this.f761h0)) {
            z10 = false;
        }
        i10 = 8;
        ImageView imageView = this.D;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f757d0 || !isFocusable()) {
            return false;
        }
        if (!this.V) {
            boolean requestFocus = this.f768x.requestFocus(i10, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        int[] iArr = this.f768x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f770z.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f764k0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f768x;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i10) {
        this.f768x.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f768x.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f758e0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f756b0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.c0 = z10;
        f3.a aVar = this.W;
        if (aVar instanceof w0) {
            w0 w0Var = (w0) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            w0Var.f1126x = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i10;
        this.f763j0 = searchableInfo;
        SearchAutoComplete searchAutoComplete = this.f768x;
        boolean z10 = true;
        Intent intent = null;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f763j0.getImeOptions());
            int inputType = this.f763j0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f763j0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            f3.a aVar = this.W;
            if (aVar != null) {
                aVar.c(null);
            }
            if (this.f763j0.getSuggestAuthority() != null) {
                w0 w0Var = new w0(getContext(), this, this.f763j0, this.f767n0);
                this.W = w0Var;
                searchAutoComplete.setAdapter(w0Var);
                w0 w0Var2 = (w0) this.W;
                if (this.c0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                w0Var2.f1126x = i10;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f763j0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f763j0.getVoiceSearchLaunchWebSearch()) {
                intent = this.P;
            } else if (this.f763j0.getVoiceSearchLaunchRecognizer()) {
                intent = this.Q;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                this.f759f0 = z10;
                if (z10) {
                    searchAutoComplete.setPrivateImeOptions("nm");
                }
                w(this.V);
            }
        }
        z10 = false;
        this.f759f0 = z10;
        if (z10) {
        }
        w(this.V);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f755a0 = z10;
        w(this.V);
    }

    public void setSuggestionsAdapter(f3.a aVar) {
        this.W = aVar;
        this.f768x.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.U;
        SearchAutoComplete searchAutoComplete = this.f768x;
        if (z10 && (drawable = this.M) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z10;
        int i10 = 0;
        if ((this.f755a0 || this.f759f0) && !this.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.C.getVisibility() != 0 && this.E.getVisibility() != 0)) {
            i10 = 8;
        }
        this.A.setVisibility(i10);
    }

    public final void v(boolean z10) {
        int i10;
        boolean z11;
        boolean z12 = this.f755a0;
        if (z12) {
            i10 = 0;
            if ((z12 || this.f759f0) && !this.V) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (hasFocus()) {
                    if (!z10) {
                        if (!this.f759f0) {
                        }
                    }
                    this.C.setVisibility(i10);
                }
            }
        }
        i10 = 8;
        this.C.setVisibility(i10);
    }

    public final void w(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.V = z10;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f768x.getText());
        this.B.setVisibility(i10);
        v(z11);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f769y.setVisibility(i11);
        ImageView imageView = this.L;
        if (imageView.getDrawable() != null && !this.U) {
            i12 = 0;
            imageView.setVisibility(i12);
            r();
            boolean z12 = !z11;
            if (this.f759f0 && !this.V && z12) {
                this.C.setVisibility(8);
                i13 = 0;
            }
            this.E.setVisibility(i13);
            u();
        }
        i12 = 8;
        imageView.setVisibility(i12);
        r();
        boolean z122 = !z11;
        if (this.f759f0) {
            this.C.setVisibility(8);
            i13 = 0;
        }
        this.E.setVisibility(i13);
        u();
    }
}

package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.noto.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import ma.i;

/* loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* renamed from: i  reason: collision with root package name */
    public SearchBar f7261i;

    /* renamed from: j  reason: collision with root package name */
    public int f7262j;

    /* renamed from: k  reason: collision with root package name */
    public TransitionState f7263k;

    /* loaded from: classes.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            boolean z10;
            SearchView searchView2 = searchView;
            if (searchView2.f7261i != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (view instanceof SearchBar)) {
                searchView2.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public enum TransitionState {
        /* JADX INFO: Fake field, exist only in values array */
        HIDING,
        /* JADX INFO: Fake field, exist only in values array */
        HIDDEN,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWING,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWN
    }

    /* loaded from: classes.dex */
    public static class a extends h3.a {
        public static final Parcelable.Creator<a> CREATOR = new C0065a();

        /* renamed from: k  reason: collision with root package name */
        public String f7265k;

        /* renamed from: l  reason: collision with root package name */
        public int f7266l;

        public a() {
            throw null;
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7265k = parcel.readString();
            this.f7266l = parcel.readInt();
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeString(this.f7265k);
            parcel.writeInt(this.f7266l);
        }

        /* renamed from: com.google.android.material.search.SearchView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0065a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f7261i;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i10) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.f7263k;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f7262j;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.L(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f7262j = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f11358i);
        setText(aVar.f7265k);
        if (aVar.f7266l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setVisible(z10);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            Editable text = getText();
            if (text != null) {
                text.toString();
            }
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setAnimatedNavigationIcon(boolean z10) {
    }

    public void setAutoShowKeyboard(boolean z10) {
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z10) {
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(int i10) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        throw null;
    }

    public void setTransitionState(TransitionState transitionState) {
        if (this.f7263k.equals(transitionState)) {
            return;
        }
        this.f7263k = transitionState;
        for (b bVar : new LinkedHashSet((Collection) null)) {
            bVar.a();
        }
    }

    public void setUseWindowInsetsController(boolean z10) {
    }

    public void setVisible(boolean z10) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f7261i = searchBar;
        throw null;
    }
}

package com.noto.app.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import f7.q;
import kotlin.Metadata;
import m7.n;
import s6.e0;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/widget/NoteListFilteringWidgetDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListFilteringWidgetDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final l<? super FilteringType, n> f10015u0;

    /* renamed from: v0  reason: collision with root package name */
    public final FilteringType f10016v0;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10017a;

        static {
            int[] iArr = new int[FilteringType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10017a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListFilteringWidgetDialogFragment noteListFilteringWidgetDialogFragment = NoteListFilteringWidgetDialogFragment.this;
            noteListFilteringWidgetDialogFragment.f10015u0.U(FilteringType.Inclusive);
            noteListFilteringWidgetDialogFragment.Z();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListFilteringWidgetDialogFragment noteListFilteringWidgetDialogFragment = NoteListFilteringWidgetDialogFragment.this;
            noteListFilteringWidgetDialogFragment.f10015u0.U(FilteringType.Exclusive);
            noteListFilteringWidgetDialogFragment.Z();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NoteListFilteringWidgetDialogFragment noteListFilteringWidgetDialogFragment = NoteListFilteringWidgetDialogFragment.this;
            noteListFilteringWidgetDialogFragment.f10015u0.U(FilteringType.Strict);
            noteListFilteringWidgetDialogFragment.Z();
        }
    }

    public NoteListFilteringWidgetDialogFragment() {
        super(false, 1, null);
        this.f10015u0 = NoteListFilteringWidgetDialogFragment$onClick$1.f10021j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteListFilteringWidgetDialogFragment(FilteringType filteringType, l<? super FilteringType, n> lVar) {
        this();
        g.f(filteringType, "filteringType");
        this.f10016v0 = filteringType;
        this.f10015u0 = lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i10;
        g.f(layoutInflater, "inflater");
        e0 a10 = e0.a(layoutInflater, viewGroup);
        MaterialTextView materialTextView = a10.f17336e.c;
        Context j2 = j();
        if (j2 != null) {
            str = q.f(j2, R.string.filtering, new Object[0]);
        } else {
            str = null;
        }
        materialTextView.setText(str);
        FilteringType filteringType = this.f10016v0;
        if (filteringType == null) {
            i10 = -1;
        } else {
            i10 = a.f10017a[filteringType.ordinal()];
        }
        MaterialRadioButton materialRadioButton = a10.f17335d;
        MaterialRadioButton materialRadioButton2 = a10.f17334b;
        MaterialRadioButton materialRadioButton3 = a10.c;
        if (i10 != -1 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    materialRadioButton.setChecked(true);
                }
            } else {
                materialRadioButton2.setChecked(true);
            }
        } else {
            materialRadioButton3.setChecked(true);
        }
        materialRadioButton3.setOnClickListener(new b());
        materialRadioButton2.setOnClickListener(new c());
        materialRadioButton.setOnClickListener(new d());
        NestedScrollView nestedScrollView = a10.f17333a;
        g.e(nestedScrollView, "root");
        return nestedScrollView;
    }
}

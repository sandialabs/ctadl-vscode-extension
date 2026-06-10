package com.noto.app.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.navigation.i;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/MainDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainDialogFragment extends o6.b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f8838v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8839u0;

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f8841a;

        public a(l lVar) {
            this.f8841a = lVar;
        }

        @Override // v7.e
        public final l a() {
            return this.f8841a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f8841a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return g.a(this.f8841a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8841a.hashCode();
        }
    }

    public MainDialogFragment() {
        super(false, 1, null);
        this.f8839u0 = kotlin.a.a(LazyThreadSafetyMode.NONE, new MainDialogFragment$special$$inlined$sharedViewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        i d5;
        d0 a10;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.main_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a11 = s6.c.a(O);
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_folders_archive);
                if (materialTextView != null) {
                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folders_vault);
                    if (materialTextView2 != null) {
                        MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_settings);
                        if (materialTextView3 != null) {
                            Context j2 = j();
                            if (j2 != null) {
                                str = q.f(j2, R.string.app_name, new Object[0]);
                            } else {
                                str = null;
                            }
                            a11.c.setText(str);
                            NavController g10 = ViewUtilsKt.g(this);
                            if (g10 != null && (d5 = g10.d()) != null && (a10 = d5.a()) != null) {
                                a10.c("IsPasscodeValid").d(r(), new a(new MainDialogFragment$setupState$1(this)));
                            }
                            materialTextView.setOnClickListener(new b(this, 4));
                            materialTextView2.setOnClickListener(new h6.b(5, this));
                            materialTextView3.setOnClickListener(new com.noto.app.main.a(this, 3));
                            g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                        i10 = R.id.tv_settings;
                    } else {
                        i10 = R.id.tv_folders_vault;
                    }
                } else {
                    i10 = R.id.tv_folders_archive;
                }
            } else {
                i10 = R.id.tb;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}

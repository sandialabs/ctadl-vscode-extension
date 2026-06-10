package com.noto.app.settings.general;

import a1.b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.navigation.i;
import com.noto.app.settings.c;
import com.noto.app.util.ViewUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/general/GeneralSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GeneralSettingsFragment extends Fragment {

    /* renamed from: d0  reason: collision with root package name */
    public final e f9685d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new GeneralSettingsFragment$special$$inlined$viewModel$default$1(this));

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f9687a;

        public a(l lVar) {
            this.f9687a = lVar;
        }

        @Override // v7.e
        public final l a() {
            return this.f9687a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f9687a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return g.a(this.f9687a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f9687a.hashCode();
        }
    }

    public static final c Z(GeneralSettingsFragment generalSettingsFragment) {
        return (c) generalSettingsFragment.f9685d0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i d5;
        d0 a10;
        OnBackPressedDispatcher onBackPressedDispatcher;
        g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            f7.c.f(this);
            s c = c();
            if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                b.j(onBackPressedDispatcher, null, new GeneralSettingsFragment$onCreateView$1$1(this), 3);
            }
            NavController g10 = ViewUtilsKt.g(this);
            if (g10 != null && (d5 = g10.d()) != null && (a10 = d5.a()) != null) {
                a10.c("folder_id").d(r(), new a(new GeneralSettingsFragment$onCreateView$1$2(this)));
            }
            ComposeView composeView = new ComposeView(j2);
            composeView.setTransitionGroup(true);
            composeView.setContent(a1.c.j0(-1571794244, new GeneralSettingsFragment$onCreateView$1$3$1(this, j2), true));
            return composeView;
        }
        return null;
    }
}

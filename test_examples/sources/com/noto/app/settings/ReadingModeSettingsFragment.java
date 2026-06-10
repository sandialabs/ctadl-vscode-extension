package com.noto.app.settings;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.s;
import b.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/ReadingModeSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReadingModeSettingsFragment extends Fragment {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f9444h0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f9445d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ReadingModeSettingsFragment$special$$inlined$viewModel$default$1(this));

    /* renamed from: e0  reason: collision with root package name */
    public final e f9446e0 = kotlin.a.b(new ReadingModeSettingsFragment$notificationManager$2(this));

    /* renamed from: f0  reason: collision with root package name */
    public final p f9447f0 = (p) Q(new w6.a(2, this), new f());

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f9448g0;

    public ReadingModeSettingsFragment() {
        this.f9448g0 = Build.VERSION.SDK_INT >= 23;
    }

    public final c Z() {
        return (c) this.f9445d0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            s c = c();
            if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                a1.b.j(onBackPressedDispatcher, null, new ReadingModeSettingsFragment$onCreateView$1$1(this), 3);
            }
            f7.c.f(this);
            ComposeView composeView = new ComposeView(j2);
            composeView.setTransitionGroup(true);
            composeView.setContent(a1.c.j0(-881506014, new ReadingModeSettingsFragment$onCreateView$1$2$1(this), true));
            return composeView;
        }
        return null;
    }
}

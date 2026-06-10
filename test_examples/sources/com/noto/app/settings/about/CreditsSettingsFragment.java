package com.noto.app.settings.about;

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
import f7.c;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/about/CreditsSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CreditsSettingsFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            c.f(this);
            s c = c();
            if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                b.j(onBackPressedDispatcher, null, new CreditsSettingsFragment$onCreateView$1$1(this), 3);
            }
            ComposeView composeView = new ComposeView(j2);
            composeView.setTransitionGroup(true);
            composeView.setContent(a1.c.j0(-416519775, new CreditsSettingsFragment$onCreateView$1$2$1(this), true));
            return composeView;
        }
        return null;
    }
}

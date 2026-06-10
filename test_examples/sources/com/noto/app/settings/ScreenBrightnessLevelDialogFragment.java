package com.noto.app.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/ScreenBrightnessLevelDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScreenBrightnessLevelDialogFragment extends o6.b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f9465u0;

    public ScreenBrightnessLevelDialogFragment() {
        super(false, 1, null);
        this.f9465u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ScreenBrightnessLevelDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            ComposeView composeView = new ComposeView(j2);
            composeView.setContent(a1.c.j0(-549897918, new ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1(this), true));
            return composeView;
        }
        return null;
    }
}

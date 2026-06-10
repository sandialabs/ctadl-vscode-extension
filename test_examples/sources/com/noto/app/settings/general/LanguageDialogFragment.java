package com.noto.app.settings.general;

import a1.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import o6.b;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/general/LanguageDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LanguageDialogFragment extends b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f9752u0;

    public LanguageDialogFragment() {
        super(false, 1, null);
        this.f9752u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new LanguageDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            ComposeView composeView = new ComposeView(j2);
            composeView.setContent(c.j0(-651286694, new LanguageDialogFragment$onCreateView$1$1$1(this), true));
            return composeView;
        }
        return null;
    }
}

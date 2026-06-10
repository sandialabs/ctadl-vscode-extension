package com.noto.app.components;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.noto.R;
import com.noto.app.AppViewModel;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.Theme;
import com.noto.app.util.ModelUtilsKt;
import d.f;
import d.j;
import ha.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.collections.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import n7.l;
import v2.h;
import v7.g;
import x2.b;

/* loaded from: classes.dex */
public class BaseActivity extends f {
    public static final /* synthetic */ int G = 0;
    public final e F = a.a(LazyThreadSafetyMode.SYNCHRONIZED, new BaseActivity$special$$inlined$viewModel$default$1(this));

    @Override // androidx.fragment.app.s, androidx.activity.ComponentActivity, m2.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        b bVar;
        int i10;
        Language language;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            bVar = new x2.a(this);
        } else {
            bVar = new b(this);
        }
        bVar.a();
        if (i11 >= 33) {
            h h10 = j.h();
            g.e(h10, "getApplicationLocales()");
            int i12 = ModelUtilsKt.f9848a;
            String a10 = h10.f18149a.a();
            g.e(a10, "toLanguageTags()");
            List<String> n12 = kotlin.text.b.n1(a10, new char[]{','});
            ArrayList arrayList = new ArrayList(l.Z1(n12, 10));
            for (String str : n12) {
                if (i.X0(str, "en", true)) {
                    language = Language.English;
                } else if (i.X0(str, "tr", true)) {
                    language = Language.Turkish;
                } else if (i.X0(str, "ar", true)) {
                    language = Language.Arabic;
                } else if (i.X0(str, "in", true)) {
                    language = Language.Indonesian;
                } else if (i.X0(str, "ru", true)) {
                    language = Language.Russian;
                } else if (i.X0(str, "ta", true)) {
                    language = Language.Tamil;
                } else if (i.X0(str, "es", true)) {
                    language = Language.Spanish;
                } else if (i.X0(str, "fr", true)) {
                    language = Language.French;
                } else if (i.X0(str, "de", true)) {
                    language = Language.German;
                } else if (i.X0(str, "it", true)) {
                    language = Language.Italian;
                } else if (i.X0(str, "cs", true)) {
                    language = Language.Czech;
                } else if (i.X0(str, "lt", true)) {
                    language = Language.Lithuanian;
                } else if (i.X0(str, "zh", true)) {
                    language = Language.SimplifiedChinese;
                } else {
                    language = Language.System;
                }
                arrayList.add(language);
            }
            q().g((Language) c.n2(arrayList));
        }
        Theme theme = q().f7556q;
        if (theme != null) {
            int ordinal = theme.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                i10 = R.style.LightBlackTheme;
                setTheme(Integer.valueOf(i10).intValue());
            }
            i10 = R.style.LightDarkTheme;
            setTheme(Integer.valueOf(i10).intValue());
        }
        super.onCreate(bundle);
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BaseActivity$setupState$1(this), q().f7547g), ma.i.z(this));
        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BaseActivity$setupState$2(this, null), q().f7548h), ma.i.z(this));
        Window window = getWindow();
        g.e(window, "window");
        f7.f.a(this, window);
        Window window2 = getWindow();
        g.e(window2, "window");
        f7.f.b(this, window2, true);
    }

    public final AppViewModel q() {
        return (AppViewModel) this.F.getValue();
    }
}

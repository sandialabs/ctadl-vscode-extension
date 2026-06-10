package com.noto.app.components;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.AppViewModel;
import com.noto.app.domain.model.Theme;
import d.j;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import m7.n;
import p7.c;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class BaseActivity$setupState$1 extends AdaptedFunctionReference implements p<Theme, c<? super n>, Object> {
    public BaseActivity$setupState$1(Object obj) {
        super(obj);
    }

    @Override // u7.p
    public final Object R(Theme theme, c<? super n> cVar) {
        int i10;
        Theme theme2 = theme;
        c<? super n> cVar2 = cVar;
        BaseActivity baseActivity = (BaseActivity) this.f13040i;
        if (baseActivity.q().f7556q != theme2) {
            AppViewModel q10 = baseActivity.q();
            q10.getClass();
            g.f(theme2, "theme");
            q10.f7556q = theme2;
            int ordinal = theme2.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                    }
                } else {
                    j.A(1);
                }
                baseActivity.recreate();
            } else {
                i10 = -1;
            }
            j.A(i10);
            baseActivity.recreate();
        }
        return n.f16010a;
    }
}

package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Theme;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotoThemeKt$NotoTheme$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Theme f7590j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<d, Integer, n> f7591k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotoThemeKt$NotoTheme$2(Theme theme, p<? super d, ? super Integer, n> pVar, int i10) {
        super(2);
        this.f7590j = theme;
        this.f7591k = pVar;
        this.f7592l = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        NotoThemeKt.a(this.f7590j, this.f7591k, dVar, this.f7592l | 1);
        return n.f16010a;
    }
}

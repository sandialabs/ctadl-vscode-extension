package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.r;
import g0.h1;
import kotlin.NoWhenBranchMatchedException;
import ma.i;
import p1.p;
import v7.g;

/* loaded from: classes.dex */
public final class TypographyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f2598a = CompositionLocalKt.c(TypographyKt$LocalTypography$1.f2599j);

    public static final p a(r rVar, TypographyKeyTokens typographyKeyTokens) {
        g.f(rVar, "<this>");
        g.f(typographyKeyTokens, "value");
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return rVar.f10584j;
            case 1:
                return rVar.f10585k;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return rVar.f10586l;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return rVar.f10576a;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return rVar.f10577b;
            case 5:
                return rVar.c;
            case 6:
                return rVar.f10578d;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return rVar.f10579e;
            case 8:
                return rVar.f10580f;
            case i.f16046m /* 9 */:
                return rVar.f10587m;
            case i.f16047o /* 10 */:
                return rVar.n;
            case 11:
                return rVar.f10588o;
            case 12:
                return rVar.f10581g;
            case 13:
                return rVar.f10582h;
            case 14:
                return rVar.f10583i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.l;
import g0.h1;
import g0.t0;
import g0.z0;
import kotlin.NoWhenBranchMatchedException;
import m7.n;
import ma.i;
import u7.q;
import v0.c0;
import v0.h0;
import v7.g;
import z.f;

/* loaded from: classes.dex */
public final class ShapesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f2400a = CompositionLocalKt.c(ShapesKt$LocalShapes$1.f2401j);

    public static final h0 a(ShapeKeyTokens shapeKeyTokens, g0.d dVar) {
        g.f(shapeKeyTokens, "<this>");
        dVar.f(-612531606);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        l lVar = (l) dVar.w(f2400a);
        g.f(lVar, "<this>");
        int ordinal = shapeKeyTokens.ordinal();
        z.a aVar = lVar.f10554a;
        z.a aVar2 = lVar.f10557e;
        z.a aVar3 = lVar.f10556d;
        h0 h0Var = aVar;
        switch (ordinal) {
            case 0:
                h0Var = aVar2;
                break;
            case 1:
                h0Var = b(aVar2);
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                h0Var = b(aVar);
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                h0Var = f.f18974a;
                break;
            case 5:
                h0Var = aVar3;
                break;
            case 6:
                g.f(aVar3, "<this>");
                float f10 = (float) 0.0d;
                h0Var = z.a.c(aVar3, new z.c(f10), null, new z.c(f10), 6);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                h0Var = b(aVar3);
                break;
            case 8:
                h0Var = lVar.c;
                break;
            case i.f16046m /* 9 */:
                h0Var = c0.f18087a;
                break;
            case i.f16047o /* 10 */:
                h0Var = lVar.f10555b;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        dVar.u();
        return h0Var;
    }

    public static final z.a b(z.a aVar) {
        g.f(aVar, "<this>");
        float f10 = (float) 0.0d;
        return z.a.c(aVar, null, new z.c(f10), new z.c(f10), 3);
    }
}

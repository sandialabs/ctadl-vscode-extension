package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import r.f;
import r.z;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt$Switch$2 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.a<Float, f> f2543j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f2544k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2(androidx.compose.animation.core.a<Float, f> aVar, float f10) {
        super(0);
        this.f2543j = aVar;
        this.f2544k = f10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // u7.a
    public final n k0() {
        f fVar;
        f fVar2;
        boolean z10;
        ?? valueOf = Float.valueOf(this.f2544k);
        androidx.compose.animation.core.a<Float, f> aVar = this.f2543j;
        ?? r22 = aVar.f1358g;
        z<Float, f> zVar = aVar.f1353a;
        if (valueOf == 0 || (fVar = zVar.a().U(valueOf)) == null) {
            fVar = aVar.f1360i;
        }
        if (r22 == 0 || (fVar2 = zVar.a().U(r22)) == null) {
            fVar2 = aVar.f1361j;
        }
        int b5 = fVar.b();
        for (int i10 = 0; i10 < b5; i10++) {
            if (fVar.a(i10) <= fVar2.a(i10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + fVar + " is greater than upper bound " + fVar2 + " on index " + i10).toString());
            }
        }
        aVar.f1362k = fVar;
        aVar.f1363l = fVar2;
        aVar.f1358g = r22;
        aVar.f1357f = valueOf;
        if (!((Boolean) aVar.f1355d.getValue()).booleanValue()) {
            Float b10 = aVar.b(aVar.c());
            if (!g.a(b10, aVar.c())) {
                aVar.c.f16975j.setValue(b10);
            }
        }
        return n.f16010a;
    }
}

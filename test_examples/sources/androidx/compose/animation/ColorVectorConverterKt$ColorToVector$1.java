package androidx.compose.animation;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import r.h;
import r.z;
import u7.l;
import v0.r;
import v7.g;
import w0.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw0/c;", "colorSpace", "Lr/z;", "Lv0/r;", "Lr/h;", "invoke", "(Lw0/c;)Lr/z;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements l<c, z<r, h>> {

    /* renamed from: j  reason: collision with root package name */
    public static final ColorVectorConverterKt$ColorToVector$1 f1252j = new ColorVectorConverterKt$ColorToVector$1();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv0/r;", "color", "Lr/h;", "invoke-8_81llA", "(J)Lr/h;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<r, h> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f1253j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final h U(r rVar) {
            long j2 = rVar.f18135a;
            long a10 = r.a(j2, ColorSpaces.f3110q);
            float h10 = r.h(a10);
            float g10 = r.g(a10);
            float e10 = r.e(a10);
            float[] fArr = ColorVectorConverterKt.f1251b;
            double d5 = 0.33333334f;
            return new h(r.d(j2), (float) Math.pow(ColorVectorConverterKt.a(0, h10, g10, e10, fArr), d5), (float) Math.pow(ColorVectorConverterKt.a(1, h10, g10, e10, fArr), d5), (float) Math.pow(ColorVectorConverterKt.a(2, h10, g10, e10, fArr), d5));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr/h;", "it", "Lv0/r;", "invoke-vNxB06k", "(Lr/h;)J", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements l<h, r> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c f1254j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar) {
            super(1);
            this.f1254j = cVar;
        }

        @Override // u7.l
        public final r U(h hVar) {
            h hVar2 = hVar;
            g.f(hVar2, "it");
            double d5 = 3.0f;
            float pow = (float) Math.pow(hVar2.f16992b, d5);
            float pow2 = (float) Math.pow(hVar2.c, d5);
            float pow3 = (float) Math.pow(hVar2.f16993d, d5);
            float[] fArr = ColorVectorConverterKt.c;
            return new r(r.a(a1.c.j(a1.c.b0(ColorVectorConverterKt.a(0, pow, pow2, pow3, fArr), -2.0f, 2.0f), a1.c.b0(ColorVectorConverterKt.a(1, pow, pow2, pow3, fArr), -2.0f, 2.0f), a1.c.b0(ColorVectorConverterKt.a(2, pow, pow2, pow3, fArr), -2.0f, 2.0f), a1.c.b0(hVar2.f16991a, 0.0f, 1.0f), ColorSpaces.f3110q), this.f1254j));
        }
    }

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // u7.l
    public final z<r, h> U(c cVar) {
        c cVar2 = cVar;
        g.f(cVar2, "colorSpace");
        return VectorConvertersKt.a(AnonymousClass1.f1253j, new AnonymousClass2(cVar2));
    }
}

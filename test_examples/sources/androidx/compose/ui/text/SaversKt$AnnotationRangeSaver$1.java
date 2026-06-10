package androidx.compose.ui.text;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o0.f;
import o0.g;
import p1.a;
import p1.h;
import p1.k;
import p1.r;
import p1.s;
import u7.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo0/g;", "Lp1/a$a;", "", "it", "invoke", "(Lo0/g;Lp1/a$a;)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements p<g, a.C0207a<? extends Object>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$1 f4022j = new SaversKt$AnnotationRangeSaver$1();

    public SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(g gVar, a.C0207a<? extends Object> c0207a) {
        AnnotationType annotationType;
        Object obj;
        f fVar;
        g gVar2 = gVar;
        a.C0207a<? extends Object> c0207a2 = c0207a;
        v7.g.f(gVar2, "$this$Saver");
        v7.g.f(c0207a2, "it");
        Object obj2 = c0207a2.f16645a;
        if (obj2 instanceof h) {
            annotationType = AnnotationType.Paragraph;
        } else if (obj2 instanceof k) {
            annotationType = AnnotationType.Span;
        } else if (obj2 instanceof s) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (obj2 instanceof r) {
            annotationType = AnnotationType.Url;
        } else {
            annotationType = AnnotationType.String;
        }
        int ordinal = annotationType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            f fVar2 = SaversKt.f4001a;
                            return c.O(annotationType, obj2, Integer.valueOf(c0207a2.f16646b), Integer.valueOf(c0207a2.c), c0207a2.f16647d);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    v7.g.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    obj = (r) obj2;
                    fVar = SaversKt.f4004e;
                } else {
                    v7.g.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    obj = (s) obj2;
                    fVar = SaversKt.f4003d;
                }
            } else {
                v7.g.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                obj = (k) obj2;
                fVar = SaversKt.f4006g;
            }
        } else {
            v7.g.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            obj = (h) obj2;
            fVar = SaversKt.f4005f;
        }
        obj2 = SaversKt.a(obj, fVar, gVar2);
        return c.O(annotationType, obj2, Integer.valueOf(c0207a2.f16646b), Integer.valueOf(c0207a2.c), c0207a2.f16647d);
    }
}

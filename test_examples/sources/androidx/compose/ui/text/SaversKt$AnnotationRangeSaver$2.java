package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o0.f;
import p1.a;
import p1.h;
import p1.k;
import p1.r;
import p1.s;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/a$a;", "invoke", "(Ljava/lang/Object;)Lp1/a$a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements l<Object, a.C0207a<? extends Object>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$2 f4023j = new SaversKt$AnnotationRangeSaver$2();

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final a.C0207a<? extends Object> U(Object obj) {
        AnnotationType annotationType;
        Integer num;
        Integer num2;
        String str;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        if (obj2 != null) {
            annotationType = (AnnotationType) obj2;
        } else {
            annotationType = null;
        }
        g.c(annotationType);
        Object obj4 = list.get(2);
        if (obj4 != null) {
            num = (Integer) obj4;
        } else {
            num = null;
        }
        g.c(num);
        int intValue = num.intValue();
        Object obj5 = list.get(3);
        if (obj5 != null) {
            num2 = (Integer) obj5;
        } else {
            num2 = null;
        }
        g.c(num2);
        int intValue2 = num2.intValue();
        Object obj6 = list.get(4);
        if (obj6 != null) {
            str = (String) obj6;
        } else {
            str = null;
        }
        g.c(str);
        int ordinal = annotationType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            Object obj7 = list.get(1);
                            if (obj7 != null) {
                                obj3 = (String) obj7;
                            }
                            g.c(obj3);
                            return new a.C0207a<>(obj3, intValue, intValue2, str);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj8 = list.get(1);
                    f fVar = SaversKt.f4004e;
                    if (!g.a(obj8, Boolean.FALSE) && obj8 != null) {
                        obj3 = (r) fVar.f16183b.U(obj8);
                    }
                    g.c(obj3);
                    return new a.C0207a<>(obj3, intValue, intValue2, str);
                }
                Object obj9 = list.get(1);
                f fVar2 = SaversKt.f4003d;
                if (!g.a(obj9, Boolean.FALSE) && obj9 != null) {
                    obj3 = (s) fVar2.f16183b.U(obj9);
                }
                g.c(obj3);
                return new a.C0207a<>(obj3, intValue, intValue2, str);
            }
            Object obj10 = list.get(1);
            f fVar3 = SaversKt.f4006g;
            if (!g.a(obj10, Boolean.FALSE) && obj10 != null) {
                obj3 = (k) fVar3.f16183b.U(obj10);
            }
            g.c(obj3);
            return new a.C0207a<>(obj3, intValue, intValue2, str);
        }
        Object obj11 = list.get(1);
        f fVar4 = SaversKt.f4005f;
        if (!g.a(obj11, Boolean.FALSE) && obj11 != null) {
            obj3 = (h) fVar4.f16183b.U(obj11);
        }
        g.c(obj3);
        return new a.C0207a<>(obj3, intValue, intValue2, str);
    }
}

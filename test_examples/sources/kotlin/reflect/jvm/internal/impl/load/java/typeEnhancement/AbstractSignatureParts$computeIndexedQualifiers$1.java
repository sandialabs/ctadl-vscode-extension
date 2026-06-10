package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import c9.h;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements l<Integer, c9.c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f13842j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ c9.c[] f13843k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(h hVar, c9.c[] cVarArr) {
        super(1);
        this.f13842j = hVar;
        this.f13843k = cVarArr;
    }

    @Override // u7.l
    public final c9.c U(Integer num) {
        Map<Integer, c9.c> map;
        c9.c cVar;
        int intValue = num.intValue();
        h hVar = this.f13842j;
        if (hVar == null || (map = hVar.f6579a) == null || (cVar = map.get(Integer.valueOf(intValue))) == null) {
            if (intValue >= 0) {
                c9.c[] cVarArr = this.f13843k;
                g.f(cVarArr, "<this>");
                if (intValue <= cVarArr.length - 1) {
                    return cVarArr[intValue];
                }
            }
            return c9.c.f6566e;
        }
        return cVar;
    }
}

package androidx.compose.ui.text;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p1.f;
import p1.g;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics$minIntrinsicWidth$2 extends Lambda implements u7.a<Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MultiParagraphIntrinsics f4000j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$minIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.f4000j = multiParagraphIntrinsics;
    }

    @Override // u7.a
    public final Float k0() {
        Object obj;
        float f10;
        g gVar;
        ArrayList arrayList = this.f4000j.f3998e;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = arrayList.get(0);
            float a10 = ((f) obj2).f16662a.a();
            int B0 = c.B0(arrayList);
            int i10 = 1;
            if (1 <= B0) {
                while (true) {
                    Object obj3 = arrayList.get(i10);
                    float a11 = ((f) obj3).f16662a.a();
                    if (Float.compare(a10, a11) < 0) {
                        obj2 = obj3;
                        a10 = a11;
                    }
                    if (i10 == B0) {
                        break;
                    }
                    i10++;
                }
            }
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar != null && (gVar = fVar.f16662a) != null) {
            f10 = gVar.a();
        } else {
            f10 = 0.0f;
        }
        return Float.valueOf(f10);
    }
}

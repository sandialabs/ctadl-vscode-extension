package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u1.e;
import u1.i;
import u1.j;
import u1.m;
import u7.r;
import v7.g;
import x1.b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lu1/e;", "fontFamily", "Lu1/m;", "fontWeight", "Lu1/i;", "fontStyle", "Lu1/j;", "fontSynthesis", "Landroid/graphics/Typeface;", "invoke-DPcqOEQ", "(Lu1/e;Lu1/m;II)Landroid/graphics/Typeface;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements r<e, m, i, j, Typeface> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f4148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(a aVar) {
        super(4);
        this.f4148j = aVar;
    }

    @Override // u7.r
    public final Typeface l0(e eVar, m mVar, i iVar, j jVar) {
        m mVar2 = mVar;
        int i10 = iVar.f17748a;
        int i11 = jVar.f17749a;
        g.f(mVar2, "fontWeight");
        a aVar = this.f4148j;
        b bVar = new b(aVar.f4152e.a(eVar, mVar2, i10, i11));
        aVar.f4157j.add(bVar);
        Object obj = bVar.f18571b;
        g.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }
}

package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p1.k;
import u1.e;
import u1.i;
import u1.j;
import u1.m;
import u7.q;
import u7.r;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp1/k;", "spanStyle", "", "start", "end", "Lm7/n;", "invoke", "(Lp1/k;II)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements q<k, Integer, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Spannable f4159j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ r<e, m, i, j, Typeface> f4160k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(SpannableString spannableString, r rVar) {
        super(3);
        this.f4159j = spannableString;
        this.f4160k = rVar;
    }

    @Override // u7.q
    public final n O(k kVar, Integer num, Integer num2) {
        int i10;
        int i11;
        k kVar2 = kVar;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        g.f(kVar2, "spanStyle");
        m mVar = kVar2.c;
        if (mVar == null) {
            mVar = m.n;
        }
        i iVar = kVar2.f16673d;
        if (iVar != null) {
            i10 = iVar.f17748a;
        } else {
            i10 = 0;
        }
        i iVar2 = new i(i10);
        j jVar = kVar2.f16674e;
        if (jVar != null) {
            i11 = jVar.f17749a;
        } else {
            i11 = 1;
        }
        this.f4159j.setSpan(new s1.m(this.f4160k.l0(kVar2.f16675f, mVar, iVar2, new j(i11))), intValue, intValue2, 33);
        return n.f16010a;
    }
}

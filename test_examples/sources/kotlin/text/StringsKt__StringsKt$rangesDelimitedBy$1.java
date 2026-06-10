package kotlin.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ char[] f15131j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f15132k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z10) {
        super(2);
        this.f15131j = cArr;
        this.f15132k = z10;
    }

    @Override // u7.p
    public final Pair<? extends Integer, ? extends Integer> R(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        g.f(charSequence2, "$this$$receiver");
        int f12 = b.f1(intValue, charSequence2, this.f15132k, this.f15131j);
        if (f12 < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(f12), 1);
    }
}

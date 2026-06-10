package kotlin.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b8.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb8/i;", "it", "", "invoke", "(Lb8/i;)Ljava/lang/String;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements l<i, String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CharSequence f15135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        super(1);
        this.f15135j = charSequence;
    }

    @Override // u7.l
    public final String U(i iVar) {
        i iVar2 = iVar;
        g.f(iVar2, "it");
        return b.p1(this.f15135j, iVar2);
    }
}

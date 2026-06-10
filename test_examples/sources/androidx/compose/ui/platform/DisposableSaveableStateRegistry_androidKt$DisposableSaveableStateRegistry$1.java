package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f3736j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b4.b f3737k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f3738l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z10, b4.b bVar, String str) {
        super(0);
        this.f3736j = z10;
        this.f3737k = bVar;
        this.f3738l = str;
    }

    @Override // u7.a
    public final m7.n k0() {
        if (this.f3736j) {
            b4.b bVar = this.f3737k;
            bVar.getClass();
            String str = this.f3738l;
            v7.g.f(str, "key");
            bVar.f6379a.g(str);
        }
        return m7.n.f16010a;
    }
}

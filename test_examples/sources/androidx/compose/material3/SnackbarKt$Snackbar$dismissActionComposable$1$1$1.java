package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarKt$Snackbar$dismissActionComposable$1$1$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f2506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$dismissActionComposable$1$1$1(m mVar) {
        super(0);
        this.f2506j = mVar;
    }

    @Override // u7.a
    public final n k0() {
        this.f2506j.dismiss();
        return n.f16010a;
    }
}

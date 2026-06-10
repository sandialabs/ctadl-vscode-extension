package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj1/h;", "it", "Lm7/n;", "invoke", "(Lj1/h;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ContentInViewModifier$modifier$1 extends Lambda implements l<h, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ContentInViewModifier f1606j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$modifier$1(ContentInViewModifier contentInViewModifier) {
        super(1);
        this.f1606j = contentInViewModifier;
    }

    @Override // u7.l
    public final n U(h hVar) {
        this.f1606j.f1603m = hVar;
        return n.f16010a;
    }
}

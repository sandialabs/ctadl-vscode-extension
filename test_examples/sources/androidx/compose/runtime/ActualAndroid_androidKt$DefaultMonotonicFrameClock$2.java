package androidx.compose.runtime;

import android.os.Looper;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg0/c0;", "invoke", "()Lg0/c0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends Lambda implements u7.a<c0> {

    /* renamed from: j  reason: collision with root package name */
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 f2632j = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    public ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    @Override // u7.a
    public final c0 k0() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f2755i : e.f2876i;
    }
}

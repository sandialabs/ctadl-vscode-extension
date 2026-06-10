package androidx.compose.ui.text.input;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import la.e;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@c(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {204}, m = "textInputCommandEventLoop")
/* loaded from: classes.dex */
public final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public TextInputServiceAndroid f4144l;

    /* renamed from: m  reason: collision with root package name */
    public e f4145m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ TextInputServiceAndroid f4146o;

    /* renamed from: p  reason: collision with root package name */
    public int f4147p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, p7.c<? super TextInputServiceAndroid$textInputCommandEventLoop$1> cVar) {
        super(cVar);
        this.f4146o = textInputServiceAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f4147p |= Integer.MIN_VALUE;
        return this.f4146o.a(this);
    }
}

package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import u1.d;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, 62}, m = "awaitLoad")
/* loaded from: classes.dex */
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public AndroidFontLoader f4081l;

    /* renamed from: m  reason: collision with root package name */
    public d f4082m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AndroidFontLoader f4083o;

    /* renamed from: p  reason: collision with root package name */
    public int f4084p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, p7.c<? super AndroidFontLoader$awaitLoad$1> cVar) {
        super(cVar);
        this.f4083o = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f4084p |= Integer.MIN_VALUE;
        return this.f4083o.a(null, this);
    }
}

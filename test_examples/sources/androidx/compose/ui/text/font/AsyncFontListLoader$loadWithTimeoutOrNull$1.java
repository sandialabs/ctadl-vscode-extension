package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import u1.d;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
/* loaded from: classes.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public d f4101l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f4102m;
    public final /* synthetic */ AsyncFontListLoader n;

    /* renamed from: o  reason: collision with root package name */
    public int f4103o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, p7.c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> cVar) {
        super(cVar);
        this.n = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4102m = obj;
        this.f4103o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}

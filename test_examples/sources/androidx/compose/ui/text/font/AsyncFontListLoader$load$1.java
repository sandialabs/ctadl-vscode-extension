package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import u1.d;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public AsyncFontListLoader f4092l;

    /* renamed from: m  reason: collision with root package name */
    public List f4093m;
    public d n;

    /* renamed from: o  reason: collision with root package name */
    public int f4094o;

    /* renamed from: p  reason: collision with root package name */
    public int f4095p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f4096q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f4097r;

    /* renamed from: s  reason: collision with root package name */
    public int f4098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, p7.c<? super AsyncFontListLoader$load$1> cVar) {
        super(cVar);
        this.f4097r = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4096q = obj;
        this.f4098s |= Integer.MIN_VALUE;
        return this.f4097r.a(this);
    }
}

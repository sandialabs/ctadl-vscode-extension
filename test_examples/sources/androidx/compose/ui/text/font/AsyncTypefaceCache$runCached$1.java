package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {399}, m = "runCached")
/* loaded from: classes.dex */
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public a f4106l;

    /* renamed from: m  reason: collision with root package name */
    public a.b f4107m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f4108o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a f4109p;

    /* renamed from: q  reason: collision with root package name */
    public int f4110q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(a aVar, p7.c<? super AsyncTypefaceCache$runCached$1> cVar) {
        super(cVar);
        this.f4109p = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4108o = obj;
        this.f4110q |= Integer.MIN_VALUE;
        return this.f4109p.c(null, null, null, this);
    }
}

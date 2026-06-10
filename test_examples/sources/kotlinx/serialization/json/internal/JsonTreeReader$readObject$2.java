package kotlinx.serialization.json.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
@q7.c(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
/* loaded from: classes.dex */
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public m7.a f15684l;

    /* renamed from: m  reason: collision with root package name */
    public d f15685m;
    public LinkedHashMap n;

    /* renamed from: o  reason: collision with root package name */
    public String f15686o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f15687p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ d f15688q;

    /* renamed from: r  reason: collision with root package name */
    public int f15689r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(d dVar, p7.c<? super JsonTreeReader$readObject$2> cVar) {
        super(cVar);
        this.f15688q = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15687p = obj;
        this.f15689r |= Integer.MIN_VALUE;
        return d.a(this.f15688q, null, this);
    }
}

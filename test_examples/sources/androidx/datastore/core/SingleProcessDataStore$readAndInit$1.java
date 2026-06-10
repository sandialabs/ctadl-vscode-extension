package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4706l;

    /* renamed from: m  reason: collision with root package name */
    public Object f4707m;
    public Serializable n;

    /* renamed from: o  reason: collision with root package name */
    public Object f4708o;

    /* renamed from: p  reason: collision with root package name */
    public SingleProcessDataStore$readAndInit$api$1 f4709p;

    /* renamed from: q  reason: collision with root package name */
    public Iterator f4710q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f4711r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f4712s;

    /* renamed from: t  reason: collision with root package name */
    public int f4713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, p7.c<? super SingleProcessDataStore$readAndInit$1> cVar) {
        super(cVar);
        this.f4712s = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4711r = obj;
        this.f4713t |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
        return this.f4712s.e(this);
    }
}

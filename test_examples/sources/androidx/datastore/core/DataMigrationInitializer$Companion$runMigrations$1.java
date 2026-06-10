package androidx.datastore.core;

import androidx.datastore.core.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Serializable f4655l;

    /* renamed from: m  reason: collision with root package name */
    public Iterator f4656m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a.C0034a f4657o;

    /* renamed from: p  reason: collision with root package name */
    public int f4658p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(a.C0034a c0034a, p7.c<? super DataMigrationInitializer$Companion$runMigrations$1> cVar) {
        super(cVar);
        this.f4657o = c0034a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f4658p |= Integer.MIN_VALUE;
        return a.C0034a.a(this.f4657o, null, null, this);
    }
}

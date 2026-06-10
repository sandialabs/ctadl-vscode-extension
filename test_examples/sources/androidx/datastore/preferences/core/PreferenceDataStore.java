package androidx.datastore.preferences.core;

import androidx.datastore.core.SingleProcessDataStore;
import j3.d;
import kotlinx.coroutines.flow.b;
import p7.c;
import u7.p;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements d<m3.a> {

    /* renamed from: a  reason: collision with root package name */
    public final d<m3.a> f4770a;

    public PreferenceDataStore(SingleProcessDataStore singleProcessDataStore) {
        this.f4770a = singleProcessDataStore;
    }

    @Override // j3.d
    public final Object a(p<? super m3.a, ? super c<? super m3.a>, ? extends Object> pVar, c<? super m3.a> cVar) {
        return this.f4770a.a(new PreferenceDataStore$updateData$2(pVar, null), cVar);
    }

    @Override // j3.d
    public final b<m3.a> b() {
        return this.f4770a.b();
    }
}

package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u6.b;
import v7.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", "T", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListRemoteViewsFactory$special$$inlined$inject$default$3 extends Lambda implements u7.a<b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ db.a f10047j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListRemoteViewsFactory$special$$inlined$inject$default$3(db.a aVar) {
        super(0);
        this.f10047j = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [u6.b, java.lang.Object] */
    @Override // u7.a
    public final b k0() {
        org.koin.core.scope.a aVar;
        db.a aVar2 = this.f10047j;
        if (aVar2 instanceof db.b) {
            aVar = ((db.b) aVar2).a();
        } else {
            aVar = aVar2.c().f16502a.f15888b;
        }
        return aVar.a(null, i.a(b.class), null);
    }
}

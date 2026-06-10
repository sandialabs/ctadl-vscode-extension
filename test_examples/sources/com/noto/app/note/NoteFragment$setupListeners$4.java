package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/i;", "Lm7/n;", "invoke", "(Landroidx/activity/i;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteFragment$setupListeners$4 extends Lambda implements u7.l<androidx.activity.i, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<m7.n> f9060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupListeners$4(u7.a<m7.n> aVar) {
        super(1);
        this.f9060j = aVar;
    }

    @Override // u7.l
    public final m7.n U(androidx.activity.i iVar) {
        v7.g.f(iVar, "$this$addCallback");
        this.f9060j.k0();
        return m7.n.f16010a;
    }
}

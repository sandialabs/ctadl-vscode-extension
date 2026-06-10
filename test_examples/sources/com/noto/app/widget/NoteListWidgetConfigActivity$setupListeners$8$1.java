package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/noto/app/domain/model/FilteringType;", "filteringType", "Lm7/n;", "invoke", "(Lcom/noto/app/domain/model/FilteringType;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupListeners$8$1 extends Lambda implements l<FilteringType, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupListeners$8$1(NoteListWidgetConfigActivity noteListWidgetConfigActivity) {
        super(1);
        this.f10059j = noteListWidgetConfigActivity;
    }

    @Override // u7.l
    public final n U(FilteringType filteringType) {
        FilteringType filteringType2 = filteringType;
        g.f(filteringType2, "filteringType");
        int i10 = NoteListWidgetConfigActivity.L;
        NoteListWidgetConfigViewModel s10 = this.f10059j.s();
        s10.getClass();
        b.M0(a1.b.d0(s10), null, null, new NoteListWidgetConfigViewModel$setFilteringType$1(s10, filteringType2, null), 3);
        return n.f16010a;
    }
}

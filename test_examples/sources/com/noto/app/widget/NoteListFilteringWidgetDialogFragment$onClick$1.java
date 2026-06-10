package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/noto/app/domain/model/FilteringType;", "it", "Lm7/n;", "invoke", "(Lcom/noto/app/domain/model/FilteringType;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListFilteringWidgetDialogFragment$onClick$1 extends Lambda implements l<FilteringType, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final NoteListFilteringWidgetDialogFragment$onClick$1 f10021j = new NoteListFilteringWidgetDialogFragment$onClick$1();

    public NoteListFilteringWidgetDialogFragment$onClick$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(FilteringType filteringType) {
        g.f(filteringType, "it");
        return n.f16010a;
    }
}

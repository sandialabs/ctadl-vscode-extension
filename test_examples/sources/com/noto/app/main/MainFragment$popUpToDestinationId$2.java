package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainFragment$popUpToDestinationId$2 extends Lambda implements u7.a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$popUpToDestinationId$2(MainFragment mainFragment) {
        super(0);
        this.f8855j = mainFragment;
    }

    @Override // u7.a
    public final Integer k0() {
        int i10;
        if (((Long) this.f8855j.f8847y0.getValue()) == null) {
            i10 = R.id.filteredFragment;
        } else {
            i10 = R.id.folderFragment;
        }
        return Integer.valueOf(i10);
    }
}

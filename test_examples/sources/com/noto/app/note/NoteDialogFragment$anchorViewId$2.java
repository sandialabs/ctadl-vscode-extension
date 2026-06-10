package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoteDialogFragment$anchorViewId$2 extends Lambda implements u7.a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f8997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$anchorViewId$2(NoteDialogFragment noteDialogFragment) {
        super(0);
        this.f8997j = noteDialogFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer k0() {
        androidx.navigation.i iVar;
        Integer num;
        androidx.navigation.n nVar;
        NavController g10;
        try {
            g10 = ViewUtilsKt.g(this.f8997j);
        } catch (Throwable unused) {
        }
        if (g10 != null) {
            iVar = g10.c(R.id.folderArchiveFragment);
            if (iVar == null && (nVar = iVar.f5479j) != null) {
                num = Integer.valueOf(nVar.f5511k);
            } else {
                num = null;
            }
            if (num == null) {
                return null;
            }
            return Integer.valueOf((int) R.id.bab);
        }
        iVar = null;
        if (iVar == null) {
        }
        num = null;
        if (num == null) {
        }
    }
}

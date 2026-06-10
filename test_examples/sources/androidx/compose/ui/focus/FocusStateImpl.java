package androidx.compose.ui.focus;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import t0.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Lt0/k;", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public enum FocusStateImpl implements k {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    @Override // t0.k
    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return true;
            }
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}

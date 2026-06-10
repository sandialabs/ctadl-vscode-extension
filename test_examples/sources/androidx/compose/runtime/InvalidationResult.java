package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public enum InvalidationResult {
    IGNORED,
    SCHEDULED,
    DEFERRED,
    IMMINENT
}

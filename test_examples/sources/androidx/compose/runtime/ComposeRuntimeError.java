package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: i  reason: collision with root package name */
    public final String f2639i;

    public ComposeRuntimeError(String str) {
        v7.g.f(str, "message");
        this.f2639i = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2639i;
    }
}

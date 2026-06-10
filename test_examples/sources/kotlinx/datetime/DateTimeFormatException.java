package kotlinx.datetime;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.DateTimeException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/DateTimeFormatException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "kotlinx-datetime"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class DateTimeFormatException extends IllegalArgumentException {
    public DateTimeFormatException(DateTimeException dateTimeException) {
        super(dateTimeException);
    }
}

package kotlinx.serialization;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/SerializationException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "kotlinx-serialization-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class SerializationException extends IllegalArgumentException {
    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
    }
}

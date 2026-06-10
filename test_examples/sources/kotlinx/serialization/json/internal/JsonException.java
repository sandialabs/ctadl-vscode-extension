package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.SerializationException;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-json"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        g.f(str, "message");
    }
}

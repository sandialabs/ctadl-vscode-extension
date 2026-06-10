package kotlinx.serialization;

import a1.c;
import a4.b;
import java.util.List;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f15575i;

    public MissingFieldException(String str) {
        this(c.N0(str), b.m("Field '", str, "' is required, but it was missing"), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        g.f(list, "missingFields");
        this.f15575i = list;
    }
}

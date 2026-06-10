package kotlinx.serialization.json.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    

    /* renamed from: i  reason: collision with root package name */
    public final char f15694i;

    /* renamed from: j  reason: collision with root package name */
    public final char f15695j;

    WriteMode(char c, char c10) {
        this.f15694i = c;
        this.f15695j = c10;
    }
}

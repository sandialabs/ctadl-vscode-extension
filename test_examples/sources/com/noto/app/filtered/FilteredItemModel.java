package com.noto.app.filtered;

import a1.c;
import com.noto.app.domain.model.NotoColor;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/noto/app/filtered/FilteredItemModel;", "", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public enum FilteredItemModel {
    All(-2, NotoColor.Blue),
    Recent(-3, NotoColor.Yellow),
    Scheduled(-5, NotoColor.Red),
    Archived(-6, NotoColor.Purple);
    

    /* renamed from: k  reason: collision with root package name */
    public static final List<Long> f8281k = c.O0(-2L, -3L, -5L, -6L);

    /* renamed from: i  reason: collision with root package name */
    public final long f8286i;

    /* renamed from: j  reason: collision with root package name */
    public final NotoColor f8287j;

    FilteredItemModel(long j2, NotoColor notoColor) {
        this.f8286i = j2;
        this.f8287j = notoColor;
    }
}

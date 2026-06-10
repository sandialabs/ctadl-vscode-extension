package com.noto.app.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/noto/app/domain/model/ScreenBrightnessLevel;", "", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public enum ScreenBrightnessLevel {
    System(-1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    Min(0.0f),
    /* JADX INFO: Fake field, exist only in values array */
    VeryLow(0.1f),
    /* JADX INFO: Fake field, exist only in values array */
    Low(0.25f),
    /* JADX INFO: Fake field, exist only in values array */
    Medium(0.5f),
    /* JADX INFO: Fake field, exist only in values array */
    High(0.75f),
    /* JADX INFO: Fake field, exist only in values array */
    VeryHigh(0.9f),
    /* JADX INFO: Fake field, exist only in values array */
    Max(1.0f);
    

    /* renamed from: i  reason: collision with root package name */
    public final float f8219i;

    ScreenBrightnessLevel(float f10) {
        this.f8219i = f10;
    }
}

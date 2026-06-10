package com.airbnb.epoxy;

import com.airbnb.epoxy.ModelList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ControllerModelList extends ModelList {

    /* renamed from: k  reason: collision with root package name */
    public static final a f6587k = new a();

    /* loaded from: classes.dex */
    public class a implements ModelList.c {
    }

    public ControllerModelList(int i10) {
        super(i10);
        if (!this.f6591i) {
            this.f6591i = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }
}

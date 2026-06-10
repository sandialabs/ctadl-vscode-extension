package x4;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class w implements n4.d {

    /* renamed from: a  reason: collision with root package name */
    public final y4.a f18623a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.a f18624b;
    public final w4.t c;

    static {
        n4.g.f("WMFgUpdater");
    }

    public w(WorkDatabase workDatabase, v4.a aVar, y4.a aVar2) {
        this.f18624b = aVar;
        this.f18623a = aVar2;
        this.c = workDatabase.w();
    }
}

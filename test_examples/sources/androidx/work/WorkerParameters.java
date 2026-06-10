package androidx.work;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n4.l;
import n4.m;
import x4.w;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f6199a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6200b;
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public final y4.a f6201d;

    /* renamed from: e  reason: collision with root package name */
    public final m f6202e;

    /* renamed from: f  reason: collision with root package name */
    public final n4.d f6203f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f6204a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f6205b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, b bVar, List list, ExecutorService executorService, y4.a aVar, l lVar, w wVar) {
        this.f6199a = uuid;
        this.f6200b = bVar;
        new HashSet(list);
        this.c = executorService;
        this.f6201d = aVar;
        this.f6202e = lVar;
        this.f6203f = wVar;
    }
}

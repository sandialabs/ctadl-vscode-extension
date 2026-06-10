package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class h extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.h f4999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5000b;

    public h(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4999a = hVar;
        this.f5000b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5000b;
        try {
            this.f4999a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5000b;
        try {
            this.f4999a.b(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

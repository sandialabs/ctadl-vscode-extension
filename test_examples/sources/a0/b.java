package a0;

import androidx.compose.foundation.text.TextController;
import androidx.compose.foundation.text.TextState;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import j1.h;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public long f3a;

    /* renamed from: b  reason: collision with root package name */
    public long f4b;
    public final /* synthetic */ TextController c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0.c f5d;

    public b(TextController textController, b0.c cVar) {
        this.c = textController;
        this.f5d = cVar;
        long j2 = u0.c.f17721b;
        this.f3a = j2;
        this.f4b = j2;
    }

    @Override // a0.d
    public final void a() {
        long j2 = this.c.f2103a.f2119b;
        b0.c cVar = this.f5d;
        if (SelectionRegistrarKt.a(cVar, j2)) {
            cVar.a();
        }
    }

    @Override // a0.d
    public final void b(long j2) {
        TextController textController = this.c;
        h hVar = textController.f2103a.f2120d;
        TextState textState = textController.f2103a;
        b0.c cVar = this.f5d;
        if (hVar != null) {
            if (!hVar.P()) {
                return;
            }
            if (TextController.d(textController, j2, j2)) {
                long j10 = textState.f2119b;
                cVar.h();
            } else {
                cVar.i();
            }
            this.f3a = j2;
        }
        if (!SelectionRegistrarKt.a(cVar, textState.f2119b)) {
            return;
        }
        this.f4b = u0.c.f17721b;
    }

    @Override // a0.d
    public final void c(long j2) {
        TextController textController = this.c;
        h hVar = textController.f2103a.f2120d;
        if (hVar == null || !hVar.P()) {
            return;
        }
        long j10 = textController.f2103a.f2119b;
        b0.c cVar = this.f5d;
        if (!SelectionRegistrarKt.a(cVar, j10)) {
            return;
        }
        long f10 = u0.c.f(this.f4b, j2);
        this.f4b = f10;
        long f11 = u0.c.f(this.f3a, f10);
        if (!TextController.d(textController, this.f3a, f11) && cVar.j()) {
            this.f3a = f11;
            this.f4b = u0.c.f17721b;
        }
    }

    @Override // a0.d
    public final void onCancel() {
        long j2 = this.c.f2103a.f2119b;
        b0.c cVar = this.f5d;
        if (SelectionRegistrarKt.a(cVar, j2)) {
            cVar.a();
        }
    }
}

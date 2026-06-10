package b6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import b6.n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends n.f {
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f6467d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.f6467d = matrix;
    }

    @Override // b6.n.f
    public final void a(Matrix matrix, a6.a aVar, int i10, Canvas canvas) {
        for (n.f fVar : this.c) {
            fVar.a(this.f6467d, aVar, i10, canvas);
        }
    }
}

package w2;

import java.util.ArrayList;
import w2.j;

/* loaded from: classes.dex */
public final class i implements z2.a<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18278a;

    public i(String str) {
        this.f18278a = str;
    }

    @Override // z2.a
    public final void accept(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.c) {
            p.h<String, ArrayList<z2.a<j.a>>> hVar = j.f18281d;
            ArrayList<z2.a<j.a>> orDefault = hVar.getOrDefault(this.f18278a, null);
            if (orDefault != null) {
                hVar.remove(this.f18278a);
                for (int i10 = 0; i10 < orDefault.size(); i10++) {
                    orDefault.get(i10).accept(aVar2);
                }
            }
        }
    }
}

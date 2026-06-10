package q0;

import androidx.compose.ui.node.NodeCoordinator;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f16823g = 0;

    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ a f16824i = new a();

        @Override // q0.d
        public final d Z(d dVar) {
            g.f(dVar, "other");
            return dVar;
        }

        @Override // q0.d
        public final <R> R h0(R r3, p<? super R, ? super b, ? extends R> pVar) {
            g.f(pVar, "operation");
            return r3;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // q0.d
        public final boolean x(l<? super b, Boolean> lVar) {
            g.f(lVar, "predicate");
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b extends d {
    }

    /* loaded from: classes.dex */
    public static abstract class c implements l1.b {

        /* renamed from: i  reason: collision with root package name */
        public final c f16825i = this;

        /* renamed from: j  reason: collision with root package name */
        public int f16826j;

        /* renamed from: k  reason: collision with root package name */
        public int f16827k;

        /* renamed from: l  reason: collision with root package name */
        public c f16828l;

        /* renamed from: m  reason: collision with root package name */
        public c f16829m;
        public NodeCoordinator n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f16830o;

        @Override // l1.b
        public final c e() {
            return this.f16825i;
        }

        public final void p() {
            if (!this.f16830o) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(this.n != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            s();
            this.f16830o = false;
        }

        public void q() {
        }

        public void s() {
        }
    }

    d Z(d dVar);

    <R> R h0(R r3, p<? super R, ? super b, ? extends R> pVar);

    boolean x(l<? super b, Boolean> lVar);
}

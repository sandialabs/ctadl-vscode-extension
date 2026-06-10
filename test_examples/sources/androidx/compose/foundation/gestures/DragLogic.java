package androidx.compose.foundation.gestures;

import g0.g0;
import ja.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import t.a;
import u.j;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class DragLogic {

    /* renamed from: a  reason: collision with root package name */
    public final q<x, u0.c, p7.c<? super n>, Object> f1677a;

    /* renamed from: b  reason: collision with root package name */
    public final q<x, Float, p7.c<? super n>, Object> f1678b;
    public final g0<u.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1679d;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(q<? super x, ? super u0.c, ? super p7.c<? super n>, ? extends Object> qVar, q<? super x, ? super Float, ? super p7.c<? super n>, ? extends Object> qVar2, g0<u.b> g0Var, j jVar) {
        g.f(qVar, "onDragStarted");
        g.f(qVar2, "onDragStopped");
        g.f(g0Var, "dragStartInteraction");
        this.f1677a = qVar;
        this.f1678b = qVar2;
        this.c = g0Var;
        this.f1679d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x xVar, p7.c<? super n> cVar) {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        DragLogic dragLogic;
        Float f10;
        if (cVar instanceof DragLogic$processDragCancel$1) {
            dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1) cVar;
            int i11 = dragLogic$processDragCancel$1.f1683p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragCancel$1.f1683p = i11 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragCancel$1.n;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragLogic$processDragCancel$1.f1683p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = dragLogic$processDragCancel$1.f1681m;
                    dragLogic = dragLogic$processDragCancel$1.f1680l;
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    u.b value = this.c.getValue();
                    if (value != null) {
                        j jVar = this.f1679d;
                        if (jVar != null) {
                            u.a aVar = new u.a(value);
                            dragLogic$processDragCancel$1.f1680l = this;
                            dragLogic$processDragCancel$1.f1681m = xVar;
                            dragLogic$processDragCancel$1.f1683p = 1;
                            if (jVar.a(aVar, dragLogic$processDragCancel$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        f10 = new Float(0.0f);
                        dragLogic$processDragCancel$1.f1680l = null;
                        dragLogic$processDragCancel$1.f1681m = null;
                        dragLogic$processDragCancel$1.f1683p = 2;
                        if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragCancel$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return n.f16010a;
                    }
                }
                dragLogic.c.setValue(null);
                f10 = new Float(0.0f);
                dragLogic$processDragCancel$1.f1680l = null;
                dragLogic$processDragCancel$1.f1681m = null;
                dragLogic$processDragCancel$1.f1683p = 2;
                if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragCancel$1) == coroutineSingletons) {
                }
                return n.f16010a;
            }
        }
        dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, cVar);
        Object obj2 = dragLogic$processDragCancel$1.n;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragLogic$processDragCancel$1.f1683p;
        if (i10 == 0) {
        }
        dragLogic.c.setValue(null);
        f10 = new Float(0.0f);
        dragLogic$processDragCancel$1.f1680l = null;
        dragLogic$processDragCancel$1.f1681m = null;
        dragLogic$processDragCancel$1.f1683p = 2;
        if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragCancel$1) == coroutineSingletons) {
        }
        return n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x xVar, a.c cVar, p7.c<? super n> cVar2) {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        DragLogic dragLogic;
        j jVar;
        u.b bVar;
        j jVar2;
        DragLogic dragLogic2;
        x xVar2;
        u.b bVar2;
        u0.c cVar3;
        if (cVar2 instanceof DragLogic$processDragStart$1) {
            dragLogic$processDragStart$1 = (DragLogic$processDragStart$1) cVar2;
            int i11 = dragLogic$processDragStart$1.f1689r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStart$1.f1689r = i11 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStart$1.f1687p;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragLogic$processDragStart$1.f1689r;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                m0.b.n1(obj);
                                return n.f16010a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = dragLogic$processDragStart$1.f1686o;
                        cVar = dragLogic$processDragStart$1.n;
                        xVar2 = dragLogic$processDragStart$1.f1685m;
                        dragLogic2 = dragLogic$processDragStart$1.f1684l;
                        m0.b.n1(obj);
                        bVar = bVar2;
                        xVar = xVar2;
                        dragLogic = dragLogic2;
                        dragLogic.c.setValue(bVar);
                        cVar3 = new u0.c(cVar.f17535a);
                        dragLogic$processDragStart$1.f1684l = null;
                        dragLogic$processDragStart$1.f1685m = null;
                        dragLogic$processDragStart$1.n = null;
                        dragLogic$processDragStart$1.f1686o = null;
                        dragLogic$processDragStart$1.f1689r = 3;
                        if (dragLogic.f1677a.O(xVar, cVar3, dragLogic$processDragStart$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return n.f16010a;
                    }
                    cVar = dragLogic$processDragStart$1.n;
                    xVar = dragLogic$processDragStart$1.f1685m;
                    dragLogic = dragLogic$processDragStart$1.f1684l;
                    m0.b.n1(obj);
                } else {
                    m0.b.n1(obj);
                    u.b value = this.c.getValue();
                    if (value != null && (jVar = this.f1679d) != null) {
                        u.a aVar = new u.a(value);
                        dragLogic$processDragStart$1.f1684l = this;
                        dragLogic$processDragStart$1.f1685m = xVar;
                        dragLogic$processDragStart$1.n = cVar;
                        dragLogic$processDragStart$1.f1689r = 1;
                        if (jVar.a(aVar, dragLogic$processDragStart$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    dragLogic = this;
                }
                bVar = new u.b();
                jVar2 = dragLogic.f1679d;
                if (jVar2 != null) {
                    dragLogic$processDragStart$1.f1684l = dragLogic;
                    dragLogic$processDragStart$1.f1685m = xVar;
                    dragLogic$processDragStart$1.n = cVar;
                    dragLogic$processDragStart$1.f1686o = bVar;
                    dragLogic$processDragStart$1.f1689r = 2;
                    if (jVar2.a(bVar, dragLogic$processDragStart$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dragLogic2 = dragLogic;
                    xVar2 = xVar;
                    bVar2 = bVar;
                    bVar = bVar2;
                    xVar = xVar2;
                    dragLogic = dragLogic2;
                }
                dragLogic.c.setValue(bVar);
                cVar3 = new u0.c(cVar.f17535a);
                dragLogic$processDragStart$1.f1684l = null;
                dragLogic$processDragStart$1.f1685m = null;
                dragLogic$processDragStart$1.n = null;
                dragLogic$processDragStart$1.f1686o = null;
                dragLogic$processDragStart$1.f1689r = 3;
                if (dragLogic.f1677a.O(xVar, cVar3, dragLogic$processDragStart$1) == coroutineSingletons) {
                }
                return n.f16010a;
            }
        }
        dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, cVar2);
        Object obj2 = dragLogic$processDragStart$1.f1687p;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragLogic$processDragStart$1.f1689r;
        if (i10 == 0) {
        }
        bVar = new u.b();
        jVar2 = dragLogic.f1679d;
        if (jVar2 != null) {
        }
        dragLogic.c.setValue(bVar);
        cVar3 = new u0.c(cVar.f17535a);
        dragLogic$processDragStart$1.f1684l = null;
        dragLogic$processDragStart$1.f1685m = null;
        dragLogic$processDragStart$1.n = null;
        dragLogic$processDragStart$1.f1686o = null;
        dragLogic$processDragStart$1.f1689r = 3;
        if (dragLogic.f1677a.O(xVar, cVar3, dragLogic$processDragStart$1) == coroutineSingletons) {
        }
        return n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(x xVar, a.d dVar, p7.c<? super n> cVar) {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        DragLogic dragLogic;
        Float f10;
        if (cVar instanceof DragLogic$processDragStop$1) {
            dragLogic$processDragStop$1 = (DragLogic$processDragStop$1) cVar;
            int i11 = dragLogic$processDragStop$1.f1694q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStop$1.f1694q = i11 - Integer.MIN_VALUE;
                Object obj = dragLogic$processDragStop$1.f1692o;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = dragLogic$processDragStop$1.f1694q;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.d dVar2 = dragLogic$processDragStop$1.n;
                    x xVar2 = dragLogic$processDragStop$1.f1691m;
                    dragLogic = dragLogic$processDragStop$1.f1690l;
                    m0.b.n1(obj);
                    dVar = dVar2;
                    xVar = xVar2;
                } else {
                    m0.b.n1(obj);
                    u.b value = this.c.getValue();
                    if (value != null) {
                        j jVar = this.f1679d;
                        if (jVar != null) {
                            u.c cVar2 = new u.c(value);
                            dragLogic$processDragStop$1.f1690l = this;
                            dragLogic$processDragStop$1.f1691m = xVar;
                            dragLogic$processDragStop$1.n = dVar;
                            dragLogic$processDragStop$1.f1694q = 1;
                            if (jVar.a(cVar2, dragLogic$processDragStop$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        dragLogic = this;
                    } else {
                        dragLogic = this;
                        f10 = new Float(dVar.f17536a);
                        dragLogic$processDragStop$1.f1690l = null;
                        dragLogic$processDragStop$1.f1691m = null;
                        dragLogic$processDragStop$1.n = null;
                        dragLogic$processDragStop$1.f1694q = 2;
                        if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragStop$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return n.f16010a;
                    }
                }
                dragLogic.c.setValue(null);
                f10 = new Float(dVar.f17536a);
                dragLogic$processDragStop$1.f1690l = null;
                dragLogic$processDragStop$1.f1691m = null;
                dragLogic$processDragStop$1.n = null;
                dragLogic$processDragStop$1.f1694q = 2;
                if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragStop$1) == coroutineSingletons) {
                }
                return n.f16010a;
            }
        }
        dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, cVar);
        Object obj2 = dragLogic$processDragStop$1.f1692o;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = dragLogic$processDragStop$1.f1694q;
        if (i10 == 0) {
        }
        dragLogic.c.setValue(null);
        f10 = new Float(dVar.f17536a);
        dragLogic$processDragStop$1.f1690l = null;
        dragLogic$processDragStop$1.f1691m = null;
        dragLogic$processDragStop$1.n = null;
        dragLogic$processDragStop$1.f1694q = 2;
        if (dragLogic.f1678b.O(xVar, f10, dragLogic$processDragStop$1) == coroutineSingletons) {
        }
        return n.f16010a;
    }
}

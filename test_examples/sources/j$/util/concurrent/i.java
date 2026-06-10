package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends AbstractC0263b implements Iterator, Enumeration, j$.util.Iterator {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f12145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(mVarArr, i10, i11, concurrentHashMap);
        this.f12145k = i12;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f12145k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f12145k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.f12145k) {
            case 0:
                m mVar = this.f12157b;
                if (mVar != null) {
                    this.f12140j = mVar;
                    e();
                    return mVar.f12151b;
                }
                throw new NoSuchElementException();
            default:
                m mVar2 = this.f12157b;
                if (mVar2 != null) {
                    Object obj = mVar2.c;
                    this.f12140j = mVar2;
                    e();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f12145k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}

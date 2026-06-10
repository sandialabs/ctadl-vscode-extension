package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import q3.a;
import q3.g;
import v8.f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1027a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1028b;

    public /* synthetic */ m() {
        this.f1027a = new LinkedHashMap();
        this.f1028b = new LinkedHashMap();
    }

    public /* synthetic */ m(EditText editText) {
        this.f1027a = editText;
        this.f1028b = new q3.a(editText);
    }

    public /* synthetic */ m(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        f.a aVar = v8.f.f18187a;
        this.f1027a = lazyJavaPackageFragmentProvider;
        this.f1028b = aVar;
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((q3.a) this.f1028b).f16894a.getClass();
            if (!(keyListener instanceof q3.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new q3.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1027a).getContext().obtainStyledAttributes(attributeSet, a1.b.f50s, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        q3.a aVar = (q3.a) this.f1028b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0212a c0212a = aVar.f16894a;
        c0212a.getClass();
        if (!(inputConnection instanceof q3.c)) {
            return new q3.c(c0212a.f16895a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void d(androidx.compose.material.ripple.a aVar) {
        v7.g.f(aVar, "indicationInstance");
        Object obj = this.f1027a;
        d0.f fVar = (d0.f) ((Map) obj).get(aVar);
        if (fVar != null) {
            androidx.compose.material.ripple.a aVar2 = (androidx.compose.material.ripple.a) ((Map) this.f1028b).remove(fVar);
        }
        ((Map) obj).remove(aVar);
    }

    public final l8.b e(b9.g gVar) {
        MemberScope memberScope;
        l8.d dVar;
        h9.c e10 = gVar.e();
        if (e10 != null) {
            gVar.D();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a A = gVar.A();
        if (A != null) {
            l8.b e11 = e(A);
            if (e11 != null) {
                memberScope = e11.w0();
            } else {
                memberScope = null;
            }
            if (memberScope != null) {
                dVar = memberScope.e(gVar.getName(), NoLookupLocation.FROM_JAVA_LOADER);
            } else {
                dVar = null;
            }
            if (!(dVar instanceof l8.b)) {
                return null;
            }
            return (l8.b) dVar;
        } else if (e10 == null) {
            return null;
        } else {
            h9.c e12 = e10.e();
            v7.g.e(e12, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) kotlin.collections.c.p2(((LazyJavaPackageFragmentProvider) this.f1027a).a(e12));
            if (lazyJavaPackageFragment == null) {
                return null;
            }
            LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.f13766r.f13711d;
            lazyJavaPackageScope.getClass();
            return lazyJavaPackageScope.v(gVar.getName(), gVar);
        }
    }

    public final void f(boolean z10) {
        q3.g gVar = ((q3.a) this.f1028b).f16894a.f16896b;
        if (gVar.f16914l != z10) {
            if (gVar.f16913k != null) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                g.a aVar = gVar.f16913k;
                a10.getClass();
                v8.b.m(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f4982a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f4983b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            gVar.f16914l = z10;
            if (z10) {
                q3.g.a(gVar.f16911i, androidx.emoji2.text.f.a().b());
            }
        }
    }
}

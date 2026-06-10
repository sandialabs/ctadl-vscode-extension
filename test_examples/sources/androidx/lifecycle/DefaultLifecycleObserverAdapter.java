package androidx.lifecycle;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/o;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements o {

    /* renamed from: i  reason: collision with root package name */
    public final e f5310i;

    /* renamed from: j  reason: collision with root package name */
    public final o f5311j;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5312a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5312a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(e eVar, o oVar) {
        v7.g.f(eVar, "defaultLifecycleObserver");
        this.f5310i = eVar;
        this.f5311j = oVar;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        int i10 = a.f5312a[event.ordinal()];
        e eVar = this.f5310i;
        switch (i10) {
            case 1:
                eVar.d(qVar);
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                eVar.m(qVar);
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                eVar.b(qVar);
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                eVar.h(qVar);
                break;
            case 5:
                eVar.v(qVar);
                break;
            case 6:
                eVar.onDestroy(qVar);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        o oVar = this.f5311j;
        if (oVar != null) {
            oVar.f(qVar, event);
        }
    }
}

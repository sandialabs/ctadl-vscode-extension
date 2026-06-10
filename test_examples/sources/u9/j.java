package u9;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17929a = new a();

    /* loaded from: classes.dex */
    public static class a implements j {
        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // u9.j
        public final void b(o8.b bVar, ArrayList arrayList) {
            if (bVar != null) {
                return;
            }
            a(0);
            throw null;
        }

        @Override // u9.j
        public final void g(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor != null) {
                return;
            }
            a(2);
            throw null;
        }
    }

    void b(o8.b bVar, ArrayList arrayList);

    void g(CallableMemberDescriptor callableMemberDescriptor);
}

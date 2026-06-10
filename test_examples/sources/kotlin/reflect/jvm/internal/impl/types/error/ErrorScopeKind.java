package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes.dex */
public enum ErrorScopeKind {
    f15008j("No member resolution should be done on captured type, it used only during constraint system resolution"),
    f15009k("Scope for integer literal type (%s)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("Error scope for erased receiver type"),
    f15010l("Scope for abbreviation %s"),
    f15011m("Scope for stub type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("A scope for common supertype which is not a normal classifier"),
    n("Scope for error type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("Scope for unsupported type %s"),
    f15012o("Error scope for class %s with arguments: %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF111("Error resolution candidate for call %s");
    

    /* renamed from: i  reason: collision with root package name */
    public final String f15014i;

    ErrorScopeKind(String str) {
        this.f15014i = str;
    }
}

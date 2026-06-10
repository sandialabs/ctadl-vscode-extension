package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public final class StartedLazily implements s {
    @Override // kotlinx.coroutines.flow.s
    public final b<SharingCommand> a(u<Integer> uVar) {
        return new n(new StartedLazily$command$1(uVar, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}

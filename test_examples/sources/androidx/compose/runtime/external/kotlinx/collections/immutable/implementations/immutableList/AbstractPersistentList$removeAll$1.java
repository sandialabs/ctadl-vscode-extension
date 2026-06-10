package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AbstractPersistentList$removeAll$1 extends Lambda implements l<E, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Collection<E> f2877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPersistentList$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.f2877j = collection;
    }

    @Override // u7.l
    public final Boolean U(Object obj) {
        return Boolean.valueOf(this.f2877j.contains(obj));
    }
}

package y3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import y3.d;

/* loaded from: classes.dex */
public interface e extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f18826a = 0;

        /* renamed from: y3.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0244a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f18827a;

            public C0244a(IBinder iBinder) {
                this.f18827a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f18827a;
            }

            @Override // y3.e
            public final int b(d dVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(dVar);
                    obtain.writeString(str);
                    this.f18827a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // y3.e
            public final void c(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f18827a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 != 1598968902) {
                d dVar = null;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        ((MultiInstanceInvalidationService.a) this).c(parcel.readInt(), parcel.createStringArray());
                    } else {
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                                dVar = (d) queryLocalInterface;
                            } else {
                                dVar = new d.a.C0243a(readStrongBinder);
                            }
                        }
                        int readInt = parcel.readInt();
                        v7.g.f(dVar, "callback");
                        MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                        synchronized (multiInstanceInvalidationService.f6023k) {
                            multiInstanceInvalidationService.f6023k.unregister(dVar);
                            String str = (String) multiInstanceInvalidationService.f6022j.remove(Integer.valueOf(readInt));
                        }
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof d)) {
                            dVar = (d) queryLocalInterface2;
                        } else {
                            dVar = new d.a.C0243a(readStrongBinder2);
                        }
                    }
                    int b5 = ((MultiInstanceInvalidationService.a) this).b(dVar, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b5);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int b(d dVar, String str);

    void c(int i10, String[] strArr);
}

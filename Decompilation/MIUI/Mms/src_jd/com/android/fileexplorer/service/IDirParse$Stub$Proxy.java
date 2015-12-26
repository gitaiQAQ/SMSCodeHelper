package com.android.fileexplorer.service;

import android.os.IBinder;

class IDirParse$Stub$Proxy
  implements IDirParse
{
  private IBinder mRemote;
  
  IDirParse$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  /* Error */
  public void queryDirInfo(java.util.List<String> paramList, IQueryCallBack paramIQueryCallBack)
    throws android.os.RemoteException
  {
    // Byte code:
    //   0: invokestatic 32	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 32	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 34
    //   12: invokevirtual 38	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: aload_1
    //   17: invokevirtual 42	android/os/Parcel:writeStringList	(Ljava/util/List;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_2
    //   25: invokeinterface 46 1 0
    //   30: astore_1
    //   31: aload_3
    //   32: aload_1
    //   33: invokevirtual 49	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: getfield 19	com/android/fileexplorer/service/IDirParse$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   40: iconst_1
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 55 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 58	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 61	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 61	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aconst_null
    //   67: astore_1
    //   68: goto -37 -> 31
    //   71: astore_1
    //   72: aload 4
    //   74: invokevirtual 61	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: invokevirtual 61	android/os/Parcel:recycle	()V
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	Proxy
    //   0	83	1	paramList	java.util.List<String>
    //   0	83	2	paramIQueryCallBack	IQueryCallBack
    //   3	75	3	localParcel1	android.os.Parcel
    //   7	66	4	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   9	20	71	finally
    //   24	31	71	finally
    //   31	56	71	finally
  }
}

/* Location:
 * Qualified Name:     com.android.fileexplorer.service.IDirParse.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
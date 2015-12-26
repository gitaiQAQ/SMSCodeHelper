import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.android.mms.MmsApp;
import com.android.mms.TempFileProvider;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.Executor;

public class abm
  extends zh
{
  public static int e;
  private static Bitmap i;
  private static Bitmap j;
  private static Bitmap k;
  private final aay<Uri, Bitmap> f = new aay(8, 16, 0.75F, true);
  private final Context g;
  private zx h;
  
  public abm(Context paramContext)
  {
    super(paramContext);
    g = paramContext;
    i = BitmapFactory.decodeResource(paramContext.getResources(), 2130838200);
    j = BitmapFactory.decodeResource(paramContext.getResources(), 2130838190);
    k = BitmapFactory.decodeResource(paramContext.getResources(), 2130837719);
    e = paramContext.getResources().getDimensionPixelSize(2131559301);
  }
  
  private zz a(Uri paramUri, boolean paramBoolean1, zy<abm.a> paramzy, boolean paramBoolean2)
  {
    boolean bool3 = true;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    Bitmap localBitmap = (Bitmap)f.a(paramUri);
    boolean bool1;
    boolean bool4;
    boolean bool2;
    if (localBitmap != null)
    {
      bool1 = true;
      bool4 = a.contains(paramUri);
      if ((bool1) || (bool4)) {
        break label199;
      }
      bool2 = true;
      label61:
      if (paramzy == null) {
        break label205;
      }
    }
    for (;;)
    {
      if (Log.isLoggable("Mms:thumbnailcache", 3)) {
        Log.v("ThumbnailManager", "getThumbnail mThumbnailCache.get for uri: " + paramUri + " thumbnail: " + localBitmap + " callback: " + paramzy + " thumbnailExists: " + bool1 + " taskExists: " + bool4 + " newTaskRequired: " + bool2 + " callbackRequired: " + bool3);
      }
      if (!bool1) {
        break label211;
      }
      if (bool3) {
        paramzy.a(new abm.a(localBitmap, paramBoolean1), null);
      }
      return new aam();
      bool1 = false;
      break;
      label199:
      bool2 = false;
      break label61;
      label205:
      bool3 = false;
    }
    label211:
    if (bool3) {
      a(paramUri, paramzy);
    }
    if (bool2)
    {
      a.add(paramUri);
      paramUri = new abm.b(paramUri, paramBoolean1, paramBoolean2);
      c.execute(paramUri);
    }
    return new abn(this, paramzy);
  }
  
  private void h()
  {
    if (i == null) {
      i = BitmapFactory.decodeResource(MmsApp.c().getResources(), 2130838200);
    }
    if (j == null) {
      j = BitmapFactory.decodeResource(MmsApp.c().getResources(), 2130838190);
    }
    if (k == null) {
      k = BitmapFactory.decodeResource(MmsApp.c().getResources(), 2130837719);
    }
  }
  
  private zx i()
  {
    try
    {
      if (h == null) {
        h = new zx(g);
      }
      zx localzx = h;
      return localzx;
    }
    finally {}
  }
  
  public zz a(Uri paramUri, zy<abm.a> paramzy, boolean paramBoolean)
  {
    return a(paramUri, false, paramzy, paramBoolean);
  }
  
  public void a()
  {
    super.a();
    if (i != null)
    {
      i.recycle();
      i = null;
    }
    if (j != null)
    {
      j.recycle();
      j = null;
    }
    if (k != null)
    {
      k.recycle();
      k = null;
    }
  }
  
  public void a(Uri paramUri)
  {
    if (Log.isLoggable("ThumbnailManager", 3)) {
      Log.d("ThumbnailManager", "removeThumbnail: " + paramUri);
    }
    if (paramUri != null) {
      f.b(paramUri);
    }
  }
  
  public zz b(Uri paramUri, zy<abm.a> paramzy)
  {
    return a(paramUri, true, paramzy, false);
  }
  
  public void b()
  {
    try
    {
      super.b();
      f.a();
      d();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String c()
  {
    return "ThumbnailManager";
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 189	abm:h	Lzx;
    //   6: ifnonnull +13 -> 19
    //   9: aload_0
    //   10: getfield 37	abm:g	Landroid/content/Context;
    //   13: invokestatic 223	zk:a	(Landroid/content/Context;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: invokespecial 178	abm:i	()Lzx;
    //   23: invokevirtual 224	zx:a	()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 189	abm:h	Lzx;
    //   31: goto -15 -> 16
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	abm
    //   34	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	34	finally
    //   19	31	34	finally
  }
  
  public static class a
  {
    public final Bitmap a;
    public final boolean b;
    
    public a(Bitmap paramBitmap, boolean paramBoolean)
    {
      a = paramBitmap;
      b = paramBoolean;
    }
  }
  
  public class b
    implements Runnable
  {
    private final Uri b;
    private final boolean c;
    private final boolean d;
    
    public b(Uri paramUri, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramUri == null) {
        throw new NullPointerException();
      }
      b = paramUri;
      c = paramBoolean1;
      d = paramBoolean2;
    }
    
    private int a(double paramDouble1, double paramDouble2)
    {
      if (paramDouble2 > paramDouble1) {}
      int i;
      for (;;)
      {
        i = (int)paramDouble1;
        if (i > 1) {
          break;
        }
        return 1;
        paramDouble1 = paramDouble2;
      }
      if (i <= 8) {
        return a(i);
      }
      return i / 8 * 8;
    }
    
    private int a(int paramInt)
    {
      if (paramInt <= 0) {
        throw new IllegalArgumentException();
      }
      return Integer.highestOneBit(paramInt);
    }
    
    /* Error */
    private Bitmap a()
    {
      // Byte code:
      //   0: new 49	android/media/MediaMetadataRetriever
      //   3: dup
      //   4: invokespecial 50	android/media/MediaMetadataRetriever:<init>	()V
      //   7: astore_1
      //   8: aload_1
      //   9: aload_0
      //   10: getfield 19	abm$b:a	Labm;
      //   13: invokestatic 53	abm:d	(Labm;)Landroid/content/Context;
      //   16: aload_0
      //   17: getfield 27	abm$b:b	Landroid/net/Uri;
      //   20: invokevirtual 57	android/media/MediaMetadataRetriever:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
      //   23: aload_1
      //   24: ldc2_w 58
      //   27: invokevirtual 63	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
      //   30: astore_2
      //   31: aload_1
      //   32: invokevirtual 66	android/media/MediaMetadataRetriever:release	()V
      //   35: aload_2
      //   36: areturn
      //   37: astore_2
      //   38: aload_1
      //   39: invokevirtual 66	android/media/MediaMetadataRetriever:release	()V
      //   42: aconst_null
      //   43: areturn
      //   44: astore_2
      //   45: aload_1
      //   46: invokevirtual 66	android/media/MediaMetadataRetriever:release	()V
      //   49: aload_2
      //   50: athrow
      //   51: astore_1
      //   52: aload_2
      //   53: areturn
      //   54: astore_1
      //   55: goto -13 -> 42
      //   58: astore_1
      //   59: goto -10 -> 49
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	62	0	this	b
      //   7	39	1	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
      //   51	1	1	localRuntimeException1	RuntimeException
      //   54	1	1	localRuntimeException2	RuntimeException
      //   58	1	1	localRuntimeException3	RuntimeException
      //   30	6	2	localBitmap1	Bitmap
      //   37	1	2	localRuntimeException4	RuntimeException
      //   44	9	2	localBitmap2	Bitmap
      // Exception table:
      //   from	to	target	type
      //   8	31	37	java/lang/RuntimeException
      //   8	31	44	finally
      //   31	35	51	java/lang/RuntimeException
      //   38	42	54	java/lang/RuntimeException
      //   45	49	58	java/lang/RuntimeException
    }
    
    private Bitmap a(double paramDouble1, double paramDouble2, Bitmap paramBitmap, int paramInt, boolean paramBoolean)
    {
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      if (paramDouble2 > paramDouble1)
      {
        j = (int)(paramInt * 1.0D * j / i);
        i = paramInt;
      }
      while ((i == paramBitmap.getWidth()) && (j == paramBitmap.getHeight()))
      {
        return paramBitmap;
        i = (int)(paramInt * 1.0D * i / j);
        j = paramInt;
      }
      float f = (float)(i * 1.0D / paramBitmap.getWidth());
      Bitmap localBitmap = Bitmap.createBitmap(i, j, b(paramBitmap));
      Canvas localCanvas = new Canvas(localBitmap);
      localCanvas.scale(f, f);
      localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, new Paint(6));
      if (paramBoolean) {
        paramBitmap.recycle();
      }
      return localBitmap;
    }
    
    private Bitmap a(Bitmap paramBitmap, float paramFloat, boolean paramBoolean)
    {
      int i = Math.round(paramBitmap.getWidth() * paramFloat);
      int j = Math.round(paramBitmap.getHeight() * paramFloat);
      if ((i == paramBitmap.getWidth()) && (j == paramBitmap.getHeight())) {
        return paramBitmap;
      }
      Bitmap localBitmap = Bitmap.createBitmap(i, j, b(paramBitmap));
      Canvas localCanvas = new Canvas(localBitmap);
      localCanvas.scale(paramFloat, paramFloat);
      localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, new Paint(6));
      if (paramBoolean) {
        paramBitmap.recycle();
      }
      return localBitmap;
    }
    
    private Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, paramBitmap.getWidth() - paramInt1 >> 1, paramBitmap.getHeight() - paramInt2 >> 1, paramInt1, paramInt2);
      if (localBitmap == null) {
        return paramBitmap;
      }
      paramBitmap.recycle();
      return localBitmap;
    }
    
    private Bitmap a(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
    {
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      float f = Math.min(paramInt / i, paramInt / j);
      if (f >= 1.0F) {
        return paramBitmap;
      }
      return a(paramBitmap, f, paramBoolean);
    }
    
    private Bitmap a(Uri paramUri, int paramInt)
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      inPreferredConfig = Bitmap.Config.ARGB_8888;
      return a(paramUri, localOptions, abm.e);
    }
    
    private Bitmap a(Uri paramUri, BitmapFactory.Options paramOptions, int paramInt)
    {
      BitmapFactory.Options localOptions = paramOptions;
      if (paramOptions == null) {
        localOptions = new BitmapFactory.Options();
      }
      int i = abp.a(abm.d(abm.this), paramUri);
      InputStream localInputStream;
      double d1;
      double d2;
      try
      {
        paramOptions = abm.d(abm.this).getContentResolver().openInputStream(paramUri);
        inJustDecodeBounds = true;
        BitmapFactory.decodeStream(paramOptions, null, localOptions);
        a(paramOptions);
      }
      catch (FileNotFoundException paramOptions)
      {
        label141:
        Log.e("ThumbnailManager", "Can't open uri: " + paramUri, paramOptions);
        return null;
      }
      try
      {
        localInputStream = abm.d(abm.this).getContentResolver().openInputStream(paramUri);
        d1 = outWidth * 1.0D / paramInt;
        d2 = outHeight * 1.0D / paramInt;
        inSampleSize = a(d1, d2);
        inJustDecodeBounds = false;
      }
      catch (FileNotFoundException paramOptions)
      {
        Log.e("ThumbnailManager", "Can't open uri: " + paramUri, paramOptions);
        return null;
      }
      try
      {
        paramOptions = BitmapFactory.decodeStream(localInputStream, null, localOptions);
        paramUri = paramOptions;
      }
      catch (OutOfMemoryError paramOptions)
      {
        Log.e("ThumbnailManager", "requestDecode " + paramUri + "-- " + paramOptions);
        a(localInputStream);
        paramUri = null;
        break label141;
      }
      finally
      {
        a(localInputStream);
      }
      if (paramUri == null) {
        return null;
      }
      paramOptions = a(a(d1, d2, paramUri, paramInt, true), paramInt, paramInt);
      paramUri = paramOptions;
      if (i != 1)
      {
        paramUri = paramOptions;
        if (i != 0) {
          paramUri = wd.a(paramOptions, i);
        }
      }
      return c(paramUri);
    }
    
    private Bitmap a(boolean paramBoolean)
    {
      Object localObject1 = null;
      zx localzx = abm.c(abm.this);
      String str = new zf(abm.d(abm.this), b).c();
      if (str == null) {
        return (Bitmap)localObject1;
      }
      boolean bool = TempFileProvider.a(str);
      if (!bool) {}
      for (localObject1 = localzx.a(str, 1);; localObject1 = null)
      {
        if (localObject1 != null)
        {
          localObject2 = new BitmapFactory.Options();
          inPreferredConfig = Bitmap.Config.ARGB_8888;
          localObject2 = a(a, b, a.length - b, (BitmapFactory.Options)localObject2);
          localObject1 = localObject2;
          if (localObject2 != null) {
            break;
          }
          Log.w("ThumbnailManager", "decode cached failed " + str);
          return (Bitmap)localObject2;
        }
        if (paramBoolean) {}
        for (localObject1 = a(); localObject1 == null; localObject1 = a(b, 1))
        {
          Log.w("ThumbnailManager", "decode orig failed " + str);
          return null;
        }
        if (paramBoolean) {}
        for (Object localObject2 = a((Bitmap)localObject1, abm.e, true);; localObject2 = localObject1)
        {
          localObject1 = localObject2;
          if (bool) {
            break;
          }
          localzx.a(str, 1, a((Bitmap)localObject2));
          return (Bitmap)localObject2;
        }
      }
    }
    
    private Bitmap a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
    {
      BitmapFactory.Options localOptions = paramOptions;
      if (paramOptions == null) {
        localOptions = new BitmapFactory.Options();
      }
      return c(BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2, localOptions));
    }
    
    private void a(Closeable paramCloseable)
    {
      if (paramCloseable == null) {
        return;
      }
      try
      {
        paramCloseable.close();
        return;
      }
      catch (Throwable paramCloseable)
      {
        Log.w("ThumbnailManager", "close fail", paramCloseable);
      }
    }
    
    private byte[] a(Bitmap paramBitmap)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    
    private Bitmap.Config b(Bitmap paramBitmap)
    {
      Bitmap.Config localConfig = paramBitmap.getConfig();
      paramBitmap = localConfig;
      if (localConfig == null) {
        paramBitmap = Bitmap.Config.ARGB_8888;
      }
      return paramBitmap;
    }
    
    private Bitmap c(Bitmap paramBitmap)
    {
      if ((paramBitmap == null) || (paramBitmap.getConfig() != null)) {
        return paramBitmap;
      }
      Bitmap localBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, false);
      paramBitmap.recycle();
      return localBitmap;
    }
    
    public void run()
    {
      Object localObject = null;
      try
      {
        Bitmap localBitmap = a(c);
        localObject = localBitmap;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          Log.e("ThumbnailManager", "Couldn't load bitmap for " + b, localIllegalArgumentException);
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        for (;;)
        {
          Log.e("ThumbnailManager", "Couldn't load bitmap for " + b, localOutOfMemoryError);
        }
      }
      d.post(new abo(this, (Bitmap)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     abm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
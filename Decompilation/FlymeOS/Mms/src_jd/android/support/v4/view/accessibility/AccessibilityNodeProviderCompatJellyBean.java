package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.List;

class AccessibilityNodeProviderCompatJellyBean
{
  public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge paramAccessibilityNodeInfoBridge)
  {
    return new AccessibilityNodeProviderCompatJellyBean.1(paramAccessibilityNodeInfoBridge);
  }
  
  static abstract interface AccessibilityNodeInfoBridge
  {
    public abstract Object createAccessibilityNodeInfo(int paramInt);
    
    public abstract List<Object> findAccessibilityNodeInfosByText(String paramString, int paramInt);
    
    public abstract boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.accessibility.AccessibilityNodeProviderCompatJellyBean
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.meizu.common.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class SubscribeButton$1
  implements ValueAnimator.AnimatorUpdateListener
{
  SubscribeButton$1(SubscribeButton paramSubscribeButton) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    SubscribeButton.access$000(this$0, f);
    this$0.invalidate();
  }
}

/* Location:
 * Qualified Name:     com.meizu.common.widget.SubscribeButton.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
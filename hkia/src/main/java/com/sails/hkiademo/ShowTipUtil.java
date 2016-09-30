package com.sails.hkiademo;


import android.app.Activity;
import android.content.Context;
import android.view.View;

import net.frederico.showtipsview.ShowTipsBuilder;
import net.frederico.showtipsview.ShowTipsView;

/**
 * 第一次启动应用的操作提示工具类
 */
public  class ShowTipUtil {
    private static int tipsBgColor = 0x6989BC;
    private static int tipsBgAlpha = 0x80;

    public static ShowTipsView shows(Context context, View view, String title, String des,int pot) {
        ShowTipsView showtips = new ShowTipsBuilder((Activity) context)
                .setTarget(view)//设置需要提示的控件
                .setTitle(title)//设置显示的提示标题
                .setDescription(des)//设置显示的具体提示信息
                .setDelay(1000)//设置进入界面后延迟时间显示提示
                .setBackgroundColor(tipsBgColor)//设置提示背景颜色
                .setBackgroundAlpha(tipsBgAlpha)//设置背景透明度
                .setButtonText("下一步")//设置GOIT即按钮的显示文本
                .displayOneTime(pot)//设置当前控件的shopTipsId，此id唯一不能重复，重复的话值显示第一次
                .build();
        showtips.show((Activity) context);//设置显示的界面
        return showtips;
    }
}
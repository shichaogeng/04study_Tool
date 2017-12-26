package com.gengsc.forkjoin.BaJie.impl;

import com.gengsc.forkjoin.service.IProcessTaoZi;
import com.gengsc.forkjoin.vo.PanTao;

/**
 * 动脑学院-Mark老师
 * 创建日期：2017/10/12
 * 创建时间: 16:38
 */
public class BaJieProcessImpl implements IProcessTaoZi {
    @Override
    public void processTaoZi(PanTao taoZi) {
        //看看桃子，一口吃了
        eat();
    }

    //看看桃子，一口吃了
    private void eat(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

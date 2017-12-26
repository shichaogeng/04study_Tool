package com.gengsc.forkjoin.BaJie.impl;


import com.gengsc.forkjoin.service.IPickTaoZi;
import com.gengsc.forkjoin.service.IProcessTaoZi;
import com.gengsc.forkjoin.vo.Color;
import com.gengsc.forkjoin.vo.PanTao;
import com.gengsc.forkjoin.vo.Size;

/**
 * 动脑学院-Mark老师
 * 创建日期：2017/10/12
 * 创建时间: 16:32
 */
public class BaJiePickImpl implements IPickTaoZi {

    private IProcessTaoZi processTaoZi;

    public BaJiePickImpl(IProcessTaoZi processTaoZi) {
        this.processTaoZi = processTaoZi;
    }

    @Override
    public boolean pick(PanTao[] src, int index) {
        if(src[index].getColor()== Color.RED&&
                src[index].getSize()== Size.BIG){
            processTaoZi.processTaoZi(src[index]);
            return true;
        }else{
            return false;
        }
    }
}

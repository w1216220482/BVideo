package demo.gl.eagleweb.xyz.recordlib.beauty.utils;

import android.content.Context;

import demo.gl.eagleweb.xyz.recordlib.beauty.filter.GPUImageFilter;
import demo.gl.eagleweb.xyz.recordlib.beauty.filter.MagicBeautyFilter;

public class MagicFilterFactory {

    private static int mFilterType = MagicFilterType.NONE;

    public static GPUImageFilter getFilters(int type, Context mContext) {
        mFilterType = type;
        switch (type) {
            case MagicFilterType.BEAUTY:// 美肤
                return new MagicBeautyFilter(mContext);
            default:
                return null;
        }
    }

    public int getFilterType() {
        return mFilterType;
    }
}

package org.smart4j.framework.util;

/**
 * 转型操作工具类
 * Created by szy on 2016/6/4.
 */
public class CastUtil {

    /**
     * 转为String型
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    /**
     * 转为String型（提供默认值）
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     */
    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj,0);
    }

    /**
     * 转为double型（提供默认值）
     */
    public static double castDouble(Object obj,double defaultValue){
        double doubleValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    doubleValue=Double.parseDouble(strValue);
                } catch(NumberFormatException e) {
                    e.printStackTrace();
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj){
        return CastUtil.castLong(obj, 0);
    }

    /**
     * 转为long型（提供默认值）
     */
    public static long castLong(Object obj,long defaultValue){
        long longValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    longValue = Long.parseLong(strValue);
                } catch(NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj, 0);
    }

    /**
     * 转为int型（提供默认值）
     */
    public static int castInt(Object obj,int defaultValue){
        int intValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    intValue = Integer.parseInt(strValue);
                } catch(NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为int型
     */
    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj, false);
    }

    /**
     * 转为int型（提供默认值）
     */
    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    booleanValue = Boolean.parseBoolean(strValue);
                } catch(NumberFormatException e) {
                    booleanValue = defaultValue;
                }
            }
        }
        return booleanValue;
    }

}

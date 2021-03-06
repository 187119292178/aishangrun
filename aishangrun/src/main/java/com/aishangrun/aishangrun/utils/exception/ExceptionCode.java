/**
 * CopyRight (c) 2016 北京好数科技有限公司 保留所有权利
 */

package com.aishangrun.aishangrun.utils.exception;

/**
 * 异常编码常量类
 *
 * @author zhangzhan
 * @version 1.0.0.2017年2月14日
 */
public class ExceptionCode {

    public static int SUCCESS = 0;

    /**
     * 系统操作异常码
     */
    public static int SYSTEM_ERROR = 500101; // 服务器繁忙，请稍后再试

    public static int SYSTEM_FILE_READ = 500101; // 读取文件错误

    public static int SYSTEM_DATE = 510101; // 日期解析错误

    public static int SYSTEM_STRING = 520101; // 字符串解析错误

    public static int SYSTEM_FILE_EXIST = 560501; // 文件不存在

    /**
     * 数据库操作异常码
     */
    public static int DB_SELECT = 500201; // 数据库查询错误

    public static int DB_INSERT = 510201; // 数据库保存错误

    public static int DB_UPDATE = 520201; // 数据库修改错误

    public static int DB_DELETE = 530201; // 数据库删除错误

    /**
     * 缓存操作异常码
     */
    public static int CACHE_SELECT = 500301; // Redis查询错误

    public static int CACHE_INSERT = 510301; // Redis保存错误

    public static int CACHE_DATA = 540301; // Redis取出数据转换错误

    /**
     * 消息操作异常码
     */
    public static int MQ_SEND = 500401; // 发送消息出错

    public static int MQ_LISTENER = 510401; // 接收消息出错

    /**
     * 转换错误
     */
    public static int PARSE_ERROR = 530101;

    /**
     * bean转vo错误
     */
    public static int BEAN_VO_ERROR = 530102;

    /**
     * 第三方系统错误
     */
    public static int HUAWEI_ERROR = 600001;
    
    public static int THIRD_SYS_ERROR = 600101;
    
    public static int THIRD_SYS_UPDATE = 600102;
    
    public static int THIRD_SYS_SELECT = 600103;
    
    public static int THIRD_SYS_INSERT = 600104;
    
    public static int THIRD_SYS_DELETE = 600105;
    
    public static int AUTH_EXCEPTION = 400105;
    
    // 未登录
    public static int UNLOGIN = 400102;
    
    // 没有权限
    public static int NO_PRIVILEGE = 400103;

    // 用户不存在
    public static int NOT_EXISTS_USER = 400100;

    // 密码不正确
    public static int INVALID_PASSWORD = 400101;
    
    // 证书过期
    public static int LINCENSE_EXPIRE = 400104;

    // 卡数量错误
    public static int INVALID_CARD_NUM = 400201;

    // 工单错误
    public static int WORKORDER_ERROR = 400202;

    // 余额不足
    public static int INVALID_BALANCE = 400203;

    // 通道api接口返回错误
    public static int CHANNEL_API_ERROR = 600001;

    // 调度错误
    public static int SCHEDULE_ERROR = 400300;

    // 平台错误
    public static int PLATFORM_ERROR = 400400;

    public static int CMANAGE_ERROR = 400500;

    public static int HMANAGE_ERROR = 400600;

    public static int RECHARGE_EXCEPTION = 400700;

    public static int WEBAUTH_EXCEPTION = 400800;

    public static int SECURITY_EXCEPTION = 400900;
    
    public static int DEVICE_EXCEPTION = 401000;

    

    /**
     * 提供第三方api接口错误
     */
    
    
    // 系统错误
    public static int COPEN_SYSTEM_ERROR = 700000;

    // 非此用户卡
    public static int COPEN_NOT_CUSTOMER_CARD = 7000001;

    // 输入卡号为空
    public static int COPEN_MSISDN_NULL = 7000002;
}

package net.age.chat;

import java.util.UUID;

/**
 * @Description: 常量
 * @author: <a href="http://www.xiaoyaoyou1212.com">DAWI</a>
 * @date: 16/9/18 20:36.
 */
public class ChatConstant {

    /*Message Type*/
    public static final int MESSAGE_ONLINE = 1; //新成员上线
    public static final int MESSAGE_OFFLINE = 2;//成员离线
    public static final int MESSAGE_NEW_MSG = 3;
    public static final int MESSAGE_NEW_MEDIA = 5;
    public static final int MESSAGE_SEND_MEDIA = 6;
    public static final int MESSAGE_CLEAR_EDIT = 4; //清楚输入框



    /*User Login State*/
    public static final int USER_NEW = 1; //新成员注册
    public static final int USER_LOGINED = 1; //用户已经登录

    public static final String APP_NAME  = "S/u\\N";
    public static final String NICK_NAME  = "REVENGE";
    public static final int VERSION_MAIN = 1;
    public static final int VERSION_SUB = 4;
    public static final String WELCOME = APP_NAME + "_" +VERSION_MAIN + "." + VERSION_SUB + "@" + NICK_NAME;


    /*界面*/
    public static final String SERVER_PROTOCOL = "ws://";
//    public static final String SERVER_ADDR = "192.168.3.176";
//    public static final int SERVER_PORT = 8887;

    public static final String SERVER_ADDR = "fyh520.cn";
    public static final int SERVER_PORT = 8888;


}

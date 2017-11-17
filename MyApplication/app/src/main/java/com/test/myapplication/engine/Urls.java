package com.test.myapplication.engine;

import static com.test.myapplication.App.EXTERNAL_RELEASE;

/**
 * Created by Administrator on 2016/1/20.
 */

public class Urls {

    public final static String PROTOCOL = "http";
    public static String WEB_SERVER_PATH = AppConstant.HOST;
    public final static String KEY = "android";

    public final static String GETCODE = "1001/" + KEY;//获取验证码
    public final static String LOGIN = "1002/" + KEY;//登录
    public final static String SETIMAGE = "1003/" + KEY;//上传图片
    public final static String CarouselFigure = "1009/" + KEY;//首页轮播图(不能用)
    //    public final static String HOTLIST_C = "1010/" + KEY;//热门列表(不能用)
    public final static String HOTLIST_C = "1174/" + KEY;//热门列表(不能用)
    public final static String SETPERSONINFO = "1004/" + KEY;//个人信息
    public final static String LIVECERTIFYINFO = "1109/" + KEY;//获取直播认证信息
    public final static String LIVECERTIFY = "1005/" + KEY;//直播认证
    public final static String CITYLISTDATA = "1146/" + KEY;//城市数据
    public final static String CITYLISTDATABUUXIAN = "1151/" + KEY;//:获取全部省市区(含不限) - 1151

    public final static String FIRSTGUANZHU = "1007/" + KEY;//首次登录关注列表
    public final static String FIRSTGUANZHU_ATTENTION = "1008/" + KEY;//添加关注 - 1008
    public final static String FRIENDLIST = "1025/" + KEY;//好友列表
    //    public final static String GETRONGTOKEN = "rong/token";//获取融云的token
    public final static String GETRONGTOKEN = "rong/dev-token";//获取融云的token 临时


    //    public final static String ATTENTION_PEOPLE = "1083/" + KEY;//关注经纪人首页(bunengyong)
    public final static String ATTENTION_PEOPLE = "1175/" + KEY;//关注经纪人首页
    public final static String ATTENTION_BROKERLIST = "1121/" + KEY;//经纪人列表/搜索经纪人列表(头像,昵称,地区,等级) - 1121
    //    public final static String ATTENTION_HOUSE = "1084/" + KEY;//关注房屋首页 - 1084(不能用)
    public final static String ATTENTION_HOUSE = "1176/" + KEY;//关注房屋首页 - 1084
    public final static String ATTENTION_HOUSELIST = "1122/" + KEY;//关注房屋列表/搜索房屋列表 - 1122
    public final static String ATTENTION_RENOW = "1085/" + KEY;//更新关注 (关注/取消关注)- 1085
    public final static String BROKER_CENTRE = "1014/" + KEY;//经纪人直播个人主页 - 1014
    //    public final static String CUSTOMS_CENTRE = "1141/" + KEY;//用户详情 - 1141
    public final static String SEARCH_ALL = "1123/" + KEY;//搜索全部 - 1123
    public final static String UPDATA_USER = "1135/" + KEY;//更新用户经纬度 - 1135
    public final static String BROKERHISTORY = "1015/" + KEY;//历史直播列表 - 1015
    public final static String SEND_REDPACKET = "1185/" + KEY;//主播直播中发红包 - 1185
    public final static String REDPACKET_STATE = "1187/" + KEY;//红包状态 - 1187
    public final static String REDPACKET_SHARE = "1188/" + KEY;//客户抢红包(分享朋友圈后回调) - 1188
    public final static String REDPACKET_INFO = "1190/" + KEY;//获取红包头信息 - 1190
    public final static String REDPACKET_INFO_CUSTOMER = "1191/" + KEY;//获取红包详情(客户) - 1191
    public final static String REDPACKET_INFO_AUTHOR = "1192/" + KEY;//获取红包详情(直播) - 1192


    public final static String LIVENEWHOUSELIST = "1038/" + KEY;//直播新房列表
    public final static String LIVENEWHOUSEINFO = "1039/" + KEY;//直播新房详情
    public final static String ADDLIVENEWHOUSE = "1035/" + KEY;//添加新房直播信息 - 1035
    public final static String LIVEOLDHOUSELIST = "1066/" + KEY;//直播二手房列表
    public final static String LIVEOLDHOUSEINFO = "1068/" + KEY;//直播二手房详情
    public final static String ADDLIVEOLDHOUSE = "1036/" + KEY;//添加二手房直播信息 - 1036
    public final static String LIVERENTHOUSELIST = "1067/" + KEY;//直播租房列表
    public final static String LIVERENTHOUSEINFO = "1069/" + KEY;//直播租房详情
    public final static String ADDLIVERENTHOUSE = "1037/" + KEY;//添加租房直播信息 - 1037
    public final static String DELLIVEHOUSELIST = "1051/" + KEY;//删除(租房/新房/二手房) - 1051
    public final static String STARTLIVE = "1095/" + KEY;//开始直播 - 1095
    public final static String STARTSHARELIVE = "1115/" + KEY;//直播初始化 - 1115
    public final static String COMELIVEROOM = "1106/" + KEY;//直播中客户进入直播 - 1106
    public final static String COMEHISTORY = "1183/" + KEY;//随机获取广告图片表中的id
    public final static String LEAVELIVEROOM = "1107/" + KEY;//直播中客户离开直播 - 1107
    public final static String LIVEROOMINFO = "1016/" + KEY;//直播详情页 - 1016
    public final static String LIVELINK = "1105/" + KEY;//直播中连麦 - 1105
    public final static String LIVELINK_agree = "1124/" + KEY;//主播同意连麦 - 1124
    public final static String LIVESENDGIFT = "1104/" + KEY;//直播中打赏 - 1104
    public final static String DELTELIVE = "1086/" + KEY;//删除视频 - 1086
    public final static String ACCUSATION = "1019/" + KEY;//添加举报 - 1019
    public final static String REFUSELIVE = "1142/" + KEY;//主播拒绝接听直播 - 1142
    public final static String CANCELLIVE = "1143/" + KEY;//客户取消呼出邀请 - 1143
    public final static String EXAMINELIVE = "1144/" + KEY;//检查客户是否取消邀请直播 - 1144
    public final static String HISTORYLIVE = "1145/" + KEY;//历史直播回放 - 1145
    public final static String HISTORYLIVE_CHAT = "1182/" + KEY;//历史直播回放消息 - 1182
    public final static String DINGFANGINFO = "1040/" + KEY;//查看订房信息 - 1040
    public final static String ENDLIVE = "1147/" + KEY;//主播结束直播 - 1147
    public final static String LIVESHARERETURN = "1064/" + KEY;//分享直播回调 - 1064
    public final static String SHARERETURN = "1094/" + KEY;//分享得賞銀回調 - 1094
    public final static String LIVELINKHTTP = "1152/" + KEY;//直播心跳 - 1152
    public final static String LINKEND = "1153/" + KEY;//结束连麦 - 1153
    public final static String LOGINAGREEMENT = "wap/agreement/" + KEY;//用户协议 h5 - wap/agreement
    public final static String HOUSERULES = "wap/agreement/" + KEY;//订房规则 h5 - wap/houserules
    public final static String ANCHOR_BUSY = "1159/" + KEY;//主播繁忙(弹出主播离开,马上回来...) - 1159
    public final static String ANCHOR_COME = "1160/" + KEY;//主播直播(取消主播离开,马上回来...) - 1160
    public final static String ANCHOR_LINEMESS = "1163/" + KEY;//主播中断对方连麦 - 1163
    public final static String LIVING_SHARE_CONTENT = "#/direct/";//直播分享

//    public final static String LIVING_SHARE = "http://odwap.7door.cc/#/direct/";//直播分享(测试)
//    public final static String LIVING_SHARE = "http://odwap.sevendoor.cn/#/direct/";//直播分享(正式)
//        public final static String LIVING_SHARE_WeChat = "http://oddev.7door.cc/wechat/live/home";//直播分享微信（测试）
//    public final static String LIVING_SHARE_WeChat = "http://odpro.sevendoor.cn/wechat/live/home";//直播分享微信（正式）
//        public final static  String TRAILER_SHARE_WeChat="http://oddev.sevendoor.cn/wxapp/prevue/";//预告详情分享网址(测试)
//    public final static String TRAILER_SHARE_WeChat = "http://odpro.sevendoor.cn/wxapp/prevue/";//预告详情分享网址(正式)

    public static String LIVING_SHARE = (EXTERNAL_RELEASE) ? "http://odwap.sevendoor.cn/#/direct/" : "http://odwap.7door.cc/#/direct/";
    public static String LIVING_SHARE_WeChat = (EXTERNAL_RELEASE) ? "http://odpro.sevendoor.cn/wechat/live/home" : "http://oddev.7door.cc/wechat/live/home";
    public static String TRAILER_SHARE_WeChat = (EXTERNAL_RELEASE) ? "http://odpro.sevendoor.cn/wxapp/prevue/" : "http://oddev.sevendoor.cn/wxapp/prevue/";

    /*******************************************
     * 地图
     ************************************************/
    public final static String MAP_FILTER = "1101/" + KEY;//邀请直播筛选
    public final static String INVITE_BROKER = "1087/" + KEY;//邀请经纪人直播
    public final static String GET_ADDRESS_CODE = "1110/" + KEY;//通过省市区获取id
    public final static String MAP_HOUSE = "1102/" + KEY;//地图找房屋
    public final static String HOUSE_FIND_LIVE = "1120/" + KEY;//房屋找直播
    public final static String LIVE_LIST = "1026/" + KEY;//受邀直播经纪人列表
    public final static String INVITE_LIVE_LIST = "1267/" + KEY;//客户查看受邀直播经纪人列表 - 1267
    /*****************************************************
     * 发布房源
     ***************************************************/
    public final static String FREE_SALE_HOUSE = "1127/" + KEY;//卖房
    public final static String FREE_RENT_HOUSE = "1128/" + KEY;//租房
    public final static String MY_DELEG = "1129/" + KEY;//我的委托
    public final static String DELEG_SALE_DETAIL = "1130/" + KEY;//我的委托

    public final static String DELEG_ACCEPT = "1136/" + KEY;//委托受理
    public final static String REFUSE = "1316/" + KEY;//拒绝接受委托


    /*******************************************
     * 消息
     ******************************************/
    public final static String BROKER_LIVE_TASK = "1074/" + KEY;//经纪人直播任务列表

    public final static String BROKER_LIVE_TASK_DETAIL = "1076/" + KEY;//经纪人任务直播详情

    public final static String BROKER_DELEG_TASK = "1133/" + KEY;//经纪人委托任务列表

    public final static String CAN_DELEG_BROKER = "1131/" + KEY;//可以委托经纪人

    public final static String CLOSE_DELEG = "1132/" + KEY;//关闭委托

    public final static String B_DELEG_TASK_DETAIL = "1134/" + KEY;//委托任务详情

    public final static String ACCEPT_LIVE = "1075/" + KEY;//接直播

    public final static String DELEG_OPERATE = "1137/" + KEY;//委托他

    /*******************************************
     * 个人中心
     ********************************************/
    public final static String GET_PERSON_INFO = "1027/" + KEY;//获取个人中心个人(客户)信息
    public final static String GET_BROKER_INFO = "1042/" + KEY;//获取个人中心个人(经纪人)信息


    public final static String APPOINTMENT_HOUSE = "1028/" + KEY;//预约看房(客户)
    public final static String C_APPOINTMENT_HOUSE_DETAIL = "1030/" + KEY;//预约看房详情(客户)

    public final static String B_APPOINTMENT_HOUSE = "1097/" + KEY;//预约看房（经纪人）
    public final static String APPOINTMENT_HOUSE_DETAIL = "1099/" + KEY;//预约看房详情（经纪人）
    public final static String CRESERVATION = "1029/" + KEY;//订房(客户)
    public final static String CRESERVATION_DETAIL = "1031/" + KEY;//订房订单详情(客户)
    public final static String RESERVATION_ORDER_DETAIL = "1126/" + KEY;//订房订单详情
    public final static String UPDATE_ORDER_STATUS = "1032/" + KEY;//修改订房订单
    public final static String EDIT_SELF_INFO = "1046/" + KEY;//客户编辑个人资料
    public final static String CUSTOMER_GET_INFO = "1065/" + KEY;//客户获取个人资
    public final static String EDITDINGFANG = "1017/" + KEY;//填写订房信息
    public final static String GETUSERINFO = "1119/" + KEY;//会话列表获取消息
    public final static String BROLERORDER = "1041/" + KEY;//经纪人订单页
    public final static String INVITEBROKERDETAIL = "1100/" + KEY;//订单详情(经纪人订房)
    public final static String DINGJIORDERDETAIL = "1088/" + KEY;//定金订单详情
    public final static String EDITKANFANG = "1018/" + KEY;//填写看房信息

    public final static String GET_PROVINCE = "1113/" + KEY;//获取省份
    public final static String GET_CITY = "1112/" + KEY;//通过id获取市、区
    public final static String RANR_HOUSE = "1116/" + KEY;//通过经纬度找房

    /*我的-----经纪人*/
    public final static String ADD_NEW_HOUSE = "1035/" + KEY;//添加新房
    public final static String ADD_OLD_HOUSE = "1036/" + KEY;//添加新房
    public final static String ADD_RENT_HOUSE = "1037/" + KEY;//添加租房
    public final static String NEW_HOUSE_LIST = "1038/" + KEY;//新房列表
    public final static String OLD_HOUSE_LIST = "1066/" + KEY;//二手房列表
    public final static String RENT_HOUSE_LIST = "1067/" + KEY;//租房列表
    public final static String EDIT_NEW_HOUSE = "1048/" + KEY;//新房编辑
    public final static String EDIT_OLD_HOUSE = "1049/" + KEY;//二手房编辑
    public final static String EDIT_RENT_HOUSE = "1050/" + KEY;//租房编辑
    public final static String HOUSE_DETAIL = "1103/" + KEY;//房屋详情

    public final static String DELETE_HOUSE_LIST = "1051/" + KEY;//删除（新房/租房/二手房）
    public final static String MONEYREWAR = "1043/" + KEY;//赏银 - 1043
    public final static String LEVEL = "1054/" + KEY;//等级
    public final static String HIS_LIVE = "1052/" + KEY;//历史直播
    public final static String LOOK_LIVE = "1053/" + KEY;//看过我直播的人
    public final static String REWARD_LIST = "1045/" + KEY;//贡献榜
    public final static String RECORD_CASH = "1044/" + KEY;//提现记录
    public final static String ACCOUNT_BALANCE = "1034/" + KEY;//账户余额
    public final static String RECHANGE_RECORD = "1193/" + KEY;//充值记录
    public final static String RECHARGE_PRICE = "1117/" + KEY;//充值价格
    public final static String BROKER_RESERVATION = "1098/" + KEY;//经纪人订房

    public final static String CANCLE_INVITE = "1138/" + KEY;//取消邀请直播
    public final static String DELITE_HISTORYVIDEO = "1167/" + KEY;//删除历史直播记录 - 1167
    public final static String DELITE_ENTRUST = "1170/" + KEY;//经纪人删除未受理的委托 - 1170
    public final static String ADVERTISEMENT = "1171/" + KEY;//获取广告图片信息 - 1171

    /***********************************************
     * 设置
     *******************************************/
    public final static String BLACK_LIST = "1055/" + KEY;//黑名单
    public final static String LEAVE_APP = "1000/" + KEY;//退出 - 1000
    public final static String CONCELBLACK = "1057/" + KEY;//取消黑名单 - 1057
    public final static String ADDBLACK = "1056/" + KEY;//添加黑名单 - 1056
    public final static String OPTION = "1059/" + KEY;//意见反馈 - 1059
    public final static String MESSAGE_MAGAGER = "1091/" + KEY;//消息管理信息 - 1091
    public final static String SWITCH_PRIVATE_LETTER = "1092/" + KEY;//切换为关注私信 - 1092
    public final static String SWITCH_LIVE_MESSAGE = "1093/" + KEY;//切换为直播信息 - 1093
    public final static String COMPLAINE = "1156/" + KEY;//申诉问题 - 1093


    /************************************************
     * 支付
     **************************************************/
    public final static String RECHARGE_ORDER = "1139/" + KEY;//充值订单
    public final static String RECHARGE_pay__ORDER = "1140/" + KEY;//支付订单

    public final static String DEPOSITDETAIL = "1090/" + KEY;//定金支付详情

    //    public final static String SIFTHOUSE = "1071/" + KEY;//筛选新房/二手房/租房列表 - 1071
    public final static String SIFTHOUSE = "1177/" + KEY;//筛选新房/二手房/租房列表 - 1177
    public final static String SEARCHBROKER = "1118/" + KEY;//按昵称或ID搜索经纪人 - 1118
    /************************************************
     * 微信提现
     **************************************************/
    public final static String IS_BIND_WX = "1148/" + KEY;//是否绑定微信
    public final static String BIND_WX = "1149/" + KEY;// 1149
    public final static String SUBMIT_CASH = "1150/" + KEY;// 提交提现
    public final static String CHANGESTATUS = "1155/" + KEY;// 切换身份
    public final static String TONGXUNLV = "1158/" + KEY;//查看手机通讯录号码是否已经注册
    public final static String CHANGENAME = "1157/" + KEY;//添加好友备注
    public final static String GETMESS = "1161/" + KEY;//获取短信内容
    public final static String SENDJOIN = "1162/" + KEY;//发起邀请

    public final static String HISRECORD = "1164/" + KEY;//回放记录

    public final static String SEARCHKEYUWORD = "1165/" + KEY;//获取热搜词 - 1165
    public final static String ATTEND_HOUSE_DETAIL = "1166/" + KEY;//关注房屋详情 - 1166
    public final static String INVITELIVE = "1168/" + KEY; //客户邀请经纪人 - 1168
    public final static String HOUSE_NATURE = "1169/" + KEY; //房屋标签 - 1169

    public final static String UPDATE_VERSION = "1172/" + KEY; //版本跟新 - 1172
    public final static String MAP_DISTREAT = "1173/" + KEY; // - 1173
    public final static String MAP_FIND_HOUSE = "1178/" + KEY; // - 1178地图找房屋直播
    public final static String C_DELETE_MYDELEG = "1179/" + KEY; // - 1179删除我的委托
    public final static String B_DELETE_ROB_CUSTOMER = "1180/" + KEY; //1180  删除抢客户
    public final static String C_FANS = "1181/" + KEY; //1181  我的客户粉丝
    public final static String MAP_BROKER = "1189/" + KEY; //1181  我的客户粉丝
    public final static String LOOK_HEARD = "1108/" + KEY; //观看中头像 - 1108
    /**********************************************新版*******************************************/

    /***********************************************
     * 全新接口
     *******************************************/

    public final static String LIVEHOUSEINFO = "1212/" + KEY; //楼盘详情 - 1212
    public final static String ATTENTIONLIVEHOUSE = "1213/" + KEY; //添加关注 - 1213
    public final static String LIVEHOUSELIST = "1224/" + KEY; //我直播的新房、二手房、租房列表 - 1224
    public final static String PUBLISHYUGAO = "1225/" + KEY; //发布预告 - 1225
    public final static String ADD_NEW_HOUSE_LIVE = "1226/" + KEY; //添加新房直播信息 - 1226
    public final static String ADD_OLD_HOUSE_LIVE = "1227/" + KEY; //添加二手房直播信息 - 1227
    public final static String ADD_RENT_HOUSE_LIVE = "1228/" + KEY; //添加租房直播信息 - 1228
    public final static String HOUSE_INFO = "1229/" + KEY; //楼盘编辑 - 1229
    public final static String EDIT_RENTHOUSE = "1262/" + KEY; //租房楼盘编辑保存 - 1262
    public final static String EDIT_NEWTHOUSE = "1260/" + KEY; //新房楼盘编辑保存 - 1260
    public final static String EDIT_OLDTHOUSE = "1261/" + KEY; //二手房楼盘编辑保存 - 1261
    public final static String VIDEO_SAVE = "1238/" + KEY; //保存视频- 1238


    /************************************************
     * 首页
     **************************************************/
    public final static String HOME_ATTENTION = "1210/" + KEY; //首页关注列表
    public final static String HOME_ATTENTION_GUESS_LIKE = "1211/" + KEY; //首页关注列表猜你喜欢
    public final static String HOME_REC = "1200/" + KEY; //首页推荐
    public final static String HOME_REC_PREVIEW = "1206/" + KEY; //首页推荐预告
    public final static String HOME_LATEST = "1207/" + KEY; //首页最新
    public final static String HOME_FORESHOW = "1205/" + KEY; //首页预告
    public final static String HOME_NEWHOUSE = "1201/" + KEY; //首页新房
    public final static String HOME_OLDHOUSE = "1202/" + KEY; //首页二手房
    public final static String HOME_RENDHOUSE = "1203/" + KEY; //首页租房列表
    public final static String HOME_NEARHOUSE = "1204/" + KEY; //租房，附近好房
    public final static String KAIBOTIXING = "1208/" + KEY; //预告开播/取消提醒- 1208
    public final static String GETSHOP = "1219/" + KEY; //获取商圈 - 1219
    public final static String TONGXUNLVNEW = "1220/" + KEY; // 查看手机通讯录号码是否已经关注 - 1220
    public final static String SELLHOUSELIST = "1221/" + KEY; //我要出售列表 - 1221
    public final static String CHUZULIEBIAO = "1222/" + KEY; // 我要出租列表 - 1222
    public final static String CHUSHOUORCHUZUDETAIL = "1223/" + KEY; // 出售或出租委托(详情) - 1223
    public final static String HOME_CITY = "1250/" + KEY; //首页城市数据
    public final static String OPENREDPACKET = "2040/" + KEY; //用户分享直播得现金接口- 2040
    public final static String GERREDPACKET = "2041/" + KEY; // 用户获得分享奖金(微信分享回调)- 2041
    public final static String SEARCHTITLE = "1230/" + KEY; // 搜索页面结果 - 1230
    public final static String SEARCHDATA = "1231/" + KEY; // 搜索页面结果列表 - 1231
    public final static String SEARCHRECOMMEND = "1232/" + KEY; // 为你推荐 - 1232
    public final static String REDPACKETLOOK = "2042/" + KEY; // 查看大家手气接口- 2042
    public final static String REDPACKETBROKERLOOK = "2043/" + KEY; // 查看大家手气接口(主播查看)- 2043
    public final static String BROKERLABEL = "1253/" + KEY; // 获取经纪人评价 - 1253
    public final static String ADDBROKERLABEL = "1251/" + KEY; //  添加经纪人评价 - 1251
    //    public final static String GETBROKERLABEL = "1255/" + KEY; //  获取评价标签 - 1255
    public final static String GETBROKERLABEL = "2053/" + KEY; //  获取评价标签 - 2053
    public final static String LIVEENDINFO = "1254/" + KEY; //  获取直播信息 - 1254
    public final static String COLLECTLIVE = "1256/" + KEY; // 添加收藏 - 1256
    public final static String BANNEDTOPOST = "1263/" + KEY; // 经纪人禁言用户 - 1263
    public final static String QIANGFANGYUANLIST = "1264/" + KEY; //  抢房源列表 - 1264
    public final static String INFORBROKER = "1236/" + KEY; //  个人资料 - 1236
    public final static String INFORBROKERTITLE = "1237/" + KEY; //  经纪人信息- 1237
    public final static String BROKERLIVEORHISTORY = "1235/" + KEY; // 经纪人主页(直播及回放)屋 - 1235
    public final static String QIANGKUHULIST = "1265/" + KEY; //  抢客户列表 - 1265
    public final static String BROKERINVITELIVE = "2044/" + KEY; //  主播邀请看客连麦- 2044
    public final static String CUSTOMERRESPOND = "2045/" + KEY; //  客户同意/拒绝主播连麦- 2045
    public final static String ENDCLOSELINE = "2046/" + KEY; //  結束连麦(客户)- 2046
    public final static String SEARCHHOTWORD = "1209/" + KEY; //  搜索页面- 1209
    public final static String FREIENDLISTLIVE = "2047/" + KEY; // 好友列表(直播页面)- 2047
    public final static String HOUSENEWINFO = "1212/" + KEY; //楼盘详情 - 1212
    public final static String TRAILERINFO = "2048/" + KEY; //预告详情- 2048
    public final static String SIMILARTYHOUSE = "1234/" + KEY; // 更多此类房屋 - 1234
    public final static String HOME_SEARCH = "1248/" + KEY; // 首页搜索 - 1248

    public static final String MAP_HOUSE_ONE = "1239/" + KEY;//地图楼盘首页
    public static final String MAP_HOUSE_TWO = "1240/" + KEY;//地图找房第二级别(地图商圈)
    public static final String MAP_HOUSE_THIRD = "1241/" + KEY;//经纬度范围找房(详情)
    public static final String INVITE_ZHIBO = "1266/" + KEY;//邀请经纪人直播(新房，租房，二手房直播)
    public final static String REMIND_LIVE = "1208/" + KEY; // 预告开播/取消提醒- 1208
    public final static String HOT_CITY = "1244/" + KEY; // 热门城市
    public final static String CITY_LIST = "1250/" + KEY; // 城市列表
    public final static String HISTORY_EXCEPTIONAL = "2049/" + KEY; // 历史回放打赏- 2049
    public final static String USER_DIAMONDS = "2052/" + KEY; // 获取当前用户的当前钻石数量- 2052
    public final static String ORDERINFO = "1245/" + KEY; // 订单详情(经纪人端)- 1245
    public final static String ORDERINFO_CUSTOMER = "1246/" + KEY; // 订单详情(客户端)- 1246
    public final static String CALLBACK = "2066/" + KEY;
    /**
     * 个人中心
     */
    public final static String MY_DATEYEAR = "1252/" + KEY;//获取充值记录年份 - 1252
    public final static String MY_CLIENTINFO = "1257/" + KEY;//经纪人我的 - 1258
    public final static String MY_BROKERINFO = "1258/" + KEY;//经纪人我的 - 1258
    public static final String MAP_FIND_BROKER = "1247/" + KEY;//地图找经纪人- 1247
    public static final String MAP_SEARCH_HOUSE = "1242/" + KEY;//地图搜索楼盘- 1242
    public final static String MY_FOLLOW = "1308/" + KEY;//关注（关注的人和关注的房屋） - 1308
    public final static String MY_FANS = "1311/" + KEY;//粉丝列表（我的页面） - 1311
    public final static String OREDER_LOOKHOUSE = "1302/" + KEY;//预约看房列表(经纪人) - 1302
    public final static String OREDER_LOOKHOUSE_C = "1301/" + KEY;//预约看房列表(客户) - 1301
    public final static String CONTRUIBUTETOP = "2054/" + KEY;//赏银贡献榜） - 2054
    public static final String SAVE_USER_INFO = "2057/" + KEY;//保存个人资料编辑
    public final static String MYREMARK = "2055/" + KEY;//我的标签） - 2055
    public final static String MYCOLLECTION = "1315/" + KEY;//我的收藏（我的页面）- 1315
    public final static String MYREDPACKER = "1325/" + KEY;//查询绑定与解绑） - 1325
    public final static String ROOMRESERVATION = "1322/" + KEY;//订房管理列表(经纪人） - 1322
    public final static String ROOMRESERVATION_C = "2050/" + KEY;//订房管理列表(用户)- 2050
    public final static String DELORDER = "1323/" + KEY;//删除订房信息） - 1323
    public final static String CHANGEORDERSTATUE = "1320/" + KEY;// 经纪人改变订房订单状态） - 1320
    public final static String CHANGEORDERSTATUE_C = "1321/" + KEY;// 客户改变订房订单状态） - 1321
    public final static String DELORDERLOOKHOUSE = "1306/" + KEY;// 删除预约看房订单(客户和经纪人) - 1306
    public final static String CANCELORDERLOOKHOUSE = "1304/" + KEY;// 取消预约看房订单(客户和经纪人) - 1304
    public final static String SUREORDERLOOKHOUSE_C = "1303/" + KEY;// 预约看房确认看房(客户) - 1303
    public final static String SUREORDERLOOKHOUSE = "1305/" + KEY;// 预约看房确认看房(经纪人) - 1305
    public static final String BROKER_VERIFY = "1326/" + KEY;//经纪人认证 - 1326
    public final static String ADDBROKERLABEL_ORDER = "1259/" + KEY;//  添加经纪人评价(订单) - 1259
    public final static String ENTRUSTHOUSE = "1310/" + KEY;// 委托房源(我的页面)(经纪人) - 1310
    public final static String MYHOUSE = "1309/" + KEY;// 我的房源(全部)（经纪人） - 1309
    public final static String MYHOUSE_CHUS = "1313/" + KEY;// 我的出售列表（我的页面）- 1313
    public final static String MYHOUSE_CHUZ = "1314/" + KEY;// 我的出租列表（我的页面）- 1314

    public final static String MYSALE = "1313/" + KEY;//我的出售列表（我的页面）- 1313
    public final static String MYRENT = "1314/" + KEY;//我的出租列表（我的页面）- 1314
    public final static String MYEDITSELF = "2057/" + KEY;//保存个人资料编辑） - 2057
    public final static String MYCHONGZHI = "1047/" + KEY;//充值记录 - 1047
    public final static String MYYUYUEZHIBO = "2056/" + KEY;//预约直播列表） - 2056
    public final static String MYYUYUEZKAIBO = "1243/" + KEY;//预告开始直播- 1243
    public final static String MYDELORDER = "1307/" + KEY;//删除订单（我的出售和我的出租） - 1307
    public final static String MYBROKERYUGAO = "2051/" + KEY;//我的预告- 2051
    public final static String BUSINESSCIRCLE = "1219/" + KEY;//获取商圈 - 1219

    public final static String CALCULATETAX = "wap/calculatetax";//充值
    public final static String PROBLEM = "wap/problem";//常见问题
    public final static String RECHARGEPROTOCOL = "wap/rechargeprotocol";//充值协议

    public final static String START_SHOW = "2058/" + KEY;//开启预告(在直播预告房屋页面)- 2058
    public static final String ZHIBO_RECORD = "2060/" + KEY;//我的直播记录(经纪人)- 2060
    public static final String ZHIBO_DETAIl = "2059/" + KEY;//直播记录详情- 2059
    public static final String ZHIBO_MONTH = "1252/" + KEY;//获取充值记录年份 - 1252
    public final static String LINK = "2065/" + KEY;//客户点击查看连麦- 2065
    public final static String CANCELCOMELIVE = "2067/" + KEY;//经纪人取消邀请客户观看直播-2067
    public final static String CUSTOMER_AGREE = "2068/" + KEY;//客户同意经纪人的邀请观看直播请求- 2068
    public final static String DELETE_FRIEND = "1318/" + KEY;//删除好友 - 1318
    public final static String DELTE_YUGAO = "1319/" + KEY;//删除预告 - 1319
    public final static String IDCRARD_NEW = "1327/" + KEY;//经纪人身份认证 - 1327
    public final static String LOAD_HISTORY_BUILDING = "2073/" + KEY;//获取经纪人的楼盘 - 2073
    public final static String CONTACT_LIST = "2071/" + KEY;//获取最近联系人(直播页面) - 2071
    public final static String LIVE_SEARCH = "2070/" + KEY;//邀请直播页面通过手机号、昵称、ID查找用户(直播页面) - 2070

    public final static String SWITCH_TYPE = "2069/" + KEY;//切换外部设备 - 2069
    public final static String EXTENT_READY = "2076/" + KEY;//通知直播间外置摄像头Ready - 2076


    public final static String ENTRUS_LIST = "2075/" + KEY;//委托列表 - 2075
    public final static String TAKE_CLIENT = "2074/" + KEY; //抢客户列表
    public final static String ENTRUSTINFOCLIENT = "2077/" + KEY; //委托详情 (客户)- 2077
    public final static String ENTRUSTINFOBROKER = "2078/" + KEY; //委托详情(经纪人) - 2078
    public final static String ISLIVEING = "2079/" + KEY; //判断一些经纪人是否正在直播 - 2079

    public final static String BROKERISLIVE = "1268/" + KEY; // 经纪人是否正在直播 - 1268
    public final static String OPENOUTERLINK = "2080/" + KEY; // 开启外置设备链接(MJPEG) - 2080
    public final static String CLOSEOUTERLINK = "2081/" + KEY; // 关闭外置设备链接(MJPEG) - 2081
    public final static String CUTCAMERA = "2082/" + KEY; // 主播切换到前后置摄像头 - 2082


}

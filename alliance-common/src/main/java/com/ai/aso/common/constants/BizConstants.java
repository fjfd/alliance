package com.ai.aso.common.constants;

import com.ai.aso.base.constants.SysConstants;

public interface BizConstants extends SysConstants {
	
	// 菜单、资源相关属性常量
//	short RESOURCE_ENABLED = 1; // 有效的资源状态
//	short RESOURCE_DISABLED = 0; // 无效的资源状态
	
	String RESOURCE_NEED_AUTH = "RESOURCE.AUTH.NEED"; // 非匿名权限资源

//	int RESOURCE_MENU = 10; // 菜单
	public static final String ORDER_MEDDLE_COMFIRE_TIME = "ORDER_MEDDLE_COMFIRE_TIME";
	public static final String ORDER_MEDDLE_COMFIRE_TIME_UNIT = "ORDER_MEDDLE_COMFIRE_TIME_UNIT";
	String CUST_BILL_COMFIRE_TIME = "CUST_BILL_COMFIRE_TIME";
	String CUST_BILL_COMFIRE_TIME_UNIT = "CUST_BILL_COMFIRE_TIME_UNIT";
	String SEQ_KEY_CUST = "sqName_cust";
	String SEQ_KEY_LOGINLOG = "sqName_loginLog";
	String SEQ_KEY_OPERATELOG = "sqName_operateLog";
	String SEQUENCENAME_DATABOOK = "sqName_databook";
	String SEQUENCENAME_DATAACCT = "sqName_dataacct";
	// 账本表序列
	String SEQUENCENAME_BOOK = "sqName_book";
	String SEQUENCENAME_REGIST = "sqName_registApply";
	String PICTURE_MAX_SIZE = "PICTURE_MAX_SIZE";//1M
	// 账本流水序列
	String SEQUENCENAME_BOOKRECORD = "sqName_bookRecord";
	//支付流水序列
	String SEQ_KEY_PAYMENT="sqName_payMent";
	//用户信息序列名
	String SEQUENCENAME_USER = "sqName_user";
	//登录账号信息序列名
	String SEQUENCENAME_ACCT = "sqName_loginAcct";
	//webService接口配置
	String PROD_SPEC_CDMA = "PROD_SPEC_CDMA";//webService查询的用户类型CDMA类型为1
	String CRM_WEBSERVICE_CUST_URL="CRM_WEBSERVICE_CUST_URL";//CRM客户查询webService地址
	String CRM_WEBSERVICE_CUST_METHOD="CRM_WEBSERVICE_CUST_METHOD";//CRM客户查询webService按号码查询方法
	//CRM订单订购查询
	String CRM_WEBSERVICE_ORDER_QUERY_URL="CRM_WEBSERVICE_ORDER_QUERY_URL";//CRM订购查询webService地址
	String CRM_WEBSERVICE_ORDER_QUERY_METHOD="CRM_WEBSERVICE_ORDER_QUERY_METHOD";//CRM订购查询webService方法
	//CRM订单订购
	String CRM_WEBSERVICE_ORDER_URL="CRM_WEBSERVICE_ORDER_URL";//CRM订购webService地址
	String CRM_WEBSERVICE_ORDER_METHOD="CRM_WEBSERVICE_ORDER_METHOD";//CRM订购webService方法
	String CRM_WEBSERVICE_ORDER_ACTIONCODE="CRM_WEBSERVICE_ORDER_ACTIONCODE";//CRM订购参数：0代表开
	String CRM_WEBSERVICE_ORDER_CHANNELID="CRM_WEBSERVICE_ORDER_CHANNELID";//CRM订购参数渠道Id
	//CRM短信接口
	String CRM_WEBSERVICE_SMS_URL="CRM_WEBSERVICE_SMS_URL";//CRM短息webService地址
	String CRM_WEBSERVICE_SMS_METHOD="CRM_WEBSERVICE_SMS_METHOD";//CRM短息webService方法
	String SEQUENCENAME_SMSCODE = "sqName_smsCode";
	//短信相关
	String CRM_WEBSERVICE_SMS_USERNAME="CRM_WEBSERVICE_SMS_USERNAME";
	String CRM_WEBSERVICE_SMS_PASS="CRM_WEBSERVICE_SMS_PASS";
	String CRM_WEBSERVICE_SMS_SYSCODE="CRM_WEBSERVICE_SMS_SYSCODE";
	String CRM_WEBSERVICE_SMS_PRODUCTID="CRM_WEBSERVICE_SMS_PRODUCTID";
	String CRM_WEBSERVICE_SMS_LATNID="CRM_WEBSERVICE_SMS_LATNID";
	String CRM_WEBSERVICE_SMS_SENTTYPE="CRM_WEBSERVICE_SMS_SENTTYPE";
	String CRM_WEBSERVICE_SMS_BUSINESSID_DELAYED="CRM_WEBSERVICE_SMS_BUSINESSID_DELAYED";
	String CRM_WEBSERVICE_SMS_BUSINESSID_CONSTANTLY="CRM_WEBSERVICE_SMS_BUSINESSID_CONSTANTLY";
	String CRM_WEBSERVICE_SMS_CHANNELTYPE="CRM_WEBSERVICE_SMS_CHANNELTYPE";
	String CRM_BILL_OFFER_ID="CRM_BILL_OFFER_ID";//CRM计费表offer_id
	//来源item_source_id
	String CRM_BILL_ITEM_SOURCE_ID="CRM_BILL_ITEM_SOURCE_ID";//来源item_source_id
	//初始化状态
	String CRM_BILL_SATTE="CRM_BILL_SATTE";//初始化状态
	//payment_method
	String CRM_BILL_PAYMENT_METHOD="CRM_BILL_PAYMENT_METHOD";
	//GLOBAL PARAM
	//IP拦截相关
	String SYS_IP_REQ_INTERVAL_KEY = "SYS.IP.REQ.INTERVAL.KEY"; //系统请求访问时间间隔key
	String SYS_IP_REQ_LIMIT_KEY = "SYS.IP.REQ.LIMIT.KEY"; // 系统请求访问总次数KEY
	
	//RESOURCES
	String RESOURCES_TYPE_MENU = "RESOURCES.TYPE.MENU";//资源类型：10-菜单，20-方法
	String RESOURCES_TYPE_OTHER = "RESOURCES.TYPE.OTHER";//资源类型：20 其它
	
	String PASSWORD_DEFAULT = "PASSWORD.DEFAULT";//默认密码
	
	String PARTNER_ROLE_ID = "SYS_ROLE_PARTNER";//合作伙伴角色id=3
	
	//合作伙伴客户状态位参数key
	String CUST_STATE_NEW = "CUST.STATE.NEW";//未生效（新建状态）
	String CUST_STATE_ENABLED = "CUST.STATE.ENABLED";//已生效
	String CUST_STATE_UNAUDIT = "CUST.STATE.UNAUDIT";//待审核
	String CUST_STATE_FAILED = "CUST.STATE.FAILED";//审核不通过
	String CUST_STATE_CLOSED = "CUST.STATE.CLOSED";//关闭
	//合作伙伴校验状态位参数key
	String CUST_VALID_FLAG_ENABLED = "CUST.VALID.FLAG.ENABLED";//有效
	String CUST_VALID_FLAG_DISABLED = "CUST.VALID.FLAG.DISABLED";//无效
	//合作伙伴操作标识
	String CUST_OPER_FLAG_NEW = "CUST.OPER.FLAG.NEW";//新建
	String CUST_OPER_FLAG_MODIFY = "CUST.OPER.FLAG.MODIFY";//修改
	String CUST_OPER_FLAG_DEL = "CUST.OPER.FLAG.DEL";//删除
	
	//账户禁用状态
	String ACCT_STATE_CLOSED = "ACCT.STATE.CLOSED";
	String ACCT_STATE_ENABLED = "ACCT.STATE.ENABLED";
	String ACCT_STATE_LOCKED = "ACCT.STATE.LOCKED";
	
	//管理员用户默认状态
	String USER_STATE_DEFAULT = "USER.STATE.DEFAULT";
	//省级管理员区域标示
	String PROVINCE_ADMIN_REGION = "PROVINCE.ADMIN.REGION";
	
	//ATTRIBUTE
	// AttributeSet表中的Package key
	String ATTR_CUST_CERT_TYPE = "CUST_CERT_TYPE";
	String ATTR_CUST_TYPE = "CUST_TYPE";
	String ATTR_CUST_STATE = "CUST_STATE";
	
	String ATTR_RESOURCES_TYPE = "RESOURCES_TYPE";//资源类型：10 菜单目录
	
	String ATTR_USER_STATE = "USER_STATE";
	
	String ATTR_ORDER_STATE = "ORDER_STATE";//订单状态
	
	String ATTR_GOODS_TYPE = "GOODS_TYPE";//商品类型编码
	String ATTR_DATA_TYPE="DATA_TYPE";//流量类型编码
	//订单状态
	String ORDER_STATE_NEW = "ORDER.STATE.NEW";//未生效（新建状态）
	String ORDER_STATE_UNAUDIT = "ORDER.STATE.UNAUDIT";//待审核
	String ORDER_STATE_UNPAY = "ORDER.STATE.UNPAY";//待支付
	String ORDER_STATE_PAYED = "ORDER.STATE.PAYED";//已支付
	String ORDER_STATE_COMPLETED = "ORDER.STATE.COMPLETED";//已完成
	String ORDER_STATE_CLOSED = "ORDER.STATE.CLOSED";//关闭
	
//	String ORDER_PAY_CERT_UPLOAD="USER.UPLOAD.PATH";//支付凭证上传的路径
//	
//	String ATTR_DATAPUT_FILE_UPLOAD = "DATAPUT.TEMP.UPLOAD.PATH";//支付凭证上传的路径
	
	String ATTR_CONTRACT_STATE="CONTRACT_STATE";//合同状态
	String ATTR_DATA_RECHAGE_STATE="RECHAGE.STATE";//充值状态
	String ATTR_DATA_BILL_STATE="BILL.STATE";//出账状态
	//String ATTR_CONTRACT_SUB_STATE = "CONTRACT_SUB_STATE";//100 待审核

	//合同账本类型
	String CONTRACT_BOOK_TYPE_PAYMENT="CONTRACT.BOOK.TYPE.PAYMENT";//200 支付账本
	String CONTRACT_BOOK_TYPE_DEPOSIT="CONTRACT.BOOK.TYPE.DEPOSIT";//100 保证金账本
	String CONTRACT_BOOK_TYPE_CREDIT="CONTRACT.BOOK.TYPE.CREDIT";//300 透支账本
	//合同账本状态
	String CONTRACT_BOOK_STATE_NORMAL = "CONTRACT.BOOK.STATE.NORMAL";//100正常
	String CONTRACT_BOOK_STATE_FROZEN = "CONTRACT.BOOK.STATE.FROZEN";//200冻结
	String CONTRACT_BOOK_STATE_CLOSED = "CONTRACT.BOOK.STATE.CLOSED";//300关闭
	
	//合同状态
	String CONTRACT_STATE_ENABLED = "CONTRACT.STATE.ENABLED";//1 已生效
	String CONTRACT_STATE_DISABLED = "CONTRACT.STATE.DISABLED";//2 未生效
	String CONTRACT_STATE_FROZEN = "CONTRACT.STATE.FROZEN";//3 已冻结
	String CONTRACT_STATE_EXPIRED = "CONTRACT.STATE.EXPIRED";//4 已过期
	String CONTRACT_STATE_CLOSED = "CONTRACT.STATE.CLOSED";//5 已终止
	
	//合同子状态

	String CONTRACT_SUB_STATE_WAITAUDIT = "CONTRACT_SUB_STATE_WAITAUDIT";//100 待审核
	String CONTRACT_SUB_STATE_AUDIT = "CONTRACT_SUB_STATE_AUDIT";//200 审核通过
	String CONTRACT_SUB_STATE_FAILED = "CONTRACT_SUB_STATE_FAILED";//210 审核不通过
	String CONTRACT_SUB_STATE_LIVE = "CONTRACT_SUB_STATE_LIVE";//300待激活


	String CONTRACT_SUB_STATE_WAITAUDITLIVE = "CONTRACT_SUB_STATE_WAITAUDITLIVE";//310 待激活审核
	String CONTRACT_SUB_STATE_LIVESUC = "CONTRACT_SUB_STATE_LIVESUC";//320 激活审核通过
	String CONTRACT_SUB_STATE_LIVEFAILED = "CONTRACT_SUB_STATE_LIVEFAILED";//330 激活审核不通过
	String CONTRACT_SUB_STATE_WAITAUDITRENEWAL = "CONTRACT_SUB_STATE_WAITAUDITRENEWAL";//400 续费待审核
	String CONTRACT_SUB_STATE_RENEWALSUC = "CONTRACT_SUB_STATE_RENEWALSUC";//410 续费审核通过
	String CONTRACT_SUB_STATE_RENEWALFAILED = "CONTRACT_SUB_STATE_RENEWALFAILED";//420 续费审核不通过
	String CONTRACT_SUB_STATE_CLOSED = "CONTRACT_SUB_STATE_CLOSED";//900 终止

	//省级管理员的
	String PROVINCIAL_ROLE_ID = "SYS_ROLE_PROVINCIAL";
	String CITY_ROLE_ID = "SYS_ROLE_CITY";
	String ENBALER_ROLE_ID = "SYS_ROLE_ENABLER";
	
	
	String SYS_DATA_TYPE_PRO = "SYS.DATA.TYPE.PRO";
	String SYS_DATA_TYPE_PUB = "SYS.DATA.TYPE.PUB";

	String  FLOW_BUSI_TYPE_HN = "FLOW.BUSI.TYPE.HN";

	String SEQUENCENAME_CONTRACT = "sqName_contract";

	String ORDER_PREPAY = "ORDER.PREPAY";

	String CONTRACT_OPER_STEP_APPLY = "CONTRACT.OPER.STEP.APPLY";//100合同申请
	String CONTRACT_OPER_STEP_ACTIVATE = "CONTRACT.OPER.STEP.ACTIVATE";//200合同激活
	String CONTRACT_OPER_STEP_RENEWAL = "CONTRACT.OPER.STEP.RENEWAL";//300合同续费
	String CONTRACT_OPER_STEP_OVERDRAFT = "CONTRACT.OPER.STEP.OVERDRAFT";//400合同透支
	String CONTRACT_OPER_STEP_DEPOSIT_TRANSFER = "CONTRACT.OPER.STEP.DEPOSIT.TRANSFER";//500保证金转存
	String CONTRACT_OPER_STEP_CARRY = "CONTRACT.OPER.STEP.CARRY";//600合同余额结转
	String CONTRACT_OPER_STEP_COLUMN = "CONTRACT.OPER.STEP.COLUMN";//700合同列收
	String CONT_BOOK_RECORD_OPER_TYPE_IN = "CONT.BOOK.RECORD.OPER.TYPE.IN";
	String CONT_BOOK_RECORD_OPER_TYPE_OUT = "CONT.BOOK.RECORD.OPER.TYPE.OUT";

	String ATTR_CONTRACT_BOOK_TYPE = "CONTRACT_BOOK_TYPE";
	
	String CUST_BILL_STATE_UNCONFIRM = "CUST_BILL_STATE_UNCONFIRM";//100未确认
	String CUST_BILL_STATE_CONFIRMED = "CUST_BILL_STATE_CONFIRMED";//200已确认
	String CUST_BILL_STATE_INBILL = "CUST_BILL_STATE_INBILL";//300已入账
	
	String OUT_BILL_STATE_NOT = "OUT_BILL_STATE_NOT";//100未出帐
	String OUT_BILL_STATE_ING = "OUT_BILL_STATE_ING";//200出帐中
	String OUT_BILL_STATE_OK = "OUT_BILL_STATE_OK";//300已出账
	String OUT_BILL_STATE_IN = "OUT_BILL_STATE_IN";//400已入账
	
	String COST_BILL_STATE_NOT = "COST_BILL_STATE_NOT";//100未同步
	String COST_BILL_STATE_ING = "COST_BILL_STATE_ING";//200同步中
	String COST_BILL_STATE_SUC = "COST_BILL_STATE_SUC";//300已同步
	
	String IS_INVCD_NOT = "IS_INVCD_NOT";//未开发票
	String IS_INVCD_SUC = "IS_INVCD_SUC";//已开发票

	String ATTR_CONTRACT_SUB_STATE = "CONTRACT_SUB_STATE";//合同子状态
	
//	String CONTRACT_ATTACHMENT_PATH = "CONTRACT_ATTACHMENT_PATH";//合同附件路径
	//付费类型
	String PAY_TYPE_PREPAY = "PAY_TYPE_PREPAY";//预付费200
	String PAY_TYPE_POSTPAY = "PAY_TYPE_POSTPAY";//后付费100
	//支付对象
	String PAY_OBJECT_TYPE_PREPAY = "PAY_OBJECT_TYPE_PREPAY";//100 预付费订单；
	String PAY_OBJECT_TYPE_POSTPAY = "PAY_OBJECT_TYPE_POSTPAY";//200 后付费账单
	String PAY_OBJECT_TYPE_ADVANCES = "PAY_OBJECT_TYPE_ADVANCES";//300 预存款
	String PAY_OBJECT_TYPE_DEPOSITS = "PAY_OBJECT_TYPE_DEPOSITS";//400 保证金
	String PAY_OBJECT_TYPE_CARRY = "PAY_OBJECT_TYPE_CARRY";//500 余额结转
	String PAY_OBJECT_TYPE_COLUMN = "PAY_OBJECT_TYPE_COLUMN";//600 合同列收
	//支付状态
	String PAY_STATE_PAYING = "PAY_STATE_PAYING";//支付状态：100 支付中；
	String PAY_STATE_PAY_CONFIREMED = "PAY_STATE_PAY_CONFIREMED";//200 支付待确认；
	String PAY_STATE_PAY_SUCC = "PAY_STATE_PAY_SUCC";//300 支付成功；
	String PAY_STATE_PAY_FAILED = "PAY_STATE_PAY_FAILED";//400 支付失败；
	String PAY_STATE_PAY_CLOSED = "PAY_STATE_PAY_CLOSED";//500 已关闭
	String PAY_STATE_PAY_CARRYIN = "PAY_STATE_PAY_CARRYIN";//600 余额结转转入成功
	String PAY_STATE_PAY_CARRYOUT = "PAY_STATE_PAY_CARRYOUT";//700 余额结转转出成功
	//支付费用类型
	String COST_TYPE_ACTIVATE = "COST_TYPE_ACTIVATE";//支付费用类型：100 合同激活；
	String COST_TYPE_RENEWAL = "COST_TYPE_RENEWAL";//200 合同续费；
	//支付方式
	String PAY_MODE_ONLINE = "PAY_MODE_ONLINE";//支付方式：100 在线支付；
	String PAY_MODE_COLLECTION = "PAY_MODE_COLLECTION";//200 计费托收；
	String PAY_MODE_BYBANK = "PAY_MODE_BYBANK";//300 银行转账'
	
	
	String FILE_ROOT_PATH_TEST = "FILE_ROOT_PATH_TEST"; // 文件资源总路径【SYS.FILE.UPLOAD.ROOT】
	String FILE_ROOT_PATH = "FILE_ROOT_PATH"; // 文件资源总路径【SYS.FILE.UPLOAD.ROOT】
	String FILE_TEMPLET_PATH = "FILE_TEMPLET_PATH"; // 模板文件路径【TEMPLET_PATH】
	String FILE_UPLOAD_PAYMENT_PATH = "FILE_UPLOAD_PAYMENT_PATH"; // 支付凭证上传的路径【USER_UPLOAD_PATH】
	String FILE_UPLOAD_CONTRACT_PATH = "FILE_UPLOAD_CONTRACT_PATH"; // 合同附件上传路径【CONTRACT_ATTACHMENT_PATH】
	String FILE_UPLOAD_PFPC_PATH = "FILE_UPLOAD_PFPC_PATH"; // 批量派发相对路径【FILE_UPLOAD_PFPC_PATH】
	String FILE_UPLOAD_BACKUP_TABLE = "FILE_UPLOAD_BACKUP_TABLE"; // 数据库表备份路径路径【FILE_UPLOAD_BACKUP_TABLE】
	//oracle配置文件路径
	String ORACLE_COFG_FILE = "ORACLE_COFG_FILE";
	//开放接口的审核状态
	String ENABLER_STATE_ADOPT = "ENABLER_STATE_ADOPT";
	String ENABLER_STATE_CHECK = "ENABLER_STATE_CHECK";
	String ENABLER_STATE_FAIL = "ENABLER_STATE_FAIL";

	//商品类型
	public  static final String GOODS_TYPE_NORMAL = "GOODS.TYPE.NORMAL";//100通用商品
	public  static final String DATA_TYPE_PUBLIC = "DATA_TYPE_PUBLIC";//100国内
	public  static final String DATA_TYPE_PROVINCE = "DATA_TYPE_PROVINCE";//200省内
	public  static final String DATA_TYPE_PRIVATE = "DATA_TYPE_PRIVATE";//300本地
     //业务类:100 流量资源批发；200 流量资源分销；300 流量共享池',
	public  static final String BUSSINESS_TYPE_BATCH="BUSSINESS.TYPE.BATCH";//100 流量资源批发
	public  static final String BUSSINESS_TYPE_DISTIBUTION="BUSSINESS.TYPE.DISTIBUTION";//200 流量资源分销
	public  static final String BUSSINESS_TYPE_SHARE="BUSSINESS.TYPE.SHARED";//300 流量共享池
	//量本状态：100 在用；201 未生效；202 已关闭；203 已过期；204 未付款'
	public  static final String DATA_BOOK_STATE_USING="DATA.BOOK.STATE.USING";//100 在用
	public  static final String DATA_BOOK_STATE_DISABLE="DATA.BOOK.STATE.DISABLE";//201 未生效
	public  static final String DATA_BOOK_STATE_CLOSED="DATA.BOOK.STATE.CLOSED";//202 已关闭
	public  static final String DATA_BOOK_STATE_OUTDATE="DATA.BOOK.STATE.OUTDATE";//203 已过期
	public  static final String DATA_BOOK_STATE_UNPAY="DATA.BOOK.STATE.UNPAY";//204 未付款
	//量本来源类型：100 合同',
	public  static final String DATA_BOOK_ORIG_TYPE_CONT="DATA.BOOK.ORIG.TYPE.CONT";//100 合同
	//量本类型 100
	public  static final String DATA_BOOK_TYPE_DATA="DATA.BOOK.TYPE.DATA";//量本类型 100
	
	//'账户类型：100 河南流量分销账户',
	public  static final String ACCT_TYPE_HN_DISTRIBUTION="ACCT.TYPE.HN.DISTRIBUTION";//100 河南流量分销账户
	
	String CUST_ENABLER_CODE = "CUST_ENABLER_CODE";

	String SMS_RESET_PASSWORD = "SMS_RESET_PASSWORD";
	
	String GOODS_STATE_ENABLED = "GOODS_STATE_ENABLED";//商品状态：1-有效
	String GOODS_STATE_DISABLED = "GOODS_STATE_DISABLED";//商品状态：0-无效
	
	String ATTR_GOODS_STATE = "GOOS_STATE";//商品状态用于页面展示
	String BILL_REC_SHOW_LINE_COUNTS = "BILL_REC_SHOW_LINE_COUNTS";//商品状态用于页面展示
	//意向单状态1完成 ；0未处理 ；2失败关闭；
	String APPLY_TIP_DEALING_STATE = "APPLY_TIP_DEALING_STATE";//
	String APPLY_TIPS_STATE_UNCONFIRM = "APPLY_TIPS_STATE_UNCONFIRM";//未处理
	String APPLY_TIPS_STATE_SUCC = "APPLY_TIPS_STATE_SUCC";//完成
	String APPLY_TIPS_STATE_FAILED = "APPLY_TIPS_STATE_FAILED";//失败关闭
	//短息模板定义
	String SMS_TEMPLATE_REGISTER="SMS_TEMPLATE_REGISTER";//用户注册短信模板
	
	String SMS_TEMPLATE_RES_NOTICE="SMS_TEMPLATE_RES_NOTICE";//用户注册短信完成通知管理员模板
	
	String SMS_TEMPLATE_ADICUT_NOTICE="SMS_TEMPLATE_ADICUT_NOTICE";//短信完成通知用户模板
	
	String SMS_TEMPLATE_ARREARAGE_NOTICE="SMS_TEMPLATE_ARREARAGE_NOTICE";//用户欠费提醒短信模板

	//FPS 省集约流量系统常量
	String FPS_SECURITY_APP_ID = "FPS_SECURITY_APP_ID";
	String FPS_SECURITY_APP_SECRET = "FPS_SECURITY_APP_SECRET";
	String FPS_SERVICE_CODE = "FPS_SERVICE_CODE";
	String FPS_INTERFACE_URL_FLOWORDER = "FPS_INTERFACE_URL_FLOWORDER";
	//省内平台同步综合平台省内客户合同信息接口
	String FPS_INTERFACE_URL_CONTRACTSYNC = "FPS_INTERFACE_URL_CONTRACTSYNC";
	//流量包订单状态查询
	String FPS_INTERFACE_URL_FLOWORDERSTATUSQUERY = "FPS_INTERFACE_URL_FLOWORDERSTATUSQUERY";

}
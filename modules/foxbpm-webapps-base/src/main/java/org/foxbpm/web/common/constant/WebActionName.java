package org.foxbpm.web.common.constant;

/**
 * controller 对应的action名称定义，用于映射URL请求命令
 * 
 * @author MEL
 * @date 2014-06-06
 */
public final class WebActionName {

	/*************************** 任务中心action ************************************************/
	public final static String COMPLETE_TASK_ACTION = "completeTask";
	public final static String QUERY_TASK_ACTION = "queryTask";
	public final static String QUERY_TODOTASK_ACTION = "queryToDoTask";
	public final static String QUERY_PROCESSDEFINITION_ACTION = "queryProcessDefinition";
	public final static String QUERY_STARTPROCESS_ACTION = "queryStartProcess";
	public final static String QUERY_QUERYALLPROCESSINST_ACTION = "queryProcessInst";
	public final static String QUERY_TASKDETAILINFOR_ACTION = "queryTaskDetailInfor";
	public final static String GETFLOWGRAPH_ACTION = "getFlowGraph";
	public final static String START_TASK_ACTION = "startTask";
	public final static String DELEGATE_AUTHORITY = "delegateAuthority";
	public final static String SAVE_USER_DELEGATIONINFO = "saveUserDelegationInfo";
	/*************************** 管控中心action ************************************************/
	public final static String PROCESSDEF_ACTION = "processDef";
	public final static String DEPLOY_ACTION = "deploy";
	public final static String DELETEDEPLOY_ACTION = "deleteDeploy";
	public final static String UPDATECACHE_ACTION = "updateCache";
	public final static String PROCESSINSTMANAGE_ACTION = "processInstManage";
	public static final String SUSPENDPROCESS_ACTION = "suspendProcess";
	public static final String CONTINUEPROCESS_ACTION = "continueProcess";
	public static final String TERMINATPROCESS_ACTION = "terminatProcess";
	public static final String DELETEPROCESS_ACTION = "deleteProcess";
	public static final String PROCESSVARIABLEMANAGE_ACTION = "processVariableManage";
	public static final String SELECT_PROCESSDEF = "selectProcessDefList";
	public static final String SELECT_USER = "selectUserList";
}

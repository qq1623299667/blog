package cn.virtualspider.blog.myenum;

/**
 * 提示信息枚举类
 * @author Administrator
 *
 */
public enum PromptMessageEnum {
	GET_ARTICLE_LIST_SUCCESS(true,"获取文章列表成功"),
	GET_USER_DETAIL_SUCCESS(true,"获取用户详情成功"),
	GET_USER_DETAIL_FAILURE(false,"获取用户详情失败"),
	GET_ARTICLE_DETAIL_SUCCESS(true,"获取文章详情成功"),
	LOGIN_USER_SUCCESS(true,"登陆用户成功"),
	LOGIN_USER_FAILURE(false,"登陆用户失败"),
	REGIST_USER_SUCCESS(true,"注册用户成功"),
	REGIST_USER_FAILURE_USER_ALREADY_EXIST(false,"注册用户失败，用户已存在"),
	REGIST_USER_FAILURE_PASSWORD_NOT_EQUAL(false,"注册用户失败，两次输入密码不一致");
	private Boolean status;//状态，成功为true，失败为false
	private String promptMessage;//提示信息
	private PromptMessageEnum(Boolean status,String promptMessage) {
		this.status = status;
		this.promptMessage = promptMessage;
	}
	public Boolean getStatus() {
		return status;
	}
	public String getPromptMessage() {
		return promptMessage;
	}
	
}
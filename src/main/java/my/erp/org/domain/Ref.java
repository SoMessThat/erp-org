package my.erp.org.domain;

import java.io.Serializable;

public class Ref implements Serializable {
	
	
	/**   
	  * serialVersionUID:TODO
	  *   
	  * @since v1.0  
	 **/   
	
	private static final long serialVersionUID = -7793676077847627250L;

	private Long id;
	
	private Long userId;
	
	private Long roleId;
	
	private Long powerId;
	
	private String tip;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getPowerId() {
		return powerId;
	}
	public void setPowerId(Long powerId) {
		this.powerId = powerId;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}

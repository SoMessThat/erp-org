package my.erp.org.vo;

import java.io.Serializable;
import java.util.Map;

import my.erp.org.domain.Department;
import my.erp.org.domain.Student;
import my.erp.org.util.BaseVo;

/**
 * Database Table Remarks:
 *   用户信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class UserVo extends BaseVo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     * Database Column Remarks:
     *   名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   头像
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.avatar
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     * Database Column Remarks:
     *   电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.creat_time
     *
     * @mbg.generated
     */
    private String creatTime;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * Database Column Remarks:
     *   所属部门
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.department_id
     *
     * @mbg.generated
     */
    private Long departmentId;

    /**
     * Database Column Remarks:
     *   学生信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.student_id
     *
     * @mbg.generated
     */
    private String studentId;

    /**
     * Database Column Remarks:
     *   角色
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.role_id
     *
     * @mbg.generated
     */
    private Long roleId;
    
    /**
     * 学号
     */
	private String code;
	
	/**
     *   所属部门
     */
    private Department department;

    /**
     *   学生信息
     */
    private Student student;
    
    /**
     * 职位
     */
    private String job;
    
    
    private Map<String, Object> role;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.account
     *
     * @return the value of sys_user.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.account
     *
     * @param account the value for sys_user.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.avatar
     *
     * @return the value of sys_user.avatar
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.avatar
     *
     * @param avatar the value for sys_user.avatar
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.tel
     *
     * @return the value of sys_user.tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.tel
     *
     * @param tel the value for sys_user.tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.creat_time
     *
     * @return the value of sys_user.creat_time
     *
     * @mbg.generated
     */
    public String getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.creat_time
     *
     * @param creatTime the value for sys_user.creat_time
     *
     * @mbg.generated
     */
    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.state
     *
     * @return the value of sys_user.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.state
     *
     * @param state the value for sys_user.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.department_id
     *
     * @return the value of sys_user.department_id
     *
     * @mbg.generated
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.department_id
     *
     * @param departmentId the value for sys_user.department_id
     *
     * @mbg.generated
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.student_id
     *
     * @return the value of sys_user.student_id
     *
     * @mbg.generated
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.student_id
     *
     * @param studentId the value for sys_user.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.role_id
     *
     * @return the value of sys_user.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.role_id
     *
     * @param roleId the value for sys_user.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", avatar=").append(avatar);
        sb.append(", tel=").append(tel);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", state=").append(state);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", studentId=").append(studentId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Map<String, Object> getRole() {
		return role;
	}

	public void setRole(Map<String, Object> role) {
		this.role = role;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
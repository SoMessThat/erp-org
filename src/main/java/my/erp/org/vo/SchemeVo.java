package my.erp.org.vo;

import java.io.Serializable;
import java.util.Date;

import my.erp.org.util.BaseVo;

/**
 * Database Table Remarks:
 *   策划信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table res_scheme
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SchemeVo extends BaseVo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * Database Column Remarks:
     *   活动名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   活动说明
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   活动主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.theme
     *
     * @mbg.generated
     */
    private String theme;

    /**
     * Database Column Remarks:
     *   活动目的
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.goal
     *
     * @mbg.generated
     */
    private String goal;

    /**
     * Database Column Remarks:
     *   活动时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.begin_time
     *
     * @mbg.generated
     */
    private String beginTime;

    /**
     * Database Column Remarks:
     *   活动地点
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.place
     *
     * @mbg.generated
     */
    private String place;

    /**
     * Database Column Remarks:
     *   活动人员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.person
     *
     * @mbg.generated
     */
    private String person;

    /**
     * Database Column Remarks:
     *   活动形式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.form
     *
     * @mbg.generated
     */
    private String form;

    /**
     * Database Column Remarks:
     *   活动人员安排
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.arrangements
     *
     * @mbg.generated
     */
    private String arrangements;

    /**
     * Database Column Remarks:
     *   活动流程
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.flow
     *
     * @mbg.generated
     */
    private String flow;

    /**
     * Database Column Remarks:
     *   资金预算
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.budget
     *
     * @mbg.generated
     */
    private String budget;

    /**
     * Database Column Remarks:
     *   奖励
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.award
     *
     * @mbg.generated
     */
    private String award;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.creator_id
     *
     * @mbg.generated
     */
    private Long creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     * Database Column Remarks:
     *   所属部门
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.department_id
     *
     * @mbg.generated
     */
    private Long departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.department_name
     *
     * @mbg.generated
     */
    private String departmentName;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * Database Column Remarks:
     *   活动内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_scheme.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table res_scheme
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.id
     *
     * @return the value of res_scheme.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.id
     *
     * @param id the value for res_scheme.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.code
     *
     * @return the value of res_scheme.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.code
     *
     * @param code the value for res_scheme.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.name
     *
     * @return the value of res_scheme.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.name
     *
     * @param name the value for res_scheme.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.description
     *
     * @return the value of res_scheme.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.description
     *
     * @param description the value for res_scheme.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.theme
     *
     * @return the value of res_scheme.theme
     *
     * @mbg.generated
     */
    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.theme
     *
     * @param theme the value for res_scheme.theme
     *
     * @mbg.generated
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.goal
     *
     * @return the value of res_scheme.goal
     *
     * @mbg.generated
     */
    public String getGoal() {
        return goal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.goal
     *
     * @param goal the value for res_scheme.goal
     *
     * @mbg.generated
     */
    public void setGoal(String goal) {
        this.goal = goal == null ? null : goal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.begin_time
     *
     * @return the value of res_scheme.begin_time
     *
     * @mbg.generated
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.begin_time
     *
     * @param beginTime the value for res_scheme.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.place
     *
     * @return the value of res_scheme.place
     *
     * @mbg.generated
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.place
     *
     * @param place the value for res_scheme.place
     *
     * @mbg.generated
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.person
     *
     * @return the value of res_scheme.person
     *
     * @mbg.generated
     */
    public String getPerson() {
        return person;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.person
     *
     * @param person the value for res_scheme.person
     *
     * @mbg.generated
     */
    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.form
     *
     * @return the value of res_scheme.form
     *
     * @mbg.generated
     */
    public String getForm() {
        return form;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.form
     *
     * @param form the value for res_scheme.form
     *
     * @mbg.generated
     */
    public void setForm(String form) {
        this.form = form == null ? null : form.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.arrangements
     *
     * @return the value of res_scheme.arrangements
     *
     * @mbg.generated
     */
    public String getArrangements() {
        return arrangements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.arrangements
     *
     * @param arrangements the value for res_scheme.arrangements
     *
     * @mbg.generated
     */
    public void setArrangements(String arrangements) {
        this.arrangements = arrangements == null ? null : arrangements.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.flow
     *
     * @return the value of res_scheme.flow
     *
     * @mbg.generated
     */
    public String getFlow() {
        return flow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.flow
     *
     * @param flow the value for res_scheme.flow
     *
     * @mbg.generated
     */
    public void setFlow(String flow) {
        this.flow = flow == null ? null : flow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.budget
     *
     * @return the value of res_scheme.budget
     *
     * @mbg.generated
     */
    public String getBudget() {
        return budget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.budget
     *
     * @param budget the value for res_scheme.budget
     *
     * @mbg.generated
     */
    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.award
     *
     * @return the value of res_scheme.award
     *
     * @mbg.generated
     */
    public String getAward() {
        return award;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.award
     *
     * @param award the value for res_scheme.award
     *
     * @mbg.generated
     */
    public void setAward(String award) {
        this.award = award == null ? null : award.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.create_time
     *
     * @return the value of res_scheme.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.create_time
     *
     * @param createTime the value for res_scheme.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.update_time
     *
     * @return the value of res_scheme.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.update_time
     *
     * @param updateTime the value for res_scheme.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.creator_id
     *
     * @return the value of res_scheme.creator_id
     *
     * @mbg.generated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.creator_id
     *
     * @param creatorId the value for res_scheme.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.creator_name
     *
     * @return the value of res_scheme.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.creator_name
     *
     * @param creatorName the value for res_scheme.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.department_id
     *
     * @return the value of res_scheme.department_id
     *
     * @mbg.generated
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.department_id
     *
     * @param departmentId the value for res_scheme.department_id
     *
     * @mbg.generated
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.department_name
     *
     * @return the value of res_scheme.department_name
     *
     * @mbg.generated
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.department_name
     *
     * @param departmentName the value for res_scheme.department_name
     *
     * @mbg.generated
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.status
     *
     * @return the value of res_scheme.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.status
     *
     * @param status the value for res_scheme.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_scheme.content
     *
     * @return the value of res_scheme.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_scheme.content
     *
     * @param content the value for res_scheme.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_scheme
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", theme=").append(theme);
        sb.append(", goal=").append(goal);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", place=").append(place);
        sb.append(", person=").append(person);
        sb.append(", form=").append(form);
        sb.append(", arrangements=").append(arrangements);
        sb.append(", flow=").append(flow);
        sb.append(", budget=").append(budget);
        sb.append(", award=").append(award);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package my.erp.org.domain;

import java.io.Serializable;
import java.util.Date;

import my.erp.org.util.BasePo;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table res_affiche
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Affiche extends BasePo implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.tittle
     *
     * @mbg.generated
     */
    private String tittle;

    /**
     * Database Column Remarks:
     *   内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   署名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.signature
     *
     * @mbg.generated
     */
    private String signature;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_affiche.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table res_affiche
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.id
     *
     * @return the value of res_affiche.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.id
     *
     * @param id the value for res_affiche.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.tittle
     *
     * @return the value of res_affiche.tittle
     *
     * @mbg.generated
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.tittle
     *
     * @param tittle the value for res_affiche.tittle
     *
     * @mbg.generated
     */
    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.content
     *
     * @return the value of res_affiche.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.content
     *
     * @param content the value for res_affiche.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.signature
     *
     * @return the value of res_affiche.signature
     *
     * @mbg.generated
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.signature
     *
     * @param signature the value for res_affiche.signature
     *
     * @mbg.generated
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.create_time
     *
     * @return the value of res_affiche.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.create_time
     *
     * @param createTime the value for res_affiche.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_affiche.status
     *
     * @return the value of res_affiche.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_affiche.status
     *
     * @param status the value for res_affiche.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_affiche
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
        sb.append(", tittle=").append(tittle);
        sb.append(", content=").append(content);
        sb.append(", signature=").append(signature);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
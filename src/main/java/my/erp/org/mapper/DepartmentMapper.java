package my.erp.org.mapper;

import java.util.List;

import my.erp.org.domain.Department;
import my.erp.org.vo.DepartmentVo;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    DepartmentVo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_department
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Department record);

	List<DepartmentVo> queryDepartment(DepartmentVo vo);

	List<DepartmentVo> queryApplyDepartment(DepartmentVo vo);
}
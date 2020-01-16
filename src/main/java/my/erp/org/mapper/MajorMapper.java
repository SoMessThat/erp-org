package my.erp.org.mapper;

import java.util.List;
import java.util.Map;

import my.erp.org.domain.Major;
import my.erp.org.vo.MajorVo;

public interface MajorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    int insert(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    int insertSelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    Major selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_major
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Major record);

	List<MajorVo> queryMajor(MajorVo vo);

	List<Map<String, Object>> getMajorItem(Long id);
}
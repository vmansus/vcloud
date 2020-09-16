package vip.vmansus.cloud.vcloud.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.vmansus.cloud.vcloud.model.TempFile;
import vip.vmansus.cloud.vcloud.model.TempFileExample;

public interface TempFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    long countByExample(TempFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByExample(TempFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insert(TempFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insertSelective(TempFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    List<TempFile> selectByExample(TempFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    TempFile selectByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExampleSelective(@Param("record") TempFile record, @Param("example") TempFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExample(@Param("record") TempFile record, @Param("example") TempFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKeySelective(TempFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table temp_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKey(TempFile record);
}
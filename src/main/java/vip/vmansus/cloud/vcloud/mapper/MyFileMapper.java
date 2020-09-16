package vip.vmansus.cloud.vcloud.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.vmansus.cloud.vcloud.model.MyFile;
import vip.vmansus.cloud.vcloud.model.MyFileExample;

public interface MyFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    long countByExample(MyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByExample(MyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByPrimaryKey(Integer myFileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insert(MyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insertSelective(MyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    List<MyFile> selectByExample(MyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    MyFile selectByPrimaryKey(Integer myFileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExampleSelective(@Param("record") MyFile record, @Param("example") MyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExample(@Param("record") MyFile record, @Param("example") MyFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKeySelective(MyFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_file
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKey(MyFile record);
}
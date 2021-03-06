package vip.vmansus.cloud.vcloud.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.vmansus.cloud.vcloud.model.FileStore;
import vip.vmansus.cloud.vcloud.model.FileStoreExample;

public interface FileStoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    long countByExample(FileStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByExample(FileStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByPrimaryKey(Integer fileStoreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insert(FileStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insertSelective(FileStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    List<FileStore> selectByExample(FileStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    FileStore selectByPrimaryKey(Integer fileStoreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExampleSelective(@Param("record") FileStore record, @Param("example") FileStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExample(@Param("record") FileStore record, @Param("example") FileStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKeySelective(FileStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_store
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKey(FileStore record);
}
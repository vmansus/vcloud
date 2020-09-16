package vip.vmansus.cloud.vcloud.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.vmansus.cloud.vcloud.model.FileFolder;
import vip.vmansus.cloud.vcloud.model.FileFolderExample;

public interface FileFolderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    long countByExample(FileFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByExample(FileFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int deleteByPrimaryKey(Integer fileFolderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insert(FileFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int insertSelective(FileFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    List<FileFolder> selectByExample(FileFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    FileFolder selectByPrimaryKey(Integer fileFolderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExampleSelective(@Param("record") FileFolder record, @Param("example") FileFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByExample(@Param("record") FileFolder record, @Param("example") FileFolderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKeySelective(FileFolder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_folder
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    int updateByPrimaryKey(FileFolder record);
}
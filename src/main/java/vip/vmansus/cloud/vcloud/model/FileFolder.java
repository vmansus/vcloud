package vip.vmansus.cloud.vcloud.model;

import java.util.Date;

public class FileFolder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_folder.file_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    private Integer fileFolderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_folder.file_folder_name
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    private String fileFolderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_folder.parent_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    private Integer parentFolderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_folder.file_store_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    private Integer fileStoreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_folder.time
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_folder.file_folder_id
     *
     * @return the value of file_folder.file_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Integer getFileFolderId() {
        return fileFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_folder.file_folder_id
     *
     * @param fileFolderId the value for file_folder.file_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setFileFolderId(Integer fileFolderId) {
        this.fileFolderId = fileFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_folder.file_folder_name
     *
     * @return the value of file_folder.file_folder_name
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public String getFileFolderName() {
        return fileFolderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_folder.file_folder_name
     *
     * @param fileFolderName the value for file_folder.file_folder_name
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setFileFolderName(String fileFolderName) {
        this.fileFolderName = fileFolderName == null ? null : fileFolderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_folder.parent_folder_id
     *
     * @return the value of file_folder.parent_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Integer getParentFolderId() {
        return parentFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_folder.parent_folder_id
     *
     * @param parentFolderId the value for file_folder.parent_folder_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setParentFolderId(Integer parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_folder.file_store_id
     *
     * @return the value of file_folder.file_store_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Integer getFileStoreId() {
        return fileStoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_folder.file_store_id
     *
     * @param fileStoreId the value for file_folder.file_store_id
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setFileStoreId(Integer fileStoreId) {
        this.fileStoreId = fileStoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_folder.time
     *
     * @return the value of file_folder.time
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_folder.time
     *
     * @param time the value for file_folder.time
     *
     * @mbg.generated Wed Sep 16 18:39:48 HKT 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }
}
package cn.earlymorning.netvideo.beans;

public class Profession {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_profession.pro_id
     *
     * @mbg.generated
     */
    private Integer proId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_profession.pro_name
     *
     * @mbg.generated
     */
    private String proName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_profession.pro_descript
     *
     * @mbg.generated
     */
    private String proDescript;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_profession.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_profession.pro_id
     *
     * @return the value of tb_sys_profession.pro_id
     *
     * @mbg.generated
     */
    public Integer getProId() {
        return proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_profession.pro_id
     *
     * @param proId the value for tb_sys_profession.pro_id
     *
     * @mbg.generated
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_profession.pro_name
     *
     * @return the value of tb_sys_profession.pro_name
     *
     * @mbg.generated
     */
    public String getProName() {
        return proName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_profession.pro_name
     *
     * @param proName the value for tb_sys_profession.pro_name
     *
     * @mbg.generated
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_profession.pro_descript
     *
     * @return the value of tb_sys_profession.pro_descript
     *
     * @mbg.generated
     */
    public String getProDescript() {
        return proDescript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_profession.pro_descript
     *
     * @param proDescript the value for tb_sys_profession.pro_descript
     *
     * @mbg.generated
     */
    public void setProDescript(String proDescript) {
        this.proDescript = proDescript == null ? null : proDescript.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_profession.pid
     *
     * @return the value of tb_sys_profession.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_profession.pid
     *
     * @param pid the value for tb_sys_profession.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
package cn.earlymorning.netvideo.beans;

public class CourseType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_type.type_id
     *
     * @mbg.generated
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_course_type.type_descript
     *
     * @mbg.generated
     */
    private String typeDescript;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_type.type_id
     *
     * @return the value of tb_course_type.type_id
     *
     * @mbg.generated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_type.type_id
     *
     * @param typeId the value for tb_course_type.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_type.type_name
     *
     * @return the value of tb_course_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_type.type_name
     *
     * @param typeName the value for tb_course_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_course_type.type_descript
     *
     * @return the value of tb_course_type.type_descript
     *
     * @mbg.generated
     */
    public String getTypeDescript() {
        return typeDescript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_course_type.type_descript
     *
     * @param typeDescript the value for tb_course_type.type_descript
     *
     * @mbg.generated
     */
    public void setTypeDescript(String typeDescript) {
        this.typeDescript = typeDescript == null ? null : typeDescript.trim();
    }
}
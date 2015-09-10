/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_options*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_options")
public class OptionVal extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.id
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.type
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.typeVal
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("typeVal")
    private String typeval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.orderIndex
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("orderIndex")
    private Integer orderindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.createdtime
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("createdtime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.extraId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("extraId")
    private Integer extraid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.isDefault
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("isDefault")
    private Boolean isdefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.refOption
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Column("refOption")
    private Integer refoption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_options.description
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        OptionVal item = (OptionVal)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1715, 1561).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.id
     *
     * @return the value of m_options.id
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.id
     *
     * @param id the value for m_options.id
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.type
     *
     * @return the value of m_options.type
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.type
     *
     * @param type the value for m_options.type
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.typeVal
     *
     * @return the value of m_options.typeVal
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public String getTypeval() {
        return typeval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.typeVal
     *
     * @param typeval the value for m_options.typeVal
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setTypeval(String typeval) {
        this.typeval = typeval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.orderIndex
     *
     * @return the value of m_options.orderIndex
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Integer getOrderindex() {
        return orderindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.orderIndex
     *
     * @param orderindex the value for m_options.orderIndex
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.sAccountId
     *
     * @return the value of m_options.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.sAccountId
     *
     * @param saccountid the value for m_options.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.createdtime
     *
     * @return the value of m_options.createdtime
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.createdtime
     *
     * @param createdtime the value for m_options.createdtime
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.createdUser
     *
     * @return the value of m_options.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.createdUser
     *
     * @param createduser the value for m_options.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.extraId
     *
     * @return the value of m_options.extraId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Integer getExtraid() {
        return extraid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.extraId
     *
     * @param extraid the value for m_options.extraId
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setExtraid(Integer extraid) {
        this.extraid = extraid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.isDefault
     *
     * @return the value of m_options.isDefault
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.isDefault
     *
     * @param isdefault the value for m_options.isDefault
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.refOption
     *
     * @return the value of m_options.refOption
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public Integer getRefoption() {
        return refoption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.refOption
     *
     * @param refoption the value for m_options.refOption
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setRefoption(Integer refoption) {
        this.refoption = refoption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_options.description
     *
     * @return the value of m_options.description
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_options.description
     *
     * @param description the value for m_options.description
     *
     * @mbggenerated Tue Sep 08 09:15:20 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        type,
        typeval,
        orderindex,
        saccountid,
        createdtime,
        createduser,
        extraid,
        isdefault,
        refoption,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}
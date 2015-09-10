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
/*Domain class of table m_tracker_version*/
package com.esofthead.mycollab.module.tracker.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_tracker_version")
public class Version extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.id
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.projectid
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("projectid")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.duedate
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("duedate")
    private Date duedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.versionname
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Length(max=255, message="Field value is too long")
    @Column("versionname")
    private String versionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.lastUpdatedTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.createdTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.status
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.prjKey
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Column("prjKey")
    private Integer prjkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_version.description
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        Version item = (Version)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1449, 317).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.id
     *
     * @return the value of m_tracker_version.id
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.id
     *
     * @param id the value for m_tracker_version.id
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.projectid
     *
     * @return the value of m_tracker_version.projectid
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.projectid
     *
     * @param projectid the value for m_tracker_version.projectid
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.duedate
     *
     * @return the value of m_tracker_version.duedate
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.duedate
     *
     * @param duedate the value for m_tracker_version.duedate
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.versionname
     *
     * @return the value of m_tracker_version.versionname
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public String getVersionname() {
        return versionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.versionname
     *
     * @param versionname the value for m_tracker_version.versionname
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.createdUser
     *
     * @return the value of m_tracker_version.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.createdUser
     *
     * @param createduser the value for m_tracker_version.createdUser
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.sAccountId
     *
     * @return the value of m_tracker_version.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.sAccountId
     *
     * @param saccountid the value for m_tracker_version.sAccountId
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.lastUpdatedTime
     *
     * @return the value of m_tracker_version.lastUpdatedTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_tracker_version.lastUpdatedTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.createdTime
     *
     * @return the value of m_tracker_version.createdTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.createdTime
     *
     * @param createdtime the value for m_tracker_version.createdTime
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.status
     *
     * @return the value of m_tracker_version.status
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.status
     *
     * @param status the value for m_tracker_version.status
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.prjKey
     *
     * @return the value of m_tracker_version.prjKey
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public Integer getPrjkey() {
        return prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.prjKey
     *
     * @param prjkey the value for m_tracker_version.prjKey
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setPrjkey(Integer prjkey) {
        this.prjkey = prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_version.description
     *
     * @return the value of m_tracker_version.description
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_version.description
     *
     * @param description the value for m_tracker_version.description
     *
     * @mbggenerated Tue Sep 08 09:15:23 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        projectid,
        duedate,
        versionname,
        createduser,
        saccountid,
        lastupdatedtime,
        createdtime,
        status,
        prjkey,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}
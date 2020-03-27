/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomiematchapp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aeb5874
 */
@Entity
@Table(name = "UserModel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserModel_1.findAll", query = "SELECT u FROM UserModel_1 u")
    , @NamedQuery(name = "UserModel_1.findById", query = "SELECT u FROM UserModel_1 u WHERE u.id = :id")})
public class UserModel_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    public UserModel_1() {
    }

    public UserModel_1(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserModel_1)) {
            return false;
        }
        UserModel_1 other = (UserModel_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "roomiematchapp.UserModel_1[ id=" + id + " ]";
    }
    
}

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
@Table(name = "UserModel1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserModel1.findAll", query = "SELECT u FROM UserModel1 u")
    , @NamedQuery(name = "UserModel1.findByAge", query = "SELECT u FROM UserModel1 u WHERE u.age = :age")
    , @NamedQuery(name = "UserModel1.findByName", query = "SELECT u FROM UserModel1 u WHERE u.name = :name")})
public class UserModel1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "age")
    private Integer age;
    @Column(name = "name")
    private String name;

    public UserModel1() {
    }

    public UserModel1(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (age != null ? age.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserModel1)) {
            return false;
        }
        UserModel1 other = (UserModel1) object;
        if ((this.age == null && other.age != null) || (this.age != null && !this.age.equals(other.age))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "roomiematchapp.UserModel1[ age=" + age + " ]";
    }
    
}

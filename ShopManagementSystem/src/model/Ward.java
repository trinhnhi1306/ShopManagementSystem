/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author TRINH
 */
public class Ward {

    private Integer wardId;
    private String wardName;
    private String wardPrefix;
    private District district;
    private List<Address> addresses;

    public Ward() {
    }

    public Ward(Integer wardId, String wardName, String wardPrefix, District district, List<Address> addresses) {
        this.wardId = wardId;
        this.wardName = wardName;
        this.wardPrefix = wardPrefix;
        this.district = district;
        this.addresses = addresses;
    }

    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getWardPrefix() {
        return wardPrefix;
    }

    public void setWardPrefix(String wardPrefix) {
        this.wardPrefix = wardPrefix;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}

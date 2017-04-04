/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Assetvaluechangecomponent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Assetvaluechangecomponent   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("component_id")
  private String componentId = null;

  @SerializedName("taxbaseprice")
  private Double taxbaseprice = null;

  @SerializedName("accbaseprice")
  private Double accbaseprice = null;

  @SerializedName("taxremainderprice")
  private Double taxremainderprice = null;

  @SerializedName("accremainderprice")
  private Double accremainderprice = null;

  public Assetvaluechangecomponent displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Assetvaluechangecomponent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Assetvaluechangecomponent classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Assetvaluechangecomponent objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Assetvaluechangecomponent parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu změna ceny majetku [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu změna ceny majetku [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Assetvaluechangecomponent componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * odkaz do seznamu prvků; id objektu prvek karty majetku [persistentní položka]
   * @return componentId
  **/
  @ApiModelProperty(example = "null", value = "odkaz do seznamu prvků; id objektu prvek karty majetku [persistentní položka]")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public Assetvaluechangecomponent taxbaseprice(Double taxbaseprice) {
    this.taxbaseprice = taxbaseprice;
    return this;
  }

   /**
   * daň.vstup.cena [persistentní položka]
   * @return taxbaseprice
  **/
  @ApiModelProperty(example = "null", value = "daň.vstup.cena [persistentní položka]")
  public Double getTaxbaseprice() {
    return taxbaseprice;
  }

  public void setTaxbaseprice(Double taxbaseprice) {
    this.taxbaseprice = taxbaseprice;
  }

  public Assetvaluechangecomponent accbaseprice(Double accbaseprice) {
    this.accbaseprice = accbaseprice;
    return this;
  }

   /**
   * Účet.vstup.cena [persistentní položka]
   * @return accbaseprice
  **/
  @ApiModelProperty(example = "null", value = "Účet.vstup.cena [persistentní položka]")
  public Double getAccbaseprice() {
    return accbaseprice;
  }

  public void setAccbaseprice(Double accbaseprice) {
    this.accbaseprice = accbaseprice;
  }

  public Assetvaluechangecomponent taxremainderprice(Double taxremainderprice) {
    this.taxremainderprice = taxremainderprice;
    return this;
  }

   /**
   * daň.zůst.cena [persistentní položka]
   * @return taxremainderprice
  **/
  @ApiModelProperty(example = "null", value = "daň.zůst.cena [persistentní položka]")
  public Double getTaxremainderprice() {
    return taxremainderprice;
  }

  public void setTaxremainderprice(Double taxremainderprice) {
    this.taxremainderprice = taxremainderprice;
  }

  public Assetvaluechangecomponent accremainderprice(Double accremainderprice) {
    this.accremainderprice = accremainderprice;
    return this;
  }

   /**
   * Účet.zůst.cena [persistentní položka]
   * @return accremainderprice
  **/
  @ApiModelProperty(example = "null", value = "Účet.zůst.cena [persistentní položka]")
  public Double getAccremainderprice() {
    return accremainderprice;
  }

  public void setAccremainderprice(Double accremainderprice) {
    this.accremainderprice = accremainderprice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetvaluechangecomponent assetvaluechangecomponent = (Assetvaluechangecomponent) o;
    return Objects.equals(this.displayname, assetvaluechangecomponent.displayname) &&
        Objects.equals(this.id, assetvaluechangecomponent.id) &&
        Objects.equals(this.classid, assetvaluechangecomponent.classid) &&
        Objects.equals(this.objversion, assetvaluechangecomponent.objversion) &&
        Objects.equals(this.parentId, assetvaluechangecomponent.parentId) &&
        Objects.equals(this.componentId, assetvaluechangecomponent.componentId) &&
        Objects.equals(this.taxbaseprice, assetvaluechangecomponent.taxbaseprice) &&
        Objects.equals(this.accbaseprice, assetvaluechangecomponent.accbaseprice) &&
        Objects.equals(this.taxremainderprice, assetvaluechangecomponent.taxremainderprice) &&
        Objects.equals(this.accremainderprice, assetvaluechangecomponent.accremainderprice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, componentId, taxbaseprice, accbaseprice, taxremainderprice, accremainderprice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetvaluechangecomponent {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    taxbaseprice: ").append(toIndentedString(taxbaseprice)).append("\n");
    sb.append("    accbaseprice: ").append(toIndentedString(accbaseprice)).append("\n");
    sb.append("    taxremainderprice: ").append(toIndentedString(taxremainderprice)).append("\n");
    sb.append("    accremainderprice: ").append(toIndentedString(accremainderprice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

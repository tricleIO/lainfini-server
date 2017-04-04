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
 * Gpmparameterrows
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Gpmparameterrows   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("productreception_docq_id")
  private String productreceptionDocqId = null;

  @SerializedName("outgoingtransfer_docq_id")
  private String outgoingtransferDocqId = null;

  @SerializedName("incomingtransfer_docq_id")
  private String incomingtransferDocqId = null;

  @SerializedName("productstore_id")
  private String productstoreId = null;

  @SerializedName("operatingstore_id")
  private String operatingstoreId = null;

  @SerializedName("firm_id")
  private String firmId = null;

  @SerializedName("materialdistribution_docq_id")
  private String materialdistributionDocqId = null;

  @SerializedName("materialstore_id")
  private String materialstoreId = null;

  @SerializedName("waste_docq_id")
  private String wasteDocqId = null;

  @SerializedName("overplus_docq_id")
  private String overplusDocqId = null;

  @SerializedName("productstorefororders")
  private Boolean productstorefororders = null;

  @SerializedName("ordersbalancealstatus")
  private Integer ordersbalancealstatus = null;

  public Gpmparameterrows displayname(String displayname) {
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

  public Gpmparameterrows id(String id) {
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

  public Gpmparameterrows classid(String classid) {
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

  public Gpmparameterrows objversion(Integer objversion) {
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

  public Gpmparameterrows parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu nastavení gastrovýroby [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu nastavení gastrovýroby [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Gpmparameterrows posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Gpmparameterrows docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada dokladů; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Gpmparameterrows divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Gpmparameterrows busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Gpmparameterrows bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch. případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch. případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Gpmparameterrows busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }

  public Gpmparameterrows productreceptionDocqId(String productreceptionDocqId) {
    this.productreceptionDocqId = productreceptionDocqId;
    return this;
  }

   /**
   * Řada phv; id objektu Řada dokladů [persistentní položka]
   * @return productreceptionDocqId
  **/
  @ApiModelProperty(example = "null", value = "Řada phv; id objektu Řada dokladů [persistentní položka]")
  public String getProductreceptionDocqId() {
    return productreceptionDocqId;
  }

  public void setProductreceptionDocqId(String productreceptionDocqId) {
    this.productreceptionDocqId = productreceptionDocqId;
  }

  public Gpmparameterrows outgoingtransferDocqId(String outgoingtransferDocqId) {
    this.outgoingtransferDocqId = outgoingtransferDocqId;
    return this;
  }

   /**
   * Řada prv; id objektu Řada dokladů [persistentní položka]
   * @return outgoingtransferDocqId
  **/
  @ApiModelProperty(example = "null", value = "Řada prv; id objektu Řada dokladů [persistentní položka]")
  public String getOutgoingtransferDocqId() {
    return outgoingtransferDocqId;
  }

  public void setOutgoingtransferDocqId(String outgoingtransferDocqId) {
    this.outgoingtransferDocqId = outgoingtransferDocqId;
  }

  public Gpmparameterrows incomingtransferDocqId(String incomingtransferDocqId) {
    this.incomingtransferDocqId = incomingtransferDocqId;
    return this;
  }

   /**
   * Řada prp; id objektu Řada dokladů [persistentní položka]
   * @return incomingtransferDocqId
  **/
  @ApiModelProperty(example = "null", value = "Řada prp; id objektu Řada dokladů [persistentní položka]")
  public String getIncomingtransferDocqId() {
    return incomingtransferDocqId;
  }

  public void setIncomingtransferDocqId(String incomingtransferDocqId) {
    this.incomingtransferDocqId = incomingtransferDocqId;
  }

  public Gpmparameterrows productstoreId(String productstoreId) {
    this.productstoreId = productstoreId;
    return this;
  }

   /**
   * sklad výrobků; id objektu sklad [persistentní položka]
   * @return productstoreId
  **/
  @ApiModelProperty(example = "null", value = "sklad výrobků; id objektu sklad [persistentní položka]")
  public String getProductstoreId() {
    return productstoreId;
  }

  public void setProductstoreId(String productstoreId) {
    this.productstoreId = productstoreId;
  }

  public Gpmparameterrows operatingstoreId(String operatingstoreId) {
    this.operatingstoreId = operatingstoreId;
    return this;
  }

   /**
   * provozní sklad; id objektu sklad [persistentní položka]
   * @return operatingstoreId
  **/
  @ApiModelProperty(example = "null", value = "provozní sklad; id objektu sklad [persistentní položka]")
  public String getOperatingstoreId() {
    return operatingstoreId;
  }

  public void setOperatingstoreId(String operatingstoreId) {
    this.operatingstoreId = operatingstoreId;
  }

  public Gpmparameterrows firmId(String firmId) {
    this.firmId = firmId;
    return this;
  }

   /**
   * firma; id objektu firma [persistentní položka]
   * @return firmId
  **/
  @ApiModelProperty(example = "null", value = "firma; id objektu firma [persistentní položka]")
  public String getFirmId() {
    return firmId;
  }

  public void setFirmId(String firmId) {
    this.firmId = firmId;
  }

  public Gpmparameterrows materialdistributionDocqId(String materialdistributionDocqId) {
    this.materialdistributionDocqId = materialdistributionDocqId;
    return this;
  }

   /**
   * Řada vmv; id objektu Řada dokladů [persistentní položka]
   * @return materialdistributionDocqId
  **/
  @ApiModelProperty(example = "null", value = "Řada vmv; id objektu Řada dokladů [persistentní položka]")
  public String getMaterialdistributionDocqId() {
    return materialdistributionDocqId;
  }

  public void setMaterialdistributionDocqId(String materialdistributionDocqId) {
    this.materialdistributionDocqId = materialdistributionDocqId;
  }

  public Gpmparameterrows materialstoreId(String materialstoreId) {
    this.materialstoreId = materialstoreId;
    return this;
  }

   /**
   * sklad surovin; id objektu sklad [persistentní položka]
   * @return materialstoreId
  **/
  @ApiModelProperty(example = "null", value = "sklad surovin; id objektu sklad [persistentní položka]")
  public String getMaterialstoreId() {
    return materialstoreId;
  }

  public void setMaterialstoreId(String materialstoreId) {
    this.materialstoreId = materialstoreId;
  }

  public Gpmparameterrows wasteDocqId(String wasteDocqId) {
    this.wasteDocqId = wasteDocqId;
    return this;
  }

   /**
   * ztráty výroby; id objektu Řada dokladů [persistentní položka]
   * @return wasteDocqId
  **/
  @ApiModelProperty(example = "null", value = "ztráty výroby; id objektu Řada dokladů [persistentní položka]")
  public String getWasteDocqId() {
    return wasteDocqId;
  }

  public void setWasteDocqId(String wasteDocqId) {
    this.wasteDocqId = wasteDocqId;
  }

  public Gpmparameterrows overplusDocqId(String overplusDocqId) {
    this.overplusDocqId = overplusDocqId;
    return this;
  }

   /**
   * přebytky výroby; id objektu Řada dokladů [persistentní položka]
   * @return overplusDocqId
  **/
  @ApiModelProperty(example = "null", value = "přebytky výroby; id objektu Řada dokladů [persistentní položka]")
  public String getOverplusDocqId() {
    return overplusDocqId;
  }

  public void setOverplusDocqId(String overplusDocqId) {
    this.overplusDocqId = overplusDocqId;
  }

  public Gpmparameterrows productstorefororders(Boolean productstorefororders) {
    this.productstorefororders = productstorefororders;
    return this;
  }

   /**
   * pro bony [persistentní položka]
   * @return productstorefororders
  **/
  @ApiModelProperty(example = "null", value = "pro bony [persistentní položka]")
  public Boolean getProductstorefororders() {
    return productstorefororders;
  }

  public void setProductstorefororders(Boolean productstorefororders) {
    this.productstorefororders = productstorefororders;
  }

  public Gpmparameterrows ordersbalancealstatus(Integer ordersbalancealstatus) {
    this.ordersbalancealstatus = ordersbalancealstatus;
    return this;
  }

   /**
   * stav vl [persistentní položka]
   * @return ordersbalancealstatus
  **/
  @ApiModelProperty(example = "null", value = "stav vl [persistentní položka]")
  public Integer getOrdersbalancealstatus() {
    return ordersbalancealstatus;
  }

  public void setOrdersbalancealstatus(Integer ordersbalancealstatus) {
    this.ordersbalancealstatus = ordersbalancealstatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gpmparameterrows gpmparameterrows = (Gpmparameterrows) o;
    return Objects.equals(this.displayname, gpmparameterrows.displayname) &&
        Objects.equals(this.id, gpmparameterrows.id) &&
        Objects.equals(this.classid, gpmparameterrows.classid) &&
        Objects.equals(this.objversion, gpmparameterrows.objversion) &&
        Objects.equals(this.parentId, gpmparameterrows.parentId) &&
        Objects.equals(this.posindex, gpmparameterrows.posindex) &&
        Objects.equals(this.docqueueId, gpmparameterrows.docqueueId) &&
        Objects.equals(this.divisionId, gpmparameterrows.divisionId) &&
        Objects.equals(this.busorderId, gpmparameterrows.busorderId) &&
        Objects.equals(this.bustransactionId, gpmparameterrows.bustransactionId) &&
        Objects.equals(this.busprojectId, gpmparameterrows.busprojectId) &&
        Objects.equals(this.productreceptionDocqId, gpmparameterrows.productreceptionDocqId) &&
        Objects.equals(this.outgoingtransferDocqId, gpmparameterrows.outgoingtransferDocqId) &&
        Objects.equals(this.incomingtransferDocqId, gpmparameterrows.incomingtransferDocqId) &&
        Objects.equals(this.productstoreId, gpmparameterrows.productstoreId) &&
        Objects.equals(this.operatingstoreId, gpmparameterrows.operatingstoreId) &&
        Objects.equals(this.firmId, gpmparameterrows.firmId) &&
        Objects.equals(this.materialdistributionDocqId, gpmparameterrows.materialdistributionDocqId) &&
        Objects.equals(this.materialstoreId, gpmparameterrows.materialstoreId) &&
        Objects.equals(this.wasteDocqId, gpmparameterrows.wasteDocqId) &&
        Objects.equals(this.overplusDocqId, gpmparameterrows.overplusDocqId) &&
        Objects.equals(this.productstorefororders, gpmparameterrows.productstorefororders) &&
        Objects.equals(this.ordersbalancealstatus, gpmparameterrows.ordersbalancealstatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, docqueueId, divisionId, busorderId, bustransactionId, busprojectId, productreceptionDocqId, outgoingtransferDocqId, incomingtransferDocqId, productstoreId, operatingstoreId, firmId, materialdistributionDocqId, materialstoreId, wasteDocqId, overplusDocqId, productstorefororders, ordersbalancealstatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gpmparameterrows {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    productreceptionDocqId: ").append(toIndentedString(productreceptionDocqId)).append("\n");
    sb.append("    outgoingtransferDocqId: ").append(toIndentedString(outgoingtransferDocqId)).append("\n");
    sb.append("    incomingtransferDocqId: ").append(toIndentedString(incomingtransferDocqId)).append("\n");
    sb.append("    productstoreId: ").append(toIndentedString(productstoreId)).append("\n");
    sb.append("    operatingstoreId: ").append(toIndentedString(operatingstoreId)).append("\n");
    sb.append("    firmId: ").append(toIndentedString(firmId)).append("\n");
    sb.append("    materialdistributionDocqId: ").append(toIndentedString(materialdistributionDocqId)).append("\n");
    sb.append("    materialstoreId: ").append(toIndentedString(materialstoreId)).append("\n");
    sb.append("    wasteDocqId: ").append(toIndentedString(wasteDocqId)).append("\n");
    sb.append("    overplusDocqId: ").append(toIndentedString(overplusDocqId)).append("\n");
    sb.append("    productstorefororders: ").append(toIndentedString(productstorefororders)).append("\n");
    sb.append("    ordersbalancealstatus: ").append(toIndentedString(ordersbalancealstatus)).append("\n");
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
